package com.nya.manage.service;

import com.nya.manage.constant.SelfManagementConstants;
import com.nya.manage.entity.SelfUser;
import com.nya.manage.exception.SelfUserException;
import com.nya.manage.mapper.SelfUserMapper;
import com.nya.manage.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author nya
 * @Date 2020/3/20 下午1:51
 **/
@Service
@Slf4j
public class SelfUserService {

    @Autowired
    private SelfUserMapper selfUserMapper;

    /**
     * 用户注册
     * @param selfUser
     * @return
     */
    public int register(SelfUser selfUser) throws SelfUserException {
        int res;
        try {
            selfUser.setSelfPass(CommonUtils.md5(selfUser.getSelfPass()));
            selfUser.setCreateTime(System.currentTimeMillis());
            selfUser.setUpdateTime(System.currentTimeMillis());
            selfUser.setSelfStatus(SelfManagementConstants.USER_STATUS_OK);
            // 获取数据库当前最大self_id
            Integer selfId = selfUserMapper.selectMaxSelfId();
            selfUser.setSelfId(selfId+1);
            res = selfUserMapper.insert(selfUser);
        } catch (DuplicateKeyException de) {
            log.error("username [{}] is already exist",selfUser.getSelfName(),de);
            return SelfManagementConstants.USERNAME_EXIST;
        } catch (Exception e) {
            log.error("register-self-user : userName-[{}]",selfUser.getSelfName(),e);
            throw new SelfUserException("self-user-insert-error",e);
        }
        return res;
    }

    /**
     * 通过用户名获取用户id
     * @param selfName
     * @return
     */
    public int querySelfIdBySelfName(String selfName) {
        SelfUser selfUser = selfUserMapper.selectByUsername(selfName);
        return selfUser.getSelfId();
    }

    /**
     * 判断用户名是否已存在
     * @param selfName
     * @return
     */
    public boolean isSelfNameExist(String selfName) {
        SelfUser selfUser = selfUserMapper.selectByUsername(selfName);
        return selfUser != null && StringUtils.isNotBlank(selfUser.getSelfName());
    }

    /**
     * 登录信息
     * @param key
     * @param password
     * @return
     */
    public String queryByPasswordSelfIdOrSelfName(String key,String password){
        SelfUser user = new SelfUser();
        if (CommonUtils.isInteger(key)) {
            user.setSelfId(Integer.parseInt(key));
        } else {
            user.setSelfName(key);
        }
        user.setSelfPass(CommonUtils.md5(password));
        SelfUser selfUser = selfUserMapper.selectByUsernameSelfIdSelective(user);
        if (selfUser != null) {
            // TODO 登录信息缓存redis 后期追加
            return Integer.toString(selfUser.getSelfStatus());
        } else {
            if (StringUtils.isNotBlank(user.getSelfName())) {
                return "username is not exist";
            } else {
                return "self id is not exist";
            }
        }
    }

}
