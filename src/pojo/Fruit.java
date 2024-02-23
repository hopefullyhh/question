package pojo;

import java.math.BigDecimal;

public abstract class Fruit {
    private String name;
    private BigDecimal price;
    private Boolean isDiscountCommodity = false;
    private double discount = 1d;
    private int orderedCount;

    public Boolean getDiscountCommodity() {
        return isDiscountCommodity;
    }

    public void setDiscountCommodity(Boolean discountCommodity) {
        isDiscountCommodity = discountCommodity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getOrderedCount() {
        return orderedCount;
    }

    public void setOrderedCount(int orderedCount) {
        this.orderedCount = orderedCount;
    }
}
