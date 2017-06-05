package sample.Sprites;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Player extends Sprite{

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
