import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.colors.Colors;

public class ChangeMap implements GameConfig, Assets {
    public static int currentMap = 0;
    public static int OBJECT_AMOUNT = 10;

    public static int getObject_Amount(){
        return OBJECT_AMOUNT;
    }

    public static void setMap(){
        for (int i=0; i<OBJECT_AMOUNT; i++){
            if (currentMap == 0){
                OBJECT_AMOUNT = 10;
                Objects.createObjects(i,i*100,500, 100, 10, Colors.BLUE);
                //Objects.createObjects(5,i*50,300-i*10 , 100, 10, Colors.PINK);
            }
            if (currentMap == 1){
                OBJECT_AMOUNT =5;
                Player.setY(10);
                Objects.createObjects(i,i*120,200 , 100, 10, Colors.BLUE);

            }
        }
        Player.setHindernis();
    }

    public static void right(){
        Player.setX(30);
        currentMap++;
        setMap();

    }
    public static void left(){
        Player.setX(SCREEN_WIDTH-PLAYERWIDTH);
        currentMap--;
        setMap();
    }
}
