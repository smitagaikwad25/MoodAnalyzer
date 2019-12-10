package com.bridgelabz;

public class MoodAnalyzerException extends Exception {

      ExceptionType type;

    public MoodAnalyzerException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

    public enum ExceptionType {
        ENTERED_NULL
    }

}
