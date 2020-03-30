package com.nya.manage.utils;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import lombok.extern.slf4j.Slf4j;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/**
 * @Description TODO
 * @Author nya
 * @Date 2020/3/30 下午6:58
 **/
@Slf4j
public class ImgUtils {

    /**
     * 获取图片宽度和高度
     *
     * @param file
     * @return 返回图片的宽度
     */
    public static int[] getImgWidthHeight(File file) {
        InputStream is = null;
        BufferedImage src = null;
        int result[] = { 0, 0 };
        try {
            // 获得文件输入流
            is = new FileInputStream(file);
            // 从流里将图片写入缓冲图片区
            src = ImageIO.read(is);
            result[0] =src.getWidth(null); // 得到源图片宽
            result[1] =src.getHeight(null);// 得到源图片高
            is.close();  //关闭输入流
        } catch (Exception ef) {
            ef.printStackTrace();
        }

        return result;
    }

    /**
     * 图片压缩
     * @param imgSrc
     */
    public static void reduceImg(String imgSrc) {
        try {
            File srcfile = new File(imgSrc);
            //获得源图片的宽高存入数组中
            int[] results = getImgWidthHeight(srcfile);
            int width = results[0];
            int height = results[1];
            log.info("width -- [{}],height -- [{}]",width,height);
            if (width > 480) {
                double rate = (double) 480 / width;
                width = (int) (width * rate);
                height = (int) (height * rate);
            } else {
                return;
            }
            // 开始读取文件并进行压缩
            Image src = ImageIO.read(srcfile);

            // 构造一个类型为预定义图像类型之一的 BufferedImage
            BufferedImage tag = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            //绘制图像  getScaledInstance表示创建此图像的缩放版本，返回一个新的缩放版本Image,按指定的width,height呈现图像
            //Image.SCALE_SMOOTH,选择图像平滑度比缩放速度具有更高优先级的图像缩放算法。
            tag.getGraphics().drawImage(src.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);

            //创建文件输出流
            FileOutputStream out = new FileOutputStream(imgSrc);
            //将图片按JPEG压缩，保存到out中
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(tag);
            int[] last = getImgWidthHeight(srcfile);
            log.info("last width -- [{}],height -- [{}]",last[0],last[1]);
            //关闭文件输出流
            out.close();
        } catch (Exception ef) {
            ef.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String path = "/data/nya/images/1.jpg";
        reduceImg(path);
    }


}
