package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class capgeminiActivity extends AppCompatActivity {
    private Csol answerStorage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capgemini);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Write the code for Bubble Sort.\n");
        answerStorage.addAnswer("#include<stdio.h>\n" +
                "\n" +
                "/* Function to print array */\n" +
                "void display(int arr[], int size) \n" +
                "{ \n" +
                "    int i; \n" +
                "    for (i=0; i < size; i++) \n" +
                "        printf(\"%d \", arr[i]); \n" +
                "    printf(\"\\n\"); \n" +
                "} \n" +
                "\n" +
                "// Main function to run the program\n" +
                "int main() \n" +
                "{ \n" +
                "    int array[] = {5, 3, 1, 9, 8, 2, 4,7}; \n" +
                "    int size = sizeof(array)/sizeof(array[0]); \n" +
                "\n" +
                "    printf(\"Before bubble sort: \\n\");\n" +
                "    display(array, size);\n" +
                "\n" +
                "       int i, j, temp; \n" +
                "   for (i = 0; i < size-1; i++){       \n" +
                "\n" +
                "       // Since, after each iteration righmost i elements are sorted   \n" +
                "       for (j = 0; j < size-i-1; j++)  \n" +
                "           if (array[j] > array[j+1]) \n" +
                "           {\n" +
                "              temp = array[j]; // swap the element\n" +
                "              array[j] = array[j+1]; \n" +
                "              array[j+1] = temp; \n" +
                "           }\n" +
                "    }\n" +
                "    printf(\"After bubble sort: \\n\"); \n" +
                "    display(array, size); \n" +
                "    return 0; \n" +
                "} \n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Primary and Secondary Key?\n");
        answerStorage.addAnswer("Primary Key:- A primary key is used to identify a unique record in a database.\n" +
                "\n" +
                "Secondary Key:- It is an alternate key or an additional key to a primary key ,used for locating a specific data.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Which Data Structure should be used for implementing LRU cache?\n");
        answerStorage.addAnswer("There are two data structures, that can be used to implemenet LRU Cache:-\n" +
                "\n" +
                "Queue\n" +
                "A Hash\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Explain SDLC?\n");
        answerStorage.addAnswer("SDLC or Software Development Life Cycle, is the process of designing, building, maintaining and testing a software product.\n" +
                "\n" +
                "SDLC refers to the approach towards developing a software product, in a systematic way.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. List the different storage class specifiers in C.\n");
        answerStorage.addAnswer("The storage class specifiers in C are:-\n" +
                "\n" +
                "Auto storage class specifier\n" +
                "Static storage class specifier\n" +
                "Extern Storage class specifier\n" +
                "Register Storage Class Specifier\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are the advantages of OOPS?\n");
        answerStorage.addAnswer("code re-usability\n" +
                "data redundancy\n" +
                "code maintenance\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Write the programming code to swap two numbers without using the third variable.\n");
        answerStorage.addAnswer("a=int(input(“Enter value : “))\n" +
                "\n" +
                "b=int(input(“Enter value : “))\n" +
                "\n" +
                "print(“Before swapping a :”,a)\n" +
                "\n" +
                "print(“Before swapping b :”,b)\n" +
                "\n" +
                "#logic to swap without using third variable\n" +
                "\n" +
                "a=a+b\n" +
                "\n" +
                "b=a-b\n" +
                "\n" +
                "a=a-b\n" +
                "\n" +
                "print(“After swapping a becomes :”,a)\n" +
                "\n" +
                "print(“After swapping b becomes :”,b)\n" +
                "\n" +
                "Enter value : 34\n" +
                "Enter value : 12\n" +
                "Before swapping a : 34\n" +
                "Before swapping b : 12\n" +
                "After swapping a becomes : 12\n" +
                "After swapping b becomes : 34\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is networking?\n");
        answerStorage.addAnswer("Networking is connecting two or more computer such that they are able to communicate with one another are able to send and receive data.\n");

        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.capge);
        textView.setText(answersString);
    }
}