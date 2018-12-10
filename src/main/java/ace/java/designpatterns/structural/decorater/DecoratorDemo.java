package ace.java.designpatterns.structural.decorater;

import ace.java.designpatterns.domain.Trade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Date;

@SpringBootApplication
public class DecoratorDemo implements CommandLineRunner {
    @Autowired
    private TradeBookingSystem tradeBookingSystem;

    public static void main(String args[]){
        new SpringApplicationBuilder().sources(DecoratorDemo.class).web(false).run().close();

    }

    @Override
    public void run(String... args) throws Exception {
        tradeBookingSystem.book(new Trade(new Date(),"JPMCC","NOMURA","RIL"));

    }
}
