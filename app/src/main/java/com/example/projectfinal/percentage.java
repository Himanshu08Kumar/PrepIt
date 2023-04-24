package com.example.projectfinal;

public class percentage {
    public static String question[] ={
            "Q1. A batsman scored 110 runs which included 3 boundaries and 8 sixes. What percent of his total score did he make by running between the wickets?",
            "Q2. Two students appeared at an examination. One of them secured 9 marks more than the other and his marks was 56% of the sum of their marks. The marks obtained by them are:",
            "Q3. A fruit seller had some apples. He sells 40% apples and still has 420 apples. Originally, he had:",
            "Q4. What percentage of numbers from 1 to 70 have 1 or 9 in the unit's digit?",
            "Q5. If A = x% of y and B = y% of x, then which of the following is true?",
            "Q6. If 20% of a = b, then b% of 20 is the same as:",
            "Q7. In a certain school, 20% of students are below 8 years of age. The number of students above 8 years of age is 2/3 of the number of students of 8 years of age which is 48. What is the total number of students in the school?",
            "Q8. Two numbers A and B are such that the sum of 5% of A and 4% of B is two-third of the sum of 6% of A and 8% of B. Find the ratio of A : B.",
            "Q9. A student multiplied a number by 3/5 instead of 5/3 .What is the percentage error in the calculation?",
            "Q10. In an election between two candidates, one got 55% of the total valid votes, 20% of the votes were invalid. If the total number of votes was 7500, the number of valid votes that the other candidate got, was:",
            "Q11. Three candidates contested an election and received 1136, 7636 and 11628 votes respectively. What percentage of the total votes did the winning candidate get?",
            "Q12. Two tailors X and Y are paid a total of Rs. 550 per week by their employer. If X is paid 120 percent of the sum paid to Y, how much is Y paid per week?",
            "Q13. Gauri went to the stationers and bought things worth Rs. 25, out of which 30 paise went on sales tax on taxable purchases. If the tax rate was 6%, then what was the cost of the tax free items?",
            "Q14. Rajeev buys good worth Rs. 6650. He gets a rebate of 6% on it. After getting the rebate, he pays sales tax @ 10%. Find the amount he will have to pay for the goods.",
            "Q15. The population of a town increased from 1,75,000 to 2,62,500 in a decade. The average percent increase of population per year is:",
            "Q16. Father is aged three times more than his son Ronit. After 8 years, he would be two and a half times of Ronit's age. After further 8 years, how many times would he be of Ronit's age?",
            "Q17. The sum of ages of 5 children born at the intervals of 3 years each is 50 years. What is the age of the youngest child?",
            "Q18. A father said to his son, \"I was as old as you are at the present at the time of your birth\". If the father's age is 38 years now, the son's age five years back was:",
            "Q19. A is two years older than B who is twice as old as C. If the total of the ages of A, B and C be 27, then how old is B?",
            "Q20. Present ages of Sameer and Anand are in the ratio of 5 : 4 respectively. Three years hence, the ratio of their ages will become 11 : 9 respectively. What is Anand's present age in years?",
            "Q21. A man is 24 years older than his son. In two years, his age will be twice the age of his son. The present age of his son is:",
            "Q22. Six years ago, the ratio of the ages of Kunal and Sagar was 6 : 5. Four years hence, the ratio of their ages will be 11 : 10. What is Sagar's age at present?",
            "Q23. The sum of the present ages of a father and his son is 60 years. Six years ago, father's age was five times the age of the son. After 6 years, son's age will be:",
            "Q24. At present, the ratio between the ages of Arun and Deepak is 4 : 3. After 6 years, Arun's age will be 26 years. What is the age of Deepak at present ?",
            "Q25. Sachin is younger than Rahul by 7 years. If their ages are in the respective ratio of 7 : 9, how old is Sachin?",
            "Q26. The present ages of three persons in proportions 4 : 7 : 9. Eight years ago, the sum of their ages was 56. Find their present ages (in years).",
            "Q27. Ayesha's father was 38 years of age when she was born while her mother was 36 years old when her brother four years younger to her was born. What is the difference between the ages of her parents?",
            "Q28. A person's present age is two-fifth of the age of his mother. After 8 years, he will be one-half of the age of his mother. How old is the mother at present?",
            "Q29. Q is as much younger than R as he is older than T. If the sum of the ages of R and T is 50 years, what is definitely the difference between R and Q's age?",
            "Q30. The age of father 10 years ago was thrice the age of his son. Ten years hence, father's age will be twice that of his son. The ratio of their present ages is:"

    };
    public static String choices[][]={
            {"45%","45(5/11)%","54(6/11)%","55%"},
            {"39, 30","41, 32","42, 33","43, 34"},
            {"588 apples","600 apples","672 apples","700 apples"},
            {"1","14","20","21"},
            {"A is smaller than B.","A is greater than B","If x is smaller than y, then A is greater than B.","None of these"},
            {"4% of a","5% of a","20% of a","None of these"},
            {"72","80","120","100"},
            {"2 : 3","1 : 1","3 : 4","4 : 3"},
            {"34%","44%","54%","64%"},
            {"2700","2900","3000","3100"},
            {"57%","60%","65%","90%"},
            {"Rs. 200","Rs. 250","Rs. 300","None of these"},
            {"Rs. 15","Rs. 15.70","Rs. 19.70","Rs. 20"},
            {"Rs. 6876.10","Rs. 6999.20","Rs. 6654","Rs. 7000"},
            {"4.37%","5%","6%","8.75%"},
            {"2 times","2(1/2) times","2(3/4) times","3 times"},
            {"4 years","8 years","10 years","None of these"},
            {"14 years","19 years","33 years","38 years"},
            {"7","8","9","10"},
            {"24","27","40","Cannot be determined"},
            {"14 years","18 years","20 years","22 years"},
            {"16 years","18 years","20 years","None of these"},
            {"12 years","14 years","18 years","20 years"},
            {"12 years","15 years","19 and half","21 years"},
            {"16 years","18 years","28 years","24.5 years"},
            {"8, 20, 28","16, 28, 36","20, 35, 45","None of these"},
            {"2 years","4 years","6 years","8 years"},
            {"32 years","36 years","40 years","48 years"},
            {"1 year","2 years","25 years","Data inadequate"},
            {"5 : 2","7 : 3","9 : 2","13 : 4"}
    };
    public static String correctAnswer[]={
            "45(5/11)%",
            "42, 33",
            "700 apples",
            "20",
            "None of these",
            "4% of a",
            "100",
            "4 : 3",
            "64%",
            "2700",
            "57%",
            "Rs. 250",
            "Rs. 19.70",
            "Rs. 6876.10",
            "5%",
            "2 times",
            "4 years",
            "14 years",
            "10",
            "24",
            "22 years",
            "16 years",
            "20 years",
            "15 years",
            "24.5 years",
            "16, 28, 36",
            "6 years",
            "40 years",
            "Data inadequate",
            "7 : 3"
    };
    public static String desAns[]={
            "Number of runs made by running = 110 - (3 x 4 + 8 x 6)\n" +
                    "\n" +
                    "= 110 - (60)\n" +
                    "\n" +
                    "= 50.\n" +
                    "\n" +
                    " Required percentage =(50 * 100)/110 %\n"+
                    "= 45(5/11)%\n",

            "Let their marks be (x + 9) and x.\n" +
                    "\n" +
                    "Then, x + 9 = 56/100(x + 9 + x)\n"+
            "25(x + 9) = 14(2x + 9)\n" +
                    "\n" +
                    " 3x = 99\n" +
                    "\n" +
                    " x = 33\n" +
                    "\n" +
                    "So, their marks are 42 and 33.\n",

            "Suppose originally he had x apples.\n" +
                    "\n" +
                    "Then, (100 - 40)% of x = 420.\n" +
                    "60/100 * x = 420\n"+
            "x = (420 * 100)/60 = 700\n",

            "Clearly, the numbers which have 1 or 9 in the unit's digit, have squares that end in the digit 1. Such numbers from 1 to 70 are 1, 9, 11, 19, 21, 29, 31, 39, 41, 49, 51, 59, 61, 69.\n" +
                    "\n" +
                    "Number of such number =14\n" +
                    "\n" +
                    " Required percentage =(14 * 100)/70 %\n"+
            "20%\n",

            "None of these",

            "20% of a = b "+
            "(20/100) a = b\n"+
            "b% of 20 =(b/100)*20\n"+
            "[(20/100)a * 1/100 * 20]\n"+
            "4/100 * a\n"+
            "4% of a\n",

            "Let the number of students be x. Then,\n" +
                    "\n" +
                    "Number of students above 8 years of age = (100 - 20)% of x = 80% of x.\n" +
                    "\n" +
                    " 80% of x = 48 + 2/3 of 48\n"+
            "(80/100)x = 80\n"+
            "x = 100\n",

            "5% of A + 4% of B = 2/3(6% of A + 8% of B)\n"+
            "(5/100)A + (4/100)B = 2/3[(6/100)A + (8/100)B]\n"+
            "(1/20)A + (1/25)B =(1/25)A + (4/75)B\n"+
            "[(1/20) - (1/25)]A = [(4/75) - (1/25)]B\n"+
            "(1/100)A = (1/75)B\n"+
            "A/B = 100/75 = 4/3\n"+
            "Required ratio = 4 : 3\n",

            "Let the number be x.\n" +
                    "\n" +
                    "Then, error = (5/3)x - (3/5)x = (16/15)x\n"+
            "Error% = [(16x/15)*(3/5x) * 100]% = 64%\n",

            "Number of valid votes = 80% of 7500 = 6000.\n" +
                    "\n" +
                    " Valid votes polled by other candidate = 45% of 6000\n"+
            "(45/100)*6000 = 2700\n",

            "Total number of votes polled = (1136 + 7636 + 11628) = 20400.\n" +
                    "\n" +
                    " Required percentage =(11628/20400) * 100 % = 57%\n",

            "Let the sum paid to Y per week be Rs. z.\n" +
                    "\n" +
                    "Then, z + 120% of z = 550.\n" +
                    "\n" +
                    " z + (120/100)z = 500\n"+
            "(11/5)z = 550\n"+
            "z = (550 * 5)/11 = 250\n",

            "Let the amount taxable purchases be Rs. x.\n" +
                    "\n" +
                    "Then, 6% of x = 30/100\n"+
            "x = (30/100) * (100/6) = 5\n"+
            "Cost of tax free items = Rs. [25 - (5 + 0.30)] = Rs. 19.70\n",

            "Rebate = 6% of Rs. 6650 = Rs (6/100) * (6650) = Rs 399\n"+
            "Sales tax = 10% of Rs. (6650 - 399) = Rs (10/100) * (6251) = Rs 625.10\n"+
            "Final amount = Rs. (6251 + 625.10) = Rs. 6876.10",

            "Increase in 10 years = (262500 - 175000) = 87500.\n" +
                    "\n" +
                    "Increase% =(87500/175000) * (100) % = 50%\n"+
            "Required average = (50/10)% = 5%\n",

            "Let Ronit's present age be x years. Then, father's present age =(x + 3x) years = 4x years.\n" +
                    "\n" +
                    "\t(4x + 8) = 5/2(x + 8)\n"+
            "8x + 16 = 5x + 40\n" +
                    "\n" +
                    " 3x = 24\n" +
                    "\n" +
                    " x = 8.\n" +
                    "\n" +
                    "Hence, required ratio = (4x + 16)/(x + 16) = 48/24 = 2\n",

            "Let the ages of children be x, (x + 3), (x + 6), (x + 9) and (x + 12) years.\n" +
                    "\n" +
                    "Then, x + (x + 3) + (x + 6) + (x + 9) + (x + 12) = 50\n" +
                    "\n" +
                    " 5x = 20\n" +
                    "\n" +
                    " x = 4.\n" +
                    "\n" +
                    " Age of the youngest child = x = 4 years.\n",

            "Let the son's present age be x years. Then, (38 - x) = x\n" +
                    "\n" +
                    " 2x = 38.\n" +
                    "\n" +
                    " x = 19.\n" +
                    "\n" +
                    " Son's age 5 years back (19 - 5) = 14 years.\n",

            "Let C's age be x years. Then, B's age = 2x years. A's age = (2x + 2) years.\n" +
                    "\n" +
                    " (2x + 2) + 2x + x = 27\n" +
                    "\n" +
                    " 5x = 25\n" +
                    "\n" +
                    " x = 5.\n" +
                    "\n" +
                    "Hence, B's age = 2x = 10 years.\n",

            "Let the present ages of Sameer and Anand be 5x years and 4x years respectively.\n" +
                    "\n" +
                    "Then, (5x + 3)/(4x + 3) = 11/9\n "+
            "9(5x + 3) = 11(4x + 3)\n" +
                    "\n" +
                    " 45x + 27 = 44x + 33\n" +
                    "\n" +
                    " 45x - 44x = 33 - 27\n" +
                    "\n" +
                    " x = 6.\n" +
                    "\n" +
                    " Anand's present age = 4x = 24 years.\n",

            "Let the son's present age be x years. Then, man's present age = (x + 24) years.\n" +
                    "\n" +
                    " (x + 24) + 2 = 2(x + 2)\n" +
                    "\n" +
                    " x + 26 = 2x + 4\n" +
                    "\n" +
                    " x = 22\n",

            "Let the ages of Kunal and Sagar 6 years ago be 6x and 5x years respectively.\n" +
                    "\n" +
                    "Then,(6x + 6)+4 / (5x + 6)+4 = 11/10\n"+
            "10(6x + 10) = 11(5x + 10)\n" +
                    "\n" +
                    " 5x = 10\n" +
                    "\n" +
                    " x = 2.\n" +
                    "\n" +
                    " Sagar's present age = (5x + 6) = 16 years.\n",

            "Let the present ages of son and father be x and (60 -x) years respectively.\n" +
                    "\n" +
                    "Then, (60 - x) - 6 = 5(x - 6)\n" +
                    "\n" +
                    " 54 - x = 5x - 30\n" +
                    "\n" +
                    " 6x = 84\n" +
                    "\n" +
                    " x = 14.\n" +
                    "\n" +
                    " Son's age after 6 years = (x+ 6) = 20 years.\n",

            "Let the present ages of Arun and Deepak be 4x years and 3x years respectively. Then,\n" +
                    "\n" +
                    "4x + 6 = 26        4x = 20\n" +
                    "\n" +
                    "x = 5.\n" +
                    "\n" +
                    " Deepak's age = 3x = 15 years.\n",

            "Let Rahul's age be x years.\n" +
                    "\n" +
                    "Then, Sachin's age = (x - 7) years\n"+
            "(x - 7)/x = 7/9\n"+
            "9x - 63 = 7x\n" +
                    "\n" +
                    " 2x = 63\n" +
                    "\n" +
                    " x = 31.5\n" +
                    "\n" +
                    "Hence, Sachin's age =(x - 7) = 24.5 years.\n",

            "Let their present ages be 4x, 7x and 9x years respectively.\n" +
                    "\n" +
                    "Then, (4x - 8) + (7x - 8) + (9x - 8) = 56\n" +
                    "\n" +
                    " 20x = 80\n" +
                    "\n" +
                    " x = 4.\n" +
                    "\n" +
                    " Their present ages are 4x = 16 years, 7x = 28 years and 9x = 36 years respectively.\n",

            "Mother's age when Ayesha's brother was born = 36 years.\n" +
                    "\n" +
                    "Father's age when Ayesha's brother was born = (38 + 4) years = 42 years.\n" +
                    "\n" +
                    " Required difference = (42 - 36) years = 6 years.\n",

            "Let the mother's present age be x years.\n" +
                    "\n" +
                    "Then, the person's present age =(2/5)x years\n"+
            "[(2/5)x + 8] = 1/2(x + 8)\n"+
            "2(2x + 40) = 5(x + 8)\n" +
                    "\n" +
                    " x = 40.\n",

            "Data inadequate",

            "Let the ages of father and son 10 years ago be 3x and x years respectively.\n" +
                    "\n" +
                    "Then, (3x + 10) + 10 = 2[(x + 10) + 10]\n" +
                    "\n" +
                    " 3x + 20 = 2x + 40\n" +
                    "\n" +
                    " x = 20.\n" +
                    "\n" +
                    " Required ratio = (3x + 10) : (x + 10) = 70 : 30 = 7 : 3\n"
    };
}
