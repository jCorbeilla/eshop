package com.eshop.eshop.item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jeremy Corbeilla <jeremy.corbeilla@fairfair.com>
 */
@RestController
@RequestMapping(path = "api/v1/item")
public class ItemController {

    @GetMapping
    public List<Item> getItems(){
        return List.of(new Item(
                1L,
                "Samsung Screen UHD panoramic",
                750,
                "it's a very beautifull and ergonomic screen",
                12

        ));
    }
}
