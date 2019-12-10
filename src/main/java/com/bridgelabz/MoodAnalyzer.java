package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("Sad")) {
                return "Sad";
            } else
                return "Happy";
        } catch (NullPointerException e) {
            return "Happy";
        }
    }
}
