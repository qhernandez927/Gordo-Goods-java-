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
      _mockProducts.add( new StickerProduct(1, "Eye On The Pies Sticker", 5.99,"./assets/gordo-stickers/eye-on-the-pies.png"));
      _mockProducts.add( new StickerProduct(2, "Animal Gun Sticker", 6.99,"./assets/gordo-stickers/animal-gun.png"));
      _mockProducts.add( new StickerProduct(3, "Batty Boy Sticker", 7.99,"./assets/gordo-stickers/Batty_Boy.png"));
      _mockProducts.add( new StickerProduct(4, "Buggin' Out Sticker", 5.99,"./assets/gordo-stickers/buggin-out.png"));
      _mockProducts.add( new StickerProduct(5, "Elephant Sticker", 6.99,"./assets/gordo-stickers/elephant.png"));
      _mockProducts.add( new StickerProduct(6, "Pajaro Sticker", 7.99,"./assets/gordo-stickers/pajaro.png"));
      _mockProducts.add( new StickerProduct(7, "Robot Fish Tank Sticker", 6.99,"./assets/gordo-stickers/robot-fish-tank.png"));
      _mockProducts.add( new StickerProduct(8, "Robot Jesus Sticker", 7.99,"./assets/gordo-stickers/robot-jesus.png"));
      _mockProducts.add( new StickerProduct(9, "Same Future Sticker", 5.99,"./assets/gordo-stickers/same-future.png"));
      _mockProducts.add( new StickerProduct(10, "Yuck Burger Sticker", 6.99,"./assets/gordo-stickers/youck-burger.png"));
      _mockProducts.add( new StickerProduct(11, "Feed Us Records Sticker", 7.99,"./assets/gordo-stickers/feed-us-records.png"));
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
