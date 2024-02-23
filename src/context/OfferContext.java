package context;

import stragety.OfferStrategy;

public class OfferContext {
    private OfferStrategy.OfferMode offerMode;
    private double discount;
    private int fullSubMoney;
    private int fullSubCondition;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getFullSubMoney() {
        return fullSubMoney;
    }

    public void setFullSubMoney(int fullSubMoney) {
        this.fullSubMoney = fullSubMoney;
    }

    public int getFullSubCondition() {
        return fullSubCondition;
    }

    public void setFullSubCondition(int fullSubCondition) {
        this.fullSubCondition = fullSubCondition;
    }

    public OfferStrategy.OfferMode getOfferMode() {
        return offerMode;
    }

    public void setOfferMode(OfferStrategy.OfferMode offerMode) {
        this.offerMode = offerMode;
    }
}
