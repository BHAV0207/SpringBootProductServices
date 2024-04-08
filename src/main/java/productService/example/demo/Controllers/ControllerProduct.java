package productService.example.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import productService.example.demo.DTO.DTOCategory;
import productService.example.demo.DTO.DTOProduct;
import productService.example.demo.Services.ServiceProduct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class ControllerProduct {
    ServiceProduct sc;
    ControllerProduct(ServiceProduct sc){
        this.sc = sc;
    }

    @GetMapping("/products/{id}")
    public DTOProduct getProductById(@PathVariable int id){
        return sc.getProductById(id);
    }

    @GetMapping("/products")
    public DTOProduct[] getAllProduct(){
        return sc.getAllProduct();
    }

    @GetMapping("/categories")
    public DTOCategory[] getProductByCategories(){
        return sc.getProductByCategories();
    }
    
    
    
    
}
