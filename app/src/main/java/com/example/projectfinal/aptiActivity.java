package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aptiActivity extends AppCompatActivity implements View.OnClickListener{

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ans;
    Button submitBtn;

    int totalQuestion = questionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apti);

        totalQuestionsTextView =findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ans = findViewById(R.id.ans);

        submitBtn =findViewById(R.id.submitBtn);

        ans.setOnClickListener(this);

        submitBtn.setOnClickListener(this);
        totalQuestionsTextView.setText("Total question : "+totalQuestion);

        loadNewQuestion();


    }

    @Override
    public void onClick(View v) {
        ans.setBackgroundColor(Color.TRANSPARENT);

        Button clickButton = (Button) v;

        currentQuestionIndex++;
        loadNewQuestion();
    }

    void loadNewQuestion(){
        if(currentQuestionIndex == totalQuestion){
            finishQuiz();
            return;
        }

        questionTextView.setText(questionAnswer.question[currentQuestionIndex]);
        ans.setText(questionAnswer.choices[currentQuestionIndex][0]);

    }
    void finishQuiz(){
        String passStatus = "";

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setPositiveButton("Restart",(dialogInterface, i)-> restartQuiz())
                .setCancelable(false)
                .show();

    }
    void restartQuiz(){
        currentQuestionIndex = 0;
        loadNewQuestion();
    }
}