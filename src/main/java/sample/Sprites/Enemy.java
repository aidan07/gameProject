package sample.Sprites;

import javafx.scene.Parent;
import javafx.scene.image.ImageView;

/**
 * Created by Cam on 28/05/2017.
 */
public class Enemy extends Parent{

    private static final String characterModel = "File:\\SideScrollerExample\\src\\main\\resources\\enemyFighter.png";

    public Enemy(){
        ImageView imageView = new ImageView(characterModel);
        this.getChildren().add(imageView);
    }
}
