package ace.java.designpatterns.behavioural.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BurnerCommand implements Command {
    @Autowired
    public BurnerCommand(Burner burner) {
        this.burner = burner;
    }

    private Burner burner;
    @Override
    public void execute() {
        burner.swithOn();
    }

    @Override
    public void undo() {
        burner.swithOff();
    }
}
