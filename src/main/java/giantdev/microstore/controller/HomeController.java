package giantdev.microstore.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@CrossOrigin
@RequestMapping("/")
@Api(value = "Home page", description = "It's will shows project document page.")
public class HomeController {

  @ApiOperation(value = "Document page")
  @ApiResponse(code = 200, message = "Successfully shows the documentation page.")
  @GetMapping()
  public String home() {
    return "Store API is working.";
  }

}