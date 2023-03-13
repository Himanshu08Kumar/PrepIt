package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class CAnswerActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canswer);
        // Create an instance of AnswerStorage
        answerStorage = new Csol();

        // Add some answers to the list
        answerStorage.addAnswer("Q1. Find the prime numbers between 1 to 100\n"+"\n#include <stdio.h>\n" +
                "\n" +
                "int checkPrime(int num)\n" +
                "{\n" +
                "    // 0, 1 and negative numbers are not prime\n" +
                "    if(num < 2){\n" +
                "        return 0;\n" +
                "    }\n"+
                "else{   \n" +
                "    // no need to run loop till num-1 as for any number x the numbers in\n" +
                "    // the range(num/2 + 1, num) won't be divisible anyways. \n" +
                "    // Example 36 wont be divisible by anything b/w 19-35\n" +
                "        int x = num/2;\n" +
                "        for(int i = 2; i <=x; i++)\n" +
                "        {\n" +
                "            if(num % i == 0)\n" +
                "            {\n" +
                "                return 0;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    // the number would be prime if we reach here\n" +
                "    return 1;\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int a = 1, b = 100;\n" +
                "    \n" +
                "    for(int i=a; i <= b; i++){\n" +
                "        if(checkPrime(i))\n" +
                "            printf(\"%d \",i);\n" +
                "    }\n" +
                " \n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q2. Finding number of integers which has exactly x divisors\n"+"\n#include <stdio.h>\n" +
                "#include <math.h>\n" +
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
                "        for(int j = 1; j<= i; j++){\n" +
                "            if(i%j==0){\n" +
                "                    count_factors++;\n" +
                "            }\n" +
                "        }\n" +
                "        \n" +
                "        if(count_factors == x)\n" +
                "            count++;\n" +
                "    }\n" +
                "    \n" +
                "    printf(\"%d \", count);\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q3. Sort first half in ascending order and second half in descending\n"+"\n#include<stdio.h>\n" +
                "\n" +
                "void ascDecFunc(int a[], int n)\n" +
                "{\n" +
                "    int temp;\n" +
                "    for(int i=0;i < n-1;i++)\n" +
                "    {\n" +
                "        for(int j = 0;j < n/2; j++) { if(a[j]>a[j+1])\n" +
                "            {\n" +
                "                temp=a[j];\n" +
                "                a[j]=a[j+1];\n" +
                "                a[j+1]=temp;\n" +
                "            }\n" +
                "        }\n" +
                "        \n" +
                "        for(int j = n/2;j < n-1; j++)\n" +
                "        {\n" +
                "            if(a[j] < a[j+1])\n" +
                "            {\n" +
                "                temp=a[j];\n" +
                "                a[j]=a[j+1];\n" +
                "                a[j+1]=temp;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\t\n" +
                "\tfor(int i = 0; i < n; i++)\n" +
                "\t    printf(\"%d \", a[i]);\n" +
                "}\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {3, 2, 4, 1, 10, 30, 40, 20};\n" +
                "    int len = sizeof(arr) / sizeof(arr[0]);\n" +
                "    ascDecFunc(arr, len);\n" +
                " \n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q4. Find the Smallest and largest element in an array\n"+"\n#include <stdio.h>\n" +
                "\n" +
                "void getSmallLarge(int arr[], int n)\n" +
                "{\n" +
                "    int smallest, largest;\n" +
                "    \n" +
                "    smallest = largest = arr[0];\n" +
                "    \n" +
                "    for(int i = 1; i < n ;i++){\n" +
                "        \n" +
                "        // finding smallest here\n" +
                "        if(arr[i] < smallest) smallest = arr[i]; // finding largest here\n" +
                " if(arr[i] > largest) largest = arr[i]; \n" +
                "        \n" +
                "    } \n" +
                "    printf(\"Smallest: %d\\n\",smallest);\n" +
                "    printf(\"Largest: %d\", largest); \n" +
                "    \n" +
                "} \n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {25, 40, 35, 20, 10, 80}; \n" +
                "int len = sizeof(arr)/sizeof(arr[0]);\n" +
                "getSmallLarge(arr, len); \n" +
                "    \n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q5. Finding the frequency of elements in an array\n"+"\n #include<stdio.h>\n" +
                "\n" +
                "// Main function to run the program\n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {10, 30, 10, 20, 10, 20, 30, 10}; \n" +
                "    int n = sizeof(arr)/sizeof(arr[0]); \n" +
                "\n" +
                "    int visited[n];\n" +
                " \n" +
                "    for(int i=0; i<n; i++){\n" +
                "\n" +
                "       if(visited[i]==0){\n" +
                "          int count = 1;\n" +
                "          for(int j=i+1; j<n; j++){\n" +
                "             if(arr[i]==arr[j]){\n" +
                "                count++;\n" +
                "                visited[j]=1;\n" +
                "             }\n" +
                "          }\n" +
                "\n" +
                "          printf(\"%d occurs %d times\\n\", arr[i], count);\n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "   return 0; \n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q6. Positive or Negative number\n"+"\n #include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    int num = 23;\n" +
                "      \n" +
                "    //Conditions to check if the number is negative/positive or zero\n" +
                "    if (num > 0)\n" +
                "         printf(\"The number is positive\");\n" +
                "    else if (num < 0)\n" +
                "        printf(\"The number is negative\");\n" +
                "    else\n" +
                "        printf(\"Zero\");\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q7. Even or Odd number\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "    int number;\n" +
                "    printf (\"Insert a number \\n\");\n" +
                "    scanf (\"%d\", &number);\n" +
                "\n" +
                "    //Checking if the number is divisible by 2\n" +
                "    if (number % 2 == 0)\n" +
                "        printf (\"Even\");\n" +
                "    else\n" +
                "        printf (\"Odd\");\n" +
                "  \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q8. Sum of First N Natural numbers\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int n; \n" +
                "    scanf(\"%d\",&n);\n" +
                "    \n" +
                "    int sum = 0;\n" +
                "    \n" +
                "    for(int i=1;i<=n;i++) \n" +
                "        // is same as writing sum = sum + i\n" +
                "        sum += i;\n" +
                "        \n" +
                "    printf(\"Sum is %d\",sum);\n" +
                "    \n" +
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
        answerStorage.addAnswer("Q10. Greatest of two numbers\n"+"\n #include <stdio.h> \n" +
                "int main ()\n" +
                "{\n" +
                "    int num1, num2, num3;\n" +
                "    \n" +
                "    num1=12,num2=17,num3=19;\n" +
                "\n" +
                "    //checking if num1 is greatest\n" +
                "    if (num1 >= num2 && num1 >= num3)\n" +
                "        printf(\"%d is the greatest\", num1);\n" +
                "        \n" +
                "    //checking if num2 is greatest\n" +
                "    else if(num2 >= num1 && num2 >= num3)\n" +
                "         printf(\"%d is the greatest\", num2);\n" +
                "\n" +
                "    //checking if num2 is greatest\n" +
                "    else if(num3 >= num1 && num3 >= num2)\n" +
                "         printf(\"%d is the greatest\", num3);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q11. Leap year or not\n"+"\n #include <stdio.h>\n" +
                "int main ()\n" +
                "{\n" +
                "    int year;\n" +
                "    year=2000;\n" +
                "    \n" +
                "    if(year % 400 == 0)\n" +
                "        printf(\"%d is a Leap Year\",year);\n" +
                "        \n" +
                "    else if(year % 4 == 0  && year % 100 != 0)\n" +
                "        printf(\"%d is a Leap Year\",year);\n" +
                "        \n" +
                "    else\n" +
                "        printf(\"%d is not a Leap Year\",year);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q12. Prime number within a given range\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int checkPrime(int num)\n" +
                "{\n" +
                "    // 0, 1 and negative numbers are not prime\n" +
                "    if(num < 2){\n" +
                "        return 0;\n" +
                "    }\n" +
                "    else{   \n" +
                "    // no need to run loop till num-1 as for any number x the numbers in\n" +
                "    // the range(num/2 + 1, num) won't be divisible anyways. \n" +
                "    // Example 36 wont be divisible by anything b/w 19-35\n" +
                "        int x = num/2;\n" +
                "        for(int i = 2; i < x; i++)\n" +
                "        {\n" +
                "            if(num % i == 0)\n" +
                "            {\n" +
                "                return 0;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    // the number would be prime if we reach here\n" +
                "    return 1;\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int a=10, b=20;\n" +
                "  \n" +
                "    \n" +
                "    for(int i=a; i <= b; i++){\n" +
                "        if(checkPrime(i))\n" +
                "            printf(\"%d \",i);\n" +
                "    }\n" +
                " \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q13. Sum of digits of a number\n"+"\n #include<stdio.h>\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "    int num, sum = 0;\n" +
                " \n" +
                "    num = 1234;\n" +
                "    printf(\"The number is = %d\\n\",num);\n" +
                "\n" +
                "    //loop to find sum of digits\n" +
                "    while(num!=0){\n" +
                "        sum += num % 10;\n" +
                "        num = num / 10;\n" +
                "    }\n" +
                " \n" +
                "    //output\n" +
                "    printf(\"Sum: %d\\n\",sum);\n" +
                " \n" +
                "    return 0;\n" +
                "\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q14. Reverse of a number\n"+"\n #include<stdio.h>\n" +
                "\n" +
                "//main program\n" +
                "int main ()\n" +
                "{\n" +
                "  //variables initialization\n" +
                "  int num, reverse = 0, rem;\n" +
                "  num=1234;\n" +
                "  printf(\"The number is: %d\\n\",num);\n" +
                "  \n" +
                " \n" +
                "  //loop to find reverse number\n" +
                "    while(num != 0)\n" +
                "    {\n" +
                "      rem = num % 10;\n" +
                "      reverse = reverse * 10 + rem;\n" +
                "      num /= 10;\n" +
                "    };\n" +
                " \n" +
                "  //output\n" +
                "  printf(\"Reverse: %d\\n\",reverse);\n" +
                "  \n" +
                "  return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q15. Palindrome number\n"+"\n #include<stdio.h> \n" +
                "\n" +
                "// Palindrome is a number that is same if read forward/backward\n" +
                "// Ex : 12321\n" +
                "int main ()\n" +
                "{\n" +
                "    int num, reverse = 0, rem, temp;\n" +
                "    num=11211;\n" +
                "    printf(\"The number is :%d\\n\",num);\n" +
                " \n" +
                "    temp = num;\n" +
                "    \n" +
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
                "        printf(\"%d is Palindrome\\n\", num);\n" +
                "    else\n" +
                "        printf(\"%d is Not Palindrome\\n\", num);\n" +
                "\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q16. \n"+"\n \n");
        // Get the list of answers and convert it to a string
        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.myTextView);
        textView.setText(answersString);
    }
}