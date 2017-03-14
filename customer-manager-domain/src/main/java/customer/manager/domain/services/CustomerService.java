package customer.manager.domain.services;

import java.util.List;

import customer.manager.domain.commands.CommandHandle;
import customer.manager.domain.commands.CustomerRegisterCommandImp;
import customer.manager.domain.model.Customer;

public interface CustomerService extends CommandHandle<CustomerRegisterCommandImp> {
   /**
   * get all customer from repositorie
   * @return List<Customer>
   */
	List<Customer> getAll();
}
