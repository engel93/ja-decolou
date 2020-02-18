package model;

import javax.persistence.*;

@Entity
@Table(name = "sales_order_item")
public class SalesOrderItem implements BaseEntity{
    @Id
    @GeneratedValue(generator = "item_seq", strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;

    @Column(name = "price")
    private Double price;

    @Column(name = "from")
    private String from;

    @Column(name = "to")
    private String to;

//    @OneToOne
//    @JoinColumn(name = "id_vehicle")
//    private Vehicle vehicle;

    public SalesOrderItem(Long id, Double price, String from, String to) {
        this.id = id;
        this.price = price;
        this.from = from;
        this.to = to;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

  //  public Vehicle getVehicle() {
   //     return vehicle;
   // }

    //public void setVehicle(Vehicle vehicle) {
    //    this.vehicle = vehicle;
    //}
}
