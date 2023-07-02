package com.example.slot_easy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesControl {
    private static final String CONFIG_FILE = "config.properties";
    private Properties prop;

    public PropertiesControl() {
        prop = new Properties();
        InputStream is;
        try {
            is = this.getClass().getClass().getClassLoader().getResourceAsStream(CONFIG_FILE);
            prop.load(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public Object get(String key){
        return prop.get(key);
    }
}
