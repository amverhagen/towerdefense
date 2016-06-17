package com.goonsquad.galactictd.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.goonsquad.galactictd.GalacticTDGame;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 1000;
        config.height = 500;
        config.resizable = false;
        new LwjglApplication(new GalacticTDGame(), config);
    }
}
