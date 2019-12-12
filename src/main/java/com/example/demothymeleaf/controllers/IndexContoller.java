package com.example.demothymeleaf.controllers;


import com.example.demothymeleaf.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContoller {

    private ProductService productService;


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }







    @RequestMapping("/")
    public String getIndex(Model model){

        model.addAttribute("products",productService.listProduct());

        return "index";
    }
}
