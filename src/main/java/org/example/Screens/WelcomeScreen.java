package org.example.Screens;

import com.raylib.Image;
import com.raylib.Raylib;
import com.raylib.Vector2;
import org.example.utils.PositionOffset;
import java.io.IOException;

public class WelcomeScreen
{
  public static void loadWelcomeScreen ()
  {
//    /  try
//      {
//          Image nutImage =  Raylib.loadImage("./../../../resources/assets/nut.png");
//          if (nutImage.id == 0) { // or checking for null depending on your binding
//              throw new RuntimeException("Failed to load image from path.");
//      } catch (IOException error) {
//          throw new RuntimeException("An error occurred while loading the image.", error);
//      }

      Raylib.clearBackground(Raylib.BROWN);
      String welcomeText = "Welcome To Algorithm Visualiser";
      int fontSize  = 30 ;

      int textWidth =  Raylib.measureText(welcomeText, fontSize);
      int screenWidth  = Raylib.getScreenWidth();
      int screenHeight = Raylib.getScreenHeight();
      // PositionOffset welcomeOffset = new PositionOffset( Raylib.getWindowPosition());

      // Vector2 welcomeTextOffset = welcomeOffset.getPositionOffset();
      int x =    (int )  (screenWidth -textWidth) / 2 ;
      int y =    (int )  (screenHeight -  fontSize ) / 2;
      Raylib.drawText(welcomeText, x ,y , fontSize, Raylib.DARKBROWN);

  }
}
