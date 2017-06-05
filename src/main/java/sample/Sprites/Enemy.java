package sample.Sprites;

import javafx.scene.Parent;
import javafx.scene.image.ImageView;

public class Enemy extends Sprite{

    private static final String characterModel = "File:\\SideScrollerExample\\src\\main\\resources\\enemyFighter.png";

    public Enemy(){
        ImageView imageView = new ImageView(characterModel);
        this.getChildren().add(imageView);
    }
}
