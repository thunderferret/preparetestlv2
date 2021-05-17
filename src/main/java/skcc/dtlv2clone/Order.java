package skcc.dtlv2clone;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PostPersist;

@Entity
public class Order{

    @Id
            @GeneratedValue
    Long id;

    String name;
    String customerid;
    double price;
    int quantity;


    @PostPersist
    private void publishOrderPlaced(){
        OrderPlaced orderPlaced = new OrderPlaced();

        orderPlaced.setOrderId(id);

        kafka.send(orderPlaced);


    }

    private

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerid='" + customerid + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

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

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
