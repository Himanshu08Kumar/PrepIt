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
        answerStorage.addAnswer("Q16. Armstrong number :\n"+"\n #include <stdio.h>\n" +
                "#include <math.h>\n" +
                " int order(int x)\n" +
                " {\n" +
                "  int len = 0;\n" +
                "  while (x)\n" +
                "  {\n" +
                "    len++;\n" +
                "    x = x/10;\n" +
                "  }\n" +
                "  return len;\n" +
                " }\n" +
                "  int getArmstrongSum(int num, int order){\n" +
                "\n" +
                "  if(num == 0)\n" +
                "  return 0;\n" +
                "\n" +
                "  int digit = num % 10;\n" +
                "\n" +
                "  return pow(digit, order) + getArmstrongSum(num/10, order);\n" +
                " }\n" +
                "\n" +
                "\n" +
                "// Driver Code\n" +
                "int main ()\n" +
                "{\n" +
                "  int num, len;\n" +
                "  num=1634;\n" +
                "  printf(\"The number is:%d\\n\",num); \n" +
                "\n" +
                "  // function to get order(length)\n" +
                "  len = order(num);\n" +
                "\n" +
                "  // check if Armstrong\n" +
                "  if (num == getArmstrongSum(num, len))\n" +
                "    printf(\"%d is Armstrong\", num);\n" +
                "  else\n" +
                "    printf(\"%d is Not Armstrong\", num);\n" +
                " \n" +
                " }\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q17. Fibonacci Series upto nth term\n"+"\n #include<stdio.h>\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int n = 10;\n" +
                "    int a = 0, b = 1;\n" +
                "    \n" +
                "    // printing the 0th and 1st term\n" +
                "    printf(\"%d, %d\",a,b);\n" +
                "    \n" +
                "    int nextTerm;\n" +
                "    \n" +
                "    // printing the rest of the terms here\n" +
                "    for(int i = 2; i < n; i++){\n" +
                "        nextTerm = a + b;\n" +
                "        a = b;\n" +
                "        b = nextTerm;\n" +
                "        \n" +
                "        printf(\"%d, \",nextTerm);\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q18. Factorial of a number\n"+"\n #include<stdio.h>\n" +
                "int main ()\n" +
                "{\n" +
                "    int num = 5, fact = 1;\n" +
                "    \n" +
                "    // Can't calculate factorial of a negative number\n" +
                "    if(num < 0)\n" +
                "        printf(\"Error\");\n" +
                "    else\n" +
                "    {\n" +
                "        for(int i = 1; i <= num; i++)\n" +
                "            fact = fact * i;\n" +
                "    }\n" +
                "    \n" +
                "    printf(\"Fact %d: %d\",num, fact);\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q19. Power of a number\n"+"\n #include<stdio.h>\n" +
                "#include<math.h> \n" +
                "int main() \n" +
                "{\n" +
                "    double base = 2.3;\n" +
                "    double exp = 2.1;\n" +
                "    double result;\n" +
                "    \n" +
                "    // calculates the power\n" +
                "    result = pow(base, exp);\n" +
                "    \n" +
                "    // %lf used for double\n" +
                "    printf(\"%lf ^ %lf = %lf\\n\", base, exp, result);\n" +
                "    \n" +
                "    // following can be used for precision setting\n" +
                "    printf(\"%.1lf ^ %.1lf = %.2lf\", base, exp, result);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q20. Factor of a number\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "\n" +
                "//main Program\n" +
                "int main()\n" +
                "{\n" +
                "    int n = 100;\n" +
                "    \n" +
                "    printf(\"Factors of %d are : \\n\", n);\n" +
                "    \n" +
                "    // finding and printing factors b/w 1 to num\n" +
                "    for(int i = 1; i <= n; i++)\n" +
                "    {\n" +
                "        // if n is divisible by i, then i is a factor of n\n" +
                "        if(n % i == 0)\n" +
                "            printf(\"%d, \", i);\n" +
                "    }\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q21. Finding Prime Factors of a number\n"+"\n #include <stdio.h>\n" +
                "void primefactor(int num) {\n" +
                "    printf(\"Prime factors of the number : \");     \n" +
                "    for (int i = 2; num > 1; i++) {\n" +
                "                  while (num % i == 0) {\n" +
                "                        printf(\"%d \", i);             \n" +
                "                        num = num / i;         \n" +
                "                       }     \n" +
                "                   } \n" +
                "                } \n" +
                "int main() {\n" +
                "      int num;     \n" +
                "      num=12;\n" +
                "      primefactor(num);     \n" +
                "     return 0; \n" +
                "}\n");


        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q22. Strong number\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "// function to calculate factorial\n" +
                "int getFactorial(int n){\n" +
                "    int fact = 1;\n" +
                "    \n" +
                "    for(int i = 1; i <= n; i++)\n" +
                "            fact = fact * i;\n" +
                "    \n" +
                "    return fact;\n" +
                "}\n" +
                "\n" +
                "int checkStrong(int num){\n" +
                "    \n" +
                "    int digit, sum = 0;\n" +
                "    int temp = num;\n" +
                "    \n" +
                "    // calculate 1! + 4! + 5!\n" +
                "    while(temp!=0){\n" +
                "        digit = temp % 10;\n" +
                "        \n" +
                "        sum = sum + getFactorial(digit);\n" +
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
                "    if(checkStrong(num))\n" +
                "        printf(\"%d is Strong Number\", num);\n" +
                "    else\n" +
                "        printf(\"%d is Not Strong Number\", num);\n" +
                "\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q23. Perfect number\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "    int num = 28, sum = 0;\n" +
                "    // iteratively check for all numbers in range [1, 27]\n" +
                "    for(int i = 1; i < num; i++){\n" +
                "        // check if i is a divisor, if yes then add to sum\n" +
                "        if(num % i == 0)\n" +
                "            sum = sum + i;\n" +
                "    }\n" +
                "    \n" +
                "    if(sum == num)\n" +
                "        printf(\"%d is a perfect number\",num);\n" +
                "    else\n" +
                "        printf(\"%d is not a perfect number\",num);\n" +
                "    \n" +
                "\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q24. Perfect Square \n"+"\n #include <stdio.h>\n" +
                "#include <math.h>\n" +
                "\n" +
                "int isPerfectSquare(long double x)\n" +
                "{\n" +
                "    if (x >= 0) {\n" +
                " \n" +
                "        long long sr = sqrt(x);\n" +
                "        return (sr * sr == x);\n" +
                "    }\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    long long x = 84;\n" +
                "    if (isPerfectSquare(x)==1)\n" +
                "        printf(\"True\");\n" +
                "    else\n" +
                "        printf(\"False\");\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q25. Automorphic number\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int checkAutomorphic(int num){\n" +
                "    \n" +
                "    int square = num * num;\n" +
                "    \n" +
                "    while(num != 0)\n" +
                "    {\n" +
                "        // means not automorphic number\n" +
                "        if(num % 10 != square % 10){\n" +
                "            return 0;\n" +
                "        }\n" +
                "        \n" +
                "        // reduce down numbers\n" +
                "        num /= 10;\n" +
                "        square /= 10;\n" +
                "    }\n" +
                "    // if reaches here means automorphic number\n" +
                "    return 1;\n" +
                "}\n" +
                "\n" +
                "int main ()\n" +
                "{\n" +
                "    int num = 376, square = num * num ;\n" +
                "    \n" +
                "    if(checkAutomorphic(num))\n" +
                "        printf(\"Num : %d, Square: %d - Automorphic Number\",num, square);\n" +
                "    else\n" +
                "        printf(\"Num : %d, Square: %d - Not Automorphic Number\",num, square);\n" +
                "    \n" +
                "\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q26. Find Largest element in an array\n"+"\n #include<stdio.h>\n" +
                "\n" +
                "int getLargest(int arr[], int len)\n" +
                "{\n" +
                "    // assign first array element as largest\n" +
                "    int max = arr[0];\n" +
                "    \n" +
                "    // linearly search for the largest element\n" +
                "    for(int i=1; i max)\n" +
                "            max = arr[i];\n" +
                "    }\n" +
                "    \n" +
                "    return max;\n" +
                "    \n" +
                "}\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {20, 5, 35, 40, 10, 50, 15};\n" +
                "    \n" +
                "    // get the length of the array\n" +
                "    int len = sizeof(arr)/sizeof(arr[0]);    \n" +
                "    \n" +
                "    printf(\"The Largest element is: %d\", getLargest(arr, len));\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q27. Find Smallest Element in an Array\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int getSmallest(int arr[], int len)\n" +
                "{\n" +
                "    // assign first array element as smallest\n" +
                "    int min = arr[0];\n" +
                "    \n" +
                "    // linearly search for the smallest element\n" +
                "    for(int i=1; i < len; i++)\n" +
                "    {\n" +
                "        // if the current array element is smaller\n" +
                "        if (arr[i] < min)\n" +
                "            min = arr[i];\n" +
                "    }\n" +
                "    \n" +
                "    return min;\n" +
                "    \n" +
                "}\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {5, 8, 7, 2, 12, 4};\n" +
                "    \n" +
                "    // get the length of the array\n" +
                "    int len = sizeof(arr)/sizeof(arr[0]);    \n" +
                "    \n" +
                "    printf(\"The smallest : %d\", getSmallest(arr, len));\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q28. Find Second Smallest Element in an Array\n"+"\n #include <stdio.h>\n" +
                "#include <limits.h>\n" +
                "\n" +
                "int secSmallest(int arr[], int n)\n" +
                "{\n" +
                "    // assigning first element as smallest temporarily\n" +
                "    int smallest = arr[0];\n" +
                "    \n" +
                "    // we find the smallest element here\n" +
                "    for (int i=0; i < n; i++){\n" +
                "        if(arr[i] < smallest)\n" +
                "            smallest = arr[i];\n" +
                "    }\n" +
                "    \n" +
                "    // temporarily assinging largest max value\n" +
                "    int sec_smallest = INT_MAX;\n" +
                "    \n" +
                "    // finding second smallest here\n" +
                "    for (int i=0; i < n; i++){\n" +
                "        if(arr[i] != smallest && arr[i] < sec_smallest)\n" +
                "            sec_smallest = arr[i];\n" +
                "    }\n" +
                "\n" +
                "    return sec_smallest;\n" +
                "    \n" +
                "}\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {70, 40, 30, 20, 10, 90};\n" +
                "    \n" +
                "    // get the length of the array\n" +
                "    int len = sizeof(arr)/sizeof(arr[0]);    \n" +
                "    \n" +
                "    printf(\"The 2nd smallest : %d\",secSmallest(arr, len));\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q29. Calculate the sum of elements in an array \n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int calcSum(int arr[], int len){\n" +
                "    int sum = 0;\n" +
                "    \n" +
                "    for(int i = 0; i < len; i++)\n" +
                "        sum = sum + arr[i];\n" +
                "        \n" +
                "    return sum;\n" +
                "}\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {1, 5, 2, 10, 4, 8};\n" +
                "    \n" +
                "    // get the length of the array\n" +
                "    int len = sizeof(arr)/sizeof(arr[0]);    \n" +
                "    \n" +
                "    printf(\"Sum: %d\",calcSum(arr, len));\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q30. Reverse an Array\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "void printReverse(int arr[], int len){\n" +
                "    \n" +
                "    for(int i = len - 1; i >= 0; i--)\n" +
                "        printf(\"%d \", arr[i]);\n" +
                "}\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "    int arr[] = {10, 20, 30, 40, 50, 60};\n" +
                "    \n" +
                "    int len = sizeof(arr)/sizeof(arr[0]);\n" +
                "    \n" +
                "    printf(\"Array in Reverse:\\n\");\n" +
                "    printReverse(arr, len);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q31. Sort the elements of an array \n"+"\n #include <stdio.h>\n" +
                "\n" +
                "void swap(int *xp, int *yp) \n" +
                "{ \n" +
                "   int temp = *xp; \n" +
                "   *xp = *yp; \n" +
                "   *yp = temp; \n" +
                "}\n" +
                "\n" +
                "void selectionSort(int array[], int size) \n" +
                "{ \n" +
                "    int i, j, min_idx;\n" +
                "\n" +
                "    // Loop to iterate on array \n" +
                "    for (i = 0; i < size-1; i++) \n" +
                "    { \n" +
                "        // Here we try to find the min element in array \n" +
                "        min_idx = i; \n" +
                "        for (j = i+1; j < size; j++)\n" +
                "        {\n" +
                "            if (array[j] < array[min_idx]) \n" +
                "              min_idx = j; \n" +
                "        }\n" +
                "        // Here we interchange the min element with first one \n" +
                "        swap(&array[min_idx], &array[i]); \n" +
                "     } \n" +
                "}\n" +
                "\n" +
                "/* Display function to print values */\n" +
                "void display(int array[], int size) \n" +
                "{ \n" +
                "    int i; \n" +
                "    for (i=0; i < size; i++)\n" +
                "    { \n" +
                "       printf(\"%d \",array[i]);\n" +
                "    }\n" +
                "     printf(\"\\n\"); \n" +
                "}\n" +
                "\n" +
                "// The main function to drive other functions \n" +
                "int main() \n" +
                "{ \n" +
                "   int array[] = {50, 30, 10, 90, 80, 20, 40, 70}; \n" +
                "   int size = sizeof(array)/sizeof(array[0]);\n" +
                "\n" +
                "   selectionSort(array, size);\n" +
                "  \n" +
                "   display(array, size);\n" +
                "\n" +
                "   return 0; \n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q32. Sorting elements of an array by frequency\n"+"\n #include<stdio.h>\n" +
                "#define MAX 256\n" +
                "int main ()\n" +
                "{\n" +
                "     int a[]={1, 2, 1, 1, 2, 3, 3, 3, 3, 0};\n" +
                "     int n = sizeof(a)/sizeof(a[0]);\n" +
                "     int arr[MAX][2], brr[MAX][2];\n" +
                "     int k = 0, temp, count;\n" +
                "     for (int i = 0; i < n; i++)\n" +
                "     {\n" +
                "        arr[i][0] = a[i];\n" +
                "        arr[i][1] = 0;\n" +
                "     }\n" +
                "     // Unique elements and its frequency are stored in another array\n" +
                "     for (int i = 0; i < n; i++)\n" +
                "     {\n" +
                "         if (arr[i][1])\n" +
                "          continue;\n" +
                "         count = 1;\n" +
                "         for (int j = i + 1; j < n; j++)\n" +
                "         {\n" +
                "             if (arr[i][0] == arr[j][0])\n" +
                "             {\n" +
                "                 arr[j][1] = 1;\n" +
                "                 count++;\n" +
                "             }\n" +
                "         }\n" +
                "         brr[k][0] = arr[i][0];\n" +
                "         brr[k][1] = count;\n" +
                "         k++;\n" +
                "     }\n" +
                "     n = k;\n" +
                "\n" +
                "     //Store the array and its frequency in sorted form\n" +
                "     for (int i = 0; i < n - 1; i++)\n" +
                "     {\n" +
                "         temp = brr[i][1];\n" +
                "         for (int j = i + 1; j < n; j++)\n" +
                "         {\n" +
                "             if (temp < brr[j][1])\n" +
                "             {\n" +
                "                temp = brr[j][1];\n" +
                "                brr[j][1] = brr[i][1];\n" +
                "                brr[i][1] = temp;\n" +
                "\n" +
                "                temp = brr[j][0];\n" +
                "                brr[j][0] = brr[i][0];\n" +
                "                brr[i][0] = temp;\n" +
                "             }\n" +
                "         }\n" +
                "      }\n" +
                "      for (int i = 0; i < n; i++)\n" +
                "      {\n" +
                "            while (brr[i][1] != 0)\n" +
                "            {\n" +
                "                 printf (\" %d \", brr[i][0]);\n" +
                "                 brr[i][1]--;\n" +
                "            }\n" +
                "      }\n" +
                "return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q33. Finding the Longest Palindrome in an Array\n"+"\n #include <stdio.h>\n" +
                "#include <limits.h>\n" +
                "int ispalindrome(int n){\n" +
                "     int rev=0, temp = n;\n" +
                "\n" +
                "     while(temp>0){\n" +
                "          int rem = temp%10;\n" +
                "          rev = rev*10 + rem;\n" +
                "          temp /= 10;\n" +
                "     }\n" +
                "\n" +
                "     if(n==rev)\n" +
                "        return 1;\n" +
                "\n" +
                "     return 0;\n" +
                "}\n" +
                "\n" +
                "int main(){\n" +
                "    int arr[] = {1, 121, 55551, 545545, 10111, 90};\n" +
                "    int n = sizeof(arr)/sizeof(arr[0]);\n" +
                "    int res = INT_MIN;\n" +
                "\n" +
                "    for(int i=0; i<n; i++){\n" +
                "\n" +
                "          if(ispalindrome(arr[i]) && res<arr[i])\n" +
                "             res = arr[i];\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "    if(res==INT_MIN)\n" +
                "       res = -1;\n" +
                "\n" +
                "    printf(\"%d \",res);\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q34. Counting Distinct Elements in an Array\n"+"\n #include<stdio.h>\n" +
                "#include<stdlib.h>\n" +
                "\n" +
                "// Main function to run the program\n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {30, 50, 30, 10, 20, 40, 10, 20}; \n" +
                "    int n = sizeof(arr)/sizeof(arr[0]); \n" +
                "\n" +
                "    int visited[n] = {0};// marking all items 0(unvisited)\n" +
                "    int count_dis=0;\n" +
                "    \n" +
                "    for(int i=0; i < n; i++)\n" +
                "    {\n" +
                "        // only if unvisited\n" +
                "        if(visited[i]==0)\n" +
                "        {\n" +
                "            for(int j = i+1; j < n; j++){\n" +
                "                // if item appears again in the array\n" +
                "                if(arr[i] == arr[j]){\n" +
                "                    // mark visited\n" +
                "                    visited[j] = 1;\n" +
                "                }\n" +
                "            }\n" +
                "            // increase count as current array item counted\n" +
                "            // and future indexes with same value marked visited\n" +
                "            count_dis++;\n" +
                "        }\n" +
                "    }\n" +
                "   printf(\"Distinct items : %d \",count_dis);\n" +
                "   return 0; \n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q35. Finding  Repeating elements in an Array\n"+"\n #include<stdio.h>\n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {20, 30, 10, 2, 10, 20, 30, 11}; \n" +
                "    int n = sizeof(arr)/sizeof(arr[0]); \n" +
                "\n" +
                "    int visited[n];\n" +
                " \n" +
                "    for(int i=0; i < n; i++){\n" +
                "        \n" +
                "        // only if unvisited\n" +
                "        if(visited[i] == 0){\n" +
                "            int count = 1;\n" +
                "          \n" +
                "            for(int j = i+1; j < n; j++) { \n" +
                "\t\t\t\t// if appears again in the array \n" +
                "\t\t\t\tif(arr[i] == arr[j]) \n" +
                "\t\t\t\t{ // increase count & mark index visited \n" +
                "\t\t\t\t\tcount++; \n" +
                "\t\t\t\t\tvisited[j] = 1; \n" +
                "\t\t\t\t} \n" +
                "\t\t\t} // \n" +
                "\t\t\t\n" +
                "            if(count > 1)\n" +
                "                printf(\"%d \",arr[i]);\n" +
                "        }\n" +
                "    }\n" +
                "   return 0; \n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q36. Finding Non Repeating elements in an Array\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "// Main function to run the program\n" +
                "int main() \n" +
                "{ \n" +
                "    int arr[] = {21, 30, 10, 2, 10, 20, 30, 11}; \n" +
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
                "         if(count==1)\n" +
                "          printf(\"%d \",arr[i]);\n" +
                "       }\n" +
                "   }\n" +
                "   \n" +
                "   return 0; \n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q37. Removing Duplicate elements from an array\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "int duplicates(int arr[], int n)\n" +
                "{\n" +
                "   if (n==0 || n==1)\n" +
                "     return n;\n" +
                "\n" +
                "   int temp[n];\n" +
                "\n" +
                "   int j = 0;\n" +
                "   for (int i=0; i<n-1; i++)\n" +
                "      if (arr[i] != arr[i+1])\n" +
                "         temp[j++] = arr[i];\n" +
                "\n" +
                "   temp[j++] = arr[n-1];\n" +
                "\n" +
                "   for (int i=0; i<j; i++)\n" +
                "     arr[i] = temp[i];\n" +
                "\n" +
                "   return j;\n" +
                "}\n" +
                "\n" +
                "// Driver code\n" +
                "int main()\n" +
                "{\n" +
                "   int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};\n" +
                "   int n = sizeof(arr) / sizeof(arr[0]);\n" +
                "\n" +
                "   n = duplicates(arr, n);\n" +
                "\n" +
                "   for (int i=0; i<n; i++)\n" +
                "      printf(\"%d \", arr[i]);\n" +
                "\n" +
                "   return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q38. Finding Minimum scalar product of two vectors\n"+"\n #include <stdio.h>\n" +
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
                "    printf(\"%d \", product);\n" +
                "\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q39. Finding Maximum scalar product of two vectors in an array\n"+"\n #include <stdio.h>\n" +
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
                "       for(int j=i+1; j<n; j++){ \n" +
                "           if(arr1[i]>arr1[j]){\n" +
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
                "    printf(\"%d \", product);\n" +
                "\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q40. Counting the number of even and odd elements in an array\n"+"\n #include<stdio.h>\n" +
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
                "   printf(\"Even Elements count : %d \\nOdd Elements count : %d\", even_count, odd_count);\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q41. Check whether a character is a vowel or consonant \n"+"\n #include <stdio.h>\n" +
                "\n" +
                "// main function\n" +
                "int main()\n" +
                "{\n" +
                "    char c='F';\n" +
                "\n" +
                "    \n" +
                "        \n" +
                "    //checking for vowels\t\n" +
                "    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||\n" +
                "    c=='A'||c=='E'||c=='I'||c=='O'||c=='U')\n" +
                "    {\n" +
                "        printf(\"%c is a vowel\", c);  // condition true input is vowel\n" +
                "    }\n" +
                "    else\n" +
                "    {\n" +
                "        printf(\"%c is a consonant\", c);  // condition true input is consonant\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q42. Check whether a character is a alphabet or not\n"+"\n #include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    char ch='9';\n" +
                "\n" +
                " \n" +
                "    if( (ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))\n" +
                "        printf(\"The inserted character %c is an Alphabet\", ch);\n" +
                "   \n" +
                "    else\n" +
                "        printf(\"The entered character %c is not an Alphabet\", ch);\n" +
                "\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q43. Count the number of vowels \n"+"\n #include <stdio.h>\n" +
                "#include <ctype.h>\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    // Initializing variable.\n" +
                "    char str[100];  \n" +
                "    int i, vowels = 0;\n" +
                "    \n" +
                "    // Accepting input.\n" +
                "    printf(\"Enter the string: \");\n" +
                "    // best way to read string rather than gets/fgets\n" +
                "    scanf(\"%[^\\n]s\",&str);\n" +
                "    \n" +
                "    //Initializing for loop. \n" +
                "    for(i = 0; str[i]; i++)  \n" +
                "    {\n" +
                "        //Counting the vowels.\n" +
                "        if(str[i]=='a'|| str[i]=='e'||str[i]=='i'||\n" +
                "           str[i]=='o'|| str[i]=='u'||str[i]=='A'||\n" +
                "           str[i]=='E'||str[i]=='I'||str[i]=='O' ||str[i]=='U')\n" +
                "        {\n" +
                "            vowels++;\n" +
                "        }\n" +
                "    }\n" +
                " \t\n" +
                "    //Printing the count of vowels.\n" +
                "    printf(\"Total number of vowels: = %d\\n\",vowels);\n" +
                "    \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q44. Remove the vowels from a String\n"+"\n #include <stdio.h>\n" +
                "#include <stdlib.h>\n" +
                "\n" +
                "int main() {\n" +
                "    // Initializing variable.\n" +
                "    char str[100];\n" +
                "    int i, j, len = 0;\n" +
                "\n" +
                "    // Accepting input.\n" +
                "    printf(\"Enter a string : \");\n" +
                "    // gets(str);\n" +
                "    scanf(\"%s\", str);\n" +
                "\n" +
                "    len = strlen(str);\n" +
                "    // Accepting input.\n" +
                "\n" +
                "    for (i = 0; i < len; i++) {\n" +
                "        // Checking vowels.\n" +
                "        if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u' ||\n" +
                "            str[i] == 'A' || str[i] == 'E' || str[i] == 'I' || str[i] == 'O' || str[i] == 'U') {\n" +
                "            // Deleting vowels.\n" +
                "            for (j = i; j < len; j++) {\n" +
                "                // Storing string without vowels.\n" +
                "                str[j] = str[j + 1];\n" +
                "            }\n" +
                "            i--;\n" +
                "            len--;\n" +
                "        }\n" +
                "        str[len + 1] = '\\0';\n" +
                "    }\n" +
                "   printf(\"After deleting the vowels, the string will be : %s\", str);\n" +
                "   return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q45. Check if the given string is Palindrome or not\n"+"\n #include <stdio.h>\n" +
                "#include <string.h>\n" +
                "\n" +
                "\n" +
                "int main() \n" +
                "{\n" +
                "    char str[10] = \"naman\";\n" +
                "    int i, len, flag = 0;\n" +
                "    \n" +
                "    len = strlen(str);\n" +
                "\n" +
                "    for (i = 0; i < len; i++) \n" +
                "    {\n" +
                "        // Checking if string is palindrome or not\n" +
                "        if (str[i] != str[len - i - 1]) {\n" +
                "            flag = 1;\n" +
                "            break;\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    if (flag)\n" +
                "        printf(\"%s is not palindrome\", str);\n" +
                "    else\n" +
                "        printf(\"%s is palindrome\", str);\n" +
                "        \n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q46. Print the given string in reverse order\n"+"\n #include <stdio.h>\n" +
                "\n" +
                "#include <string.h>  \n" +
                "\n" +
                "// function definition of the revstr() \n" +
                "void revstr(char *str1) \n" +
                "{ \n" +
                "  // declare variable \n" +
                "  int i, len, temp; \n" +
                "  len = strlen(str1); // use strlen() to get the length of str string \n" +
                "\n" +
                "  // use for loop to iterate the string \n" +
                "  for (i = 0; i < len/2; i++) \n" +
                "  { \n" +
                "  // temp variable use to temporary hold the string \n" +
                "   temp = str1[i]; \n" +
                "   str1[i] = str1[len - i - 1]; \n" +
                "   str1[len - i - 1] = temp; \n" +
                "  } \n" +
                " } \n" +
                "\n" +
                "int main() \n" +
                "{ \n" +
                "  char str[50]=\"priyanka\"; // size of char string \n" +
                "  pri\n" +
                "\n" +
                "  printf (\" \\n Before reversing the string: %s \\n\", str); \n" +
                "\n" +
                "  // call revstr() function \n" +
                "  revstr(str); \n" +
                "  printf (\" After reversing the string: %s\", str); \n" +
                " }\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q47. Remove all characters from string except alphabets\n"+"\n #include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    //Initializing variable.\n" +
                "    char str[100];\n" +
                "    int i, j;\n" +
                "    \n" +
                "     //Accepting input.\n" +
                "    printf(\" Enter a string : \");\n" +
                "    gets(str);\n" +
                "\n" +
                "     //Iterating each character and removing non alphabetical characters.\n" +
                "    for(i = 0; str[i] != '\\0'; ++i)\n" +
                "    {\n" +
                "        while (!( (str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z') || str[i] == '\\0') )\n" +
                "        {\n" +
                "            for(j = i; str[j] != '\\0'; ++j)\n" +
                "            {\n" +
                "                str[j] = str[j+1];\n" +
                "            }\n" +
                "            str[j] = '\\0'; \n" +
                "        }\n" +
                "    }\n" +
                "     //Printing output.\n" +
                "    printf(\" After removing non alphabetical characters the string is :\");\n" +
                "    puts(str);\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q48. Remove spaces from a string\n"+"\n #include<stdio.h> \n" +
                "using namespace std;\n" +
                "// Function to remove all spaces from a given string\n" +
                "void removeSpaces(char *str)\n" +
                "{\n" +
                "    // To keep track of non-space character count\n" +
                "    int count = 0;\n" +
                "    // Traverse the provided string. If the current character is not a space,\n" +
                "    //move it to index 'count++'.\n" +
                "    for (int i = 0; str[i]; i++)\n" +
                "        if (str[i] != ' ')\n" +
                "            str[count++] = str[i]; // here count is incremented\n" +
                "    str[count] = '\\0';\n" +
                "}\n" +
                "// Driver program to test above function\n" +
                "int main()\n" +
                "{\n" +
                "    char str[] = \"P re p i  n  sta \";\n" +
                "    removeSpaces(str);\n" +
                "    printf(\"%s\", str);\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q49. Remove brackets from an algebraic expression\n"+"\n #include<stdio.h>  \n" +
                "int main()\n" +
                "{\n" +
                "    //Initializing variables.\n" +
                "    char str[100] = \"Prep))insta\", str_no_spc[100];\n" +
                "    int i=0, j=0 ;\n" +
                "    \n" +
                "    //Iterating each character of string.\n" +
                "    while(str[i] != '\\0')\n" +
                "    {\n" +
                "        if(str[i] != '(' &&  str[i] != ')')//Excluding brackets.\n" +
                "        {\n" +
                "            str_no_spc[j++] = str[i];\n" +
                "        }\n" +
                "        i++;\n" +
                "    }\n" +
                "    str_no_spc[j] = '\\0';\n" +
                "    \n" +
                "    //Printing result.\n" +
                "    printf(\"The string after removing all the spaces is:\\n%s\", str_no_spc);\n" +
                "    return 0;\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q50. Count the sum of numbers in a string\n"+"\n #include<stdio.h>  \n" +
                "int main()\n" +
                "{\n" +
                "    //Initializing variables.\n" +
                "    char str[100] = \"4PREP2INSTA6\";\n" +
                "    int i,sum = 0;\n" +
                "    \n" +
                "    //Iterating each character through for loop.\n" +
                "    for (i= 0; str[i] != '\\0'; i++)\n" +
                "    {\n" +
                "        if ((str[i] >= '0') && (str[i] <= '9'))  //Checking for numeric characters.\n" +
                "        {\n" +
                "            \n" +
                "            sum += (str[i] - '0'); //Adding numeric characters.\n" +
                "\n" +
                "        }\n" +
                "    }\n" +
                "    //Printing result.\n" +
                "    printf(\"Sum of all digits:\\n%d\", sum);\n" +
                "    return 0; \n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q51. \n"+"\n \n");


        // Get the list of answers and convert it to a string
        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.myTextView);
        textView.setText(answersString);
    }
}