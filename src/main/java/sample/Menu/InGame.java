package sample.Menu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by the on 05/06/2017.
 */
public class InGame extends Application {

    private int i = 0;
    private GridPane gpnael = new GridPane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        while(i<2){
            addButton();
        }

        root.getChildren().add(gpnael);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void addButton(){
        i++;
        final Button temp = new Button("Button " + i);
        final int numButton= i;
        temp.setId("" + i);
        temp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.out.println("id(" + temp.getId()  + ") =  " + numButton);
            }
        });
        gpnael.add(temp, i, 1);
    }

    public void onResumeClick(){

    }
    public void onSettingsClick(){

    }

    public static void main(String[] args) {
        launch(args);
    }
}
