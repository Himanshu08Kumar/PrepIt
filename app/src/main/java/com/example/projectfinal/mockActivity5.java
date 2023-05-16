package com.example.projectfinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mockActivity5 extends AppCompatActivity implements View.OnClickListener{
    TextView totalQuestionsTextView;
    TextView questionTextView, solution;
    Button opt1, opt2, opt3, opt4;
    Button submitBtn, showAns;

    int score = 0;
    int totalQuestion = mockQuestionAnswer5.question.length;
    int currentQuestionIndex = 0;
    int currentAnswerIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock5);

        totalQuestionsTextView =findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        solution = findViewById(R.id.solution);
        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);
        submitBtn =findViewById(R.id.submitBtn);
        showAns = findViewById(R.id.showAns);
        solution.setVisibility(View.INVISIBLE);


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

        showAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution.setVisibility(View.VISIBLE);
                showCurrentSolution();
            }
        });


        Button clickButton = (Button) v;
        if(clickButton.getId() == R.id.submitBtn) {
            if (selectedAnswer.equals(mockQuestionAnswer5.correctAnswer[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();
            showNextSolution();

        }else{
            selectedAnswer = clickButton.getText().toString();
            clickButton.setBackgroundColor(Color.BLACK);

        }

    }



    void showCurrentSolution(){
        //String currentSolution = boats.desAns[currentAnswerIndex];
        solution.setText(mockQuestionAnswer5.desAns[currentAnswerIndex]);
        showAns.setVisibility(View.VISIBLE);
    }
    void showNextSolution(){
        currentAnswerIndex = (currentAnswerIndex + 1) % mockQuestionAnswer5.desAns.length;
        solution.setVisibility(View.INVISIBLE);
        showCurrentSolution();

    }
    void loadNewQuestion(){
        if(currentQuestionIndex == totalQuestion){
            finishQuiz();
            return;
        }

        questionTextView.setText(mockQuestionAnswer5.question[currentQuestionIndex]);
        opt1.setText(mockQuestionAnswer5.choices[currentQuestionIndex][0]);
        opt2.setText(mockQuestionAnswer5.choices[currentQuestionIndex][1]);
        opt3.setText(mockQuestionAnswer5.choices[currentQuestionIndex][2]);
        opt4.setText(mockQuestionAnswer5.choices[currentQuestionIndex][3]);
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