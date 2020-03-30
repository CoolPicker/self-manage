package com.nya.manage.controller;

import com.nya.manage.constant.SelfManagementConstants;
import com.nya.manage.entity.Clothes;
import com.nya.manage.entity.ResponseData;
import com.nya.manage.mapper.ClothesMapper;
import com.nya.manage.utils.ImgUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @Description TODO
 * @Author nya
 * @Date 2020/3/30 上午11:38
 **/
@RequestMapping("/cloth")
@RestController
@Slf4j
public class ClothesController {

    @Autowired
    private ClothesMapper clothesMapper;

    /**
     * 新增衣物
     * @param image
     * @param storageId
     * @return
     */
    @PostMapping("/add")
    public ResponseData addClothes(@RequestParam(value="image") MultipartFile image,
                                   @RequestParam("storageId")Integer storageId) {

        Clothes clothes = new Clothes();
        Integer maxId = clothesMapper.selectMaxId();
        int id;
        if (maxId != null) {
            id = maxId + 1;
        } else {
            id = 1;
        }
        clothes.setId(id);
        String fileName = id + ".jpg";

        String filePath = SelfManagementConstants.LOCAL_PATH+fileName;
        File desFile = new File(filePath);
        try {
            if (desFile.exists()) {
                desFile.delete();
            }
            image.transferTo(desFile);
            new Thread(() -> ImgUtils.reduceImg(filePath)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String urlPath = SelfManagementConstants.URL_PATH + fileName;
        clothes.setImageUrl(urlPath);
        clothes.setStorageId(storageId);
        int i = clothesMapper.insertSelective(clothes);
        return ResponseData.ok().putDataValue("result",i);
    }


    @PostMapping("/update")
    public ResponseData updateClothes(MultipartFile image,
                                   Integer storageId,
                                      Integer id) {

        Clothes clothes = new Clothes();
        clothes.setId(id);
        if (image != null && image.getSize() > 0) {
            String fileName = id + ".jpg";
            String filePath = SelfManagementConstants.LOCAL_PATH+fileName;
            File desFile = new File(filePath);
            try {
                if (desFile.exists()) {
                    desFile.delete();
                }
                image.transferTo(desFile);
                new Thread(() -> ImgUtils.reduceImg(filePath)).start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (storageId != null) {
            clothes.setStorageId(storageId);
        }

        int i = clothesMapper.updateByPrimaryKeySelective(clothes);
        return ResponseData.ok().putDataValue("result",i);
    }

    /**
     * 获取某储物箱下所有衣物
     * @param storageId
     * @return
     */
    @GetMapping("/clothes")
    public ResponseData queryClothesByStorageId(@RequestParam(name = "storageId") Integer storageId) {
        List<Clothes> clothes = clothesMapper.selectByStorageId(storageId);
        return ResponseData.ok().putDataValue("result",clothes);
    }

    /**
     * 丢弃某衣物
     * @param clothId
     * @return
     */
    @GetMapping("/discard")
    public ResponseData discardClothes(Integer clothId) {
        return ResponseData.ok().putDataValue("result","");
    }

}
