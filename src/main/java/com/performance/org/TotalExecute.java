package com.performance.org;

import com.performance.org.calculate.ExecuteOperation;
import com.performance.org.conf.ConfigManager;
import com.performance.org.data.ValueProperty;

public class TotalExecute {
    static ValueProperty valueProperty = new ValueProperty();
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstance(valueProperty.Config_prop);
        int numberOfUsers = config.getIntProperty(valueProperty.Number_users);
        int rampUpTime = config.getIntProperty(valueProperty.RamUp);
        int cycles = config.getIntProperty(valueProperty.Cycles);
        int executionDuration = config.getIntProperty(valueProperty.Execute_duration);
        ExecuteOperation executeOperation = new ExecuteOperation(numberOfUsers, rampUpTime, cycles, executionDuration);
        executeOperation.calculatePerformance();
    }
}