package org.example.Screens;

import com.raylib.Raylib;

public class WelcomeScreen
{
  public static void loadWelcomeScreen ()
  {
      Raylib.clearBackground(Raylib.RAYWHITE);
      int windowWidth =  Raylib.getScreenWidth() ;
      int windowHeight =  Raylib.getScreenHeight() ;

      Raylib.drawText("Welcome To Algorithm Visualiser", windowWidth/2 , windowHeight/2 , 30, Raylib.DARKGRAY);

  }
}
