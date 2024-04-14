package productService.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * ModelCategory
 */
@Getter
@Setter
@Entity
public class ModelCategory {
    @Id
    private int id;
    private String title;
    private String description;
}