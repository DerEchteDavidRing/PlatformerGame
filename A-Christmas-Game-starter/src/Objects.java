import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Image;
import de.ur.mi.oop.graphics.Rectangle;
import org.w3c.dom.css.Rect;


//Hindernis = new Rectangle[](x,y,width,height, color);

public class Objects implements GameConfig, Assets {

    private static Image[] Hindernis = new Image[ChangeMap.getObject_Amount()];
    private static Rectangle rect = new Rectangle(0,0,0,0,Colors.PINK);



    public static void createObjects(int i, int x, int y, int width, int height, Color color){
        Hindernis[i] = new Image(x, y, "data/Objects/block.png");
        Hindernis[i].setHeight(width);
        Hindernis[i].setWidth(height);
        //rect = new Rectangle(0,200,300,300,Colors.PINK);
    }
    public static void drawObjects(){

        for (int i = 0; i< ChangeMap.getObject_Amount();i++){
            Hindernis[i].draw();
        }
        //rect.draw();
    }

    public static Image getObjects(int i){
        return Hindernis[i];
    }

    public static int returnValue=0;


    public static int checkCollision(Image playerImage){
        returnValue = 0;
        for (int i=0; i<ChangeMap.getObject_Amount();i++) {
            //TOP BORDER

            if (playerImage.hitTest(Hindernis[i].getLeftBorder(), Hindernis[i].getTopBorder())){
                returnValue = 1;

            }

            if (playerImage.hitTest(Hindernis[i].getLeftBorder()+Hindernis[i].getWidth()/2, Hindernis[i].getTopBorder())){
                returnValue = 1;

            }

            if (playerImage.hitTest(Hindernis[i].getRightBorder(), Hindernis[i].getTopBorder())){

                returnValue = 1;
            }

            //BOTTOM BORDER

            if (playerImage.hitTest(Hindernis[i].getLeftBorder(), Hindernis[i].getBottomBorder())){
                returnValue = 1;

            }

            if (playerImage.hitTest(Hindernis[i].getRightBorder(), Hindernis[i].getBottomBorder())){
                returnValue = 1;

            }

            /**
            if (rechteck.hitTest(Hindernis[i].getLeftBorder(), Hindernis[i].getLeftBorder())) {
                System.out.println("hittest3");
                returnValue = 1;
            }
             **/
        }

        return returnValue;

    }
}
