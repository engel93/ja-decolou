package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "customer")
public class Customer implements BaseEntity {

    @Id
    @GeneratedValue(generator = "customer_seq", strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "identifier")
    private String identifier;

//    @OneToMany
//    @JoinColumn(name = "id", columnDefinition = "order_id")
//    private List<SalesOrder> salesOrders;

  //  public Customer(){
  //      salesOrders = new ArrayList<SalesOrder>();
  //  }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

 //   public List<SalesOrder> getSalesOrders() {
   //     return salesOrders;
  //  }

   // public void setSalesOrders(List<SalesOrder> salesOrders) {
   //     this.salesOrders = salesOrders;
  //  }
}
