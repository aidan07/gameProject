package sample.Sprites;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class shieldSprite extends Sprite {
    public int health = 0;
    public int strength = 0;
    public Image image = new Image("File:\\SideScrollerExample\\src\\main\\resources\\shieldSprite.png");

    public shieldSprite () {
        ImageView imageView = new ImageView(image);
        this.getChildren().add(imageView);
    }
}
