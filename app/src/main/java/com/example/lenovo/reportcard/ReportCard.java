package com.example.lenovo.reportcard;

/**
 * Created by Lenovo on 2016/12/24.
 */

public class ReportCard {

    private int math_score;

    private int english_score;

    public ReportCard(int math, int english) {
        math_score = math;

        english_score = english;
    }

    public String getEnglish_score() {
        return toString(english_score);
    }

    public String getMath_score() {
        return toString(math_score);
    }

    public void setEnglish_score(int english_score) {
        this.english_score = english_score;
    }

    public void setMath_score(int math_score) {
        this.math_score = math_score;
    }

    public String toString(int score) {
        return String.valueOf(score);
    }
}
