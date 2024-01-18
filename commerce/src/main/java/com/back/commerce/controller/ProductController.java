package com.back.commerce.controller;

import com.back.commerce.domain.Product;
import com.back.commerce.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:5173/")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Product request){
        return productServices.create (request);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        return productServices.delete (id);
    }

    @GetMapping("/list")
    public List<Product> list (){
        return productServices.list ();
    }
    @PutMapping("/listbyid/{id}")
    public Optional<Product> listById(@PathVariable Long id){
        return productServices.listById (id);
    }
}
