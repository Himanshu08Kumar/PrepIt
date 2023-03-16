package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class ciscoActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cisco);
        answerStorage = new Csol();

        answerStorage.addAnswer("Technical Interview\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. How will you explain computer networking in layman’s terms?\n");
        answerStorage.addAnswer("Networking can simply be described  as connecting two or more computers locally or globally such that they are able to share information among themselves.\n");


        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is ping and traceroute?\n");
        answerStorage.addAnswer("Ping:- Ping checks whether a particular IP address is accessible or not.\n" +
                "\n" +
                "Traceroute:- Traceroute traces the route of a packet as it leaves the computer to the host, and shows the number of steps and time it will take for the packet to reach the host.\n");


        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. How is a virus removed from a computer?\n");
        answerStorage.addAnswer("The easiest way to remove virus from a computer is to run an antivirus scan.\n" +
                "\n" +
                "First boot the PC in Safe mode, where the PC is running only the essential programs. This is done to ensure the antivirus can scan without any interruption.\n" +
                "\n" +
                "Once the PC is in Safe Mode, the antivirus scan is done to eliminate the virus.\n" +
                "\n" +
                "If the antivirus fails, however then a professional help is recommended.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is troubleshooting?\n");
        answerStorage.addAnswer("Troubleshooting includes the process of identifying, diagnosing, planning and resolving any problem, error or bugs in a software or computer system.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What steps will you take to troubleshoot a page that is not loading?\n");
        answerStorage.addAnswer("1.Check the Connection:– many times the issue is not the page but the network. Verify that the system is online and connected to a stable internet connection\n" +
                "\n" +
                "2.Identify the problem:- a.If the user is unable to connect to a particular website, then the problem might be with the website. In this case we can check what the error message is displayed in the browser window, like if it is 500, that means the web-server has problem or 404 means the page is removed or the link is wrong.\n" +
                "\n" +
                "b.If the user is unable to connect to any site then we can with the troubleshooting(Step 3)\n" +
                "\n" +
                "3.Verify the IP address:- We need to verify our DHCP server IP address.\n" +
                "\n" +
                "If the IP address begins with 169.254, it means it is auto-configured by the operating system, there is no connection between the system and the DHCP server.\n" +
                "\n" +
                "In this case we need to get a DHCP address from, by contacting the support desk.\n" +
                "\n" +
                "4.Verify gateway address:- Gateway is responsible for packet transmission to the external networks(internet). We need to verify the IP address of default gateway, and then verify it with PING command.\n" +
                "\n" +
                "If it is working, then we will get a positive ping command, i.e., 192.168.1.1.\n" +
                "\n" +
                "However if the ping response is negative, it shows request time out then it means the system cannot reach the gateway.\n" +
                "\n" +
                "5.Verify DNS:- DNS server basically translates a domain to an IP address which the system can read. To verify whether it is working or not, we can ping command to a domain name say google.com\n" +
                "\n" +
                "Executing a ping command to a host name, the operating system resolves it to a IP address. However if it does not resolves to an IP address, then the DNS server is not working.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is encryption?\n");
        answerStorage.addAnswer("Encryption, basically means to convert the data into an encoded format and can be read after it is decoded.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is the Blue Screen on a laptop?\n");
        answerStorage.addAnswer("Blue Screen error is also known as stop message error or stop error. This occurs due to faulty hardware, faulty drivers or low level apps running in the kernel.\n" +
                "\n" +
                "Due to which the system shuts down or restarts.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is Dijkstra’s Algorithm?\n");
        answerStorage.addAnswer("Dijkstra’s algorithm is used for finding the shortest path between noes in a graph.\n");
        answerStorage.addAnswer("<----------------------------------------------------->\n");
        answerStorage.addAnswer("Q. What is the Merge sort algorithm?\n");
        answerStorage.addAnswer("Merge sort is used to sort data in a logical order. It follows the divide and conquer approach.\n");




        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.ciscoText);
        textView.setText(answersString);
    }
}