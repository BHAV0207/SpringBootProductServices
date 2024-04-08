package productService.example.demo.Services;

import productService.example.demo.DTO.DTOProduct;

public interface ServiceProductInterface {
    public DTOProduct getProductById(int id);

    public DTOProduct[] getAllProduct();

    public DTOProduct[] getProductByCategories();


}