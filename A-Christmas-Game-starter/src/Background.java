import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.graphics.Image;

public class Background implements Assets, GameConfig {
    public static Image backgroundimage = new Image(0,0,"data/background/Backgroundimage.png");
    public static Image floorImage = new Image(0,0,"data/objects/block.png");

    public static void draw(){
        backgroundimage.draw();
        //drawfloor();

        //backgroundimage.move(-5,0);
        if (backgroundimage.getXPos()==-1000){
            //System.out.println("1000");
            backgroundimage.setXPos(0);
        }
        if (backgroundimage.getXPos()<-1000){
            //System.out.println("1000");
            backgroundimage.setXPos(0);
        }

    }
    public static void drawfloor(){
        for (int i=0; i<4;i++){
            floorImage.draw();
        }
    }

    public static void move(int x){
        backgroundimage.move(-x/2,0);
        //floorImage.move(-x,0);
    }

    public static void setImageSize(){
        floorImage.setWidth(SCREEN_WIDTH/4);
        floorImage.setHeight(SCREEN_WIDTH/4);
    }
}
