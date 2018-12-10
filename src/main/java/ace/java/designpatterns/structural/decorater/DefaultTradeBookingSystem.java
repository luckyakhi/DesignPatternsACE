package ace.java.designpatterns.structural.decorater;

import ace.java.designpatterns.domain.Trade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DefaultTradeBookingSystem implements TradeBookingSystem{
	private static  final Logger logger= LoggerFactory.getLogger(DefaultTradeBookingSystem.class);
	@Override
	public void book(Trade t) {
		logger.info("Booked trade of with counterparty {}",t.getCounterParty());
		
	}

}
