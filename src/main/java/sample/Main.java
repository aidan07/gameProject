package sample;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.settings.GameSettings;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.Pair;
import sample.Menu.MenuItem;
import sample.Menu.Title;

import java.util.Arrays;
import java.util.List;

public class Main extends Application {

    private static final int WIDTH = 1280;
    private static final int HEIGHT = 720;

    private List<Pair<String, Runnable>> menuData = Arrays.asList(
            new Pair<String, Runnable>("Single Player", () -> {}),
            new Pair<String, Runnable>("Game Options", () -> {}),
            new Pair<String, Runnable>("Tutorial", () -> {}),
            new Pair<String, Runnable>("Credits", () -> {}),
            new Pair<String, Runnable>("Exit to Desktop", Platform::exit)
    );

    private Pane root = new Pane();
    private VBox menuBox = new VBox(-5);
    private Line line;

    private Parent createContent() {
        addBackground();
        addTitle();
        addBackgroundAnimations();

        double lineX = WIDTH / 2 - 100;
        double lineY = HEIGHT / 3 + 50;

        addLine(lineX, lineY);
        addMenu(lineX + 5, lineY + 5);

        startAnimation();

        return root;
    }

    private void addBackgroundAnimations(){
        ImageView imageView = new ImageView("File:\\SideScrollerExample\\src\\main\\resources\\stars-carousel.png");
        imageView.setFitWidth(WIDTH);
        imageView.setFitHeight(HEIGHT);

        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(1));

        transition.setToY(200);

        transition.setAutoReverse(false);
        transition.setCycleCount(TranslateTransition.INDEFINITE);

        transition.setNode(imageView);
        transition.play();

        root.getChildren().add(imageView);
    }

    private void addBackground() {
        ImageView imageView = new ImageView("File:\\SideScrollerExample\\src\\main\\resources\\stars-carousel.png");
        imageView.setFitWidth(WIDTH);
        imageView.setFitHeight(HEIGHT);
        root.getChildren().add(imageView);
    }

    private void addTitle() {
        Title title = new Title("StarShips");
        title.setTranslateX(WIDTH / 2 - title.getTitleWidth() / 2);
        title.setTranslateY(HEIGHT / 3);

        root.getChildren().add(title);
    }

    private void addLine(double x, double y) {
        line = new Line(x, y, x, y + 300);
        line.setStrokeWidth(3);
        line.setStroke(Color.color(1, 1, 1, 0.75));
        line.setEffect(new DropShadow(5, Color.BLACK));
        line.setScaleY(0);

        root.getChildren().add(line);
    }

    private void startAnimation() {
        ScaleTransition st = new ScaleTransition(Duration.seconds(1), line);
        st.setToY(1);
        st.setOnFinished(e -> {

            for (int i = 0; i < menuBox.getChildren().size(); i++) {
                Node n = menuBox.getChildren().get(i);

                TranslateTransition tt = new TranslateTransition(Duration.seconds(1 + i * 0.15), n);
                tt.setToX(0);
                tt.setOnFinished(e2 -> n.setClip(null));
                tt.play();
            }
        });
        st.play();
    }

    private void addMenu(double x, double y) {
        menuBox.setTranslateX(x);
        menuBox.setTranslateY(y);
        menuData.forEach(data -> {
            MenuItem item = new MenuItem(data.getKey());
            item.setOnAction(data.getValue());
            item.setTranslateX(-300);

            Rectangle clip = new Rectangle(300, 30);
            clip.translateXProperty().bind(item.translateXProperty().negate());

            item.setClip(clip);

            menuBox.getChildren().addAll(item);
        });

        root.getChildren().add(menuBox);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setTitle("StarShips");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
