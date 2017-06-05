package sample.PowerUps;

import sample.Sprites.shieldSprite;

public class Shield  extends AbstractPowerUps{

  private boolean active = false;

    public void check() {
        if (shield.active) {
            new shieldSprite();
        }
    }
}
