package org.example.commonsample.springtest;

import org.example.commonsample.datepac.Doffine;
import org.junit.Test;
import sun.font.*;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: FontTest
 * @Author: gedachao
 * @Date: 2020-11-12 9:43
 * @Version 1.0
 */
public class FontTest {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontFamilies = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < fontFamilies.length; i++) {
            System.out.println(fontFamilies[i]);
        }
        System.out.println(fontFamilies.length);

    }

    @Test
    public void test() {

        GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        final Font[] fonts = gEnv.getAllFonts();
        List<Font> fontList = Arrays.stream(fonts).distinct().collect(Collectors.toList());
        String fontPath = SunFontManager.getInstance().getPlatformFontPath(true);

        System.out.println(fontPath);
        Locale us = Locale.US;
        for (Font font : fontList) {
            Font2D font2D = FontManagerFactory.getInstance().findFont2D(font.getFontName(), font.getStyle(), FontManager.LOGICAL_FALLBACK);
            System.out.println(fontPath + "\\" + font2D.getFontName(us));
        }


    }

    @Test
    public void test2() {
        HashMap<String, String> map = new HashMap<>();
        map.put("cat1", "tom");
        map.put("cat2", "tom2");
        map.put("cat3", "tom3");
        map.put("cat4", "tom4");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
