import config.Assets;
import config.GameConfig;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Rectangle;

import javax.xml.xpath.XPath;
import java.util.jar.JarEntry;

public class Player implements GameConfig, Assets {
    //Image playerModel = new Image(0,0,"data\santa\santa_jumping_1");
    //static Rectangle rechteck = new Rectangle(200,SCREEN_HEIGHT-100,100,100, Colors.RED);

    static Rectangle rechteck = new Rectangle(100,20,PLAYERWIDTH,50, Colors.RED);


    public static int hitdetection = 0;
    public static void playerCollissionWithObject(){
        //1 = hit
        if (Objects.checkCollision(rechteck)==1){
            hitdetection = 1;
        }
        if (Objects.checkCollision(rechteck)==0){
            hitdetection = 0;
        }
    }



    public static Rectangle[] Hindernis = new Rectangle[ChangeMap.getObject_Amount()];

    public static void setHindernis(){
        for (int i = 0; i< ChangeMap.getObject_Amount();i++){
            Hindernis[i] = Objects.getObjects(i);
        }
    }

    public static void drawPlayer(){
        rechteck.draw();
    }
    public static int jumpHeight = 20;
    public static boolean right;
    public static boolean left;
    public static boolean up=true;
    public static boolean down;
    public static int XSPEED = 0;
    public static int YSPEED = 0;
    public static String Currentdirection = "";


    public static void playerdirection(char direction){
        switch (direction){
            case 100:
                right = true;
                break;
            case 97:
                left = true;
                break;
            case 119:
                up = true;
                break;
            case 115:
                down = true;
                break;
        }
    }

    public static void removeDirection(char direction){
        switch (direction){
            case 100:
                right = false;
                Currentdirection = "right";
                break;
            case 97:
                left = false;
                Currentdirection="left";
                break;
            case 119:
                up = false;
                YSPEED = 0;
                break;
            case 115:
                down = false;
                YSPEED = 0;
                break;
        }
    }

    public static void movePlayer(){
        if (right == true){
            XSPEED = MOVEMENTSPEED;
        }
        if (left == true){
            XSPEED = -MOVEMENTSPEED;
        }
        if (up == true){
            if (hitdetection==1){
                jumpTemp = jumpHeight;
            }
        }
        if (down == true){
            YSPEED = 15;
        }

        playerCollissionWithObject();
        jump();
        slowdown();

        if (hitdetection==0){
            Background.move(XSPEED);
            rechteck.move(XSPEED,YSPEED);
            rechteck.move(0, GRAVITY);
        }
    }

    public static int jumpTemp = 0;
    static int fallTemp = jumpHeight;
    static float fallSpeed = 0;
    static float tempIamSorryForThis;

    public static void jump(){
        if (jumpTemp>0) {
            tempIamSorryForThis = 0;
            rechteck.move(0,-jumpTemp-5);
            jumpTemp--;
        }
        if (jumpTemp==0){
            fallTemp = jumpHeight;
        }
        if (hitdetection==1){
            if (jumpTemp ==0) {
                fallSpeed++;
                if (fallSpeed > 2) {
                    tempIamSorryForThis++;
                    fallSpeed = 0;
                }
            }
        }
        //rechteck.move(0,tempIamSorryForThis);
    }

    public static float getPlayerX(){
        return rechteck.getXPos();
    }

    public static void setX(float x){
        rechteck.setXPos(x);
    }

    public static void setY(float y){
        rechteck.setYPos(y);
    }

    public static int side=0;


    public static void slowdown(){
        if (Currentdirection == "right"){
            if (XSPEED > 0){
                XSPEED -= 0.0625;
            }
            else{
                Currentdirection="";
            }
        }
        if (Currentdirection == "left") {
            if (XSPEED < 0) {
                XSPEED += 0.0625;
            }
        }
        if (hitdetection==0){
        }
    }
}
