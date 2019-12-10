package com.birdgelabz;

public class MoodAnalyzer {
    public String analyseMood(String s)
    {
        if ( s.contains("Sad"))
            return "Sad";
            return "Happy";
    }
}
