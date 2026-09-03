package org.example;

import com.raylib.Raylib;
import  com.raylib.Raylib.*;
import com.raylib.Vector2;
import org.example.Screens.WelcomeScreen;
import org.example.utils.PositionOffset;


public class Main {
    static void main() {
        String windowName = "Algorithm Visualiser";
        Raylib.setConfigFlags(Raylib.ConfigFlags.FLAG_WINDOW_RESIZABLE);
        Raylib.initWindow(800, 600, windowName);

        int currentMonitor = Raylib.getCurrentMonitor();
        int monitorWidth = Raylib.getMonitorWidth(currentMonitor);
        int monitorHeight = Raylib.getMonitorHeight(currentMonitor);

        // Window is 80% of monitor size (always smaller)
        int windowWidth = (int) (monitorWidth * 0.5);
        int windowHeight = (int) (monitorHeight * 0.5);

//        Raylib.initWindow(windowWidth, windowHeight, windowName);

        Raylib.setWindowMaxSize(windowWidth, windowHeight);

        // Center the window (positions will always be positive since window < monitor)
        int windowPosX = ( windowWidth) / 2;
        int windowPosY = ( windowHeight) / 2;


        Raylib.setWindowPosition(Math.abs(windowPosX), Math.abs( windowPosY));

        Raylib.setWindowMinSize((int) (monitorWidth / 5), (int) (monitorHeight / 5));
        Raylib.setWindowMaxSize(monitorWidth, monitorHeight);

        Raylib.setTargetFPS(60);
//        System.out.println("The Monitor count is  : " + Raylib.getMonitorCount());
//        System.out.println("The Current Monitor is    : " + Raylib.getCurrentMonitor());


        while (!Raylib.windowShouldClose())
        {

            Raylib.beginDrawing();
            WelcomeScreen.loadWelcomeScreen();
            Raylib.endDrawing();
        }

        Raylib.closeWindow();
    }
}