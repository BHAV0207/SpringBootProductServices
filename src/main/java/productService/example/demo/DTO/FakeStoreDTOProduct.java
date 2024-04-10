package productService.example.demo.DTO;

import lombok.Getter;
import lombok.Setter;
//import productService.example.demo.Models.ModelCategory;

/**
 * FakeStoreDTOProduct
 */
@Getter
@Setter
public class FakeStoreDTOProduct {
    private int id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}