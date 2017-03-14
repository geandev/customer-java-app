

package customer.manager.domain.commands;

/**
 * Command for register a new Customer
 */
public class CustomerRegisterCommandImp {
  private String name;
  private String email;
  private String phone;

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
