package skcc.dtlv2clone;


import javax.annotation.processing.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderPlaced {
    @Id
            @GeneratedValue
    Long orderId;
    String name;
    String userId;
    double price;
    int quantity;

    @Override
    public String toString() {
        return "OrderPlaced{" +
                "orderId=" + orderId +
                ", name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
