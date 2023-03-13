package com.example.projectfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import java.util.ArrayList;

public class pythonAnswerActivity extends AppCompatActivity {
    private Csol answerStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_answer);

        answerStorage = new Csol();

        answerStorage.addAnswer("Q1. Find the prime numbers between 1 to 100\n"+"\ndef checkPrime(num):\n" +
                "\n" +
                "    #  0, 1 and negative numbers are not prime\n" +
                "    if num < 2:\n" +
                "        return 0\n" +
                "    else:\n" +
                "\n" +
                "        # no need to run loop till num-1 as for any number x the numbers in\n" +
                "        # the range(num/2 + 1, num) won't be divisible anyway\n" +
                "        # Example 36 won't be divisible by anything b/w 19-35\n" +
                "\n" +
                "        x = num // 2\n" +
                "        for j in range(2, x + 1):\n" +
                "            if num % j == 0:\n" +
                "                return 0\n" +
                "\n" +
                "    # the number would be prime if we reach here\n" +
                "    return 1\n" +
                "\n" +
                "\n" +
                "a, b = 1, 100\n" +
                "for i in range(a, b + 1):\n" +
                "    if checkPrime(i):\n" +
                "        print(i, end=\" \")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q2. Finding number of integers which has exactly x divisors\n"+"\nNumber = 7\n" +
                "Divisor = 2\n" +
                "#count is to count total number of Numbers with exact divisor\n" +
                "count = 0\n" +
                "#driver loop\n" +
                "for i in range(1,Number+1):\n" +
                "    #count_factors checks the total number of divisors\n" +
                "    count_factors = 0\n" +
                "    #loop to find number of divisors\n" +
                "    for j in range(1,i+1):\n" +
                "        if i % j == 0:\n" +
                "            count_factors += 1\n" +
                "        else:\n" +
                "            pass\n" +
                "    if count_factors == Divisor:\n" +
                "        count +=1\n" +
                "\n" +
                "#for break in line between Numbers and total count\n" +
                "print(count)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q3. Sort first half in ascending order and second half in descending\n"+"\n def printOrder(arr,n) :\n" +
                "    # sorting the array\n" +
                "    arr.sort()\n" +
                "    \n" +
                "    # printing first half in ascending order\n" +
                "    i = 0\n" +
                "    while i < n/2: print(arr[i]) i=i+1 # printing second half in descending order j=n-1 while j >= n / 2 :\n" +
                "        print (arr[j])\n" +
                "        j = j - 1\n" +
                "\n" +
                "# Driver code\n" +
                "arr = [5, 4, 6, 2, 1, 3, 8, 9, 7]\n" +
                "n = len(arr)\n" +
                "\n" +
                "printOrder(arr, n)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q4. Find the Smallest and largest element in an array\n"+"\n arr = [10, 89, 9, 56, 4, 80, 8]\n" +
                "mini = arr[0]\n" +
                "maxi = arr[0]\n" +
                "\n" +
                "for i in range(len(arr)):\n" +
                "  if arr[i] < mini: mini = arr[i] \n" +
                "  \n" +
                "if arr[i] > maxi: maxi = arr[i]\n" +
                "\n" +
                "print (mini)\n" +
                "print (maxi)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q5. Finding the frequency of elements in an array\n"+"\n def countFreq(arr, n):\n" +
                "\n" +
                "   # Mark all array elements as not visited\n" +
                "   visited = [False for i in range(n)]\n" +
                "\n" +
                "   # Traverse through array elements\n" +
                "   # and count frequencies\n" +
                "   for i in range(n):\n" +
                "\n" +
                "     # Skip this element if already\n" +
                "     # processed\n" +
                "     if (visited[i] == True):\n" +
                "        continue\n" +
                "\n" +
                "     # Count frequency\n" +
                "     count = 1\n" +
                "     for j in range(i + 1, n, 1):\n" +
                "        if (arr[i] == arr[j]):\n" +
                "          visited[j] = True\n" +
                "          count += 1\n" +
                "\n" +
                "     print(arr[i], count)\n" +
                "\n" +
                "# Driver Code\n" +
                "arr = [10, 30, 10, 20, 10, 20, 30, 10]\n" +
                "n = len(arr)\n" +
                "countFreq(arr, n)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q6. Positive or Negative number\n"+"\n num = 15\n" +
                "if num > 0:\n" +
                "    print('Positive')\n" +
                "elif num < 0:\n" +
                "    print('Negative')\n" +
                "else:\n" +
                "    print('Zero')\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q7. Even or Odd number\n"+"\n num = int(input(\"Enter a Number:\")) \n" +
                "if num % 2 == 0: \n" +
                "  print(\"Given number is Even\") \n" +
                "else: \n" +
                "  print(\"Given number is Odd\")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q8. Sum of First N Natural numbers\n"+"\n num = 5\n" +
                "sum = 0\n" +
                "for i in range(num+1):\n" +
                "  sum+=i\n" +
                "print(sum)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q9. Sum of numbers in a given range\n"+"\n num1, num2 = 3, 6\n" +
                "sum = 0\n" +
                "for i in range(num1,num2+1):\n" +
                "  sum+=i\n" +
                "print(sum)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q10. Greatest of two numbers\n"+"\n num1, num2, num3 = 10 , 30 , 20\n" +
                "max = 0\n" +
                "if num1 >= num2 and num1 >= num3:\n" +
                "  print(num1)\n" +
                "elif num2 >= num1 and num2 >= num3:\n" +
                "  print(num2)\n" +
                "else:\n" +
                "  print(num3)\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q11. Leap year or not\n"+"\n year = 2000\n" +
                "if (year%400 == 0) or (year%4==0 and year%100!=0):\n" +
                "  print(\"Leap Year\")\n" +
                "else:\n" +
                "  print(\"Not a Leap Year\")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q12. Prime number within a given range\n"+"\n low, high = 2, 10\n" +
                "primes = []\n" +
                "\n" +
                "for i in range(low, high + 1):\n" +
                "    flag = 0\n" +
                "\n" +
                "    if i < 2:\n" +
                "        continue\n" +
                "    if i == 2:\n" +
                "        primes.append(2)\n" +
                "        continue\n" +
                "\n" +
                "    for x in range(2, i):\n" +
                "        if i % x == 0:\n" +
                "            flag = 1\n" +
                "            break\n" +
                "\n" +
                "    if flag == 0:\n" +
                "        primes.append(i)\n" +
                "        \n" +
                "print(primes)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q13. Sum of digits of a number\n"+"\n num = input(\"Enter Number: \")\n" +
                "sum = 0\n" +
                "\n" +
                "for i in num:\n" +
                "    sum = sum + int(i)\n" +
                "\n" +
                "print(sum)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q14. Reverse of a number\n"+"\n num = 1234\n" +
                "temp = num\n" +
                "reverse = 0\n" +
                "while num > 0:\n" +
                "    remainder = num % 10\n" +
                "    reverse = (reverse * 10) + remainder\n" +
                "    num = num // 10\n" +
                "\n" +
                "print(reverse)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q15. Palindrome number\n"+"\n num = 1221\n" +
                "temp = num\n" +
                "reverse = 0\n" +
                "while temp > 0:\n" +
                "    remainder = temp % 10\n" +
                "    reverse = (reverse * 10) + remainder\n" +
                "    temp = temp // 10\n" +
                "if num == reverse:\n" +
                "  print('Palindrome')\n" +
                "else:\n" +
                "  print(\"Not Palindrome\")\n");


        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.myTextView);
        textView.setText(answersString);
    }
}