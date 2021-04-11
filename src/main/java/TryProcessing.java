/*
      Procedural Attempt of Four Balls Challenge
*/

import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 680;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;

    int x[]={1,1,1,1};

    public static void main(String args[])
    {
        PApplet.main("TryProcessing",args);
    }
    @Override
    public void settings()
    {
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup()
    {    }
    @Override
    public void draw()
    {
        for(int i=0;i<4;i++)
        {
            ellipse(x[i],(i+1)*HEIGHT/5,DIAMETER,DIAMETER);
            x[i]+=(i+1);
        }
    }
}
