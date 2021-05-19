package skcc.dtlv2clone;


import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order{


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    private Long productId;
    private String productName;
    private int quantity;
    private int price;
    private String customerName;
    private String customerAdder;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAdder() {
        return customerAdder;
    }

    public void setCustomerAdder(String customerAdder) {
        this.customerAdder = customerAdder;
    }



    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", customerName='" + customerName + '\'' +
                ", customerAdder='" + customerAdder + '\'' +
                '}';
    }



}
