package ace.java.designpatterns.behavioural.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tvKnob")
public class TVCommand implements Command {
    @Autowired
    public TVCommand(TV tv) {
        this.tv = tv;
    }

    private TV tv;
    @Override
    public void execute() {
        tv.increaseVolume();
    }

    @Override
    public void undo() {
        tv.decreaseVolume();
    }
}
