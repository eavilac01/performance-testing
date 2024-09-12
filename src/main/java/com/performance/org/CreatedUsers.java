package com.performance.org;

import com.performance.org.calculate.TimeOperation;
import com.performance.org.conf.ConfigManager;
import com.performance.org.data.ValueProperty;

public class CreatedUsers  extends TimeOperation {
    static ValueProperty valueProperty = new ValueProperty();

    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance(valueProperty.Config_prop_user);
        int totalUsers = config.getIntProperty(valueProperty.Users);
        int totalDurationMinutes = config.getIntProperty(valueProperty.Duration_minutes); // 1 hora
        int flowsPerUser = config.getIntProperty(valueProperty.Flows_per_user);
        calculateMetrics(totalUsers, totalDurationMinutes, flowsPerUser);
    }
}