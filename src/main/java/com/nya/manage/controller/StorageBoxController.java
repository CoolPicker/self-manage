package com.nya.manage.controller;

import com.nya.manage.entity.Clothes;
import com.nya.manage.entity.ResponseData;
import com.nya.manage.entity.StorageBox;
import com.nya.manage.mapper.StorageBoxMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description TODO
 * @Author nya
 * @Date 2020/3/30 上午11:34
 **/
@RestController
@RequestMapping("/box")
@Slf4j
public class StorageBoxController {

    @Autowired
    private StorageBoxMapper storageBoxMapper;

    /**
     * 新增收纳箱
     * @param storageBox
     * @return
     */
    @PostMapping("/add")
    public ResponseData addNewStorageBox(StorageBox storageBox) {

        return ResponseData.ok().putDataValue("result","");
    }

    /**
     * 删除收纳箱
     * @param storageId
     * @return
     */
    @PostMapping("/delete")
    public ResponseData deleteStorageBox(Integer storageId) {

        return ResponseData.ok().putDataValue("result","");
    }

    @GetMapping("/query")
    public ResponseData queryStorageBoxes(){
        List<StorageBox> storageBoxes = storageBoxMapper.selectStorageBoxes();
        return ResponseData.ok().putDataValue("result",storageBoxes);
    }

}
