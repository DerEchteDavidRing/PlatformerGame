import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Rectangle;
import org.w3c.dom.css.Rect;


//Hindernis = new Rectangle[](x,y,width,height, color);

public class Objects implements GameConfig, Assets {

    private static Rectangle[] Hindernis = new Rectangle[ChangeMap.getObject_Amount()];
    private static Rectangle rect = new Rectangle(0,0,0,0,Colors.PINK);



    public static void createObjects(int i, int x, int y, int width, int height, Color color){

        Hindernis[i] = new Rectangle(x,y,width,height,color);
        //rect = new Rectangle(0,200,300,300,Colors.PINK);

    }
    public static void drawObjects(){

        for (int i = 0; i< ChangeMap.getObject_Amount();i++){
            Hindernis[i].draw();
        }
        //rect.draw();
    }

    public static Rectangle getObjects(int i){


        return Hindernis[i];
    }

    public static int returnValue=0;


    public static int checkCollision(Rectangle rechteck){
        returnValue = 0;
        for (int i=0; i<ChangeMap.getObject_Amount();i++) {
            //TOP BORDER

            if (rechteck.hitTest(Hindernis[i].getLeftBorder(), Hindernis[i].getTopBorder())){
                returnValue = 1;

            }

            if (rechteck.hitTest(Hindernis[i].getLeftBorder()+Hindernis[i].getWidth()/2, Hindernis[i].getTopBorder())){
                returnValue = 1;

            }

            if (rechteck.hitTest(Hindernis[i].getRightBorder(), Hindernis[i].getTopBorder())){

                returnValue = 1;
            }

            //BOTTOM BORDER

            if (rechteck.hitTest(Hindernis[i].getLeftBorder(), Hindernis[i].getBottomBorder())){
                returnValue = 1;

            }

            if (rechteck.hitTest(Hindernis[i].getRightBorder(), Hindernis[i].getBottomBorder())){
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
        /**
        for (int i=0; i<ChangeMap.getObject_Amount();i++) {

            boolean tophit = false;
            boolean bottomhit = false;
            boolean lefthit = true;
            boolean righthit = true;
            boolean above = false;

            if (rechteck.getBottomBorder() > Hindernis[i].getTopBorder()) {
                if (rechteck.getTopBorder() > Hindernis[i].getBottomBorder()) {
                    bottomhit = true;
                    tophit = true;
            }

            }
            if (rechteck.getRightBorder() > Hindernis[i].getLeftBorder()) {
                lefthit = false;

            }

            if (rechteck.getLeftBorder() < Hindernis[i].getRightBorder()) {
                righthit = false;

            }

            if (tophit == true && bottomhit == false) {
                System.out.println("bottomortop");
            }
            if (lefthit == true) {
                System.out.println("left");
            }
            if (righthit == true) {
                System.out.println("right");
            }
            //System.out.println(Hindernis[i].getTopBorder());
            System.out.println(rechteck.getTopBorder());
        }




    }
         **/
    }
}
