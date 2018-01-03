package org.test.proxy.virtual.proxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 虚拟代理
 * 模拟加载图片
 * Created by lichao on 2018/1/3.
 */
public class Main {
    ImageComponet imageComponet;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public static void main(String[] args) throws Exception {
        Main test = new Main();
    }

    public Main() throws Exception {
        cds.put("foo",
                "http://images.amazon.com/images/P/B000003S2K.LZZZZZZ.jpg");
        cds.put("bar",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1514981275056&di=7fef230e0ef8de48a1cbe59187435628&imgtype=0&src=http%3A%2F%2Fmedia-wallpapers.theotaku.com%2F1024-by-768-553255-20090816102117.jpg");

        URL initialURL = new URL((String) cds.get("foo"));

        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration e = cds.keys(); e.hasMoreElements();) {
            String name = (String)e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponet.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                }
            });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponet = new ImageComponet(icon);
        frame.getContentPane().add(imageComponet);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try{
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
