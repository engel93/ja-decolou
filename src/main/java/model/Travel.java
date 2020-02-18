package model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "travel")
public class Travel implements BaseEntity{
    @Id
    @GeneratedValue(generator = "travel_seq", strategy = GenerationType.AUTO)
    @Column(name = "travel_id")
    private Long id;

    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "SalesOrder")
    private List<SalesOrder> salesOrders;

  //  private Travel(){
   //     salesOrders = new ArrayList<SalesOrder>();
   // }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

   // public List<SalesOrder> getSalesOrders() {
  //      return salesOrders;
 //   }

   // public void setSalesOrders(List<SalesOrder> salesOrders) {
   //     this.salesOrders = salesOrders;
   // }
}
