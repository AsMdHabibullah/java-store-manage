package giantdev.microstore.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Store {

  @Id
  private String sid;
  private String sname;
  private String sphone;
  private String scountry;
  private String sgid;
  private String smail;
  private String saddress;

  @OneToMany(mappedBy = "store")
  private List<Product> products;

  public Store(String sid, String sname, String sphone, String scountry, String sgid, String smail, String saddress) {
    this.sid = sid;
    this.sname = sname;
    this.sphone = sphone;
    this.scountry = scountry;
    this.sgid = sgid;
    this.smail = smail;
    this.saddress = saddress;
  }

  public String getSid() {
    return this.sid;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public String getSname() {
    return this.sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }

  public String getSphone() {
    return this.sphone;
  }

  public void setSphone(String sphone) {
    this.sphone = sphone;
  }

  public String getScountry() {
    return this.scountry;
  }

  public void setScountry(String scountry) {
    this.scountry = scountry;
  }

  public String getSgid() {
    return this.sgid;
  }

  public void setSgid(String sgid) {
    this.sgid = sgid;
  }

  public String getSmail() {
    return this.smail;
  }

  public void setSmail(String smail) {
    this.smail = smail;
  }

  public String getSaddress() {
    return this.saddress;
  }

  public void setSaddress(String saddress) {
    this.saddress = saddress;
  }

  public List<Product> getProducts() {
    return this.products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

}