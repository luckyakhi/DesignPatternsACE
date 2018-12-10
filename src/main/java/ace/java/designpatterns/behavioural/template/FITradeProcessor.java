package ace.java.designpatterns.behavioural.template;

import ace.java.designpatterns.domain.Trade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FITradeProcessor implements TradeProcessor {
    private static  final Logger logger = LoggerFactory.getLogger(FITradeProcessor.class);
    @Override
    public void validateTrade(Trade trade) {
        logger.info("Validating Fixed income trade {}",trade);
    }

    @Override
    public void enrichTrade(Trade trade) {
        logger.info("Enriching Fixed income trade {}",trade);
    }

    @Override
    public void persistTrade(Trade trade) {
        logger.info("Persisting Fixed income trade {}",trade);

    }
}
