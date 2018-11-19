package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

class Config {
    static final URL BASE_URL;
    private static String TAG = Config.class.toString();

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/SuperAwesomeness/XYZReader/master/data.json");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        BASE_URL = url;
    }
}
