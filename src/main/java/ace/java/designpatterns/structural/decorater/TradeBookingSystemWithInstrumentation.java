package ace.java.designpatterns.structural.decorater;

import com.luckyakhi.designpatterns.domain.Trade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TradeBookingSystemWithInstrumentation implements TradeBookingSystem {
	private static  final Logger logger= LoggerFactory.getLogger(TradeBookingSystemWithInstrumentation.class);
	

	private TradeBookingSystem tradeBookingSystem;


	@Autowired
	public TradeBookingSystemWithInstrumentation(TradeBookingSystem tradeBookingSystem) {
		super();
		this.tradeBookingSystem = tradeBookingSystem;
	}



	@Override
	public void book(Trade t) {
		logger.info("Start time:{}",System.currentTimeMillis());
		tradeBookingSystem.book(t);
		logger.info("End time:{}",System.currentTimeMillis());
	}

}
