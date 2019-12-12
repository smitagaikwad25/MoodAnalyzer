package com.bridgelabz;

public class object {
    private String message;

    public object() {

    }

    public object(String message) {
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

    public boolean equals(Object obj) {
        if (obj instanceof object)
            return true;
        return false;
    }

}
