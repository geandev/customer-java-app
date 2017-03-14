package customer.manager.domain.model.builders;

public class CustomerBuilder {
  private final String name;
  private String email;
  private String phone;

  private CustomerBuilder(String name) {
    this.name = name;
  }

  public static CustomerBuilder create(String name) {
    return new CustomerBuilder(name);
  }

  public CustomerBuilder email(String email) {
    this.email = email;
    return this;
  }

  public CustomerBuilder phone(String phone) {
    this.phone = phone;
    return this;
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
