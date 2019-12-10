package com.bridgelabz;

public class MoodAnalyzer {
    public String analyseMood(String s)
    {
        if ( s.contains("Sad"))
            return "Sad";
        else
            return "Happy";
    }
}
