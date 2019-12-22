import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.events.KeyPressedEvent;
import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.events.KeyReleasedEvent;
import de.ur.mi.oop.events.MousePressedEvent;
import de.ur.mi.oop.graphics.Circle;

import java.util.Random;

public class SnowballFight extends GraphicsApp implements GameConfig, Assets {

    //private static boolean jump = false;
    //private static int jumpTemp = 10;

    @Override
    public void initialize() {




        setFrameRate(TARGET_FPS);
        setCanvasSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        ChangeMap.setMap();
        Player.setHindernis();

    }

    @Override
    public void draw() {
        //drawBackground(Colors.WHITE);

        Background.draw();
        if (Player.getPlayerX()>SCREEN_WIDTH){
            ChangeMap.right();
        }
        if (Player.getPlayerX()<0){
            ChangeMap.left();
        }

        Objects.drawObjects();
        Player.movePlayer();
        Player.drawPlayer();

    }

    //Circle Kreis = new Circle(100,100,100,Colors.RED);


    @Override
    public void onKeyPressed(KeyPressedEvent event){
        Player.playerdirection(event.getKeyChar());
        if (event.getKeyChar() == 119){
           // if (Player.isOnGround()){
           //     jumpTemp = 10;
            // }


        }
    }

    public void onKeyReleased(KeyReleasedEvent event){
        Player.removeDirection(event.getKeyChar());
    }
}
