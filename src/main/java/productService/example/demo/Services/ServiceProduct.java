package productService.example.demo.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import productService.example.demo.DTO.DTOCategory;
import productService.example.demo.DTO.DTOProduct;

@Service
public class ServiceProduct {
    RestTemplate restTemplate = new RestTemplate();
    String url ="https://fakestoreapi.com";


    public DTOProduct getProductById(int id){
        var response = restTemplate.getForObject(url + "/products/" + id, DTOProduct.class);
        return response;
    }

    public DTOProduct[] getAllProduct(){
        var response = restTemplate.getForObject(url + "/products", DTOProduct[].class);
        return response;
    }

    public DTOCategory[] getProductByCategories(){
        var response = restTemplate.getForObject(url + "/products/categories", DTOCategory[].class);
        return response;
    }
}
