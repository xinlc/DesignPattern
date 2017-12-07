package org.test.decorator.myio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lichao on 2017/12/7.
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in =
                new LowerCseInputStream(
                    new BufferedInputStream(
                        new FileInputStream("src/org/test/decorator/myio/test.txt")));

            while((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
