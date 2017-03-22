package customer.manager.infra.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datastax.driver.core.Row;

import customer.manager.domain.model.Customer;
import customer.manager.domain.model.builders.CustomerBuilder;
import customer.manager.domain.repositories.CustomerRepository;
import customer.manager.infra.database.ContextBase;

@Service
public class CustomerRepositoryImp implements CustomerRepository {

  private static final String SELECT_QUERY = "SELECT * FROM customer";
  private static final String INSERT_QUERY = "INSERT INTO customer (id, name, email, phone) VALUES (%s, '%s', '%s', '%s')";

  public List<Customer> getAllCustomer() {

    List<Customer> model = new ArrayList<>();

    return model;
  }

  public void registerCustomer(Customer customer) {

  }

}
