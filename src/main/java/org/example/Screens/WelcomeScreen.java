package org.example.Screens;

import com.raylib.Raylib;
import com.raylib.Vector2;
import org.example.utils.PositionOffset;

public class WelcomeScreen
{
  public static void loadWelcomeScreen ()
  {
      Raylib.clearBackground(Raylib.RAYWHITE);
      String welcomeText = "Welcome To Algorithm Visualiser";
      int fontSize  = 30 ;

      int textWidth =  Raylib.measureText(welcomeText, fontSize);
      int screenWidth  = Raylib.getScreenWidth();
      int screenHeight = Raylib.getScreenHeight();
      // PositionOffset welcomeOffset = new PositionOffset( Raylib.getWindowPosition());

      // Vector2 welcomeTextOffset = welcomeOffset.getPositionOffset();
      int x =    (int )  (screenWidth -textWidth) / 2 ;
      int y =    (int )  (screenHeight -  fontSize ) / 2;
      Raylib.drawText(welcomeText, x ,y , fontSize, Raylib.DARKGRAY);

  }
}
