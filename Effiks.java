import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by kasutaja on 24.01.2017.
 */
public class Effiks extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 500, 500, Color.WHITE);
        stage.setScene(stseen);
        stage.show();
        ArrayList<Circle> ringid = new ArrayList<Circle>();
        for (int i = 0; i < 150; i++) {
            ringid.add(new Circle(15));
            ringid.get(i).setCenterX(Math.random() * 500);
            ringid.get(i).setCenterY(Math.random() * 500);
            ringid.get(i).setFill(Color.rgb((int) Math.random() * 255, (int) Math.random() * 255, (int) Math.random() * 255));
        }
        for (Circle ring : ringid) {
            pane.getChildren().add(ring);
        }
    }

}

