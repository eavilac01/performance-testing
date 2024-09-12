package com.performance.org.message;

public class MessageLoggerCalculate {
    protected String usersPerHour;
    protected String usersPer15Minutes;
    protected String usersPerMinute;
    protected String approximateDurationHours;
    protected String flowsPerMinute;
    protected String finalUsers;

    public MessageLoggerCalculate() {
        this.usersPerHour = "Usuarios creados por hora: {0}";
        this.usersPer15Minutes = "Usuarios creados en 15 minutos: {0}";
        this.usersPerMinute = "Usuarios creados por minuto: {0}";
        this.approximateDurationHours = "Duración aproximada en horas: {0}";
        this.flowsPerMinute = "Flujos obtenidos por minuto: {0}";
        this.finalUsers = "Usuarios finales: {0}";
    }

    public String getUsersPerHour() {
        return usersPerHour;
    }

    public String getUsersPer15Minutes() {
        return usersPer15Minutes;
    }

    public String getUsersPerMinute() {
        return usersPerMinute;
    }

    public String getApproximateDurationHours() {
        return approximateDurationHours;
    }

    public String getFlowsPerMinute() {
        return flowsPerMinute;
    }

    public String getFinalUsers() {
        return finalUsers;
    }
}