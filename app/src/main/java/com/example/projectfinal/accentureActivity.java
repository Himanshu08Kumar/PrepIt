package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class accentureActivity extends AppCompatActivity {
    private Csol answerStorage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accenture);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is multi-threading?\n");
        answerStorage.addAnswer("Multi-threading is a process of executing multiple threads simultaneously.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are OOPS concepts?\n");
        answerStorage.addAnswer("OOPs or Object Oriented Programming Language concepts include:-\n" +
                "\n" +
                "Inheritance\n" +
                "Polymorphism\n" +
                "Abstraction\n" +
                "Encapsulation\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Exceptional Handling in JAVA?\n");
        answerStorage.addAnswer("Exception Handling in Java handles the runtime errors and maintains a normal application flow.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is a Friend Function in C++?\n");
        answerStorage.addAnswer("A friend function in C++, is a function capable of accessing private/protected data of any class where it has been declared as a friend, though it is not a member of that class.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Write a code for Octal to Decimal Conversion.\n");
        answerStorage.addAnswer("#include <stdio.h>\n" +
                "\n" +
                "    // Function to convert octal number to decimal\n" +
                "\n" +
                "    int convert(int octal)\n" +
                "\n" +
                "    {\n" +
                "\n" +
                "        int decimal = 0, i = 0;\n" +
                "\n" +
                "        //converting octal to decimal\n" +
                "\n" +
                "        while (octal != 0)\n" +
                "\n" +
                "        {\n" +
                "\n" +
                "            int rem = octal % 10;\n" +
                "\n" +
                "            octal /= 10;\n" +
                "\n" +
                "            int res=rem*pow(8,i);\n" +
                "\n" +
                "            decimal += res;\n" +
                "\n" +
                "            i++;\n" +
                "\n" +
                "        }\n" +
                "\n" +
                "        return decimal;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    //main program\n" +
                "\n" +
                "    int main()\n" +
                "\n" +
                "    {\n" +
                "\n" +
                "        int octal;\n" +
                "\n" +
                "        printf(\"Enter an octal number: \");\n" +
                "\n" +
                "        //user input\n" +
                "\n" +
                "        scanf(\"%d\", &octal);\n" +
                "\n" +
                "        //calling function\n" +
                "\n" +
                "        int decimal=convert(octal);\n" +
                "\n" +
                "        //printing output\n" +
                "\n" +
                "        printf( \" %d in octal = %d in decimal\", octal, decimal);     \n" +
                "\n" +
                "        return 0;\n" +
                "\n" +
                "    }\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is the use of pointers?\n");
        answerStorage.addAnswer("Pointers are used for:-\n" +
                "\n" +
                "Accessing array elements\n" +
                "Dynamic memory allocation\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are the different types of inheritance?\n");
        answerStorage.addAnswer("single inheritance\n" +
                "multiple inheritance\n" +
                "multi-level inheritance\n" +
                "hierarchical inheritance\n");

        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.accen);
        textView.setText(answersString);
    }
}