/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bouncingtextapplet.java;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BouncingTextApplet extends Applet implements Runnable {

    private Thread thread;
    private int x = 0;
    private String text = "Abinet Alemayehu";

    @Override
    public void init() {
        setSize(400, 200);
        setBackground(Color.BLACK);
    }

    @Override
    public void start() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void stop() {
        thread = null;
    }

    @Override
    public void run() {
        while (true) {
            x += 10;

            if (x > getWidth()) {
                x = 0;
            }

            repaint();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // ignored
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawString(text, x, 100);
    }
}

