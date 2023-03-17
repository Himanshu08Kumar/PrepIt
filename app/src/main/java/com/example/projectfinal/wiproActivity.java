package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class wiproActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wipro);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Storage class in C?\n");
        answerStorage.addAnswer("Storage classes are used to describe the different features of variables and functions in C programming language.\n" +
                "\n" +
                "These features include the scope, lifetime and initial value of a variable.\n" +
                "\n" +
                "There are four types of storage classes:-\n" +
                "\n" +
                "Auto Storage Class\n" +
                "External Storage Class\n" +
                "Register Storage Class\n" +
                "Static Storage Class\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is the size of a C structure?\n");
        answerStorage.addAnswer("The size of a C structure is 128 bytes.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Write a query to find the maximum salary from EMPLOYEE table.\n");
        answerStorage.addAnswer("SELECT MAX(salary) AS “Highest salary”\n" +
                "\n" +
                "FROM employees;\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Recursion in C?\n");
        answerStorage.addAnswer("Recursion is a process where a function calls itself.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is an Operating System?\n");
        answerStorage.addAnswer("An Operating System executes user programs and basically helps the user to interact with the system.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is a Data Structure?\n");
        answerStorage.addAnswer("Data Structure is a way of organizing data such that it can be used effectively.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. To Transpose a matrix.\n");
        answerStorage.addAnswer("#include <stdio.h>\n" +
                "int main ()\n" +
                "{\n" +
                "    int a[10][10], t[10][10], r, c, i, j;\n" +
                "    printf (\"Enter the order of matrix: \");\n" +
                "    scanf (\"%d %d\", &r, &c);\n" +
                "\n" +
                "    printf (\"\\nEnter the elements of matrix:\\n\");\n" +
                "    for (i = 0; i < r; ++i)\n" +
                "    {\n" +
                "        for (j = 0; j < c; ++j)\n" +
                "\t    {\n" +
                "\t        printf (\"Enter the element a[%d %d]: \", i + 1, j + 1);\n" +
                "\t        scanf (\"%d\", &a[i][j]);\n" +
                "\t    }\n" +
                "    }\n" +
                "  \n" +
                "    printf (\"\\nInput Matrix: \\n\");\n" +
                "    for (i = 0; i < r; ++i)\n" +
                "    {\n" +
                "        for (j = 0; j < c; ++j)\n" +
                "\t    {\n" +
                "\t        printf (\"%d \", a[i][j]);\n" +
                "\t        if (j == c - 1)\n" +
                "\t            printf (\"\\n\\n\");\n" +
                "\t    }\n" +
                "    }\n" +
                "\n" +
                "    for (i = 0; i < r; ++i)\n" +
                "    {\n" +
                "        for (j = 0; j < c; ++j)\n" +
                "\t    {\n" +
                "\t        t[j][i] = a[i][j];\n" +
                "\t    }\n" +
                "    }\n" +
                "\n" +
                "    printf (\"\\nTranspose of the Input Matrix:\\n\");\n" +
                "    for (i = 0; i < c; ++i)\n" +
                "    {\n" +
                "        for (j = 0; j < r; ++j)\n" +
                "\t    {\n" +
                "\t        printf (\"%d \", t[i][j]);\n" +
                "\t        if(j == r - 1)\n" +
                "\t           printf (\"\\n\\n\");\n" +
                "\t    }\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. To check for balanced parenthesis in the expression.\n");
        answerStorage.addAnswer("#include<stdio.h>\n" +
                "#include<string.h>\n" +
                "\n" +
                "#define MAX 100\n" +
                "\n" +
                "struct stack\n" +
                "{\n" +
                "  char stck[MAX];\n" +
                "  int top;\n" +
                "} s;\n" +
                "\n" +
                "void push (char item)\n" +
                "{\n" +
                "  if (s.top == (MAX - 1))\n" +
                "    printf (\"Stack is Full\\n\");\n" +
                "\n" +
                "  else\n" +
                "    {\n" +
                "      s.top = s.top + 1;\n" +
                "      s.stk[s.top] = item;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "void pop ()\n" +
                "{\n" +
                "  if (s.top == -1)\n" +
                "    printf (\"Stack is Empty\\n\");\n" +
                "\n" +
                "  else\n" +
                "    s.top = s.top - 1;\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "  char exp[MAX];\n" +
                "\n" +
                "  int i = 0;\n" +
                "\n" +
                "  s.top = -1;\n" +
                "\n" +
                "  printf (\"\\nINPUT THE EXPRESSION : \");\n" +
                "  scanf (\"%s\", exp);\n" +
                "\n" +
                "  for (i = 0; i < strlen (exp); i++)\n" +
                "    {\n" +
                "\n" +
                "      if (exp[i] == '(' || exp[i] == '[' || exp[i] == '{')\n" +
                "\t{\n" +
                "\t  push (exp[i]);\n" +
                "\t  continue;\n" +
                "\n" +
                "\t}\n" +
                "\n" +
                "      else if (exp[i] == ')' || exp[i] == ']' || exp[i] == '}')\n" +
                "\t{\n" +
                "\n" +
                "\t  if (exp[i] == ')')\n" +
                "\t    {\n" +
                "\n" +
                "\t      if (s.stk[s.top] == '(')\n" +
                "\t\tpop ();\n" +
                "\n" +
                "\t      else\n" +
                "\t\t{\n" +
                "\n" +
                "\t\t  printf (\"\\nUNBALANCED EXPRESSION\\n\");\n" +
                "\t\t  break;\n" +
                "\n" +
                "\t\t}\n" +
                "\n" +
                "\t    }\n" +
                "\n" +
                "\t  if (exp[i] == ']')\n" +
                "\t    {\n" +
                "\n" +
                "\t      if (s.stk[s.top] == '[')\n" +
                "\t\tpop ();\n" +
                "\n" +
                "\t      else\n" +
                "\t\t{\n" +
                "\n" +
                "\t\t  printf (\"\\nUNBALANCED EXPRESSION\\n\");\n" +
                "\t\t  break;\n" +
                "\n" +
                "\t\t}\n" +
                "\n" +
                "\t    }\n" +
                "\n" +
                "\t  if (exp[i] == '}')\n" +
                "\t    {\n" +
                "\n" +
                "\t      if (s.stk[s.top] == '{')\n" +
                "\t\tpop ();\n" +
                "\n" +
                "\t      else\n" +
                "\t\t{\n" +
                "\n" +
                "\t\t  printf (\"\\nUNBALANCED EXPRESSION\\n\");\n" +
                "\t\t  break;\n" +
                "\n" +
                "\t\t}\n" +
                "\n" +
                "\t    }\n" +
                "\n" +
                "\t}\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "  if (s.top == -1)\n" +
                "    printf (\"\\nBALANCED EXPRESSION\\n\");\n" +
                "\n" +
                "}\n");


        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.wippo);
        textView.setText(answersString);
    }
}