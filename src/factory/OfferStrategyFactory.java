package factory;

import context.OfferContext;
import stragety.DiscountOffer;
import stragety.FullSubOffer;
import stragety.OfferStrategy;

public class OfferStrategyFactory {
    private final static OfferStrategy DEFAULT_OFFER_STRATEGY = new DiscountOffer(1d);

    public static OfferStrategy createOfferStrategy(OfferContext offerContext) {
        OfferStrategy offerStrategy;
        switch (offerContext.getOfferMode()) {
            case DISCOUNT:
                offerStrategy = new DiscountOffer(offerContext.getDiscount());
                break;
            case FULL_SUB:
                offerStrategy = new FullSubOffer(offerContext.getFullSubCondition(), offerContext.getFullSubMoney());
                break;
            default:
                offerStrategy = DEFAULT_OFFER_STRATEGY;
                break;
        }
        return offerStrategy;
    }
}
