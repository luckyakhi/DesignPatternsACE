package ace.java.designpatterns.structural.decorater;

import ace.java.designpatterns.domain.Trade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DefaultTradeBookingSystem implements TradeBookingSystem{
	private static  final Logger logger= LoggerFactory.getLogger(DefaultTradeBookingSystem.class);
	//private LoggerSvc loggerSvc;
	@Override
	public void book(Trade t) {
		//loggerSvc.info("Start time");
		logger.info("Booked trade of with counterparty {}",t.getCounterParty());
		//loggerSvc.info("End time");
		
	}

}
