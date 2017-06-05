package sample.Sprites;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Cam on 28/05/2017.
 */
public class Player extends Parent{

    public Player(){
        ImageView imageView = new ImageView(this.getSprite());
        imageView.getFitHeight();
        imageView.getFitWidth();
        this.getChildren().add(imageView);
    }

    private Image getSprite() {
       return new Image("File:\\SideScrollerExample\\src\\main\\resources\\player.png");
    }
}
