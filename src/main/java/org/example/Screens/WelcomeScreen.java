package org.example.Screens;

import com.raylib.Image;
import com.raylib.Raylib;
import com.raylib.Rectangle;
import com.raylib.Texture;
import com.raylib.Vector2;
import org.example.utils.PositionOffset;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WelcomeScreen
{
    private static final String nutPath = "src/main/resources/assets/nut.png";
    private static final String welcomeText = "Welcome To Algorithm Visualiser";
    private static final int fontSize = 30;
    private static final int SPACING = 20; // gap between the image and the text

    private static Texture nutTexture;


    public static void loadWelcomeScreen()
    {
        Path path = Path.of(nutPath);

        if (!Files.exists(path))
        {
            throw new RuntimeException("The image is not found at : " + path.toAbsolutePath());
        }

        Image image = Raylib.loadImage(nutPath);

        if (!Raylib.isImageValid(image))
        {
            throw new RuntimeException("The image exists but could not be loaded (corrupt or unsupported format) : " + nutPath);
        }
        else
        {
            System.out.println("The image has been loaded successfully");
        }

        nutTexture = Raylib.loadTextureFromImage(image);
        Raylib.unloadImage(image);

        if (!Raylib.isTextureValid(nutTexture))
        {
            throw new RuntimeException("The texture could not be uploaded to the GPU : " + nutPath);
        }
    }


    public static void drawWelcomeScreen()
    {
        int textWidth    = Raylib.measureText(welcomeText, fontSize);
        int screenWidth  = Raylib.getScreenWidth();
        int screenHeight = Raylib.getScreenHeight();

        Raylib.clearBackground(Raylib.BROWN);

        float nutHeight = screenHeight * 0.25f;
        float scale     = nutHeight / nutTexture.height();
        float nutWidth  = nutTexture.width() * scale;

        float blockHeight = nutHeight + SPACING + fontSize;
        float blockTop    = (screenHeight - blockHeight) / 2f;

        Rectangle source = new Rectangle(0, 0, nutTexture.width(), nutTexture.height());
        Rectangle dest   = new Rectangle((screenWidth - nutWidth) / 2f, blockTop, nutWidth, nutHeight);

        Raylib.drawTexturePro(nutTexture, source, dest, new Vector2(0, 0), 0f, Raylib.WHITE);

        // PositionOffset welcomeOffset = new PositionOffset( Raylib.getWindowPosition());

        // Vector2 welcomeTextOffset = welcomeOffset.getPositionOffset();
        int x =    (int )  (screenWidth - textWidth) / 2 ;
        int y =    (int )  (blockTop + nutHeight + SPACING);
        Raylib.drawText(welcomeText, x, y, fontSize, Raylib.DARKBROWN);
    }

    // Call ONCE, after the game loop and before closeWindow()
    public static void unloadWelcomeScreen()
    {
        if (nutTexture != null)
        {
            Raylib.unloadTexture(nutTexture);
            Raylib.clearBackground(Raylib.BLACK);

        }
    }
}