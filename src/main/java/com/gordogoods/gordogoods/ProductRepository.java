package com.gordogoods.gordogoods;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<StickerProduct> _mockProducts;

    private List<StickerImage> _mockImages;

    public InputStreamResource getImage(int id) throws IOException {
        for (StickerImage image : _mockImages) {
            if (image.getId() == id) {
                return image.getImage();
            }
        }
        return null;
    }

    public byte[] getPicture(int id) throws IOException {
        for (StickerImage image : _mockImages) {
            if (image.getId() == id) {
                return image.getPicture();
            }
        }
        return null;
    }


    private void CreateMockData() throws IOException {
      _mockProducts = new ArrayList<StickerProduct>();
      _mockProducts.add( new StickerProduct(01, "A Sticker", 5.99));
      _mockProducts.add( new StickerProduct(02, "Another Sticker", 6.99));
      _mockProducts.add( new StickerProduct(03, "Final Sticker", 7.99));

      _mockImages = new ArrayList<StickerImage>();
      _mockImages.add(new StickerImage(01, "/image/almost.png"));
    }
    public ProductRepository() throws IOException {

            CreateMockData();


    }

    public StickerProduct getStickerProduct(int id) {
        for (StickerProduct product : _mockProducts) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}
