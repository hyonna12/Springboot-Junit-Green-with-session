package site.metacoding.firstapp.domain.product;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
  private Integer productId;
  private String productName;
  private Integer productPrice;
  private Integer productQty;
  private Timestamp createdAt;

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  private Product() {
  } // MyBatis에게 필요한 것

  public Product(String productName, Integer productPrice, Integer productQty) {
    this.productName = productName;
    this.productPrice = productPrice;
    this.productQty = productQty;
  }

  public void update(Product product) {
    this.productName = product.getProductName();
    this.productPrice = product.getProductPrice();
    this.productQty = product.getProductQty();
  } // update 할 때 사용(데이터를 변경할 때)

}
