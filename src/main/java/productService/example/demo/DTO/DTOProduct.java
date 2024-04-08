package productService.example.demo.DTO;

import lombok.Getter;
import lombok.Setter;

/**
 * DTOProduct
 */
@Setter
@Getter
public class DTOProduct {
    private int id;
    private String title; 
    private double price;
    private String category;
    private String description ;
    private String image;
}