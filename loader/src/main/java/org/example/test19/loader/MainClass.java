package org.example.test19.loader;

import org.example.test19.linkModules.Modules;
import org.example.test19.screen.MainFrame;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello, hard world !");
        new MainClass().start();
    }
    private void start() {
        Modules.mainFrame = MainFrame.create();
    }
}
