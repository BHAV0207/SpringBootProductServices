package productService.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * ModelProduct
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ModelProduct {
    @Id
    private int id;
    private String title;
    private double price;
    @ManyToOne
    private  ModelCategory category;
    private String description;
    private String image;
    
}