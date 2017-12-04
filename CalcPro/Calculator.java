/**
 * @author Jude Kallista-Fitzpatrick
 * @date 12/4/2017
 */

import javafx.application.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.text.DecimalFormat;

public class Calculator extends Application {
    TextField firstText = new TextField();
    TextField secondText = new TextField();
    Label label = new Label("Addition Calculator ");
    Button button = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flow = new FlowPane();
        flow.getChildren().addAll(label,firstText,secondText,button);
        button.setOnAction(e-> {
            double result = Double.parseDouble(firstText.getText()) + Double.parseDouble(secondText.getText());
            DecimalFormat format = new DecimalFormat("####.00");
            label.setText(format.format(result));
        });
        Scene scene = new Scene(flow);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String [] args){
        launch(args);
    }


}