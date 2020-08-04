package giantdev.microstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import giantdev.microstore.models.Store;
import giantdev.microstore.repository.StoreRepo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
@Api(value = "store", description = "Store routing.")
public class StoreController {

  @Autowired
  StoreRepo storeRepo;

  @ApiOperation(value = "Output: All store.")
  @ApiResponse(code = 200, message = "Successfully shows the all store.")
  @GetMapping("/stores")
  public List<Store> getStores() {
    return storeRepo.findAll();
  }

  @ApiOperation(value = "Output: Create new store.")
  @ApiResponse(code = 201, message = "Successfully created a store.")
  @PostMapping(path = "/store", consumes = { "application/json" })
  public Store postStore(@RequestBody Store store) {
    // System.out.println("New store:" + store);
    storeRepo.save(store);
    return store;
  }

  @ApiOperation(value = "Output: Update existing store.")
  @ApiResponse(code = 201, message = "Successfully updated the store.")
  @PutMapping(value = "/store/{sgid}", consumes = { "application/json" })
  public Store saveOrUpdateStore(@PathVariable String sgid, @RequestBody Store store) {
    storeRepo.save(store);
    System.out.println("Store gov. id: " + sgid);
    return store;
  }

  @ApiOperation(value = "Output: Delete existing store.")
  @ApiResponse(code = 200, message = "Successfully deleted the store.")
  @DeleteMapping("/store/{sgid}")
  public String deleteStore(@PathVariable int sgid) {
    Store store = storeRepo.getOne(sgid);
    storeRepo.delete(store);
    return "Store deletade successfully" + sgid;
  }
}