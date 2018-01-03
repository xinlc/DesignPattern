package org.test.proxy.virtual.proxy;

import javax.swing.*;
import java.awt.*;

/**
 * Created by lichao on 2018/1/3.
 */
public class ImageComponet extends JComponent {
    private Icon icon;

    public ImageComponet(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w)/2;
        int y = (600 - h)/2;
        icon.paintIcon(this, g, x, y);
    }
}
