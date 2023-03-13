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

        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.myTextView);
        textView.setText(answersString);
    }
}