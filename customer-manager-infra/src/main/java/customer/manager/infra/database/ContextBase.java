package customer.manager.infra.database;

import com.datastax.driver.core.Session;

@FunctionalInterface
public interface ContextBase {
  /**
   * Get Session for execute commands on database
   * @return Session for execute commands on database
   */
  Session getSession();
}
