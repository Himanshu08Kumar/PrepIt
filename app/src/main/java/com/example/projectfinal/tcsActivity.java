package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class tcsActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcs);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is a list and tuple?\n");
        answerStorage.addAnswer("Lists:- Lists are used to keep information within a single variable.\n" +
                "Lists in Python serve the same purpose as arrays.\n" +
                "A list, on the other hand, differs from an array in that, whereas arrays can only contain homogeneous elements, a list can store heterogeneous elements.\n" +
                "Tuple:- Tuples are similar to lists, with the exception that tuples are not mutable.\n" +
                "Tuples are preferred over lists because they can be created more quickly.\n");

        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is pass and break statement ?\n");
        answerStorage.addAnswer("Pass Statement:-\n" +
                "\n" +
                "The pass statement is simply a null statement. Pass statements are used to postpone compilation time.\n" +
                "\n" +
                "Break Statement:-\n" +
                "\n" +
                "Break is a loop control statement that is used to end a loop if the required target is satisfied.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is call by value and call by reference?\n");
        answerStorage.addAnswer("Call by value:-  Calling a method with a parameter as the value is referred to as call by value.\n" +
                "\n" +
                "Call by reference:- The call by reference method sends variable values from the caller to the caller function.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is local and global variable?\n");
        answerStorage.addAnswer("Local Variable:-\n" +
                "\n" +
                "These variables are defined in short blocks of code like as functions, control statement blocks, and so on. The default value of local variables is “garbage value.”\n" +
                "\n" +
                "Global Variable:-\n" +
                "\n" +
                "Global variables exist outside of functions and are available to all functions; their values can be altered by any function. Global value is set to zero by default.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are strings?\n");
        answerStorage.addAnswer("A string is defined as an array of characters that can be extended with extra predefined methods via headers\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are the features of C?\n");
        answerStorage.addAnswer("case sensitive language\n" +
                "middle level language\n" +
                "fast\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are loops? What is if loop?\n");
        answerStorage.addAnswer("A loop is defined as the process of repeating a series of statements until the condition becomes false. The main function of loops is to execute code repeatedly.\n" +
                "\n" +
                "Because the execution flow forms a cycle, loops are also known as iterative statements.\n" +
                "\n" +
                "If loop:-\n" +
                "\n" +
                "The if loop is used to compare two or more sets of values, and if that condition or comparison is met, the part of the code contained in the statement is executed.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is method overloading and method overriding?\n");
        answerStorage.addAnswer("Method overloading:- \n" +
                "\n" +
                "Method overloading is a polymorphism approach that enables the creation of numerous methods with the same name but distinct signatures.\n" +
                "\n" +
                "Method overriding:\n" +
                "\n" +
                "Method overriding occurs when a subclass provides a specific implementation of a method that is already offered by its parent class. It is used to implement interface methods as well as runtime polymorphism.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What do you mean  by type-casting?\n");
        answerStorage.addAnswer("Type casting is a data conversion mechanism that converts data from one data type to another.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is the query for deleting a row in SQL?\n");
        answerStorage.addAnswer("We can use the DELETE command.\n" +
                "\n" +
                "DELETE FROM table_name WHERE required_condition;\n" +
                "Example:\n" +
                "\n" +
                "If we want to delete  from students table the record of student name Jenny, we will use\n" +
                "\n" +
                "DELETE FROM students WHERE StudentName='Jenny';\n");



        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.tcs);
        textView.setText(answersString);
    }
}