package sample;

import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Controller {




    @FXML
    private Rectangle car;

    @FXML
    private void handleButtonAction() {
        final ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        ses.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                car.setX(car.getX()+4.0);
            }
        }, 0, 10, TimeUnit.MILLISECONDS);
    }
}

