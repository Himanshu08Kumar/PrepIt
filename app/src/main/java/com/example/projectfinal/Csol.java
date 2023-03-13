package com.example.projectfinal;

import java.util.ArrayList;

public class Csol {
    private ArrayList<String> answers;

    public Csol() {
        answers = new ArrayList<>();
    }

    public void addAnswer(String answer) {
        answers.add(answer);
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }
}
