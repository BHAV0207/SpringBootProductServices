package productService.example.demo.Models;

import lombok.Getter;
import lombok.Setter;

/**
 * ModelProduct
 */
@Getter
@Setter
public class ModelProduct {
    private int id;
    private String title;
    private double price;
    private  ModelCategory category;
    private String description;
    private String image;
    
}