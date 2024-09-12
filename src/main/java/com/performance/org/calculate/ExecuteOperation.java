package com.performance.org.calculate;

import com.performance.org.funtion.GetTheData;
import com.performance.org.message.MessageLoggerExecute;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ExecuteOperation extends GetTheData {
    MessageLoggerExecute messageLoggerExecute = new MessageLoggerExecute();
    private static final Logger logger = Logger.getLogger(ExecuteOperation.class.getName());

    public ExecuteOperation(int numberOfUsers, int rampUpTime, int cycles, int executionDuration) {
        super(numberOfUsers, rampUpTime, cycles, executionDuration);
    }

    public void calculatePerformance() {
        // Convertir rampUpTime a minutos
        double rampUpTimeInMinutes = rampUpTime / 60000.0;
        // Calcular el tiempo total de ejecución en minutos
        double totalExecutionTimeInMinutes = rampUpTimeInMinutes + (cycles * executionDuration);
        logger.log(Level.INFO, messageLoggerExecute.getUserMessage(), numberOfUsers);
        logger.log(Level.INFO, messageLoggerExecute.getRampUpTimeMessage(), new Object[]{rampUpTime, rampUpTimeInMinutes});
        logger.log(Level.INFO, messageLoggerExecute.getCyclesMessage(), cycles);
        logger.log(Level.INFO, messageLoggerExecute.getExecutionDurationMessage(), executionDuration);
        logger.log(Level.INFO, messageLoggerExecute.getTotalExecutionTimeMessage(), totalExecutionTimeInMinutes);
    }
}