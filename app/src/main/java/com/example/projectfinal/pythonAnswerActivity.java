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
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q16. Armstrong number :\n"+"\n number = 371\n" +
                "num = number\n" +
                "digit, sum = 0, 0\n" +
                "length = len(str(num))\n" +
                "for i in range(length):\n" +
                "  digit = int(num%10)\n" +
                "  num = num/10\n" +
                "  sum += pow(digit,length)\n" +
                "if sum==number:\n" +
                "  print(\"Armstrong\")\n" +
                "else:\n" +
                "  print(\"Not Armstrong\")\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q17. Fibonacci Series upto nth term\n"+"\n # Write a program to print fibonacci series upto n terms in python\n" +
                "num = 10\n" +
                "n1, n2 = 0, 1\n" +
                "print(\"Fibonacci Series:\", n1, n2, end=\" \")\n" +
                "for i in range(2, num):\n" +
                "    n3 = n1 + n2\n" +
                "    n1 = n2\n" +
                "    n2 = n3\n" +
                "    print(n3, end=\" \")\n" +
                "\n" +
                "print()\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q18. Factorial of a number\n"+"\n num = 6\n" +
                "fact = 1\n" +
                "\n" +
                "# Factorial of negative number doesn't exist\n" +
                "\n" +
                "if num < 0:\n" +
                "    print(\"Not Possible\")\n" +
                "else:\n" +
                "    for i in range(1, num+1):\n" +
                "        fact = fact * i\n" +
                "\n" +
                "print(\"Factorial of\", num, \"is\", fact)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q19. Power of a number\n"+"\n num, power = 3, 2\n" +
                "print(pow(num,power))\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q20. Factor of a number\n"+"\n # method to print the divisors\n" +
                "def printDivisors(n) :\n" +
                "    i = 1\n" +
                "    while i <= n :\n" +
                "        if (n % i==0) :\n" +
                "            print (i,end=\" \")\n" +
                "        i = i + 1\n" +
                "         \n" +
                "# Driver method\n" +
                "print (\"The divisors of 100 are: \")\n" +
                "printDivisors(100)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q21. Finding Prime Factors of a number\n"+"\n def Prime_Factorial(n):\n" +
                "    if n < 4:\n" +
                "        return n\n" +
                "    arr = []\n" +
                "    while n > 1:\n" +
                "        for i in range(2, int(2+n//2)):\n" +
                "            if i == (1 + n // 2):\n" +
                "                arr.append(n)\n" +
                "                n = n // n\n" +
                "            if n % i == 0:\n" +
                "                arr.append(i)\n" +
                "                n = n // i\n" +
                "                break\n" +
                "    return arr\n" +
                "\n" +
                "\n" +
                "n = 210\n" +
                "print(Prime_Factorial(n))\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q22. Strong number\n"+"\n #Using Iteration\n" +
                "n =145\n" +
                "#save the number in another variable\n" +
                "temp=n\n" +
                "sum=0\n" +
                "f=[0]*10\n" +
                "f[0]=1\n" +
                "f[1]=1\n" +
                "for i in range(2,10): #precomputing the factorial value from 0 to 9 and store in the array.\n" +
                "    f[i]=f[i-1]*i\n" +
                "\n" +
                "#Implementation\n" +
                "while(temp):\n" +
                "    r=temp%10 #r will have the vale u of the unit digit\n" +
                "    temp=temp//10\n" +
                "    sum+=f[r] #adding all the factorial\n" +
                "\n" +
                "if(sum==n):\n" +
                "    print(\"Yes\", n ,\"is strong number\")\n" +
                "\n" +
                "else:\n" +
                "    print(\"No\" , n, \"is not a strong number\")\n");

        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q23. Perfect number\n"+"\n n = 28\n" +
                "sum = 0\n" +
                "\n" +
                "for i in range(1, n):\n" +
                "    if n % i == 0:\n" +
                "        sum = sum + i\n" +
                "\n" +
                "if sum == n:\n" +
                "    print(\"The number is a Perfect number\")\n" +
                "else:\n" +
                "    print(\"The number is not a Perfect number\")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q24. Perfect Square \n"+"\n from math import sqrt\n" +
                "\n" +
                "\n" +
                "def isPerfectSquare(x):\n" +
                "    if x >= 0:\n" +
                "        sr = int(sqrt(x))\n" +
                "        return (sr * sr) == x\n" +
                "    return False\n" +
                "\n" +
                "\n" +
                "n = 84\n" +
                "if isPerfectSquare(n):\n" +
                "    print(\"True\")\n" +
                "else:\n" +
                "    print(\"False\")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q25. Automorphic number\n"+"\n number = 376\n" +
                "square = pow(number, 2)\n" +
                "mod = pow(10, len(str(number)))\n" +
                "\n" +
                "# 141376 % 1000\n" +
                "if square % mod == number:\n" +
                "    print(\"It's an Automorphic Number\")\n" +
                "else:\n" +
                "    print(\"It's not an Automorphic Number\")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q26. Find Largest element in an array\n"+"\n a = [10, 89, 9, 56, 4, 80, 8]\n" +
                "max_element = a[0]\n" +
                "\n" +
                "for i in range(len(a)):\n" +
                "  if a[i] > max_element:\n" +
                "     max_element = a[i]\n" +
                "\n" +
                "print (max_element)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q27. Find Smallest Element in an Array\n"+"\n arr = [10, 89, 9, 56, 4, 80, 8]\n" +
                "mini = arr[0]\n" +
                "\n" +
                "for i in range(len(arr)):\n" +
                "  if arr[i] < mini:\n" +
                "     mini = arr[i]\n" +
                "\n" +
                "print (mini)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q28. Find Second Smallest Element in an Array\n"+"\n import math\n" +
                "\n" +
                "arr = [10, 13, 17, 11, 34, 21]\n" +
                "first = math.inf\n" +
                "second = math.inf\n" +
                "\n" +
                "for i in range(0, len(arr)):\n" +
                "   if arr[i] < first:\n" +
                "     first = arr[i]\n" +
                "\n" +
                "for i in range(0, len(arr)):\n" +
                "   if arr[i] != first and arr[i] < second:\n" +
                "     second = arr[i]\n" +
                "\n" +
                "print(second)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q29. Calculate the sum of elements in an array \n"+"\n arr = [10, 89, 9, 56, 4, 80, 8]\n" +
                "Sum = 0\n" +
                "\n" +
                "for i in range(len(arr)):\n" +
                "   Sum = Sum + arr[i]\n" +
                "print (Sum)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q30. Reverse an Array\n"+"\n def reverseList(A, start, end):\n" +
                "  while start < end:\n" +
                "    A[start], A[end] = A[end], A[start]\n" +
                "    start += 1\n" +
                "    end -= 1\n" +
                "# Driver function to test above function\n" +
                "A = [10, 20, 30, 40, 50]\n" +
                "reverseList(A, 0, 4)\n" +
                "print(A)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q31. Sort the elements of an array \n"+"\n # List of Integers\n" +
                "numbers = [10, 30, 40, 20]\n" +
                "\n" +
                "# Sorting list of Integers\n" +
                "numbers.sort()\n" +
                "\n" +
                "print(numbers)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q32. Sorting elements of an array by frequency\n"+"\n from collections import Counter\n" +
                "ini_list = [10, 20, 30, 40, 40, 50, 50, 50]\n" +
                "\n" +
                "# sorting on bais of frequency of elements\n" +
                "result = [item for items, c in Counter(ini_list).most_common() for item in [items] * c]\n" +
                "\n" +
                "# printing final result\n" +
                "print(str(result))\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q33. Finding the Longest Palindrome in an Array\n"+"\n def isPalindrome(n):\n" +
                "\n" +
                "   divisor = 1\n" +
                "   while (int(n / divisor) >= 10):\n" +
                "      divisor *= 10\n" +
                "\n" +
                "   while (n != 0):\n" +
                "      leading = int(n / divisor)\n" +
                "      trailing = n % 10\n" +
                "  \n" +
                "      if (leading != trailing):\n" +
                "        return False\n" +
                "\n" +
                "      n = int((n % divisor) / 10)\n" +
                "\n" +
                "      divisor = int(divisor / 100)\n" +
                "   return True\n" +
                "\n" +
                "# Function to find the largest palindromic element\n" +
                "def largestPalindrome(arr, n):\n" +
                "   currentMax = -1\n" +
                "\n" +
                "   for i in range(0, n, 1):\n" +
                "      if (arr[i] > currentMax and isPalindrome(arr[i])):\n" +
                "         currentMax = arr[i]\n" +
                "\n" +
                "   return currentMax\n" +
                "\n" +
                "# Driver Code\n" +
                "\n" +
                "arr = [1, 232, 5545455, 909090, 161]\n" +
                "n = len(arr)\n" +
                "\n" +
                "# print required answer\n" +
                "print(largestPalindrome(arr, n))\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q34. Counting Distinct Elements in an Array\n"+"\n def count(arr, n):\n" +
                "\n" +
                "   # Mark all array elements as not visited\n" +
                "    visited = [False for i in range(n)]\n" +
                "    count_dis=0\n" +
                "\n" +
                "   # Traverse through array elements\n" +
                "   # and count frequencies\n" +
                "    for i in range(n):\n" +
                "     # Skip this element if already\n" +
                "     # processed\n" +
                "        if (visited[i] == True):\n" +
                "          continue\n" +
                "\n" +
                "     # Count frequency\n" +
                "        for j in range(i + 1, n, 1):\n" +
                "            if (arr[i] == arr[j]):\n" +
                "                visited[j] = True\n" +
                "         \n" +
                "        count_dis = count_dis+1;\n" +
                "   \n" +
                "    print(count_dis)\n" +
                "\n" +
                "# Driver Code\n" +
                "arr = [10, 30, 40, 20, 10, 20, 50, 10]\n" +
                "n = len(arr)\n" +
                "count(arr, n)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q35. Finding  Repeating elements in an Array\n"+"\n def count(arr, n):\n" +
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
                "     if count != 1 :\n" +
                "        print(arr[i]);\n" +
                "\n" +
                "\n" +
                "# Driver Code\n" +
                "arr = [10, 30, 40, 20, 10, 20, 50, 10]\n" +
                "n = len(arr)\n" +
                "count(arr, n)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q36. Finding Non Repeating elements in an Array\n"+"\n def count(arr, n):\n" +
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
                "     if count == 1 :\n" +
                "        print(arr[i]);\n" +
                "   \n" +
                "\n" +
                "# Driver Code\n" +
                "arr = [10, 30, 40, 20, 10, 20, 50, 10]\n" +
                "n = len(arr)\n" +
                "count(arr, n)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q37. Removing Duplicate elements from an array\n"+"\n def removeDuplicates(arr, n):\n" +
                "# Return, if array is empty or contains a single element\n" +
                "    if n == 0 or n == 1:\n" +
                "        return n\n" +
                "\n" +
                "    temp = list(range(n))\n" +
                "\n" +
                "    # Start traversing elements\n" +
                "    j = 0;\n" +
                "    for i in range(0, n-1):\n" +
                "        # If current element is not equal to next element then store that current element\n" +
                "        if arr[i] != arr[i+1]:\n" +
                "            temp[j] = arr[i]\n" +
                "            j += 1\n" +
                "\n" +
                "    temp[j] = arr[n-1]\n" +
                "    j += 1\n" +
                "\n" +
                "    # Modify original array\n" +
                "    for i in range(0, j):\n" +
                "        arr[i] = temp[i]\n" +
                "\n" +
                "    return j\n" +
                "\n" +
                "# Driver code\n" +
                "arr = [10, 20, 20, 30, 40, 40, 40, 50, 50]\n" +
                "n = len(arr)\n" +
                "\n" +
                "n = removeDuplicates(arr, n)\n" +
                "\n" +
                "# Print updated array\n" +
                "for i in range(n):\n" +
                "    print (\"%d\"%(arr[i]), end = \" \")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q38. Finding Minimum scalar product of two vectors\n"+"\n arr1 = [1, 2, 6, 3, 7]\n" +
                "arr2 = [10, 7, 45, 3, 7]\n" +
                "\n" +
                "n = len(arr1)\n" +
                "\n" +
                "#Sort arr1 in ascending order\n" +
                "for i in range(n):\n" +
                "    for j in range(i+1, n): \n" +
                "        if arr1[i]>arr1[j] :\n" +
                "            arr1[i], arr1[j] = arr1[j], arr1[i]\n" +
                "\n" +
                "#Sort arr2 in descending order\n" +
                "for i in range(n):\n" +
                "    for j in range(i+1, n): \n" +
                "        if arr2[i]<arr2[j] :\n" +
                "            arr2[i], arr2[j] = arr2[j], arr2[i]\n" +
                "\n" +
                "product = 0\n" +
                "for i in range(n):\n" +
                "    product += arr1[i]*arr2[i]\n" +
                "\n" +
                "print(product)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q39. Finding Maximum scalar product of two vectors in an array\n"+"\n arr1 = [1, 2, 6, 3, 7]\n" +
                "arr2 = [10, 7, 45, 3, 7]\n" +
                "\n" +
                "n = len(arr1)\n" +
                "\n" +
                "#Sort arr1 in ascending order\n" +
                "for i in range(n):\n" +
                "  for j in range(i+1, n): \n" +
                "     if arr1[i]>arr1[j] :\n" +
                "       arr1[i], arr1[j] = arr1[j], arr1[i]\n" +
                "\n" +
                "#Sort arr2 in ascending order\n" +
                "for i in range(n):\n" +
                "  for j in range(i+1, n): \n" +
                "    if arr2[i]>arr2[j] :\n" +
                "      arr2[i], arr2[j] = arr2[j], arr2[i]\n" +
                "\n" +
                "product = 0\n" +
                "for i in range(n):\n" +
                "   product += arr1[i]*arr2[i]\n" +
                "\n" +
                "print(product)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q40. Counting the number of even and odd elements in an array\n"+"\n arr = [1, 7, 8, 4, 5, 16, 8]\n" +
                "n = len(arr)\n" +
                "countEven = 0\n" +
                "countodd = 0\n" +
                "for i in range(0, n):\n" +
                "    if arr[i]%2==0 :\n" +
                "        countEven += 1\n" +
                "    else:\n" +
                "        countodd += 1\n" +
                "\n" +
                "print(\"Even Elements count : \" )\n" +
                "print(countEven)\n" +
                "\n" +
                "print(\"Odd Elements count : \")\n" +
                "print(countodd)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q41. Check whether a character is a vowel or consonant \n"+"\n c = 'a'\n" +
                "\n" +
                "# checking for vowels\n" +
                "if c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u' or c == 'A' or c == 'E' or c == 'I' or c == 'O' or c == 'U':\n" +
                "    print(c, \"is a vowel\")  # condition true input is vowel\n" +
                "else:\n" +
                "    print(c, \"is a consonant\")  # condition true input is consonant\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q42. Check whether a character is a alphabet or not\n"+"\n ch = 'z'\n" +
                "\n" +
                "# basic logic\n" +
                "if 'a' <= ch <= 'z' or 'A' <= ch <= 'Z':\n" +
                "    print(\"The  character\", ch, \"is an Alphabet\")\n" +
                "else:\n" +
                "    print(\"The  character\", ch, \"is not an Alphabet\")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q43. Count the number of vowels \n"+"\n String = input('Enter the string :')\n" +
                "count = 0\n" +
                "#to check for less conditions\n" +
                "#keep string in lowercase\n" +
                "String = String.lower()\n" +
                "for i in String:\n" +
                "    if i == 'a' or i == 'e' or i == 'i' or i == 'o' or i == 'u':\n" +
                "        #if True\n" +
                "        count+=1\n" +
                "#check if any vowel found\n" +
                "if count == 0:\n" +
                "    print('No vowels found')\n" +
                "else:\n" +
                "    print('Total vowels are :' + str(count))\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q44. Remove the vowels from a String\n"+"\n string = \"PrepInsta\"\n" +
                "\n" +
                "vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']\n" +
                "result = \"\"\n" +
                "\n" +
                "for i in range(len(string)):\n" +
                "    if string[i] not in vowels:\n" +
                "        result = result + string[i]\n" +
                "\n" +
                "print(\"\\nAfter removing Vowels: \", result)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q45. Check if the given string is Palindrome or not\n"+"\n input_string = 'civic'\n" +
                "rev = input_string[::-1]\n" +
                "\n" +
                "if input_string == rev:\n" +
                "    print(rev + \" is Palindrome\")\n" +
                "else:\n" +
                "    print(rev + \" is not Palindrome\")\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q46. Print the given string in reverse order\n"+"\n #using slicing:\n" +
                "string = \"Hello world\"\n" +
                "print(string[::-1])\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q47. Remove all characters from string except alphabets\n"+"\n String1 = \"#Justice!For@Chutki123\"\n" +
                "#initialize empty String\n" +
                "String2 = ''\n" +
                "for i in String1:\n" +
                "    #check for alphabets\n" +
                "    if (ord(i) >= 65 and ord(i) <= 90) or (ord(i) >= 97 and ord(i) <= 122):\n" +
                "        #concatenate to empty string\n" +
                "        String2+=i\n" +
                "print('Alphabets in string are :' + String2)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q48. Remove spaces from a string\n"+"\n String = \"PrepInsta is fabulous\"\n" +
                "\n" +
                "#Use join function \n" +
                "String = \"\".join(String.split()) \n" +
                "\n" +
                "#print String \n" +
                "print(\"After removing spaces string is :\",String)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q49. Remove brackets from an algebraic expression\n"+"\n Exp = \"(a-b)+[c*d]+{e/f}\"\n" +
                "#initialize an empty string \n" +
                "Equation = ''\n" +
                "#traversing through string\n" +
                "for i in Exp:\n" +
                "    #checking for brackets\n" +
                "    if ord(i) == 41 or ord(i) == 40 or ord(i) == 91 or ord(i) == 93 or ord(i) == 123 or ord(i) == 125:\n" +
                "        #If True\n" +
                "        pass\n" +
                "    else:\n" +
                "        #if False\n" +
                "        #add it to empty String\n" +
                "        Equation = Equation + i\n" +
                " #print the string\n" +
                "print(' String without bracket is ' + Equation)\n");
        answerStorage.addAnswer("<------------------------------------------------------>\n");
        answerStorage.addAnswer("Q50. Count the sum of numbers in a string\n"+"\n String = \"Daya123Ben456\"\n" +
                "#initialize integer variable\n" +
                "sum1 = 0\n" +
                "for i in String:\n" +
                "    #check if values lies between range of numbers or not\n" +
                "    #according to ascii tale\n" +
                "    if ord(i) >= 48 and ord(i) <= 57:\n" +
                "        #convert it to integer and add\n" +
                "        sum1 = sum1 + int(i)\n" +
                "print('Sum is :' + str(sum1))\n");


        ArrayList<String> answers = answerStorage.getAnswers();
        String answersString = TextUtils.join("\n", answers);

        // Display the answers in a TextView
        TextView textView = findViewById(R.id.myTextView);
        textView.setText(answersString);
    }
}