package com.bridgelabz;

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,
                        "please enter proper Mood");
            if (message.contains("Sad"))
                return "Sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,
                    "please enter proper Mood");
        }
    }
}
