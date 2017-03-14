package customer.manager.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("customer.manager.domain")
@ComponentScan("customer.manager.infra")
public class Startup {

  public static void main(String[] args) {
    SpringApplication notificationMicroService = new SpringApplication(Startup.class);
    notificationMicroService.addListeners(new ApplicationPidFileWriter("customer-manager-rest.pid"));
    notificationMicroService.run(args);
  }

  @Bean
  public DiscoveryClientController discoveryClientController() {
    return new DiscoveryClientController();
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurerAdapter() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/customer").allowedOrigins("*");
      }
    };
  }

}
