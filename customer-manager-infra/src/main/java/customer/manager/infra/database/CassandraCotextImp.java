package customer.manager.infra.database;

import org.springframework.stereotype.Service;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

@Service
public class CassandraCotextImp implements ContextBase {
  public Session getSession() {
    return null;
  }
}
