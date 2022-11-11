package com.sfs._SFS.controller;

import com.sfs._SFS.model.Product;
import com.sfs._SFS.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model){
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(Product p, Model model) {
        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute(products);

        return "products.html";
    }
}
