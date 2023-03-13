package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class CpAnswerActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cp_answer);

        answerStorage = new Csol();
        answerStorage.addAnswer("Q1. Find the prime numbers between 1 to 100\n"+"\n#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int checkPrime(int num)\n" +
                "{\n" +
                "    if(num < 2){\n" +
                "        return 0;\n" +
                "    }\n" +
                "    else{   \n" +
                "       int x = num/2;\n" +
                "        for(int i = 2; i < x; i++)\n" +
                "        {\n" +
                "            if(num % i == 0)\n" +
                "            {\n" +
                "                return 0;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    \n" +
                "    return 1;\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int a = 1, b = 100;\n" +
                "    \n" +
                "    for(int i=a; i <= b; i++){\n" +
                "        if(checkPrime(i))\n" +
                "            cout<<i<<\" \";\n" +
                "    }\n" +
                " \n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q2. Finding number of integers which has exactly x divisors\n"+"\n #include<iostream>\n" +
                "#include<math.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main(){\n" +
                "    \n" +
                "    int n=7, x=2;\n" +
                "    \n" +
                "    //Variable of count required numbers\n" +
                "    int count = 0;\n" +
                "    \n" +
                "    for(int i=1; i<=n; i++){\n" +
                "        \n" +
                "        //variable to count the factors of i-th number\n" +
                "        int count_factors = 0;\n" +
                "        for(int j = 1; j<=sqrt(i); j++){\n" +
                "            if(i%j==0){\n" +
                "                if(i/j != j)\n" +
                "                    count_factors += 2;\n" +
                "                else\n" +
                "                    count_factors++;\n" +
                "            }\n" +
                "        }\n" +
                "        \n" +
                "        if(count_factors == x)\n" +
                "            count++;\n" +
                "    }\n" +
                "    \n" +
                "    cout<<count;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q3. Sort first half in ascending order and second half in descending\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "void ascDecFunc(int a[], int n)\n" +
                "{\n" +
                "   int temp;\n" +
                "   for(int i=0;i < n-1;i++)\n" +
                "   {\n" +
                "     for(int j = 0;j < n/2; j++) { if(a[j]>a[j+1])\n" +
                "           {\n" +
                "             temp=a[j];\n" +
                "             a[j]=a[j+1];\n" +
                "             a[j+1]=temp;\n" +
                "           }\n" +
                "      }\n" +
                "\n" +
                "      for(int j = n/2;j < n-1; j++)\n" +
                "      {\n" +
                "          if(a[j] < a[j+1])\n" +
                "          {\n" +
                "             temp=a[j];\n" +
                "             a[j]=a[j+1];\n" +
                "             a[j+1]=temp;\n" +
                "          }\n" +
                "      }\n" +
                "   }\n" +
                "\n" +
                "   for(int i = 0; i < n; i++)\n" +
                "      cout<<a[i]<<\" \";\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {3, 2, 4, 1, 10, 30, 40, 20};\n" +
                "    int len = sizeof(arr) / sizeof(arr[0]);\n" +
                "    ascDecFunc(arr, len);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q4. Find the Smallest and largest element in an array\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "int main(){\n" +
                "\n" +
                "    int arr[] = {10, 67, 89, 78, 34, 2, 95};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "\n" +
                "    int smallest = INT_MAX, largest = INT_MIN;\n" +
                "\n" +
                "    for(int i=0; i<n; i++){ if(smallest > arr[i])\n" +
                "         smallest = arr[i];\n" +
                "       if(largest < arr[i])\n" +
                "         largest = arr[i];\n" +
                "    }\n" +
                "\n" +
                "   cout<<smallest<<endl<<largest;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q5. Finding the frequency of elements in an array\n"+"\n #include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "// Main function to run the program\n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {10, 30, 10, 20, 10, 20, 30, 10}; \n" +
                "    int n = sizeof(arr)/sizeof(arr[0]); \n" +
                "\n" +
                "    int visited[n];\n" +
                "\n" +
                "    for(int i=0; i<n; i++){\n" +
                "\n" +
                "        if(visited[i]!=1){\n" +
                "           int count = 1;\n" +
                "           for(int j=i+1; j<n; j++){\n" +
                "              if(arr[i]==arr[j]){\n" +
                "                 count++;\n" +
                "                 visited[j]=1;\n" +
                "              }\n" +
                "            }\n" +
                "\n" +
                "            cout<<arr[i]<<\" occurs at \"<<count<<\" times \"<<endl;\n" +
                "         }\n" +
                "     }\n" +
                "\n" +
                "    return 0; \n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q6. Positive or Negative number\n"+"\n #include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int num = 96;\n" +
                "    \n" +
                "    //Conditions to check if the number is negative or positive\n" +
                "    if (num > 0)\n" +
                "         cout << \"The number is positive\";\n" +
                "    else if (num < 0)\n" +
                "        cout << \"The number is negative\";\n" +
                "    else\n" +
                "        cout << \"Zero\";\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q7. Even or Odd number\n"+"\n #include <iostream>\n" +
                "using namespace std;\n" +
                "int main ()\n" +
                "{\n" +
                "    int number;\n" +
                "    cout << \"Enter a number:\"; cin >> number;\n" +
                " \n" +
                "    //checking whether the number is even or odd\n" +
                "    if (number % 2 == 0)\n" +
                "        cout << number << \" : Even\";\n" +
                "    else\n" +
                "        cout << number << \" : Odd\";\n" +
                "        \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q8. Sum of First N Natural numbers\n"+"\n #include<bits/stdc++.h> \n" +
                "using namespace std;\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int n;\n" +
                "    cout << \"Enter a number : \"; \n" +
                "    cin >> n;\n" +
                "    \n" +
                "    int sum=0;\n" +
                "    \n" +
                "    for(int i=1;i<=n;i++) \n" +
                "        sum+=i;\n" +
                "\n" +
                "    cout << sum;\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q9. Sum of numbers in a given range\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int a = 5;\n" +
                "    int b = 10;\n" +
                "    \n" +
                "    int sum = 0;\n" +
                "    \n" +
                "    for (int i = a; i <= b; i++)\n" +
                "        sum = sum + i;\n" +
                "    \n" +
                "    printf(\"%d\",sum);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q10. Greatest of two numbers\n"+"\n #include <iostream>\n" +
                "using namespace std;\n" +
                "int main ()\n" +
                "{\n" +
                "    int first, second, third;\n" +
                "    first=10,second=20,third=30;\n" +
                "    \n" +
                "    //comparing first with other numbers\n" +
                "    if ((first >= second) && (first >= third))\n" +
                "        cout << first << \" is the greatest \"; \n" +
                "\n" +
                "    //comparing Second with other numbers \n" +
                "    else if ((second >= first) && (second >= third))\n" +
                "        cout << second << \" is the greatest\";\n" +
                "    \n" +
                "    else\n" +
                "        cout << third << \" is the greatest\";\n" +
                " \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q11. Leap year or not\n"+"\n #include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int year;\n" +
                "\n" +
                "    year=2000;\n" +
                "\n" +
                "    if(year % 400 == 0)\n" +
                "        cout << year << \" is a Leap Year\";\n" +
                "        \n" +
                "    else if(year % 4 == 0  && year % 100 != 0)\n" +
                "        cout << year << \" is a Leap Year\";\n" +
                "        \n" +
                "    else\n" +
                "        cout << year << \" is not a Leap Year\";\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q12. Prime number within a given range\n"+"\n #include \n" +
                "using namespace std;\n" +
                "\n" +
                "bool isPrime(int n){\n" +
                "    int count = 0;\n" +
                "\n" +
                "    // 0, 1 negative numbers are not prime\n" +
                "    if(n < 2)\n" +
                "        return false;\n" +
                "    \n" +
                "    // checking the number of divisors b/w 1 and the number n-1\n" +
                "    for(int i = 2;i < n; i++) \n" +
                "    { \n" +
                "        if(n % i == 0) \n" +
                "            return false;\n" +
                "    }\n" +
                "    \n" +
                "    // if reached here then must be true\n" +
                "    return true;\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int lower, upper;\n" +
                "    \n" +
                "    lower=1,upper=100;\n" +
                "    \n" +
                "    for(int i = lower; i <= upper; i++)\n" +
                "        if(isPrime(i))\n" +
                "            cout << i << \" \";\n" +
                "\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q13. Sum of digits of a number\n"+"\n #include<iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "    int num, sum = 0;\n" +
                " \n" +
                "    num=1234;\n" +
                "    cout <<\"\\nThe number is: \" << num; \n" +
                " \n" +
                "    //loop to find sum of digits\n" +
                "    while(num!=0){\n" +
                "        sum += num % 10;\n" +
                "        num = num / 10;\n" +
                "    }\n" +
                " \n" +
                "    //output\n" +
                "    cout <<\"\\nSum of digits: \" << sum;\n" +
                " \n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q14. Reverse of a number\n"+"\n #include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "//main program\n" +
                "int main ()\n" +
                "{\n" +
                "    //variables initialization\n" +
                "    int num, reverse = 0, rem;\n" +
                "    num=1234;\n" +
                "    cout <<\"\\nThe number is\"<<num; \n" +
                "  \n" +
                "    //loop to find reverse number\n" +
                "    while(num != 0)\n" +
                "    {\n" +
                "      rem = num % 10;\n" +
                "      reverse = reverse * 10 + rem;\n" +
                "      num /= 10;\n" +
                "    };\n" +
                " \n" +
                "    //output\n" +
                "    cout <<\"\\nReversed Number: \"<<reverse;\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q15. Palindrome number\n"+"\n #include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "//main program\n" +
                "int main ()\n" +
                "{\n" +
                "    //variables initialization\n" +
                "    int num, reverse = 0, rem, temp;\n" +
                "    num=12321;\n" +
                "    cout <<\"\\nThe number is: \"<<num; \n" +
                "   \n" +
                " \n" +
                "    temp = num;\n" +
                "    //loop to find reverse number\n" +
                "    while(temp != 0)\n" +
                "    {\n" +
                "        rem = temp % 10;\n" +
                "        reverse = reverse * 10 + rem;\n" +
                "        temp /= 10;\n" +
                "    };\n" +
                "    \n" +
                "    // palindrome if num and reverse are equal\n" +
                "    if (num == reverse)\n" +
                "        cout << num << \" is Palindrome\";\n" +
                "    else\n" +
                "        cout << num << \" is not a Palindrome\";\n" +
                "\n" +
                "}\n");

        // Get the list of answers and convert it to a string
        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.myTextView);
        textView.setText(answersString);
    }
}