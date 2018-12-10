package ace.java.designpatterns.behavioural.template;


import ace.java.designpatterns.domain.Trade;

import java.util.Date;

public class TemplateMethodPatternDemo {
    public static void main(String args[]){
        Trade trade = new Trade(new Date(),"JPMCC","NOMURA","RIL");
        TradeProcessor tradeProcessor = new EquityTradeProcessor();
        tradeProcessor.processTrade(trade);
        tradeProcessor = new FITradeProcessor();
        tradeProcessor.processTrade(trade);
    }
}
