package customer.manager.domain.model;

import customer.manager.domain.model.builders.CustomerBuilder;

public class Customer extends ModelBase {

  private final String name;
  private final String email;
  private final String phone;

  private Customer(CustomerBuilder builder) {
    this.name = builder.getName();
    this.email = builder.getEmail();
    this.phone = builder.getPhone();
  }

  public static Customer create(CustomerBuilder builder) {
    return new Customer(builder);
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhone() {
    return this.phone;
  }
}
