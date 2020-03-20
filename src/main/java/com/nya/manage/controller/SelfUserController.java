package com.nya.manage.controller;

import com.nya.manage.constant.SelfManagementConstants;
import com.nya.manage.entity.ResponseData;
import com.nya.manage.entity.SelfUser;
import com.nya.manage.exception.SelfUserException;
import com.nya.manage.service.SelfUserService;
import com.nya.manage.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 用户管理模块
 * @Author nya
 * @Date 2020/3/20 下午2:19
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class SelfUserController {

    @Autowired
    private SelfUserService selfUserService;

    /**
     * 注册
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/register")
    public ResponseData registerUser(String username,String password) {
        try {
            if (StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
                SelfUser selfUser = new SelfUser();
                selfUser.setSelfName(username);
                selfUser.setSelfPass(password);
                int registerNum = selfUserService.register(selfUser);
                if (registerNum == SelfManagementConstants.USERNAME_EXIST) {
                    return ResponseData.customerError().putDataValue("result","username is already exist");
                }
                int selfId = selfUserService.querySelfIdBySelfName(username);
                return ResponseData.ok().putDataValue("result",selfId);
            } else {
                return ResponseData.customerError().putDataValue("result","params is not complete");
            }
        } catch (SelfUserException e) {
            return ResponseData.serverInternalError().putDataValue("result",e.getMessage());
        }
    }

    /**
     * 校验用户名是否存在
     * @param username
     * @return
     */
    @GetMapping("/userNameCheck")
    public ResponseData isNameExist(@RequestParam(name = "username") String username) {
        if (StringUtils.isNotBlank(username)) {
            boolean exist = selfUserService.isSelfNameExist(username);
            return ResponseData.ok().putDataValue("result",exist);
        } else {
            return ResponseData.customerError().putDataValue("result","param is not complete");
        }
    }


    /**
     * 用户登录
     * @param key
     * @param password
     * @return
     */
    @PostMapping("/login")
    public ResponseData login(HttpServletRequest request, String key, String password) {
        if (StringUtils.isNotBlank(key) && StringUtils.isNotBlank(password)) {
            String res = selfUserService.queryByPasswordSelfIdOrSelfName(key, password);
            if (CommonUtils.isInteger(res)) {
                return ResponseData.ok().putDataValue("result",res);
            } else {
                return ResponseData.unauthorized().putDataValue("result",res);
            }
        } else {
            return ResponseData.customerError().putDataValue("result","params is not complete");
        }
    }

    /**
     * 退出登录 校验用户名/id/ip
     * @param selfId
     * @param username
     * @return
     */
    @PostMapping("/logout")
    public ResponseData logout(HttpServletRequest request, String selfId,String username) {
        return ResponseData.ok().putDataValue("result","bye");
    }

}
