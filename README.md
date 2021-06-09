# Swagger UI Auth Sandbox

This is a very simple Spring Boot project to be able to rapidly test drive the
auth capabilities of different versions of swagger-ui, as specified by this
line in `build.gradle`:
```
dependencies {
  ...

  swaggerUI 'org.webjars:swagger-ui:3.49.0'

  ...
```

A very simple API and set of auth schemes are defined in 
[`src/main/resources/apilopenapi.yaml`](src/main/resources/api/openapi.yaml).


Running the Swagger UI to experiment with auth types can be achived by running
`./gradlew bootRun` and browsing to [http://localhost:8080](http://localhost:8080).