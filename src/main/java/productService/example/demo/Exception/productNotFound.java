package productService.example.demo.Exception;

/**
 * productNotFound
 */
public class productNotFound extends RuntimeException{
    public productNotFound(String message){
        super(message);
    }
    
}