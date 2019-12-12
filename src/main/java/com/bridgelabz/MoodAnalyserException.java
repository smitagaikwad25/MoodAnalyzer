package com.bridgelabz;

public class MoodAnalyserException extends Exception {

    ExceptionType type;

    public enum ExceptionType {
        ENTERED_EMPTY, NO_SUCH_CLASS, NO_SUCH_METHOD, No_ACCESS, METHOD_INVOCATION_ISSUE, NO_SUCH_FIELD, ENTERED_NULL
    }

    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
