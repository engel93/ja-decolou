package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "sales_order")
public class SalesOrder implements BaseEntity {
    @Id
    @GeneratedValue(generator = "order_seq", strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long id;

    @OneToMany(mappedBy = "SalesOrderItem")
    private List<SalesOrderItem> salesOrderItem;

    @Column(name = "price")
    private Double price;

    //private SalesOrder(){
    //    salesOrderItem = new ArrayList<SalesOrderItem>();
  //  }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

  //  public List<SalesOrderItem> getSalesOrderItem() {
  //      return salesOrderItem;
   // }

  //  public void setSalesOrderItem(List<SalesOrderItem> salesOrderItem) {
  //      this.salesOrderItem = salesOrderItem;
  //  }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
