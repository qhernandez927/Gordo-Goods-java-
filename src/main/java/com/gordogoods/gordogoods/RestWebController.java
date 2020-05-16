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
    @GetMapping("/getAllItems")
    public List<StickerProduct> getItems() {
        return null;
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
    public ResponseEntity<byte[]> getImage(@PathVariable int id) throws IOException {

    byte[] temp = _mockRepisitory.getPicture(id);
        return ResponseEntity
                .ok()
                .contentType(MediaType.IMAGE_PNG)
                .body(_mockRepisitory.getPicture(id));
    }

    @GetMapping(value = "/getImages")
    public ResponseEntity checkImage() throws IOException {



        return ResponseEntity
                .ok()
                .body("Hey There");
    }


}



