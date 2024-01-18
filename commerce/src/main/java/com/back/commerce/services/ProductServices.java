package com.back.commerce.services;

import com.back.commerce.domain.Product;
import com.back.commerce.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired
    private ProductRespository productRespository;

    public ResponseEntity<?> create (@RequestBody Product request){
        Product response = productRespository.save (request);
        return new ResponseEntity<> (response, HttpStatus.CREATED);
    }
    public ResponseEntity<?> delete(@PathVariable Long id){
        productRespository.deleteById (id);
        return new ResponseEntity<> (HttpStatus.OK);
    }
    public List<Product> list() {
        return productRespository.findAll ();
    }
    public Optional<Product> listById(@PathVariable Long id){
        return productRespository.findById (id);
    }
}
