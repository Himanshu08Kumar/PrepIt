package com.example.projectfinal;

import static com.example.projectfinal.mockQuestionAnswer3.correctAnswer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class mockActivity3 extends AppCompatActivity implements View.OnClickListener{
    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button opt1, opt2, opt3, opt4;
    Button submitBtn;

    int score = 0;
    int totalQuestion = mockQuestionAnswer3.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock3);

        totalQuestionsTextView =findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        opt1 = findViewById(R.id.opt1);
        opt2 = findViewById(R.id.opt2);
        opt3 = findViewById(R.id.opt3);
        opt4 = findViewById(R.id.opt4);
        submitBtn =findViewById(R.id.submitBtn);

//        opt1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                for (String answer : correctAnswer) { // loop through the correct answers
//                    if (selectedAnswer.equals(answer)) { // check if the clicked answer is correct
//                        opt1.setBackgroundColor(Color.GREEN); // set button color to green
//                        return; // exit the loop if a match is found
//                    }
//                }
//            }
//        });
//
//        opt2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                for (String answer : correctAnswer) { // loop through the correct answers
//                    if (selectedAnswer.equals(answer)) { // check if the clicked answer is correct
//                        opt2.setBackgroundColor(Color.GREEN); // set button color to green
//                        return; // exit the loop if a match is found
//                    }
//                }
//            }
//        });
//
//        opt3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                for (String answer : correctAnswer) { // loop through the correct answers
//                    if (selectedAnswer.equals(answer)) { // check if the clicked answer is correct
//                        opt3.setBackgroundColor(Color.GREEN); // set button color to green
//                        return; // exit the loop if a match is found
//                    }
//                }
//            }
//        });
//        opt4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                for (String answer : correctAnswer) { // loop through the correct answers
//                    if (selectedAnswer.equals(answer)) { // check if the clicked answer is correct
//                        opt4.setBackgroundColor(Color.GREEN); // set button color to green
//                        return; // exit the loop if a match is found
//                    }
//                }
//            }
//        });
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
        if(clickButton.getId() == R.id.submitBtn){
            if(selectedAnswer.equals(correctAnswer[currentQuestionIndex])) {
                score++;
            }
//            for (String answer : correctAnswer) { // loop through the correct answers
//                    if (selectedAnswer.equals(answer))
//                        selectedAnswer.setBackgroundColor(Color.GREEN);
//
//            }
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

        questionTextView.setText(mockQuestionAnswer3.question[currentQuestionIndex]);
        opt1.setText(mockQuestionAnswer3.choices[currentQuestionIndex][0]);
        opt2.setText(mockQuestionAnswer3.choices[currentQuestionIndex][1]);
        opt3.setText(mockQuestionAnswer3.choices[currentQuestionIndex][2]);
        opt4.setText(mockQuestionAnswer3.choices[currentQuestionIndex][3]);
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