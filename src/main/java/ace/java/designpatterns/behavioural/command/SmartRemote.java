package ace.java.designpatterns.behavioural.command;

public class SmartRemote {
    private Command onCommand;
    private Command offCommand;

    public SmartRemote(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public void switchOn(){
        onCommand.execute();
    }

    public void switchOff(){
        onCommand.undo();
    }
}
