package bio.terra.swagger_oidc;

import build.swagger_oidc.generated.controller.DefaultApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class AppController implements DefaultApi {
  @Autowired
  public AppController() {
  }

  @Override
  public ResponseEntity<Void> apiUserUsernameGet(String username) {
    return ResponseEntity.ok(null);
  }
}
