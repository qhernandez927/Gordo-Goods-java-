package com.gordogoods.gordogoods;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<StickerProduct> _mockProducts;

    public ProductRepository() throws IOException {

        CreateMockData();
    }

    private void CreateMockData() {
      _mockProducts = new ArrayList<StickerProduct>();
      _mockProducts.add( new StickerProduct(01, "A Sticker", 5.99,"/image/almost.png"));
      _mockProducts.add( new StickerProduct(02, "Another Sticker", 6.99,"Need Path"));
      _mockProducts.add( new StickerProduct(03, "Final Sticker", 7.99,"Need Path"));
    }

    public List<StickerProduct> getStickerProducts(){
        return this._mockProducts;
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
