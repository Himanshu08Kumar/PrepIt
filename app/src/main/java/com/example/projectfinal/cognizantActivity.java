package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class cognizantActivity extends AppCompatActivity {
    private Csol answerStorage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cognizant);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is TCP/IP protocol?\n");
        answerStorage.addAnswer("TCP/IP protocol or Transmission Control/Internet Protocol is a set of communication protocols used to interconnect network devices on the internet.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Query to find 2nd largest salary from a table.\n");
        answerStorage.addAnswer("select *from employee\n" +
                "\n" +
                "group by salary\n" +
                "\n" +
                "order by salary desc limit 1,1;\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are pure virtual functions?\n");
        answerStorage.addAnswer("A pure virtual function is a function for which we only need to declare it, we do not need any definition for it.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are tokens in C++?\n");
        answerStorage.addAnswer("A token is the smallest meaningful element of a C++ program, which the compiler identifies.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Can a database table exist without a primary key?\n");
        answerStorage.addAnswer("Yes, a database table can exist without a primary key.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are aggregation and encapsulation?\n");
        answerStorage.addAnswer("Aggregation:- Aggregation is a type of Encapsulation technique where child objects have one parent object, and they cannot be accessed by any other parent object.\n" +
                "\n" +
                "Encapsulation:- In encapsulation the fields of a class are made private, while the access to these fields are provided by public methods. Here, since a private field cannot be accsessed by anyone outside its class, the field stays hidden within the class.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Explain the OOPs concepts.\n");
        answerStorage.addAnswer("Encapsulation- It is the mechanism that binds the code to the data it manipulates. Thus the data is wrapped under a single unit.\n" +
                "Abstraction-It is the process of exposing the details that are necessary and hiding the rest.\n" +
                "Inheritance-Through this, a class can acquire the properties of another class.\n" +
                "Polymorphism-The same action can be performed in many different ways.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is method overloading and method overriding?\n");
        answerStorage.addAnswer("Method Overloading:- It is used to increase the readability of a program.\n" +
                "\n" +
                "Method Overriding:- It provides specific implementation of the method that is already provided by super class.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Explain BCNF.\n");
        answerStorage.addAnswer("BCNF or Boycs Codd Normal Form, is an advanced version of 3nf form.\n" +
                "\n" +
                "For a table to be in BCNF form it must fulfill the following properties:-\n" +
                "\n" +
                "should be in 3nf\n" +
                "every functional dependency, A->B, must be a superkey\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is a constructor?\n");
        answerStorage.addAnswer("Constructor in Python is a special type of method which is used to initialize the instance members of the class. The task of constructors is to initialize and assign values to the data members of the class when an object of the class is created.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Pass in Python?\n");
        answerStorage.addAnswer("Pass statement is a null statement. It is used to delay the time of compilation. In any function of a parent class which is useless to that class, but is a useful function to it’s child classes to avoid any error in base class then we use a pass statement.\n");


        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.cogni);
        textView.setText(answersString);
    }
}