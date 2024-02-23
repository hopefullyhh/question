package handler;

import context.OfferContext;
import context.Request;
import factory.OfferStrategyFactory;
import pojo.Fruit;
import stragety.OfferStrategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class RequestHandler {
    public static BigDecimal handle(Request request) {
        BigDecimal total = new BigDecimal(0);
        OfferContext offerContext = new OfferContext();
        List<Fruit> fruits = request.getFruits();
        for (Fruit fruit : fruits) {
            BigDecimal curTotal = fruit.getPrice().multiply(BigDecimal.valueOf(fruit.getOrderedCount()));
            if (fruit.getDiscountCommodity()) {
                offerContext.setDiscount(fruit.getDiscount());
                offerContext.setOfferMode(OfferStrategy.OfferMode.DISCOUNT);
                OfferStrategy offerStrategy = OfferStrategyFactory.createOfferStrategy(offerContext);
                total = total.add(offerStrategy.calculate(curTotal));
            } else {
                total = total.add(curTotal);
            }
        }
        if (request.getHasOffer()) {
            String offerMode = request.getOfferMode();
            if (OfferStrategy.OfferMode.DISCOUNT.getValue().equals(offerMode)) {
                offerContext.setDiscount(request.getDiscount());
                offerContext.setOfferMode(OfferStrategy.OfferMode.DISCOUNT);
                total = OfferStrategyFactory.createOfferStrategy(offerContext).calculate(total);
            } else if(OfferStrategy.OfferMode.FULL_SUB.getValue().equals(offerMode)) {
                offerContext.setFullSubCondition(request.getFullSubCondition());
                offerContext.setFullSubMoney(request.getFullSubMoney());
                offerContext.setOfferMode(OfferStrategy.OfferMode.FULL_SUB);
                total = OfferStrategyFactory.createOfferStrategy(offerContext).calculate(total);
            } else {
                System.out.println("没有该促销活动" + offerMode);
            }
        }
        return total.setScale(2, RoundingMode.HALF_DOWN);
    }
}
