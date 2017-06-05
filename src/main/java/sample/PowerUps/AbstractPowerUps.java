package sample.PowerUps;

import javafx.scene.Parent;

public abstract class AbstractPowerUps extends Parent {

    public Shield shield;
    public boolean active = false;

    public void enable() {
        active = true;
    }

    public void disable() {
        active = false;
    }

   abstract void check();
}
