package com.bridgelabz;

public class MoodAnalyserException extends Exception {

    ExceptionType type;

    public enum ExceptionType {
        ENTERED_EMPTY, ENTERED_NULL
    }

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }


}
