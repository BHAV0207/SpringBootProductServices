package productService.example.demo.Services;

import java.util.List;

import productService.example.demo.DTO.FakeStoreDTOProduct;
//import productService.example.demo.DTO.FakeStoreDTOProduct;
import productService.example.demo.Models.ModelProduct;

/**
 * ServiceProductInterface
 */
public interface ServiceProductInterface {

    public ModelProduct ConvertDtoToModel(FakeStoreDTOProduct response);

    public ModelProduct getProductById(int id);

    public List<ModelProduct> getAllProducts();

    public ModelProduct AddNewProduct(ModelProduct newProduct);

    public ModelProduct updateProduct(ModelProduct updatePro ,  int id);

   




     
}