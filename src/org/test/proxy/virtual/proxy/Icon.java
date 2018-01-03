package org.test.proxy.virtual.proxy;

import java.awt.*;

/**
 * Created by lichao on 2018/1/3.
 */
public interface Icon {
    public int getIconWidth();
    public int getIconHeight();
    public void paintIcon(final Component c, Graphics g, int x, int y);
}
