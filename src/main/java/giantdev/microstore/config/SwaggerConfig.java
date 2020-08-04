package giantdev.microstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
  @Bean
  public Docket storeApi() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("giantdev.microstore.controller")).paths(regex(".*")).build()
        .apiInfo(metaInfo());
  }

  private ApiInfo metaInfo() {

    ApiInfo apiInfo = new ApiInfo("Store API documentation",
        "Technology: Java, Maven, Spring, Spring Boot, SQL", "1.0", "Terms of Service",
        new Contact("Store", "https://asmdhabibullah.com", "contact@asmdhabibullah.com"), "Licence version: 1.0",
        "https://github.com");
    return apiInfo;

  }

}