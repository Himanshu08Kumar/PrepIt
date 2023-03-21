package com.example.projectfinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class aptiActivity6 extends AppCompatActivity implements View.OnClickListener{
    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button opt1, opt2, opt3, opt4;
    Button submitBtn;

    int score = 0;
    int totalQuestion = Permutation.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apti7);

        totalQuestionsTextView =findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);
        submitBtn =findViewById(R.id.submitBtn);


        opt1.setOnClickListener(this);
        opt2.setOnClickListener(this);
        opt3.setOnClickListener(this);
        opt4.setOnClickListener(this);
        submitBtn.setOnClickListener(this);
        totalQuestionsTextView.setText("Total question : "+totalQuestion);

        loadNewQuestion();
    }

    @Override
    public void onClick(View v) {
        opt1.setBackgroundColor(Color.TRANSPARENT);
        opt2.setBackgroundColor(Color.TRANSPARENT);
        opt3.setBackgroundColor(Color.TRANSPARENT);
        opt4.setBackgroundColor(Color.TRANSPARENT);

        Button clickButton = (Button) v;
        if(clickButton.getId() == R.id.submitBtn) {
            if (selectedAnswer.equals(Permutation.correctAnswer[currentQuestionIndex])) {

                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            selectedAnswer = clickButton.getText().toString();
            clickButton.setBackgroundColor(Color.BLACK);

        }

    }

    void loadNewQuestion(){
        if(currentQuestionIndex == totalQuestion){
            finishQuiz();
            return;
        }

        questionTextView.setText(Permutation.question[currentQuestionIndex]);
        opt1.setText(Permutation.choices[currentQuestionIndex][0]);
        opt2.setText(Permutation.choices[currentQuestionIndex][1]);
        opt3.setText(Permutation.choices[currentQuestionIndex][2]);
        opt4.setText(Permutation.choices[currentQuestionIndex][3]);
    }
    void finishQuiz(){
        String passStatus = "";
        if(score > totalQuestion * 0.60){
            passStatus = "Passed";
        }else {
            passStatus = "Failed";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+score+" out of "+totalQuestion)
                .setPositiveButton("Restart",(dialogInterface, i)-> restartQuiz())
                .setCancelable(false)
                .show();

    }
    void restartQuiz(){
        score =0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }
}