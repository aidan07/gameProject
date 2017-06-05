package sample.RunningGame;

/**
 * Created by the on 29/05/2017.
 */
public class GameLevel {

    private int level = 1;
    private int enemies = 10;
    private int bosses = 1;

    public GameLevel(int i){
        setCurrentLevel(i * getCurrentLevel());
        setEnemies(i * getEnemies());
        setBosses(i * getBosses());
    };

    public int getCurrentLevel() {
        return level;
    }

    private void setCurrentLevel(int level) {
        this.level = level;
    }

    public int getEnemies() {
        return enemies;
    }

    private void setEnemies(int enemies) {
        this.enemies = enemies;
    }

    public int getBosses() {
        return bosses;
    }

    private void setBosses(int bosses) {
        this.bosses = bosses;
    }
}
