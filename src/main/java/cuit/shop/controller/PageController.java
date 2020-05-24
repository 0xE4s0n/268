package cuit.shop.controller;

import cuit.shop.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @Autowired
    private GoodService goodService;
    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("goods", goodService.GoodList());
        return "index";
    }
    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("goods", goodService.GoodList());
        return "login";
    }
}
