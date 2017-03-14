package customer.manager.domain.repositories;

import java.util.List;

import customer.manager.domain.model.Customer;

public interface CustomerRepository {
  /**
   * gel all customer from repositrie
   * @return List<Customer> 
   */
	List<Customer> getAllCustomer();

  /**
   * register a new customer on repositorie
   * @param Customer 
   */
	void registerCustomer(Customer customer);
}
