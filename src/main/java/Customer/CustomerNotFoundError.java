package Customer;

public class CustomerNotFoundError extends RuntimeException {
CustomerNotFoundError(long id){
super(String.format("Customer %S not found!", id));
};

}
