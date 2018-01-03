package org.test.proxy.virtual.proxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by lichao on 2018/1/3.
 */
public class ImageProxy implements Icon {
    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x+300, y+190);

            if(!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            imageIcon = new ImageIcon(imageURL, "CD Cover");
                            c.repaint();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }

    }
}
