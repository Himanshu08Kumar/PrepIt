package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class tcsNinjaActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tcsninja);

        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are the features of python?\n");
        answerStorage.addAnswer("Some basic features of python are:\n" +
                "\n" +
                "Python is a programming language that is both free and open source.\n" +
                "Python is an easy to learn and use programming language.\n" +
                "Python is an interpreted programming language.\n" +
                "Python can be used on a variety of platforms, including Windows, Linux, UNIX, and Macintosh.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. Is python an interpreted language?\n");
        answerStorage.addAnswer("The Python code is run one line at a time. The advantage of being an interpreted language is that debugging is easy and portable.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is an IP Address?\n");
        answerStorage.addAnswer("IP addresses are a unique string of characters that identify each device that communicates with other computers on the network via the internet protocol.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is DHCP?\n");
        answerStorage.addAnswer("DHCP is an abbreviation for Dynamic Host Configuration Protocol, which is a network management protocol used to automate the process of configuring devices on IP networks so that they can access network services such as DNS, NTP, and any UDP or TCP-based communication protocol.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are LIFO and FIFO?\n");
        answerStorage.addAnswer("Q. LIFO: The concept of LIFO applies to how data is accessed, saved, and recovered. For the LIFO data type, the most recently stored data should be extracted first.\n" +
                "FIFO: First In First Out specifies how data in a structure is accessible, as well as which data gets removed first from the queue list after it has been there the longest.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are the layers in an OSI model?\n");
        answerStorage.addAnswer("The OSI reference model divides computing system communications into seven abstraction layers: \n" +
                "\n" +
                "Physical \n" +
                "Data link\n" +
                "Network\n" +
                "Transport\n" +
                "Session\n" +
                "Presentation\n" +
                "Application.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are the OOPS concepts?\n");
        answerStorage.addAnswer("There 4 basic pillars in OOPS:\n" +
                "\n" +
                "Encapsulation\n" +
                "Inheritance\n" +
                "Abstraction\n" +
                "Polymorphism\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is polymorphism?\n");
        answerStorage.addAnswer("Polymorphism refers to the presence of numerous existent forms in the program. This indicates a code for acting differently in different scenarios.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What are collections in JAVA?\n");
        answerStorage.addAnswer("In JAVA, a collection is a framework that holds components and functions as a single entity. The Java collection framework is used to manipulate data.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What do you mean by SDLC?\n");
        answerStorage.addAnswer("SDLC stands for Software Development Life Cycle which refers to the process of creating software. \n" +
                "\n" +
                "SLDC Phased include:-\n" +
                "\n" +
                "requirement gathering and analysis\n" +
                "feasibility study\n" +
                "software design\n" +
                "software implementation/coding\n" +
                "software testing\n" +
                "software deployment\n" +
                "software maintenance\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is an IoT device?\n");
        answerStorage.addAnswer("IoT devices can communicate with one another via the internet. IoT devices are being used in fire alarms, refrigerators, security systems, medical sensors, and other applications.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is an OS?\n");
        answerStorage.addAnswer("The operating system (OS) stores and maintains the program and applications in the system, and it contributes to a better user experience.\n");




        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.tcsNinja);
        textView.setText(answersString);
    }
}