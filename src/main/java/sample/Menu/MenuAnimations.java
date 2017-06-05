package sample.Menu;

import javafx.animation.TranslateTransition;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import sample.Sprites.Player;

/**
 * Created by the on 04/06/2017.
 */

public class MenuAnimations extends Pane {

    public MenuAnimations(){
        Player player = new Player();

        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(5));

        transition.setToX(-100);
        transition.setToY(-200);

        transition.setAutoReverse(true);
        transition.setCycleCount(TranslateTransition.INDEFINITE);

        transition.setNode(player);
        transition.play();
    }
}
