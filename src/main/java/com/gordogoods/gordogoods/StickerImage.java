package com.gordogoods.gordogoods;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.InputStreamResource;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class StickerImage {

    private int id;
    private InputStreamResource image;
    private byte[] picture;

    public StickerImage(int id, InputStreamResource image) {
        this.id = id;
        this.image = image;
    }

    public StickerImage(int id, String path) throws IOException {
        this.id = id;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        URL tempUrl = classLoader.getResource(path);
        String filePath = classLoader.getResource(path).getPath();
        InputStream in = new FileInputStream(filePath);
        this.picture = in.readAllBytes();
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public InputStreamResource getImage() {
        return image;
    }

    public void setImage(InputStreamResource image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}
