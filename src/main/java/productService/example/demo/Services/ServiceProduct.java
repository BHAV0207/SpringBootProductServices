package productService.example.demo.Services;

import java.util.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

//import ch.qos.logback.core.model.Model;
import productService.example.demo.DTO.FakeStoreDTOProduct;
import productService.example.demo.Exception.productNotFound;
import productService.example.demo.Models.ModelCategory;
import productService.example.demo.Models.ModelProduct;

/**
 * ServiceProduct
 */

@Service
public class ServiceProduct implements ServiceProductInterface{

    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com";

    @Override

    public ModelProduct ConvertDtoToModel(FakeStoreDTOProduct response){
        ModelProduct product = new ModelProduct();
        product.setId(response.getId());
        product.setTitle(response.getTitle());
        product.setPrice(response.getPrice());
        product.setDescription(response.getDescription());
        product.setImage(response.getImage());

        ModelCategory category = new ModelCategory();
        category.setDescription(response.getCategory());
        product.setCategory(category);
 
        return product;
    }


    public ModelProduct getProductById(int id) {
        // using this would give arthematic error exception
        // int x = 1/0;
        FakeStoreDTOProduct response = restTemplate.getForObject(url +"/products/"+ id, FakeStoreDTOProduct.class);

        if(response == null){
            throw new productNotFound("please add a valid product id");
        }
        return ConvertDtoToModel(response);
    }

    public List<ModelProduct> getAllProducts(){
        FakeStoreDTOProduct[] response = restTemplate.getForObject(url + "/products",FakeStoreDTOProduct[].class );
        

        List<ModelProduct> prod = new ArrayList<>();
        for(FakeStoreDTOProduct resp :  response){
            prod.add(ConvertDtoToModel(resp));
        }
        return prod;
    }



    public ModelProduct AddNewProduct(ModelProduct newProduct){
        FakeStoreDTOProduct newFakeProduct = new FakeStoreDTOProduct();
        newFakeProduct.setTitle(newProduct.getTitle());
        newFakeProduct.setPrice(newProduct.getPrice());
        newFakeProduct.setDescription(newProduct.getDescription());
        newFakeProduct.setImage(newProduct.getImage());
        newFakeProduct.setCategory(newProduct.getCategory().getTitle());
        FakeStoreDTOProduct response = restTemplate.postForObject(url + "/products", newFakeProduct, FakeStoreDTOProduct.class);
        return ConvertDtoToModel(response);
    }
     
}