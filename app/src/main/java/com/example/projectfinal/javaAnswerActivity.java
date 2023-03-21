package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class javaAnswerActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_answer);

        answerStorage = new Csol();

        answerStorage.addAnswer("Q1. Find the prime numbers between 1 to 100\n"+"\npublic class Main\n" +
                "{\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t\t\n" +
                "\t\tfor(int i=1;i<=100;i++){\n" +
                "\t\t    if(checkPrime(i)){\n" +
                "\t\t        System.out.print(i+\" \" );\n" +
                "\t\t    }\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tpublic static boolean checkPrime(int num){\n" +
                "\t    \n" +
                "\t   // 0, 1 and negative numbers are not prime\n" +
                "\t    if(num<2){\n" +
                "\t        return false;\n" +
                "\t    }\n" +
                "\t    else{\n" +
                "\t        // no need to run loop till num-1 as for any number x the numbers in\n" +
                "    // the range(num/2 + 1, num) won't be divisible anyways. \n" +
                "    // Example 36 wont be divisible by anything b/w 19-35\n" +
                "\t        int x= num/2;\n" +
                "\t        for(int i=2;i<x;i++){\n" +
                "\t            if(num%i==0){\n" +
                "\t                return false;\n" +
                "\t            }\n" +
                "\t        }\n" +
                "\t    }\n" +
                "\t    // the number would be prime if we reach here\n" +
                "\t    return true;\n" +
                "\t}\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q2. Finding number of integers which has exactly x divisors\n"+"\nimport java.util.*;\n" +
                " \n" +
                "class Main{\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        int  n = 7, x = 2 ;\n" +
                "        int count = 0;\n" +
                "    \n" +
                "        for(int i=1; i<=n; i++){\n" +
                "        \n" +
                "            //variable to count the factors of i-th number\n" +
                "            int count_factors = 0;\n" +
                "            for(int j = 1; j<= i; j++){\n" +
                "                if(i%j==0){\n" +
                "                    count_factors++;\n" +
                "                }\n" +
                "            }\n" +
                "        \n" +
                "        if(count_factors == x)\n" +
                "            count++;\n" +
                "    }\n" +
                "        System.out.println(count);\n" +
                "    }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q3. Sort first half in ascending order and second half in descending\n"+"\n import java.util.*;\n" +
                "\n" +
                "class Main\n" +
                "{\n" +
                "\n" +
                "   // function to print half of the array in\n" +
                "   // ascending order and the other half in\n" +
                "   // descending order\n" +
                "   static void printOrder(int[] a, int n)\n" +
                "   {\n" +
                "     int temp;\n" +
                "     for(int i=0;i < n-1;i++)\n" +
                "     {\n" +
                "        for(int j = 0;j < n/2; j++) { if(a[j]>a[j+1])\n" +
                "            {\n" +
                "              temp=a[j];\n" +
                "              a[j]=a[j+1];\n" +
                "              a[j+1]=temp;\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        for(int j = n/2;j < n-1; j++)\n" +
                "        {\n" +
                "            if(a[j] < a[j+1])\n" +
                "            {\n" +
                "               temp=a[j];\n" +
                "               a[j]=a[j+1];\n" +
                "               a[j+1]=temp;\n" +
                "            }\n" +
                "         }\n" +
                "      }\n" +
                "\n" +
                "      for(int i = 0; i < n; i++)\n" +
                "         System.out.print(a[i] + \" \");\n" +
                "\n" +
                "   }\n" +
                "\n" +
                "   // Driver code\n" +
                "   public static void main(String[] args)\n" +
                "   {\n" +
                "       int[] arr = {3, 2, 4, 1, 10, 30, 40, 20};\n" +
                "       int n = arr.length;\n" +
                "       printOrder(arr, n);\n" +
                "    }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q4. Find the Smallest and largest element in an array\n"+"\n import java.util.Scanner;\n" +
                "\n" +
                "public class Main\n" +
                "{\n" +
                "   public static void main(String args[])\n" +
                "   {\n" +
                "\n" +
                "       int arr[] = {12, 13, 1, 10, 34, 10};\n" +
                "\n" +
                "       int largest = arr[0], smallest=arr[0];\n" +
                "\n" +
                "       for(int i=0; i<arr.length; i++) { if(smallest > arr[i])\n" +
                "              smallest = arr[i];\n" +
                "           if(largest < arr[i])\n" +
                "              largest = arr[i];\n" +
                "\n" +
                "       }\n" +
                "\n" +
                "       System.out.println(smallest);\n" +
                "       System.out.println(largest);\n" +
                "   }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q5. Finding the frequency of elements in an array\n"+"\n import java.util.Arrays;\n" +
                "class Main\n" +
                "{\n" +
                "public static void countFreq(int arr[], int n)\n" +
                "{\n" +
                "boolean visited[] = new boolean[n];\n" +
                "Arrays.fill(visited, false);\n" +
                "\n" +
                "// Traverse through array elements and\n" +
                "// count frequencies\n" +
                "for (int i = 0; i < n; i++) {\n" +
                "\n" +
                "// Skip this element if already processed\n" +
                "if (visited[i] == true)\n" +
                "continue;\n" +
                "\n" +
                "// Count frequency\n" +
                "int count = 1;\n" +
                "for (int j = i + 1; j < n; j++) {\n" +
                "if (arr[i] == arr[j]) {\n" +
                "visited[j] = true;\n" +
                "count++;\n" +
                "}\n" +
                "}\n" +
                "System.out.println(arr[i] + \" occurs \" + count +\" times \");\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "// Driver code\n" +
                "public static void main(String []args)\n" +
                "{\n" +
                "int arr[] = new int[]{10, 30, 10, 20, 10, 20, 30, 10};\n" +
                "int n = arr.length;\n" +
                "countFreq(arr, n);\n" +
                "}\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q6. Positive or Negative number\n"+"\n class Main\n" +
                "{\n" +
                "  public static void main (String[]args)\n" +
                "  {\n" +
                "\n" +
                "    int num = 5;\n" +
                "\n" +
                "    //Conditions to check if the number is negative or positive\n" +
                "    if (num > 0)\n" +
                "        System.out.println (\"The number is positive\");\n" +
                "    else if (num < 0)\n" +
                "        System.out.println (\"The number is negative\");\n" +
                "    else\n" +
                "        System.out.println (\"Zero\");\n" +
                "  }\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q7. Even or Odd number\n"+"\n public class Main\n" +
                " {\n" +
                "      public static void main(String[] args) {\n" +
                "           int number = 29;\n" +
                "\n" +
                "\n" +
                "     //checking whether the number is even or odd\n" +
                "     if (number % 2 == 0)\n" +
                "              System.out.println(number + \" is Even\");\n" +
                "     else\n" +
                "              System.out.println(number + \" is odd\");\n" +
                "      }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q8. Sum of First N Natural numbers\n"+"\n public class Main\n" +
                " {\n" +
                "   public static void main (String[]args)\n" +
                "   {\n" +
                "\n" +
                "     int n = 10;\n" +
                "     int sum = 0;\n" +
                "\n" +
                "     for (int i = 1; i <= n; i++)\n" +
                "         sum += i;\n" +
                "       System.out.println (sum);\n" +
                "   }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q9. Sum of numbers in a given range\n"+"\n public class Main\n" +
                "{\n" +
                "  public static void main (String[]args)\n" +
                "  {\n" +
                "    int a = 5;\n" +
                "    int b = 10;\n" +
                "\n" +
                "    int sum = 0;\n" +
                "\n" +
                "    for (int i = a; i <= b; i++)\n" +
                "        sum = sum + i;\n" +
                "      System.out.println (\"The sum is \" + sum);\n" +
                "  }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q10. Greatest of two numbers\n"+"\n public class Main\n" +
                "{\n" +
                "  public static void main (String[]args)\n" +
                "  {\n" +
                "\n" +
                "    int num1 = 10, num2 = 20, num3 = 30;\n" +
                "\n" +
                "    //checking if num1 is greatest\n" +
                "    if (num1 >= num2 && num1 >= num3)\n" +
                "        System.out.println (num1 + \" is the greatest\");\n" +
                "\n" +
                "    //checking if num2 is greatest\n" +
                "    else if (num2 >= num1 && num2 >= num3)\n" +
                "        System.out.println (num2 + \" is the greatest\");\n" +
                "\n" +
                "    //checking if num2 is greatest\n" +
                "    else if (num3 >= num1 && num3 >= num2)\n" +
                "        System.out.println (num3 + \" is the greatest\");\n" +
                "  }\n" +
                "}\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q11. Leap year or not\n"+"\n public class Main{\n" +
                "   public static void main (String[]args)\n" +
                "   {\n" +
                "\n" +
                "     int year = 2020;\n" +
                "\n" +
                "     if (year % 400 == 0)\n" +
                "       System.out.println (year + \" is a Leap Year\");\n" +
                "\n" +
                "     else if (year % 4 == 0 && year % 100 != 0)\n" +
                "       System.out.println (year + \" is a Leap Year\");\n" +
                "\n" +
                "     else\n" +
                "         System.out.println (year + \" is not a Leap Year\");\n" +
                "\n" +
                "   }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q12. Prime number within a given range\n"+"\n public class Main\n" +
                " {\n" +
                "   public static void main (String[]args)\n" +
                "   {\n" +
                "\n" +
                "     int lower = 1, upper = 20;\n" +
                "\n" +
                "\n" +
                "     for (int i = lower; i <= upper; i++)\n" +
                "       if (isPrime (i))\n" +
                "        System.out.println (i);\n" +
                "   }\n" +
                "\n" +
                "   static boolean isPrime (int n)\n" +
                "   {\n" +
                "     int count = 0;\n" +
                "\n" +
                "     // 0, 1 negative numbers are not prime\n" +
                "     if (n < 2)\n" +
                "       return false;\n" +
                "\n" +
                "     // checking the number of divisors b/w 1 and the number n-1\n" +
                "     for (int i = 2; i < n; i++)\n" +
                "       {\n" +
                "     if (n % i == 0)\n" +
                "        return false;\n" +
                "       }\n" +
                "\n" +
                "     // if reached here then must be true\n" +
                "     return true;\n" +
                "   }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q13. Sum of digits of a number\n"+"\n public class Main\n" +
                " {\n" +
                "   public static void main (String[]args)\n" +
                "   {\n" +
                "\n" +
                "     int num = 12345, sum = 0;\n" +
                "\n" +
                "     //loop to find sum of digits\n" +
                "     while(num!=0){\n" +
                "         sum += num % 10;\n" +
                "         num = num / 10;\n" +
                "     }\n" +
                "\n" +
                "     //output\n" +
                "       System.out.println (\"Sum of digits : \" + sum);\n" +
                "   }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q14. Reverse of a number\n"+"\n public class Main\n" +
                "{\n" +
                "    public static void main (String[]args)\n" +
                "    {\n" +
                "\n" +
                "        //variables initialization\n" +
                "        int num = 1234, reverse = 0, rem;\n" +
                "\n" +
                "\n" +
                "        //loop to find reverse number\n" +
                "        while (num != 0)\n" +
                "        {\n" +
                "            rem = num % 10;\n" +
                "            reverse = reverse * 10 + rem;\n" +
                "            num /= 10;\n" +
                "        };\n" +
                "\n" +
                "        //output\n" +
                "        System.out.println (\"Reversed Number: \" + reverse);\n" +
                "    }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q15. Palindrome number\n"+"\n public class Main\n" +
                " {\n" +
                "   public static void main (String[]args)\n" +
                "   {\n" +
                "     //variables initialization\n" +
                "     int num = 12021, reverse = 0, rem, temp;\n" +
                "\n" +
                "       temp = num;\n" +
                "     //loop to find reverse number\n" +
                "     while (temp != 0)\n" +
                "       {\n" +
                "     \trem = temp % 10;\n" +
                "     \treverse = reverse * 10 + rem;\n" +
                "     \ttemp /= 10;\n" +
                "       };\n" +
                "\n" +
                "     // palindrome if num and reverse are equal\n" +
                "     if (num == reverse)\n" +
                "       System.out.println (num + \" is Palindrome\");\n" +
                "     else\n" +
                "       System.out.println (num + \" is not Palindrome\");\n" +
                "   }\n" +
                " }\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q16. Armstrong number :\n"+"\n public class Main\n" +
                "{\n" +
                "  public static void main (String[]args)\n" +
                "  {\n" +
                "    int num = 407, len;\n" +
                "\n" +
                "    // function to get order(length)\n" +
                "      len = order (num);\n" +
                "\n" +
                "    // check if Armstrong\n" +
                "    if (armstrong (num, len))\n" +
                "        System.out.println(num + \" is armstrong\");\n" +
                "    else\n" +
                "        System.out.println(num + \" is armstrong\");\n" +
                "\n" +
                "  }\n" +
                "\n" +
                "\n" +
                "  static int order (int x)\n" +
                "  {\n" +
                "    int len = 0;\n" +
                "    while (x != 0 )\n" +
                "      {\n" +
                "\tlen++;\n" +
                "\tx = x / 10;\n" +
                "      }\n" +
                "    return len;\n" +
                "  }\n" +
                "\n" +
                "  static boolean armstrong (int num, int len)\n" +
                "  {\n" +
                "\n" +
                "    int sum = 0, temp, digit;\n" +
                "    temp = num;\n" +
                "\n" +
                "    // loop to extract digit, find power & add to sum\n" +
                "    while (temp != 0)\n" +
                "      {\n" +
                "\t// extract digit\n" +
                "\tdigit = temp % 10;\n" +
                "\n" +
                "\t// add power to sum\n" +
                "\tsum = sum + (int)Math.pow(digit, len);\n" +
                "\ttemp /= 10;\n" +
                "      };\n" +
                "\n" +
                "    return num == sum;\n" +
                "  }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q17. Fibonacci Series upto nth term\n"+"\n public class Main\n" +
                " {\n" +
                "   public static void main (String[]args)\n" +
                "   {\n" +
                "\n" +
                "     int num = 15;\n" +
                "     int a = 0, b = 1;\n" +
                "\n" +
                "     // Here we are printing 0th and 1st terms\n" +
                "       System.out.print (a + \" , \" + b + \" , \");\n" +
                "\n" +
                "     int nextTerm;\n" +
                "\n" +
                "     // printing the rest of the terms here\n" +
                "     for (int i = 2; i < num; i++)\n" +
                "       {\n" +
                "      nextTerm = a + b;\n" +
                "      a = b;\n" +
                "          b = nextTerm;\n" +
                "          System.out.print (nextTerm + \" , \");\n" +
                "       }\n" +
                "\n" +
                "\n" +
                "   }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q18. Factorial of a number\n"+"\n class Main\n" +
                "{\n" +
                "    // Method to find factorial of the given number\n" +
                "    static int factorial(int n)\n" +
                "    {\n" +
                "        int res = 1, i;\n" +
                "        for (i = 2; i <= n; i++)\n" +
                "            res *= i;\n" +
                "        return res;\n" +
                "    }\n" +
                "    \n" +
                "    // Driver method\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "        int num = 6;\n" +
                "        System.out.println(\"Factorial of \" + num + \" is \" + factorial(num));\n" +
                "    }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q19. Power of a number\n"+"\n public class Main\n" +
                " {\n" +
                " \tpublic static void main(String[] args) {\n" +
                "\t    \n" +
                " \tdouble base = 1.5;\n" +
                "     double expo1 = 2.5;\n" +
                "     double expo2 = -2.5;\n" +
                "     double res1, res2;\n" +
                "    \n" +
                "     // calculates the power\n" +
                "     res1 = Math.pow(base, expo1);\n" +
                "     res2 = Math.pow(base, expo2);\n" +
                " \tSystem.out.println(base + \" ^ \" + expo1 + \" = \" + res1 );\n" +
                " \tSystem.out.println(base + \" ^ \" + expo2 + \" = \" + res2 );\n" +
                " \t}\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q20. Factor of a number\n"+"\n public class Main\n" +
                " {\n" +
                "      public static void main(String[] args) {\n" +
                "\n" +
                "      int num = 10;\n" +
                "\n" +
                "     System.out.println( \"Factors of \" + num + \" are \" );\n" +
                "\n" +
                "     // finding and printing factors b/w 1 to num\n" +
                "     for(int i = 1; i <= num; i++)\n" +
                "     {\n" +
                "         if(num % i == 0)\n" +
                "             System.out.println(i + \" \"); \n" +
                "     }\n" +
                "\n" +
                "      }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q21. Finding Prime Factors of a number\n"+"\n import java.io.*;\n" +
                "import java.lang.Math;\n" +
                "\n" +
                "class Main {\n" +
                "\n" +
                "   public static int isprime(int n){\n" +
                "\n" +
                "      for(int i = 2; i<=Math.sqrt(n); i++){\n" +
                "        if(n%i==0)\n" +
                "          return 0;\n" +
                "      }\n" +
                "\n" +
                "      return 1;\n" +
                "   }\n" +
                "\n" +
                "   public static void primeFactors(int n)\n" +
                "   {\n" +
                "\n" +
                "      for(int i = 2; i<= n; i++){\n" +
                "          if(isprime(i)==1){\n" +
                "             int x = n;\n" +
                "             while(x%i==0){\n" +
                "                System.out.print(i + \" \");\n" +
                "                x /= i;\n" +
                "             }\n" +
                "          }\n" +
                "       }\n" +
                "\n" +
                "   }\n" +
                "\n" +
                "   public static void main(String[] args)\n" +
                "   {\n" +
                "       int n = 90;\n" +
                "       primeFactors(n);\n" +
                "   }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q22. Strong number\n"+"\n public class Main\n" +
                " {\n" +
                "   public static void main (String[]args)\n" +
                "   {\n" +
                "\n" +
                "     int num = 145;\n" +
                "\n" +
                "     if (detectStrong (num))\n" +
                "         System.out.println (num + \" is Strong Number\");\n" +
                "     else\n" +
                "         System.out.println (num + \" is not a Strong Number\");\n" +
                "   }\n" +
                "\n" +
                "   // function to calculate factorial\n" +
                "   static int facto (int n)\n" +
                "   {\n" +
                "     int fact = 1;\n" +
                "\n" +
                "     for (int i = 1; i <= n; i++)\n" +
                "       fact = fact * i;\n" +
                "\n" +
                "     return fact;\n" +
                "   }\n" +
                "\n" +
                "   static boolean detectStrong (int num)\n" +
                "   {\n" +
                "\n" +
                "     int digit, sum = 0;\n" +
                "     int temp = num;\n" +
                "     boolean flag = false;\n" +
                "\n" +
                "     // calculate 1! + 4! + 5!\n" +
                "     while (temp != 0)\n" +
                "       {\n" +
                "     \tdigit = temp % 10;\n" +
                "\n" +
                "     \tsum = sum + facto (digit);\n" +
                " \t    temp /= 10;\n" +
                "       }\n" +
                "\n" +
                "     // returns 1 if both equal else 0\n" +
                "     if (sum == num)\n" +
                "       flag = true;\n" +
                "     else\n" +
                "       flag = false;\n" +
                "\n" +
                "     return flag;\n" +
                "\n" +
                "\n" +
                "   }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q23. Perfect number\n"+"\n public class Main\n" +
                " {\n" +
                "   public static void main (String[]args)\n" +
                "   {\n" +
                "\n" +
                "     int n = 28, sum = 0;\n" +
                "\n" +
                "     for (int i = 1; i < n; i++)\n" +
                "       {\n" +
                "     \tif (n % i == 0)\n" +
                " \t        sum = sum + i;\n" +
                "       }\n" +
                "\n" +
                "     if (sum == n)\n" +
                "       System.out.println (n + \" Is a perfect number\");\n" +
                "     else\n" +
                "       System.out.println (n + \" Is not a perfect number\");\n" +
                "\n" +
                "   }\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q24. Perfect Square \n"+"\n public class Main {\n" +
                "\n" +
                "\tstatic boolean isPerfectSquare(int x)\n" +
                "\t{\n" +
                "\t\tif (x >= 0) {\n" +
                "\t\t\n" +
                "\t\t\tint sr = (int)Math.sqrt(x);\n" +
                "\t\t\n" +
                "\t\t\treturn ((sr * sr) == x);\n" +
                "\t\t}\n" +
                "\t\treturn false;\n" +
                "\t}\n" +
                "\n" +
                "\tpublic static void main(String[] args)\n" +
                "\t{\n" +
                "\t\tint x = 84;\n" +
                "\n" +
                "\t\tif (isPerfectSquare(x))\n" +
                "\t\t\tSystem.out.print(\"True\");\n" +
                "\t\telse\n" +
                "\t\t\tSystem.out.print(\"False\");\n" +
                "\t}\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q25. Automorphic number\n"+"\n public class Main\n" +
                "{\n" +
                "\tpublic static void main(String[] args) {\n" +
                "\t   \n" +
                "\tint n = 376, sq = n * n ;\n" +
                "    if(isAutomorphic(n) == 1)\n" +
                "        System.out.println(\"Num: \"+ n + \", Square: \" + sq + \" - is Automorphic\");\n" +
                "    else\n" +
                "        System.out.println(\"Num: \"+ n + \", Square: \" + sq + \" - is not Automorphic\");\n" +
                "\t   \n" +
                "\t\t\n" +
                "\t}\n" +
                "\t\n" +
                "\tstatic int isAutomorphic(int n){\n" +
                "    int square = n * n;\n" +
                "    while(n != 0)\n" +
                "    {\n" +
                "        // means not automorphic number\n" +
                "        if(n % 10 != square % 10){\n" +
                "            return 0;\n" +
                "        }\n" +
                "        // reduce down numbers\n" +
                "        n /= 10;\n" +
                "        square /= 10;\n" +
                "    }\n" +
                "    // if reaches here means automorphic number\n" +
                "    return 1;\n" +
                "}\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q26. Find Largest element in an array\n"+"\n import java.util.Scanner;\n" +
                "\n" +
                "public class Main\n" +
                "{\n" +
                "  public static void main(String args[])\n" +
                "  {\n" +
                "\n" +
                "     int arr[] = {12, 13, 1, 10, 34, 10};\n" +
                "\n" +
                "     int max = arr[0];\n" +
                "\n" +
                "     for(int i=0; i<arr.length; i++)\n" +
                "     {\n" +
                "       if(max < arr[i])\n" +
                "       {\n" +
                "          max = arr[i];\n" +
                "       }\n" +
                "\n" +
                "     }\n" +
                "\n" +
                "    System.out.print(max); \n" +
                "  }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q27. Find Smallest Element in an Array\n"+"\n import java.util.Scanner;\n" +
                "\n" +
                "public class Main\n" +
                "{\n" +
                "  public static void main(String args[])\n" +
                "  {\n" +
                "\n" +
                "     int arr[] = {12, 13, 1, 10, 34, 10};\n" +
                "\n" +
                "     int min = arr[0];\n" +
                "\n" +
                "     for(int i=0; i<arr.length; i++) { if(min > arr[i])\n" +
                "         {\n" +
                "            min = arr[i];\n" +
                "         }\n" +
                "\n" +
                "     }\n" +
                "\n" +
                "     System.out.print(min); \n" +
                "  }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q28. Find Second Smallest Element in an Array\n"+"\n import java.util.Scanner;\n" +
                "import java.util.*;\n" +
                "\n" +
                "public class Main\n" +
                "{ \n" +
                "   static int secSmallest(int arr[], int n)\n" +
                "   {\n" +
                "      // assigning first element as smallest temporarily\n" +
                "      int smallest = arr[0];\n" +
                "\n" +
                "      // we find the smallest element here\n" +
                "      for (int i=0; i < n; i++){\n" +
                "         if(arr[i] < smallest)\n" +
                "            smallest = arr[i];\n" +
                "      }\n" +
                "\n" +
                "     // temporarily assinging largest max value\n" +
                "     int sec_smallest = Integer.MAX_VALUE;\n" +
                "\n" +
                "\n" +
                "     // finding second smallest here\n" +
                "     for (int i=0; i < n; i++){\n" +
                "         if(arr[i] != smallest && arr[i] < sec_smallest)\n" +
                "           sec_smallest = arr[i];\n" +
                "     }\n" +
                "\n" +
                "    return sec_smallest;\n" +
                "\n" +
                "  }\n" +
                "  public static void main(String args[])\n" +
                "  {\n" +
                "\n" +
                "      int arr[] = {12, 13, 1, 10, 34, 10};\n" +
                "      int n = arr.length;\n" +
                "      System.out.print(secSmallest(arr, n)); \n" +
                "   }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q29. Calculate the sum of elements in an array \n"+"\n import java.util.Scanner;\n" +
                "\n" +
                "public class Main\n" +
                "{\n" +
                "   public static void main(String args[])\n" +
                "   {\n" +
                "\n" +
                "       int arr[] = {12, 13, 1, 10, 34, 10};\n" +
                "\n" +
                "       int sum = 0;\n" +
                "\n" +
                "       for(int i=0; i<arr.length; i++)\n" +
                "       {\n" +
                "         sum = sum + arr[i];\n" +
                "       }\n" +
                "\n" +
                "       System.out.print(sum); \n" +
                "   }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q30. Reverse an Array\n"+"\n import java.util.Scanner;\n" +
                "\n" +
                "public class Main\n" +
                "{\n" +
                "   public static void main(String args[])\n" +
                "   {\n" +
                "\n" +
                "     int arr[] = {10, 20, 30, 40, 50};\n" +
                "\n" +
                "     int n=arr.length;\n" +
                "     for(int i=n-1; i>=0; i--)\n" +
                "       System.out.print(arr[i]+\" \"); \n" +
                "    }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q31. Sort the elements of an array \n"+"\n public class Main { \n" +
                "    public static void main(String[] args) { \n" +
                "\n" +
                "       //Initialize array \n" +
                "       int [] arr = new int [] {10, 40, 30, 20}; \n" +
                "       int temp = 0; \n" +
                "\n" +
                "       //Sort the array in ascending order \n" +
                "       for (int i = 0; i < arr.length; i++) { \n" +
                "           for (int j = i+1; j < arr.length; j++) { if(arr[i] > arr[j]) { \n" +
                "                 temp = arr[i]; \n" +
                "                 arr[i] = arr[j]; \n" +
                "                 arr[j] = temp; \n" +
                "              } \n" +
                "           } \n" +
                "       } \n" +
                "\n" +
                "\n" +
                "    //Displaying elements of array after sorting \n" +
                "    for (int i = 0; i < arr.length; i++) { \n" +
                "     System.out.print(arr[i] + \" \"); \n" +
                "   } \n" +
                "  } \n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q32. Sorting elements of an array by frequency\n"+"\n import java.util.Arrays;\n" +
                "import java.util.Collections;\n" +
                "import java.util.Comparator;\n" +
                "import java.util.HashMap;\n" +
                "import java.util.List;\n" +
                "class Main {\n" +
                "\n" +
                "    // Driver Code\n" +
                "    private static final int MAX = 254;\n" +
                "    public static void main(String[] args)\n" +
                "    {\n" +
                "\n" +
                "         int [] a = {10, 20, 10, 10, 20, 30, 30, 30, 30, 0};\n" +
                "         int n = a.length;\n" +
                "         int[][] arr = new int[MAX][2];\n" +
                "         int[][] brr = new int[MAX][2];\n" +
                "\n" +
                "         int k = 0, temp, count;\n" +
                "\n" +
                "         for (int i = 0; i < n; i++){\n" +
                "             arr[i][0] = a[i];\n" +
                "             arr[i][1] = 0;\n" +
                "         }\n" +
                "\n" +
                "         // Unique elements and its frequency are stored in another array\n" +
                "         for (int i = 0; i < n; i++){\n" +
                "              if (arr[i][1]==1)\n" +
                "                continue;\n" +
                "              count = 1;\n" +
                "              for (int j = i + 1; j < n; j++){\n" +
                "                   if (arr[i][0] == arr[j][0]){\n" +
                "                      arr[j][1] = 1;\n" +
                "                      count++;\n" +
                "                   }\n" +
                "              }\n" +
                "              brr[k][0] = arr[i][0];\n" +
                "              brr[k][1] = count;\n" +
                "              k++;\n" +
                "         }\n" +
                "         n = k;\n" +
                "\n" +
                "         //Store the array and its frequency in sorted form\n" +
                "         for (int i = 0; i < n - 1; i++)\n" +
                "         {\n" +
                "             temp = brr[i][1];\n" +
                "             for (int j = i + 1; j < n; j++)\n" +
                "             {\n" +
                "                 if (temp < brr[j][1])\n" +
                "                 {\n" +
                "                      temp = brr[j][1];\n" +
                "                      brr[j][1] = brr[i][1];\n" +
                "                      brr[i][1] = temp;\n" +
                "\n" +
                "                      temp = brr[j][0];\n" +
                "                      brr[j][0] = brr[i][0];\n" +
                "                      brr[i][0] = temp;\n" +
                "                  }\n" +
                "              }\n" +
                "          }\n" +
                "          for (int i = 0; i < n; i++)\n" +
                "          {\n" +
                "              while (brr[i][1] != 0){\n" +
                "                    System.out.print(brr[i][0]+\" \");\n" +
                "                      brr[i][1]--;\n" +
                "              }\n" +
                "          }\n" +
                "   }\n" +
                "\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q33. Finding the Longest Palindrome in an Array\n"+"\n import java.util.*;\n" +
                "\n" +
                "class Main\n" +
                "{\n" +
                "    // Function to check if n is palindrome\n" +
                "    static boolean isPalindrome(int n)\n" +
                "    {\n" +
                "          // Find the appropriate divisor\n" +
                "          // to extract the leading digit\n" +
                "          int divisor = 1;\n" +
                "          while (n / divisor >= 10)\n" +
                "             divisor *= 10;\n" +
                "\n" +
                "          while (n != 0) {\n" +
                "             int x = n / divisor;\n" +
                "             int y = n % 10;\n" +
                "\n" +
                "             // If first and last digits are\n" +
                "             // not same then return false\n" +
                "             if (x != y)\n" +
                "               return false;\n" +
                "\n" +
                "             // Removing the leading and trailing\n" +
                "             // digits from the number\n" +
                "             n = (n % divisor) / 10;\n" +
                "\n" +
                "             // Reducing divisor by a factor\n" +
                "             // of 2 as 2 digits are dropped\n" +
                "            divisor = divisor / 100;\n" +
                "         }\n" +
                "         return true;\n" +
                "    }\n" +
                "\n" +
                "    // Function to find the largest palindromic number\n" +
                "    static int largestPalindrome(int []A, int n)\n" +
                "    {\n" +
                "         int res = -1;\n" +
                "\n" +
                "         for (int i = 0; i < n; i++) { // If a palindrome larger than the currentMax is found \n" +
                "                 if (A[i] > res && isPalindrome(A[i]))\n" +
                "                     res = A[i];\n" +
                "         }\n" +
                "\n" +
                "        // Return the largest palindromic number from the array\n" +
                "        return res;\n" +
                "     }\n" +
                "\n" +
                "    // Driver program\n" +
                "    public static void main(String []args)\n" +
                "    {\n" +
                "       int []A = { 121, 2322, 54545, 999990 };\n" +
                "       int n = A.length;\n" +
                "\n" +
                "      // print required answer\n" +
                "      System.out.println(largestPalindrome(A, n));\n" +
                "    }\n" +
                "\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q34. Counting Distinct Elements in an Array\n"+"\n import java.util.Arrays;\n" +
                "\n" +
                "class Main\n" +
                "{\n" +
                "   public static void countFreq(int arr[], int n)\n" +
                "   {\n" +
                "         boolean visited[] = new boolean[n];\n" +
                "         Arrays.fill(visited, false);\n" +
                "         int count_dis=0;\n" +
                "         // Traverse through array elements and\n" +
                "         // count frequencies\n" +
                "         for (int i = 0; i < n; i++) {\n" +
                "\n" +
                "            // Skip this element if already processed\n" +
                "            if (visited[i] == true)\n" +
                "             continue;\n" +
                "\n" +
                "           \n" +
                "            for (int j = i + 1; j < n; j++) {\n" +
                "                if (arr[i] == arr[j]) {\n" +
                "                   visited[j] = true;\n" +
                "                   \n" +
                "                }\n" +
                "            }\n" +
                "            count_dis = count_dis+1;\n" +
                "   }\n" +
                "   System.out.println(count_dis);\n" +
                "  }\n" +
                "\n" +
                "   // Driver code\n" +
                "   public static void main(String []args)\n" +
                "   {\n" +
                "      int arr[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10};\n" +
                "      int n = arr.length;\n" +
                "      countFreq(arr, n);\n" +
                "   }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q35. Finding  Repeating elements in an Array\n"+"\n import java.util.Arrays;\n" +
                "\n" +
                "class Main\n" +
                "{\n" +
                "   public static void countFreq(int arr[], int n)\n" +
                "   {\n" +
                "         boolean visited[] = new boolean[n];\n" +
                "         Arrays.fill(visited, false);\n" +
                "     \n" +
                "         // Traverse through array elements and\n" +
                "         // count frequencies\n" +
                "         for (int i = 0; i < n; i++) {\n" +
                "\n" +
                "            // Skip this element if already processed\n" +
                "            if (visited[i] == true)\n" +
                "             continue;\n" +
                "\n" +
                "            // Count frequency\n" +
                "            int count = 1;\n" +
                "            for (int j = i + 1; j < n; j++) {\n" +
                "                if (arr[i] == arr[j]) {\n" +
                "                   visited[j] = true;\n" +
                "                   count++;\n" +
                "                }\n" +
                "            }\n" +
                "            if(count!=1)   \n" +
                "               System.out.println(arr[i]);\n" +
                "   }\n" +
                "} // Driver code \n" +
                "\n" +
                "public static void main(String []args) \n" +
                "{ \n" +
                "int arr[] = new int[]{10, 30, 30, 20, 10, 20, 50, 10};\n" +
                " int n = arr.length; \n" +
                "countFreq(arr, n); \n" +
                "} \n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q36. Finding Non Repeating elements in an Array\n"+"\n import java.util.Arrays;\n" +
                "\n" +
                "class Main\n" +
                "{\n" +
                "   public static void countFreq(int arr[], int n)\n" +
                "   {\n" +
                "         boolean visited[] = new boolean[n];\n" +
                "         Arrays.fill(visited, false);\n" +
                "         // Traverse through array elements and\n" +
                "         // count frequencies\n" +
                "         for (int i = 0; i < n; i++) {\n" +
                "\n" +
                "            // Skip this element if already processed\n" +
                "            if (visited[i] == true)\n" +
                "             continue;\n" +
                "\n" +
                "            // Count frequency\n" +
                "            int count = 1;\n" +
                "            for (int j = i + 1; j < n; j++) {\n" +
                "                if (arr[i] == arr[j]) {\n" +
                "                   visited[j] = true;\n" +
                "                   count++;\n" +
                "                }\n" +
                "            }\n" +
                "            if(count==1)   \n" +
                "              System.out.println(arr[i]);\n" +
                "   }\n" +
                "} // Driver code \n" +
                "\n" +
                "public static void main(String []args) \n" +
                "{ \n" +
                "int arr[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10}; \n" +
                "int n = arr.length;\n" +
                " countFreq(arr, n); \n" +
                "}\n" +
                " }\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q37. Removing Duplicate elements from an array\n"+"\n import java.util.*;\n" +
                "class Main\n" +
                "{\n" +
                "  public static void main (String[] args)\n" +
                "  {\n" +
                "     int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};\n" +
                "     int n = arr.length;\n" +
                "     Set hash_Set = new HashSet();\n" +
                "for (int i=0; i<n; i++)\n" +
                "hash_Set.add(arr[i]);\n" +
                "\n" +
                "System.out.print(hash_Set);\n" +
                "}\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q38. Finding Minimum scalar product of two vectors\n"+"\n class Main\n" +
                "{\n" +
                "    public static void main (String[] args)\n" +
                "    {\n" +
                "           int arr1[] = {1, 2, 6, 3, 7};\n" +
                "           int arr2[] = {10, 7, 45, 3, 7};\n" +
                "           int n = arr1.length;\n" +
                "\n" +
                "           //Sort arr1 in ascending order\n" +
                "           for(int i=0; i<n; i++){\n" +
                "                for(int j=i+1; j<n; j++){ if(arr1[i]>arr1[j]){\n" +
                "                       int temp = arr1[i];\n" +
                "                       arr1[i] = arr1[j];\n" +
                "                       arr1[j] = temp;\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "\n" +
                "           //Sort arr2 in descending order\n" +
                "           for(int i=0; i<n; i++){\n" +
                "                for(int j=i+1; j<n; j++){\n" +
                "                    if(arr2[i]<arr2[j]){\n" +
                "                        int temp = arr2[i];\n" +
                "                        arr2[i] = arr2[j];\n" +
                "                        arr2[j] = temp;\n" +
                "                    }\n" +
                "                 }\n" +
                "            }\n" +
                "\n" +
                "          int product = 0;\n" +
                "          for(int i=0; i<n; i++)\n" +
                "              product += arr1[i]*arr2[i];\n" +
                "\n" +
                "          System.out.print(product);\n" +
                "   }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q39. Finding Maximum scalar product of two vectors in an array\n"+"\n class Main\n" +
                "{\n" +
                "    public static void main (String[] args)\n" +
                "    {\n" +
                "           int arr1[] = {1, 2, 6, 3, 7};\n" +
                "           int arr2[] = {10, 7, 45, 3, 7};\n" +
                "           int n = arr1.length;\n" +
                "\n" +
                "           //Sort arr1 in ascending order\n" +
                "           for(int i=0; i<n; i++){\n" +
                "                for(int j=i+1; j<n; j++){ if(arr1[i]>arr1[j]){\n" +
                "                       int temp = arr1[i];\n" +
                "                       arr1[i] = arr1[j];\n" +
                "                       arr1[j] = temp;\n" +
                "                    }\n" +
                "                }\n" +
                "            }\n" +
                "\n" +
                "           //Sort arr2 in ascending order\n" +
                "           for(int i=0; i<n; i++){\n" +
                "                for(int j=i+1; j<n; j++){ if(arr2[i]>arr2[j]){\n" +
                "                        int temp = arr2[i];\n" +
                "                        arr2[i] = arr2[j];\n" +
                "                        arr2[j] = temp;\n" +
                "                    }\n" +
                "                 }\n" +
                "            }\n" +
                "\n" +
                "          int product = 0;\n" +
                "          for(int i=0; i<n; i++)\n" +
                "              product += arr1[i]*arr2[i];\n" +
                "\n" +
                "          System.out.print(product);\n" +
                "   }\n" +
                "}\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q40. Counting the number of even and odd elements in an array\n"+"\n class Main{\n" +
                "  public static void main (String[] args)\n" +
                "  {\n" +
                "     int arr[] = {1, 20, 60, 31, 75, 40, 80};\n" +
                "     int n = arr.length;\n" +
                "     int countEven = 0, countOdd = 0;\n" +
                "\n" +
                "     for(int i=0; i<n; i++){\n" +
                "         if((arr[i] % 2 )== 0)\n" +
                "           countEven += 1;\n" +
                "\n" +
                "         else\n" +
                "           countOdd += 1;\n" +
                "     }\n" +
                "     System.out.println(\"Even Elements count : \"+ countEven);\n" +
                "     System.out.println(\"Odd Elements count : \"+ countOdd);\n" +
                "  }\n" +
                "}\n");


        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.myTextView);
        textView.setText(answersString);
    }
}