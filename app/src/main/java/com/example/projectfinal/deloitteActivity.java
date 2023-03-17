package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class deloitteActivity extends AppCompatActivity {
    private Csol answerStorage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deloitte);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is deadlock?\n");
        answerStorage.addAnswer("Deadlock refers to the condition where 2 or more processes are waiting for each other to release a resource indefinitely. In a deadlock both the processes wait for the other process to complete and are therefore stuck in a deadlock, where neither starts.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What do you know about DBMS?\n");
        answerStorage.addAnswer("DBMS or Database Management System software controls and manipulates the data that is stored or are to be stored in a database. The basic functions of DBMS include:-\n" +
                "\n" +
                "Database Definition\n" +
                "Updating and Retrieving Data\n" +
                "Administration and Security of Data.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What do you know about C language?\n");
        answerStorage.addAnswer("C is a general purpose programming language. It is one of the most compatible and easy to learn languages.\n" +
                "\n" +
                "Features of C:-\n" +
                "\n" +
                "It is a middle level language\n" +
                "It is case sensitive\n" +
                "It is easy to extend\n" +
                "It is highly portable\n" +
                "It is fast and efficient\n" +
                "Due to all this C is one of the most popular and widely used programming language.\n" +
                "\n" +
                "Limitations of C:-\n" +
                "\n" +
                "exception handling is unavailable\n" +
                "code cannot be resued\n" +
                "no run time checking is done\n" +
                "does not support OOPS\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is C++?\n");
        answerStorage.addAnswer("C++ is a superset of C, which basically means that any C program is also a C++ program, and that any compiler which supports C++ will support C. C++ supports the OOPS concept unlike C. It supports features like objects, classes, inheritance etc.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Inheritance in C++?\n");
        answerStorage.addAnswer("Inheritance refers to the ability of a class to be able to derive all the properties of a different class. It is one of the most important OOPS concept, as it allows:-\n" +
                "\n" +
                "high code resusability\n" +
                "reduces coding time\n" +
                "re-use pre-defined data and properties.\n" +
                "makes the code less complex and easy to maintain.\n" +
                "In C++ inheritance has three modes:-\n" +
                "\n" +
                "Public Mode:-\n" +
                "\n" +
                "Public members of base class become public in derived class\n" +
                "Protected members of base class become Protected in derived class\n" +
                "Private members are inaccessible in derived class\n" +
                "Protected Mode:-\n" +
                "\n" +
                "Public members of base class become protected in derived class\n" +
                "Protected members of base class become Protected in derived class\n" +
                "Private members are inaccessible in derived class\n" +
                "Private Mode:-\n" +
                "\n" +
                "Public members of base class become private in derived class\n" +
                "Protected members of base class become private in derived class\n" +
                "Private members are inaccessible in derived class\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Data Encapsulation?\n");
        answerStorage.addAnswer("Data Encapsulation is the process of hiding the data and programs from the outside world and essentially capsuling them together in one entity.\n");


        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.dello);
        textView.setText(answersString);
    }
}