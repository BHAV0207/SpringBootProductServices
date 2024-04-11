package productService.example.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import productService.example.demo.DTO.ExceptionDto;
import productService.example.demo.DTO.FakeStoreDTOProduct;
import productService.example.demo.Models.ModelProduct;
import productService.example.demo.Services.ServiceProduct;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




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

        // ResponseEntity<ModelProduct> respEntity = null;
        // ModelProduct product = null;

        // try{
        //     product = ServiceProduct.getProductById(id);
        //     respEntity = new ResponseEntity<>(product , HttpStatus.OK);
        //     return respEntity;
        // }
        // catch(RuntimeException exception){
        //     ExceptionDto dto = new ExceptionDto();
        //     dto.setMessage("something went wrong");
        //     ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto , HttpStatus.NOT_FOUND);

        //     return response;

        // }

        return sc.getProductById(id);
    }

    @GetMapping("/products")
    public List<ModelProduct> getAllProducts() {
        return sc.getAllProducts();    
    }

    @PostMapping("/products")
    public ModelProduct AddNewProduct(@RequestBody ModelProduct newProduct) {
        return sc.AddNewProduct(newProduct);
    }

   
    
    
    
}