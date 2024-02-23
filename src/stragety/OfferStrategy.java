package stragety;

import java.math.BigDecimal;

public interface OfferStrategy {
    BigDecimal calculate(BigDecimal money);

    enum OfferMode {
        DISCOUNT("discount"), FULL_SUB("full_sub");

        private final String value;

        OfferMode(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
