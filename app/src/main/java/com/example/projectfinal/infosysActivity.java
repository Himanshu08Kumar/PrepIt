package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class infosysActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infosys);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Difference between C and C++.\n");
        answerStorage.addAnswer("Q. What is null pointer?\n");
        answerStorage.addAnswer("Null pointer is a pointer that does not refer to any address of value but to NULL. When “0” is assigned to a pointer it creates a Null pointer.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Primary Key?\n");
        answerStorage.addAnswer("A Primary Key uniquely identifies the rows in a given table.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Foreign Key?\n");
        answerStorage.addAnswer("Foreign Key link 2 tables. It is a field in a table which corresponds to the Primary Key of another table.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is a doubly-linked list?\n");
        answerStorage.addAnswer("Doubly Linked list is a list made up of nodes that have two pointers. These pointers point to the next and previous node.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is BCNF?\n");
        answerStorage.addAnswer("BCNF or Boyce Codd Normal Form is an advanced version of 3nf form.\n" +
                "\n" +
                "For a table to be in BCNF, it should:-\n" +
                "\n" +
                "Be in 3nf\n" +
                "for every functional dependency, A->B, A must be a superkey i.e., in any functional dependency LHS attribute must be a SuperKey.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Relational Database Management System?\n");
        answerStorage.addAnswer("Relational Database Management System, is a software system or collection of various programs that work together on a relational datamodel database and offer various integrated entities like-Database administration, Data definition, creation, updation etc.\n" +
                "\n" +
                "Examples:-\n" +
                "\n" +
                "SQL, MySQL etc\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is inner join?\n");
        answerStorage.addAnswer("Inner Join combines matching records of two tables, in a field that is common to both tables.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is a Deadlock?\n");
        answerStorage.addAnswer("A deadlock is a waiting state that a process undergoes when a requested  system resource, it requires, is held by another waiting process.\n");






        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.infoo);
        textView.setText(answersString);
    }
}