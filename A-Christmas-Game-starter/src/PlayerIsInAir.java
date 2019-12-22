/**
import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.graphics.Rectangle;

public class PlayerIsInAir implements GameConfig, Assets {
    public static void inAir(Rectangle rechteck,){


        if ((rechteck.getBottomBorder()+GRAVITY) > Hindernis.getTopBorder()) {
            if (rechteck.getRightBorder() > Hindernis.getLeftBorder()) {
                currentlyInAir = 0;
                if (rechteck.getLeftBorder() < Hindernis.getRightBorder()) {
                    currentlyInAir = 0;
                } else currentlyInAir = 1;

            } else currentlyInAir = 1;
        }
        if (rechteck.getTopBorder() > Hindernis.getBottomBorder()) {
            currentlyInAir = 1;
        }
    }



    public static void jump(){
        rechteck.move(0,5*-MOVEMENTSPEED);
    }

    public static boolean isOnGround() {
        if (rechteck.getBottomBorder() >= SCREEN_HEIGHT) {
            return true;
        }
        else{
            return false;
        }
    }
}
**/