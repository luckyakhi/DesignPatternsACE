package ace.java.designpatterns.behavioural.template;


import ace.java.designpatterns.domain.Trade;

public interface TradeProcessor {
    void validateTrade(Trade trade);
    void enrichTrade(Trade trade);
    void persistTrade(Trade trade);
    default void processTrade(Trade trade){
        validateTrade(trade);
        enrichTrade(trade);
        persistTrade(trade);
    }
}
