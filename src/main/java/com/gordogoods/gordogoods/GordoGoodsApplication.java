package com.gordogoods.gordogoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@SpringBootApplication
public class GordoGoodsApplication {

//	@CrossOrigin
//	@GetMapping("/getAllItems")
//	public List<StickerProduct> getItems() {
//	}

	public static void main(String[] args) {
		SpringApplication.run(GordoGoodsApplication.class, args);
	}


}
