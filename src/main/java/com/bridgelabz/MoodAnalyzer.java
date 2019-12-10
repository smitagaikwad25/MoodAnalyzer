package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyzerException {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.ENTERED_NULL,
                                                "please enter proper Mood");
        }
    }
}
