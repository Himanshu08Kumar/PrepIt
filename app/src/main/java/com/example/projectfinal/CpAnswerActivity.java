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

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q16. Armstrong number :\n"+"\n #include<bits/stdc++.h>\n" +
                "#include<math.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "// Armstrong number is any number following the given rule\n" +
                "// abcd... = a^n + b^n + c^n + d^n + ...\n" +
                "// Where n is the order(length/digits in number)\n" +
                "\n" +
                "// Example = 153 (order/length = 3)\n" +
                "// 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153\n" +
                "\n" +
                "// Example = 1634 (order/length = 4)\n" +
                "// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634\n" +
                "\n" +
                "// number of digits in a number is order\n" +
                "int order(int x)\n" +
                "{\n" +
                "    int len = 0;\n" +
                "    while (x)\n" +
                "    {\n" +
                "        len++;\n" +
                "        x = x/10;\n" +
                "    }\n" +
                "    return len;\n" +
                "}\n" +
                "\n" +
                "bool armstrong(int num, int len){\n" +
                "\n" +
                "    int sum = 0, temp, digit;\n" +
                "    temp = num;\n" +
                "    \n" +
                "    // loop to extract digit, find power & add to sum\n" +
                "    while(temp != 0)\n" +
                "    {\n" +
                "        // extract digit\n" +
                "        digit = temp % 10;\n" +
                "\n" +
                "        // add power to sum\n" +
                "        sum = sum + pow(digit,len);\n" +
                "        temp /= 10;\n" +
                "    };\n" +
                "\n" +
                "    return num == sum;\n" +
                "}\n" +
                "\n" +
                "// Driver Code\n" +
                "int main ()\n" +
                "{\n" +
                "    //variables initialization\n" +
                "    int num = 407, len;\n" +
                " \n" +
                "    // function to get order(length)\n" +
                "    len = order(num);\n" +
                "    \n" +
                "    // check if Armstrong\n" +
                "    if (armstrong(num, len))\n" +
                "        cout << num << \" is armstrong\";\n" +
                "    else\n" +
                "        cout << num << \" is not armstrong\";\n" +
                "\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q17. Fibonacci Series upto nth term\n"+"\n // Write a program to print fibonacci series in C++\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int num = 15;\n" +
                "    int a = 0, b = 1;\n" +
                "    \n" +
                "    // Here we are printing 0th and 1st terms\n" +
                "    cout << a << \", \" << b << \", \";\n" +
                "    \n" +
                "    int nextTerm;\n" +
                "    \n" +
                "    // printing the rest of the terms here\n" +
                "    for(int i = 2; i < num; i++){\n" +
                "        nextTerm = a + b;\n" +
                "        a = b;\n" +
                "        b = nextTerm;\n" +
                "        \n" +
                "        cout << nextTerm << \", \";\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q18. Factorial of a number\n"+"\n #include<iostream>\n" +
                "using namespace std;\n" +
                "int main ()\n" +
                "{\n" +
                "    int num = 6, fact = 1;\n" +
                "    \n" +
                "    // Factorial of negative number doesn't exist\n" +
                "    // Read more here - https://www.quora.com/Is-the-factorial-of-a-negative-number-possible\n" +
                "    if(num < 0)\n" +
                "        cout << \"Not Possible\";\n" +
                "    else\n" +
                "    {\n" +
                "        for(int i = 1; i <= num; i++)\n" +
                "            fact = fact * i;\n" +
                "    }\n" +
                "    \n" +
                "    cout << \"Fact \" << num << \": \" << fact;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q19. Power of a number\n"+"\n #include<iostream>\n" +
                "#include<math.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main() \n" +
                "{\n" +
                "    double base = 1.5;\n" +
                "    double expo1 = 2.5;\n" +
                "    double expo2 = -2.5;\n" +
                "    double res1, res2;\n" +
                "    \n" +
                "    // calculates the power\n" +
                "    res1 = pow(base, expo1);\n" +
                "    res2 = pow(base, expo2);\n" +
                "    \n" +
                "    cout << base << \" ^ \" << expo1 << \" = \" << res1 << endl;\n" +
                "    cout << base << \" ^ \" << expo2 << \" = \" << res2 << endl;\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q20. Factor of a number\n"+"\n //C++ Program Factors of a number\n" +
                "#include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "//main Program\n" +
                "int main()\n" +
                "{\n" +
                "    int num;\n" +
                "    \n" +
                "    num=100;\n" +
                "    \n" +
                "    cout << \"Factors of \" << num << \" are: \" << endl;  \n" +
                "    \n" +
                "    // finding and printing factors b/w 1 to num\n" +
                "    for(int i = 1; i <= num; i++)\n" +
                "    {\n" +
                "        if(num % i == 0)\n" +
                "            cout << i << \" \";\n" +
                "    }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q21. Finding Prime Factors of a number\n"+"\n #include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "void primeFactors(int n) \n" +
                "{ \n" +
                "    while (n % 2 == 0) \n" +
                "    { \n" +
                "        cout << 2 << \" \"; \n" +
                "        n = n/2; \n" +
                "    } \n" +
                "\n" +
                "    for (int i = 3; i <= sqrt(n); i = i + 2) \n" +
                "    { \n" +
                "        \n" +
                "        while (n % i == 0) \n" +
                "        { \n" +
                "            cout << i << \" \"; n = n/i; } } if (n > 2) \n" +
                "        cout << n << \" \"; \n" +
                "} \n" +
                "\n" +
                "// Driver code \n" +
                "int main() \n" +
                "{ \n" +
                "    int n = 315; \n" +
                "    primeFactors(n); \n" +
                "    return 0; \n" +
                "} \n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q22. Strong number\n"+"\n #include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "// function to calculate factorial\n" +
                "int facto(int n){\n" +
                "    int fact = 1;\n" +
                "    \n" +
                "    for(int i = 1; i <= n; i++)\n" +
                "            fact = fact * i;\n" +
                "    \n" +
                "    return fact;\n" +
                "}\n" +
                "\n" +
                "int detectStrong(int num){\n" +
                "    \n" +
                "    int digit, sum = 0;\n" +
                "    int temp = num;\n" +
                "    \n" +
                "    // calculate 1! + 4! + 5!\n" +
                "    while(temp!=0){\n" +
                "        digit = temp % 10;\n" +
                "        \n" +
                "        sum = sum + facto(digit);\n" +
                "        temp /= 10;\n" +
                "    }\n" +
                "    \n" +
                "    // returns 1 if both equal else 0\n" +
                "    return sum == num;\n" +
                "    \n" +
                "}\n" +
                "int main ()\n" +
                "{\n" +
                "    int num = 145;\n" +
                "    \n" +
                "    if(detectStrong(num))\n" +
                "        cout << num << \" is Strong Number\";\n" +
                "    else\n" +
                "        cout << num << \" is Not Strong Number\";\n" +
                "\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q23. Perfect number\n"+"\n #include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "    int n = 28, sum = 0;\n" +
                "    \n" +
                "    for(int i = 1; i < n; i++){\n" +
                "        if(n % i == 0)\n" +
                "            sum = sum + i;\n" +
                "    }\n" +
                "    \n" +
                "    if(sum == n)\n" +
                "        cout << n << \" is a perfect number\";\n" +
                "    else\n" +
                "        cout << n << \" is not a perfect number\";\n" +
                "    \n" +
                "\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q24. Perfect Square \n"+"\n #include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                " \n" +
                "bool isPerfectSquare(long double x)\n" +
                "{\n" +
                "    if (x >= 0) {\n" +
                " \n" +
                "        long long sr = sqrt(x);\n" +
                "        return (sr * sr == x);\n" +
                "    }\n" +
                "    \n" +
                "    return false;\n" +
                "}\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    long long x = 84;\n" +
                "    if (isPerfectSquare(x))\n" +
                "        cout << \"True\";\n" +
                "    else\n" +
                "        cout << \"False\";\n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q25. Automorphic number\n"+"\n #include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "int isAutomorphic(int n){\n" +
                "    \n" +
                "    int square = n * n;\n" +
                "    \n" +
                "    while(n != 0)\n" +
                "    {\n" +
                "        // means not automorphic number\n" +
                "        if(n % 10 != square % 10){\n" +
                "            return 0;\n" +
                "        }\n" +
                "        \n" +
                "        // reduce down numbers\n" +
                "        n /= 10;\n" +
                "        square /= 10;\n" +
                "    }\n" +
                "    // if reaches here means automorphic number\n" +
                "    return 1;\n" +
                "}\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "    int n = 376, sq = n * n ;\n" +
                "    \n" +
                "    if(isAutomorphic(n))\n" +
                "        cout << \"Num: \"<< n << \", Square: \" << sq << \" - is Automorphic\";\n" +
                "    else\n" +
                "        cout << \"Num: \"<< n << \", Square: \" << sq << \" - is not Automorphic\";\n" +
                "    \n" +
                "\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q26. Find Largest element in an array\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main(){\n" +
                "\n" +
                "  int arr[]={10, 89, 67, 56, 45, 78};\n" +
                "  int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "  int max_element = INT_MIN;\n" +
                "\n" +
                "  for(int i=0; i<n; i++){ if(arr[i]>max_element)\n" +
                "      max_element = arr[i];\n" +
                "  }\n" +
                "\n" +
                "  cout<<max_element;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q27. Find Smallest Element in an Array\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main(){\n" +
                "\n" +
                "  int arr[] = { 34, 5, 89, 90, 56};\n" +
                "  int n = sizeof(arr)/ sizeof(arr[0]);\n" +
                "\n" +
                "  int mini = INT_MAX;\n" +
                "\n" +
                "  for(int i=0; i<n; i++){\n" +
                "    if(arr[i]<mini)\n" +
                "      mini = arr[i];\n" +
                "  }\n" +
                "\n" +
                "  cout<<mini;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q28. Find Second Smallest Element in an Array\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int secSmallest(int arr[], int n)\n" +
                "{\n" +
                "   // assigning first element as smallest temporarily\n" +
                "   int smallest = arr[0];\n" +
                "\n" +
                "   // we find the smallest element here\n" +
                "   for (int i=0; i < n; i++){\n" +
                "     if(arr[i] < smallest)\n" +
                "       smallest = arr[i];\n" +
                "   }\n" +
                "\n" +
                "   // temporarily assinging largest max value\n" +
                "   int sec_smallest = INT_MAX;\n" +
                "\n" +
                "   // finding second smallest here\n" +
                "   for (int i=0; i < n; i++){\n" +
                "      if(arr[i] != smallest && arr[i] < sec_smallest)\n" +
                "        sec_smallest = arr[i];\n" +
                "   }\n" +
                "\n" +
                "   return sec_smallest;\n" +
                "\n" +
                "}\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {70, 40, 30, 20, 10, 90};\n" +
                "\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]); \n" +
                "\n" +
                "    cout<<secSmallest(arr, n);\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q29. Calculate the sum of elements in an array \n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main(){\n" +
                "\n" +
                "   int arr[] = {10, 20, 30, 50, 89};\n" +
                "\n" +
                "   int n = sizeof(arr)/sizeof(arr[0]); \n" +
                "\n" +
                "   int sum =0;\n" +
                "\n" +
                "   for(int i=0; i<n; i++){\n" +
                "      sum += arr[i];\n" +
                "   }\n" +
                "\n" +
                "   cout<<sum;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q30. Reverse an Array\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main(){\n" +
                "\n" +
                "   int arr[] = {10, 20, 30, 40, 50};\n" +
                "   int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "\n" +
                "   for(int i=n-1; i>=0; i--)\n" +
                "      cout<<arr[i]<<\" \";\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q31. Sort the elements of an array \n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "void sorted(int arr[], int n){\n" +
                "\n" +
                "  for(int i=0; i<n-1; i++){\n" +
                "     for(int j=i+1; j<n; j++){ if(arr[i]>arr[j]){\n" +
                "             int temp = arr[i];\n" +
                "             arr[i] = arr[j];\n" +
                "             arr[j] = temp;\n" +
                "          }\n" +
                "     }\n" +
                "   }\n" +
                "\n" +
                "   for(int i=0; i<n; i++)\n" +
                "      cout<<arr[i]<<\" \";\n" +
                "}\n" +
                "\n" +
                "int main(){\n" +
                "\n" +
                "   int arr[] = {10, 89, 67, 45, 83, 9, 12};\n" +
                "   int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "\n" +
                "   sorted(arr, n);\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q32. Sorting elements of an array by frequency\n"+"\n #include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "#define MAX 256\n" +
                "int main ()\n" +
                "{\n" +
                "     int a[]={10, 20, 10, 10, 20, 30, 30, 30, 30, 0};\n" +
                "     int n = sizeof(a)/sizeof(a[0]);\n" +
                "     int arr[MAX][2], brr[MAX][2];\n" +
                "     int k = 0, temp, count;\n" +
                "     \n" +
                "     for (int i = 0; i < n; i++){\n" +
                "          arr[i][0] = a[i];\n" +
                "          arr[i][1] = 0;\n" +
                "     }\n" +
                "     \n" +
                "     // Unique elements and its frequency are stored in another array\n" +
                "     for (int i = 0; i < n; i++){\n" +
                "         if (arr[i][1])\n" +
                "            continue;\n" +
                "         count = 1;\n" +
                "         for (int j = i + 1; j < n; j++){\n" +
                "            if (arr[i][0] == arr[j][0]){\n" +
                "               arr[j][1] = 1;\n" +
                "               count++;\n" +
                "            }\n" +
                "         }\n" +
                "         brr[k][0] = arr[i][0];\n" +
                "         brr[k][1] = count;\n" +
                "         k++;\n" +
                "    }\n" +
                "    n = k;\n" +
                "\n" +
                "    //Store the array and its frequency in sorted form\n" +
                "    for (int i = 0; i < n - 1; i++)\n" +
                "    {\n" +
                "        temp = brr[i][1];\n" +
                "        for (int j = i + 1; j < n; j++)\n" +
                "        {\n" +
                "           if (temp < brr[j][1])\n" +
                "           {\n" +
                "                 temp = brr[j][1];\n" +
                "                 brr[j][1] = brr[i][1];\n" +
                "                 brr[i][1] = temp;\n" +
                "\n" +
                "                 temp = brr[j][0];\n" +
                "                 brr[j][0] = brr[i][0];\n" +
                "                 brr[i][0] = temp;\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    for (int i = 0; i < n; i++)\n" +
                "    {\n" +
                "        while (brr[i][1] != 0)\n" +
                "        {\n" +
                "           cout<< brr[i][0] <<\" \";\n" +
                "           brr[i][1]--;\n" +
                "        }\n" +
                "    }\n" +
                "    return 0;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q33. Finding the Longest Palindrome in an Array\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int ispalindrome(int n){\n" +
                "    int rev=0, temp = n;\n" +
                "\n" +
                "    while(temp>0){\n" +
                "       int rem = temp%10;\n" +
                "       rev = rev*10 + rem;\n" +
                "       temp /= 10;\n" +
                "    }\n" +
                "\n" +
                "    if(n==rev)\n" +
                "       return 1;\n" +
                "\n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "int main(){\n" +
                "     int arr[] = {1, 121, 55551, 545545, 10111, 90};\n" +
                "     int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "     int res = INT_MIN;\n" +
                "\n" +
                "     for(int i=0; i<n; i++){\n" +
                "       if(ispalindrome(arr[i]) && res<arr[i])\n" +
                "          res = arr[i];\n" +
                "     }\n" +
                "\n" +
                "     if(res==INT_MIN)\n" +
                "        res = -1;\n" +
                "\n" +
                "     cout<<res;\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q34. Counting Distinct Elements in an Array\n"+"\n #include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "// Main function to run the program\n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {10, 30, 10, 20, 40, 20, 50, 10}; \n" +
                "    int n = sizeof(arr)/sizeof(arr[0]); \n" +
                "\n" +
                "    int visited[n], count_dis=0;\n" +
                "\n" +
                "    for(int i=0; i<n; i++){\n" +
                "\n" +
                "        if(visited[i]!=1){\n" +
                "           for(int j=i+1; j<n; j++){\n" +
                "              if(arr[i]==arr[j]){\n" +
                "                 visited[j]=1;\n" +
                "              }\n" +
                "            }\n" +
                "             count_dis++;\n" +
                "         }\n" +
                "     }\n" +
                "    cout<<count_dis;\n" +
                "    return 0; \n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q35. Finding  Repeating elements in an Array\n"+"\n #include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "// Main function to run the program\n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {10, 30, 10, 20, 40, 20, 50, 10}; \n" +
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
                "            if(count!=1)\n" +
                "             cout<<arr[i]<<\" \";\n" +
                "         }\n" +
                "     }\n" +
                "    \n" +
                "    return 0; \n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q36. Finding Non Repeating elements in an Array\n"+"\n #include <bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "// Main function to run the program\n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {10, 30, 10, 20, 40, 20, 50, 10}; \n" +
                "    int n = sizeof(arr)/sizeof(arr[0]); \n" +
                "\n" +
                "    int visited[n], count_dis=0;\n" +
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
                "            if(count==1)\n" +
                "             cout<<arr[i]<<\" \";\n" +
                "         }\n" +
                "     }\n" +
                " \n" +
                "    return 0; \n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q37. Removing Duplicate elements from an array\n"+"\n #include<bits/stdc++.h>\n" +
                "\n" +
                "using namespace std;\n" +
                "int main(){\n" +
                "set<int>s;\n" +
                "int arr[] = {10, 10, 20, 30, 30, 30, 40};\n" +
                "int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "for(int i=0; i<n; i++)\n" +
                "s.insert(arr[i]);\n" +
                "for(auto it = s.begin(); it != s.end(); it++)\n" +
                "cout<<*it<<\" \";\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q38. Finding Minimum scalar product of two vectors\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main(){\n" +
                "\n" +
                "   int arr1[] = {1, 2, 6, 3, 7};\n" +
                "   int arr2[] = {10, 7, 45, 3, 7};\n" +
                "\n" +
                "   int n = sizeof(arr1)/sizeof(arr1[0]);\n" +
                "\n" +
                "\n" +
                "   //Sort arr1 in ascending order\n" +
                "   for(int i=0; i<n; i++){\n" +
                "       for(int j=i+1; j<n; j++){ if(arr1[i]>arr1[j]){\n" +
                "               int temp = arr1[i];\n" +
                "               arr1[i] = arr1[j];\n" +
                "               arr1[j] = temp;\n" +
                "           }\n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "   //Sort arr2 in descending order\n" +
                "   for(int i=0; i<n; i++){\n" +
                "       for(int j=i+1; j<n; j++){\n" +
                "           if(arr2[i]<arr2[j]){\n" +
                "                int temp = arr2[i];\n" +
                "                arr2[i] = arr2[j];\n" +
                "                arr2[j] = temp;\n" +
                "           }\n" +
                "       }\n" +
                "    }\n" +
                "\n" +
                "    int product = 0;\n" +
                "    for(int i=0; i<n; i++)\n" +
                "        product += arr1[i]*arr2[i];\n" +
                "\n" +
                "    cout<< product;\n" +
                "\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q39. Finding Maximum scalar product of two vectors in an array\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main(){\n" +
                "\n" +
                "   int arr1[] = {1, 2, 6, 3, 7};\n" +
                "   int arr2[] = {10, 7, 45, 3, 7};\n" +
                "\n" +
                "   int n = sizeof(arr1)/sizeof(arr1[0]);\n" +
                "\n" +
                "\n" +
                "   //Sort arr1 in ascending order\n" +
                "   for(int i=0; i<n; i++){\n" +
                "       for(int j=i+1; j<n; j++){ if(arr1[i]>arr1[j]){\n" +
                "               int temp = arr1[i];\n" +
                "               arr1[i] = arr1[j];\n" +
                "               arr1[j] = temp;\n" +
                "           }\n" +
                "       }\n" +
                "   }\n" +
                "\n" +
                "   //Sort arr2 in ascending order\n" +
                "   for(int i=0; i<n; i++){\n" +
                "       for(int j=i+1; j<n; j++){ if(arr2[i]>arr2[j]){\n" +
                "                int temp = arr2[i];\n" +
                "                arr2[i] = arr2[j];\n" +
                "                arr2[j] = temp;\n" +
                "           }\n" +
                "       }\n" +
                "    }\n" +
                "\n" +
                "    int product = 0;\n" +
                "    for(int i=0; i<n; i++)\n" +
                "        product += arr1[i]*arr2[i];\n" +
                "\n" +
                "    cout<< product;\n" +
                "\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q40. Counting the number of even and odd elements in an array\n"+"\n #include<bits/stdc++.h>\n" +
                "using namespace std;\n" +
                "\n" +
                "int main(){\n" +
                "\n" +
                "   int arr[] = {1, 7, 8, 4, 5, 16, 8};\n" +
                "   int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "\n" +
                "   int even_count=0, odd_count=0;\n" +
                "\n" +
                "   for(int i=0; i<n; i++){\n" +
                "     if(arr[i]%2==0)\n" +
                "       even_count++;\n" +
                "\n" +
                "     else \n" +
                "       odd_count++;\n" +
                "   }\n" +
                "   cout<<\"Even Elements count : \" <<even_count<< \"\\nOdd Elements count : \" << odd_count;\n" +
                "}\n");




        // Get the list of answers and convert it to a string
        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.myTextView);
        textView.setText(answersString);
    }
}