package stragety;

import java.math.BigDecimal;

public class DiscountOffer implements OfferStrategy {
    private double discount;

    public DiscountOffer(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public BigDecimal calculate(BigDecimal money) {
        return money.multiply(BigDecimal.valueOf(discount));
    }
}
