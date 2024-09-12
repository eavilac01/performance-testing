package com.performance.org.funtion;

public class GetTheData {
        protected final int numberOfUsers;
        protected final int rampUpTime;
        protected final int cycles;
        protected final int executionDuration;

        public GetTheData(int numberOfUsers, int rampUpTime, int cycles, int executionDuration) {
            this.numberOfUsers = numberOfUsers;
            this.rampUpTime = rampUpTime;
            this.cycles = cycles;
            this.executionDuration = executionDuration;
        }
}