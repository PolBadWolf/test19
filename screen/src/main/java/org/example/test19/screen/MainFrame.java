package org.example.test19.screen;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class MainFrame extends JFrame {
    private static MainFrame mainFrame = null;
    public static MainFrame create() {
        if (mainFrame == null) {
            try {
                SwingUtilities.invokeAndWait(new Runnable() {
                    @Override
                    public void run() {
                        mainFrame = new MainFrame();
                        mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    }
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return mainFrame;
    }
    private MainFrame() {
        super();
        initialize();
    }
    // ------------------------

    private void initialize() {
        this.setSize(300, 100);
        this.setResizable(false);
        this.setVisible(true);
    }
}
