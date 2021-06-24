package bio.terra.swagger_oidc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SwaggerOidcApplication {

  public static void main(String[] args) {
    SpringApplication.run(SwaggerOidcApplication.class, args);
  }

}
