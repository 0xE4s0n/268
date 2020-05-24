package cuit.shop.controller;


import cuit.shop.entity.Good;
import cuit.shop.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/good")
public class GoodController {
    @Autowired
    private GoodService goodService;
    @RequestMapping("/list_good")
    public List<Good> UserList() {
        return goodService.GoodList();
    }
}