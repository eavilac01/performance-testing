package com.performance.org.conf;

import com.performance.org.data.ValueProperty;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConfigManager {
    private static final Logger logger = Logger.getLogger(ConfigManager.class.getName());
    private static ConfigManager instance;
    private final Properties properties;
    static ValueProperty valueProperty = new ValueProperty();


    private ConfigManager(String propertiesFilePath) {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(propertiesFilePath)) {
            if (input == null) {
                logger.log(Level.SEVERE, valueProperty.Unable_to_find, propertiesFilePath);
                return;
            }
            properties.load(input);
        } catch (IOException e) {
            logger.log(Level.SEVERE, valueProperty.Error_loading, e);
        }
    }

    public static ConfigManager getInstance(String propertiesFilePath) {
        if (instance == null) {
            instance = new ConfigManager(propertiesFilePath);
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public int getIntProperty(String key) {
        return Integer.parseInt(properties.getProperty(key));
    }

    public double getDoubleProperty(String key) {
        return Double.parseDouble(properties.getProperty(key));
    }
}