package com.performance.org.message;

public class MessageLoggerExecute {
    protected String userMessage;
    protected String rampUpTimeMessage;
    protected String cyclesMessage;
    protected String executionDurationMessage;
    protected String totalExecutionTimeMessage;

    public MessageLoggerExecute() {
        this.userMessage = "Número de usuarios: {0}";
        this.rampUpTimeMessage = "Ramp-up time: {0} milisegundos ({1} minutos)";
        this.cyclesMessage = "Ciclos: {0}";
        this.executionDurationMessage = "Duración de la ejecución por ciclo: {0} minutos";
        this.totalExecutionTimeMessage = "Tiempo total de ejecución: {0} minutos";
    }

    public String getUserMessage() {
        return userMessage;
    }

    public String getRampUpTimeMessage() {
        return rampUpTimeMessage;
    }

    public String getCyclesMessage() {
        return cyclesMessage;
    }

    public String getExecutionDurationMessage() {
        return executionDurationMessage;
    }

    public String getTotalExecutionTimeMessage() {
        return totalExecutionTimeMessage;
    }
}