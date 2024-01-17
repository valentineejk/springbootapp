package Customer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice

public class CustomerNotFoundHelper {

    @ResponseBody
    @ExceptionHandler(CustomerNotFoundError.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String customerErrorHandler(CustomerNotFoundError e){
    return e.getMessage();
    }
}
