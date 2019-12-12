package com.example.demothymeleaf.controllers;


import com.example.demothymeleaf.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {


    private ProductService productService;


    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String getProduct() {


        return "redirect:/index";
//        return "product";
    }


    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model) {

        model.addAttribute("product", productService.getProduct(id));

        return "product";
    }


}
