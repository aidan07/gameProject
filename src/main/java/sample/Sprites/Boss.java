package sample.Sprites;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

/**
 * Created by Cam on 28/05/2017.
 */
public class Boss extends Sprite{

    private int health;
    private int strength;
    private Object ability;

    public Boss(){
        Random rnd = new Random();
        spawnBoss(AbilitySetter(AbilitySeeder(rnd)), rnd.nextInt(),rnd.nextInt(),CharacterModel(rnd.nextInt(3)+1));
    }

    private void spawnBoss(Object ability, int health, int Strength, Image characterModel){
        System.out.println("spawned boss! Health: " + health + " Strength: "  + Strength);
        ImageView image = new ImageView();
        image.setImage(characterModel);

        setAbility(ability);
        setHealth(health);
        setStrength(Strength);

        this.getChildren().add(image);

    }

    private int AbilitySeeder(Random rnd){
        return rnd.nextInt(10) + 1;
    }

    private Object AbilitySetter(int seeder){
        switch(seeder){
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return null;
            case 10:
                return null;
            default:
                return null;
        }
    }

    private Image CharacterModel(int selector){
        System.out.println(selector);
        switch(selector){
            case 1:
                return new Image("File:\\SideScrollerExample\\src\\main\\resources\\boss1.png");
            case 2:
                return new Image("File:\\SideScrollerExample\\src\\main\\resources\\boss2.png");
            default:
                return null;
        }
    }

    public int getStrength() {
        return strength;
    }

    private void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public Object getAbility() {
        return ability;
    }

    private void setAbility(Object ability) {
        this.ability = ability;
    }
}
