package stragety;

import java.math.BigDecimal;

public class FullSubOffer implements OfferStrategy {
    private int fullSubMoney;
    private int fullSubCondition;

    public FullSubOffer(int fullSubCondition, int fullSubMoney) {
        this.fullSubCondition = fullSubCondition;
        this.fullSubMoney = fullSubMoney;
    }

    @Override
    public BigDecimal calculate(BigDecimal money) {
        if (money.compareTo(BigDecimal.valueOf(fullSubCondition)) > 0) {
            money = money.subtract(BigDecimal.valueOf(fullSubMoney));
        }
        return money;
    }
}
