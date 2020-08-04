package giantdev.microstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import giantdev.microstore.models.Product;
import giantdev.microstore.repository.ProductRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/api/{sid}")
@Api(value = "product", description = "Product routing.")
public class ProductController {

  @Autowired
  ProductRepo productRepo;

  @ApiOperation(value = "Output: All product.")
  @ApiResponse(code = 200, message = "Successfully shows the all product.")
  @GetMapping("/products")
  public List<Product> getProducts() {
    return productRepo.findAll();
  }

  @ApiOperation(value = "Output: Create new product.")
  @ApiResponse(code = 201, message = "Successfully created a product.")
  @PostMapping(path = "/product", consumes = { "application/json" })
  public Product postProduct(@RequestBody Product product) {
    productRepo.save(product);
    return product;
  }

  @ApiOperation(value = "Output: Update the existing product.")
  @ApiResponse(code = 200, message = "Successfully updated the product.")
  @PutMapping(value = "/product/{pid}", consumes = { "application/json" })
  public Product saveOrUpdateProduct(@PathVariable String pid, @RequestBody Product product) {
    productRepo.save(product);
    System.out.println("Product id: " + pid);
    return product;
  }

  @ApiOperation(value = "Output: Delete existing product.")
  @ApiResponse(code = 200, message = "Successfully deleted the product.")
  @DeleteMapping("/product/{pid}")
  public String deleteProduct(@PathVariable int pid) {
    Product product = productRepo.getOne(pid);
    productRepo.delete(product);
    return "Store deletade successfully" + pid;
  }

}