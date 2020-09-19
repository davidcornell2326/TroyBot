import java.util.TimerTask;
import java.util.Date;

// Create a class extends with TimerTask
public class ScheduledTask extends TimerTask {
    private TroyBot troybot;
    Date now; // to display current time

    // Add your task here
    public void run() {
        troybot.casesScheduled(troybot.getStartChannel());
        System.out.println("FLAG");
    }

    public void setTroybot(TroyBot troybot) {
        this.troybot = troybot;
    }
}