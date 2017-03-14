package customer.manager.infra.database;

import org.springframework.stereotype.Service;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

@Service
public class CassandraCotextImp implements ContextBase {

  private static final String SERVER_IP = "127.0.0.1";
  private static final String DATABASE = "customer";
  private final Session session;

  public CassandraCotextImp() {
    Cluster cluster = Cluster.builder().addContactPoint(SERVER_IP).build();
    session = cluster.connect(DATABASE);
  }

  public Session getSession() {
    return this.session;
  }
}
