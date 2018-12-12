package ace.java.designpatterns.structural.decorater;

import ace.java.designpatterns.domain.Trade;
import org.springframework.beans.factory.annotation.Qualifier;

public class TradeBookingSysWithLoggingAndSecurity  implements TradeBookingSystem{
    private TradeBookingSystem tradeBookingSystem;


    public TradeBookingSysWithLoggingAndSecurity(@Qualifier("loggingTradeBokingsyste")
                                                         TradeBookingSystem tradeBookingSystem, SecurityChecker securityChecker) {
        this.tradeBookingSystem = tradeBookingSystem;
        this.securityChecker = securityChecker;
    }

    @Override
    public void book(Trade t) {
        securityChecker.allow();
    }

    private SecurityChecker securityChecker;
}
