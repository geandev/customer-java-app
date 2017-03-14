package customer.manager.server.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Startup {
  public static void main(String[] args) {
    SpringApplication eurekaServer = new SpringApplication(Startup.class);
    eurekaServer.addListeners(new ApplicationPidFileWriter("customer-manager-server-eureka.pid"));
    eurekaServer.run(args);
  }
}
