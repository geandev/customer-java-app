package customer.manager.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import customer.manager.domain.commands.CustomerRegisterCommandImp;
import customer.manager.domain.model.Customer;
import customer.manager.domain.model.builders.CustomerBuilder;
import customer.manager.domain.repositories.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

  private CustomerRepository customerRepository;

  @Autowired
  public CustomerServiceImp(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  public void execute(CustomerRegisterCommandImp command) {
    Customer customer = Customer.create(CustomerBuilder
    .create(command.getName())
    .email(command.getEmail())
    .phone(command.getPhone()));

    this.customerRepository.registerCustomer(customer);

  }

  public List<Customer> getAll() {
    return this.customerRepository.getAllCustomer();
  }

}
