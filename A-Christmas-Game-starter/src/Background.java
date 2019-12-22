import de.ur.mi.oop.graphics.Image;

public class Background {
    public static Image backgroundimage = new Image(0,0,"data/background/Backgroundimage.png");

    public static void draw(){
        backgroundimage.draw();
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
    public static void move(int x){
        backgroundimage.move(-x,0);
    }
}
