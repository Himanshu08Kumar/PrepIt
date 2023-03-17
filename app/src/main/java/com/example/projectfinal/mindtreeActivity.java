package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class mindtreeActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindtree);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Write a program to count the vowels in a given word.\n");
        answerStorage.addAnswer("#include  \n" +
                "#include  \n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    //Initializing variable.\n" +
                "    char str[100];  \n" +
                "    int i,vowels=0;\n" +
                "    \n" +
                "    //Accepting input.\n" +
                "    printf(\" Enter  the string : \");\n" +
                "    gets(str);\n" +
                "    \n" +
                "    //Initializing for loop. \n" +
                "    for(i=0;str[i];i++)  \n" +
                "    {\n" +
                "        //Counting the vowels.\n" +
                "        if(str[i]=='a'|| str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O' ||str[i]=='U')\n" +
                "        {\n" +
                "\t\t    vowels++;\n" +
                "        }\n" +
                "    }\n" +
                " \t\n" +
                "    //Printing the count of vowels.\n" +
                "    printf(\" Total number of vowels in the string = %d\\n\",vowels);\n" +
                "    \n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Write a program to find the average of the given numbers.\n");
        answerStorage.addAnswer("public class Main\n" +
                "{\n" +
                "  public static void main (String[]args)\n" +
                "  {\n" +
                "    int a = 5;\n" +
                "    int b = 10;\n" +
                "\n" +
                "    int sum = getSum (0, a, b);\n" +
                "      System.out.println (\"The sum is \" + sum);\n" +
                "  }\n" +
                "\n" +
                "\n" +
                "  static int getSum (int sum, int i, int b)\n" +
                "  {\n" +
                "\n" +
                "    // stop when any recursion call tries to go over b (larger number)\n" +
                "    if (i > b)\n" +
                "      return sum;\n" +
                "\n" +
                "    return i + getSum (sum, i + 1, b);\n" +
                "  }\n" +
                "}\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is BCNF?\n");
        answerStorage.addAnswer("BCNF is an Advanced version of 3nf.\n" +
                "\n" +
                "BCNF stands for Boyce Codd Normal Form. For a table to be in BCNF form, it must:-\n" +
                "\n" +
                "Be in 3nf form\n" +
                "For every functional dependency, A->B, A must be a superkey, i.e, in any functional dependency LHS attribute must be a super key.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What do you mean by foreign key?\n");
        answerStorage.addAnswer("Foreign key constraint is a column or list of columns which points to the primary key column of another table. The main purpose of foreign key is to only allow those values in the present table that matches to the primary key column of another table.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Why is DBMS important?\n");
        answerStorage.addAnswer("DBMS is important, because :-\n" +
                "\n" +
                "It manages the data\n" +
                "organizes the data such that it is easy for the users\n" +
                "dbms functions as a user interface\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Define thread and process.\n");
        answerStorage.addAnswer("Thread:- Threads are the smallest sequence of programmed instruction that can be managed independently by a scheduler.\n" +
                "\n" +
                "Process:- Process is an executing instance of a program.\n" +
                "\n" +
                "It is an active entity, that resides on the primary memory and leaves the memory when the system is rebooted.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. How to add a node at the beginning of a linked list?\n");
        answerStorage.addAnswer("void insertStart(struct Node** head, int data){\n" +
                "\n" +
                "  struct Node* newNode = (struct Node*) malloc(sizeof(struct Node));\n" +
                "\n" +
                "  newNode->data = data;\n" +
                "  newNode->next = *head;\n" +
                "\n" +
                "  //changing the new head to this freshly entered node\n" +
                "  *head = newNode; \n" +
                "}\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is FIFO data structure? State any real life example of it.\n");
        answerStorage.addAnswer("FIFO is an acronym for First in First Out approach. The concept of FIFO is basically that elements present in the stack are removed in the same order in which they are filled. Therefore the element which came in first is the element that will be removed first. In real life scenario, a queue follows a FIFO structure, where the person standing first in the queue, gets to go out first.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is an 8051 micro-controller?\n");
        answerStorage.addAnswer("8051 micro-controller is a general purpose micro-controller that Intel makes. It is an 8-bit set which has 128 bytes of RAM, 4kb of ROM, 2 Timers, 1 serial port, and four ports on a single chip.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is an interrupt service routine in Micro-controller?\n");
        answerStorage.addAnswer("ISR or interrupt service routine works when a micro-controller faces sudden interrupt.\n" +
                "\n" +
                "It stores the address of current memory and takes the control to a new interrupt memory address. Once the interrupt is fixed it restores the control back to its original address.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is deadlock? What are the conditions necessary to achieve a deadlock?\n");
        answerStorage.addAnswer("Deadlock is a situation in which two process are waiting to start, once the other finishes, thus neither starts and are left hanging.\n" +
                "\n" +
                "There are four conditions necessary:-\n" +
                "\n" +
                "Mutual Exclusion\n" +
                "Hold and Wait\n" +
                "No preemption\n" +
                "Circular wait\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Banker’s algorithm?\n");
        answerStorage.addAnswer("Banker’s algorithm is used to avoid deadlock. It is named such as it is based on the banking system of allocating cash such that they are always able to serve their customers.\n" +
                "\n" +
                "Algorithm:-\n" +
                "\n" +
                "1) Let Work vector be length m\n" +
                "\n" +
                "Finish be vector of length n\n" +
                "\n" +
                "Initialize Work = Available\n" +
                "\n" +
                "Finish[i]=false, for i=0,1,2.......,n-1\n" +
                "\n" +
                "2) Find an index i such that\n" +
                "\n" +
                "Finish[i] == false\n" +
                "\n" +
                "Need i<= work\n" +
                "\n" +
                "If no such i exists, got to step 4.\n" +
                "\n" +
                "3)Work = work+Allocation\n" +
                "\n" +
                "Finish[i] = true\n" +
                "\n" +
                "Go to step 2\n" +
                "\n" +
                "4) If Finish[i] == true for all i, then system is in safe state\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is polymorphism?\n");
        answerStorage.addAnswer("In Java, Polymorphism is the feature by which it can perform the same action in many ways.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is a break statement?\n");
        answerStorage.addAnswer("Break Statement is to stop the execution of a loop when its condition is fulfilled. The break statement stops the loop from executing and the succeeding statement is executed.\n");


        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.mind);
        textView.setText(answersString);
    }
}