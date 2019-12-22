package config;

import java.util.Random;

public interface GameConfig {

    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_HEIGHT = 600;
    public static final int TARGET_FPS = 60;
    public static final int PLAYER_JUMP_HEIGHT = 125;
    public static final int PLAYER_JUMP_SPEED = 5;
    public static final int PLAYER_HIT_BOX_RADIUS = 10;
    public static final int PLAYER_START_POSITION_X = 25;
    public static final int PLAYER_START_POSITION_Y = 120;
    public static final int PLAYER_ANIMATION_SPEED = 10;
    public static final int MAX_SNOWBALLS = 3;
    public static final int SNOWBALL_ANIMATION_SPEED = 30;
    public static final int SNOWBALL_SPAWN_DELAY = TARGET_FPS * 3;
    public static final int SNOWBALL_HEIGHT = 175;
    public static final int SCOREBOARD_POSITION_X = 220;
    public static final int SCOREBOARD_POSITION_Y = 30;
    public static final int MAX_SCORE = 999999;
    public static int PLAYERWIDTH = 80;
    public static int MOVEMENTSPEED = 5;
    public static int GRAVITY = 8;
    public static int RECT_HEIGHT = 5;

    Random randint = new Random();

}

/**
 * public static int hitdetection() {
 *
 *         side = 1;
 *         for (int i=0;i<OBJECT_AMOUNT; i++){
 *         if (rechteck.getBottomBorder() < Hindernis[i].getTopBorder()||(rechteck.getTopBorder()>Hindernis[i].getBottomBorder())) {
 *             side = 0;
 *         }
 *         if (rechteck.getLeftBorder()>Hindernis[i].getRightBorder() || (rechteck.getRightBorder()<Hindernis[i].getLeftBorder())) {
 *                 side = 0;
 *             }
 *         return side;
 *         }
 *         }
 **/