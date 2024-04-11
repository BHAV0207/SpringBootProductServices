package productService.example.demo.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import productService.example.demo.DTO.ExceptionDto;

@ControllerAdvice
public class exceptionHandler {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ExceptionDto> handleArthematicException() {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Something went wrong");
        dto.setResoluution("Arthematic error exception");
        ResponseEntity<ExceptionDto> response= new ResponseEntity<>(dto , HttpStatus.BAD_REQUEST);
        return response;

    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public ResponseEntity<ExceptionDto> handleIndexOutOfBoundException() {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Something went wrong");
        dto.setResoluution("Array index out of bound error exception");
        ResponseEntity<ExceptionDto> response= new ResponseEntity<>(dto , HttpStatus.BAD_REQUEST);
        return response;

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDto> handleException() {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage("Something went wrong");
        dto.setResoluution("exception");
        ResponseEntity<ExceptionDto> response= new ResponseEntity<>(dto , HttpStatus.BAD_REQUEST);
        return response;

    }


}
