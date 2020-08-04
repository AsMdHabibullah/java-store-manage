package giantdev.microstore.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {

  @Id
  private String pid;
  private String pname;
  private Integer pamount;
  private Integer pquantity;
  private String pdescription;

  @OneToOne
  private Store store;

  public Product(String pid, String pname, Integer pamount, Integer pquantity, String ptitle, String pdescription) {
    this.pid = pid;
    this.pname = pname;
    this.pamount = pamount;
    this.pquantity = pquantity;
    this.pdescription = pdescription;
  }

  public String getPid() {
    return this.pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public String getPname() {
    return this.pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public Integer getPamount() {
    return this.pamount;
  }

  public void setPamount(Integer pamount) {
    this.pamount = pamount;
  }

  public Integer getPquantity() {
    return this.pquantity;
  }

  public void setPquantity(Integer pquantity) {
    this.pquantity = pquantity;
  }

  public String getPdescription() {
    return this.pdescription;
  }

  public void setPdescription(String pdescription) {
    this.pdescription = pdescription;
  }

}