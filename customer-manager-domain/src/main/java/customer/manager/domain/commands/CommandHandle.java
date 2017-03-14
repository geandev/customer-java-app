package customer.manager.domain.commands;

@FunctionalInterface
public interface CommandHandle<T> {
  /**
   * execute a command on domain
   * @param command
   */
  void execute(T command);
}
