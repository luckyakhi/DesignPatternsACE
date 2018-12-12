package ace.java.designpatterns.structural.decorater;

import ace.java.designpatterns.domain.Trade;

public class TradeBookingSystemWithLogging extends  DefaultTradeBookingSystem {

    @Override
    public void book(Trade t) {
      //  loggerSvc.info("Start time");
        super.book(t);
        //loggerSvc.info("End time");

    }

}
