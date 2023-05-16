package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class hrActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hr);

        answerStorage = new Csol();

        answerStorage.addAnswer("HR Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Why should I hire you?\n");
        answerStorage.addAnswer("I should be hired for this role because of my relevant skills, experience, and passion for the industry. I've researched the company and can add value to its growth.\n" +
                "\n" +
                "My positive attitude, work ethics, and long-term goals align with the job requirements, making me a committed and valuable asset to the company.\n");

        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are your strengths and weaknesses?\n");
        answerStorage.addAnswer("My strength is I'm a dedicated, self-motivated, hardworking person and always chasing new skills.\n" +
                "\n" +
                "My weakness is I feel uncomfortable until I finish my work.\n");

        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Why do you want to work at our company?\n");
        answerStorage.addAnswer("As a fresher, I am looking for a good platform to start my career.\n" +
                "\n" +
                "Your company is reputed and established and I believe that your company will help me to enhance my skills and gain knowledge.\n");



        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is the difference between confidence and over confidence?\n");
        answerStorage.addAnswer("Confidence is when we feel sure about our actions and make the right decisions. We believe in our ability to do something and have faith in ourselves. On the other hand, overconfidence is excessive belief in our abilities, overlooking the fact that we can be wrong too.\n");


        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is the difference between hard work and smart work?\n");
        answerStorage.addAnswer("Hard work and Smart work both are important in our life. And both are keys to success. But without hard work, smart work is not possible.\n" +
                "We know that experience comes from hard work and smart comes from experience.\n");



        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. How do you feel about working nights and weekends?\n");
        answerStorage.addAnswer("I am not worried about night shifts and weekends, because as a fresher my responsibility is to gain knowledge and explore my skills for helping the growth of the organisation.\n" +
                "\n" +
                "I am flexible to work in night shift.\n");



        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Can you work under pressure?\n");
        answerStorage.addAnswer("Yes, I can work under pressure. Because it will give me the ability to push myself to develop my skills and explore my knowledge. I am also a very calm person so it is easy for me to handle these types of circumstances and I already have some experience of this during my studies.\n");



        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Are you willing to relocate or travel?\n");
        answerStorage.addAnswer("I would definitely consider it, if the apportunity given to me is appropriate, rewarding and feasible.\n" +
                "\n" +
                "I don't think I will have any issue with relocation or traveling involved.\n");



        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What motivates you to do good job?\n");
        answerStorage.addAnswer("Firstly, my parent's sacrifices and advice motivate me to study and get a good job.\n" +
                "\n" +
                "Secondly, I also motivate myself to work hard for gaining knowledge and to get a good job. So, I will try my best to get a good job that can build me to an independent person.\n");



        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Give me an example of your creativity.\n");
        answerStorage.addAnswer("According to me, creativity is doing an ordinary task in an extraordinary way.\n" +
                "\n" +
                "Like, I handle a hard situation by analyzing it first and finding where the fault is occurring then working on it with a cool mind.\n");



        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. How long would you expect to work for us if hired?\n");
        answerStorage.addAnswer("Sir, everyone looks for their bright future, healthy work and environment, good salary, job satisfaction and I'm pretty sure that your company will give such things so I don't need to change the company.\n");


        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.Hr);
        textView.setText(answersString);
    }
}