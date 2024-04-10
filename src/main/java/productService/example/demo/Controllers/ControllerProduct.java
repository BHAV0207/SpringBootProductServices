package productService.example.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import productService.example.demo.DTO.FakeStoreDTOProduct;
import productService.example.demo.Models.ModelProduct;
import productService.example.demo.Services.ServiceProduct;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * ControllerProduct
 */
@RestController
public class ControllerProduct {
    ServiceProduct sc;

    ControllerProduct(ServiceProduct sc){
        this.sc = sc;
    }

    @GetMapping("/products/{id}")
    public ModelProduct getProductById(@PathVariable int id){
        return sc.getProductById(id);
    }

    @GetMapping("/products")
    public List<ModelProduct> getAllProducts() {
        return sc.getAllProducts();    
    }
    
    
    
}