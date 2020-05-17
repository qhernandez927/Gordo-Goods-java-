package com.gordogoods.gordogoods;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

@CrossOrigin
@RestController
public class RestWebController {
    private ProductRepository _mockRepisitory;

    public RestWebController() throws IOException {
        _mockRepisitory = new ProductRepository();

    }

    @CrossOrigin
    @GetMapping("/getStickerProducts")
    public ResponseEntity<List<StickerProduct>> getStickerProduct() {

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(_mockRepisitory.getStickerProducts());
    }

    @GetMapping(value = "/getStickerProduct/{id}")
    public ResponseEntity<StickerProduct> getStickerProduct(@PathVariable int id) {

        StickerProduct oneSticker = _mockRepisitory.getStickerProduct(id);


        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(oneSticker);
    }

    @GetMapping(value = "/getImage/{id}")
    public ResponseEntity<InputStreamResource> getImage(@PathVariable int id) throws IOException {

        StickerProduct product = _mockRepisitory.getStickerProduct(id);

        var imgFile = new ClassPathResource(product.getImgPath());

        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(new InputStreamResource(imgFile.getInputStream()));
    }

    @GetMapping(value = "/test")
    public ResponseEntity testRequest() {

        return ResponseEntity
                .ok()
                .body("Hey There");
    }


}



