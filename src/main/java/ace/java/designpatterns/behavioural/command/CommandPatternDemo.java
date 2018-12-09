package ace.java.designpatterns.behavioural.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandPatternDemo implements CommandLineRunner {

    public  static void main(String args[]){
        new SpringApplicationBuilder().sources(CommandPatternDemo.class).web(false).
                run(args).close();
    }

    @Bean
    @Autowired
    public SmartRemote smartRemote(@Qualifier("tvCommand") Command onCommand,
                                   @Qualifier("tvCommand")Command offCommand){
        return  new SmartRemote(onCommand, offCommand);
    }

    @Bean
    @Autowired
    public Command tvCommand(TV tv){
        return  new TVCommand(tv);
    }

    @Bean
    @Autowired
    public Command burnerCommand(Burner burner){
        return  new BurnerCommand(burner);
    }

    @Autowired
    private SmartRemote smartRemote;
    @Override
    public void run(String... args) throws Exception {
        smartRemote.switchOn();
        smartRemote.switchOff();
    }

}
