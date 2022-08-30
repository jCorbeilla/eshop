package com.eshop.eshop;

import com.eshop.eshop.items.Item;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class EshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(EshopApplication.class, args);
	}

	@GetMapping
	public List<Item> itemList(){
		return List.of(new Item(
				1L,
				"Samsung Screen UHD panoramic",
				750,
				"it's a very beautifull and ergonomic screen",
				12

		));
	}

}
