package com.cybertek.utilities;

public class BrowserUtils {
    public static void sleep(int second)  {
        second*=1000;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
