package context;

import pojo.Fruit;
import stragety.OfferStrategy;

import java.util.List;

public class Request {
    private Boolean hasOffer = false;
    private String offerMode;
    private int fullSubMoney;
    private int fullSubCondition;
    private double discount;
    private List<Fruit> fruits;

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getOfferMode() {
        return offerMode;
    }

    public Boolean getHasOffer() {
        return hasOffer;
    }

    public void setHasOffer(Boolean hasOffer) {
        this.hasOffer = hasOffer;
    }

    public void setOfferMode(String offerMode) {
        this.offerMode = offerMode;
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
}
