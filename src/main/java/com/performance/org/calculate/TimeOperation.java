package com.performance.org.calculate;

import com.performance.org.message.MessageLoggerCalculate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimeOperation {
    static MessageLoggerCalculate message = new MessageLoggerCalculate();
    private static final Logger logger = Logger.getLogger(TimeOperation.class.getName());

    public static void calculateMetrics(int totalUsers, int totalDurationMinutes, int flowsPerUser) {
        // Usuarios creados por hora
        double usersPerHour = totalUsers / (totalDurationMinutes / 60.0);

        // Usuarios creados en 15 minutos
        double usersPer15Minutes = totalUsers / (totalDurationMinutes / 15.0);

        // Usuarios creados por minuto
        double usersPerMinute = totalUsers / (double) totalDurationMinutes;

        // Duración aproximada en horas
        double approximateDurationHours = totalDurationMinutes / 60.0;

        // Flujos obtenidos por minuto
        double flowsPerMinute = (totalUsers * flowsPerUser) / (double) totalDurationMinutes;

        // Usuarios finales (en este caso, es igual al total de usuarios)
        int finalUsers = totalUsers;

        // Log de los resultados
        logger.log(Level.INFO, message.getUsersPerHour(), usersPerHour);
        logger.log(Level.INFO, message.getUsersPer15Minutes(), usersPer15Minutes);
        logger.log(Level.INFO, message.getUsersPerMinute(), usersPerMinute);
        logger.log(Level.INFO, message.getApproximateDurationHours(), approximateDurationHours);
        logger.log(Level.INFO, message.getFlowsPerMinute(), flowsPerMinute);
        logger.log(Level.INFO, message.getFinalUsers(), finalUsers);
    }
}