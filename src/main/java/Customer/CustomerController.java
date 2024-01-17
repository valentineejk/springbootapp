package Customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    private  CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/customers")
    List<Customer> all(){
        return repo.findAll();
    }

    @GetMapping("/customers/{id}")
    Customer getOne(@PathVariable Long id){
        return repo.findById(id).orElseThrow(()-> new CustomerNotFoundError(id));
    }
    @PostMapping("/add-customer")
    Customer addCustomer(@RequestBody Customer newCustomer){
        return repo.save(newCustomer);
    }

    @DeleteMapping("/customer/{id}")
    void delteCustomer(@PathVariable Long id){
         repo.deleteById(id);
    }
}
