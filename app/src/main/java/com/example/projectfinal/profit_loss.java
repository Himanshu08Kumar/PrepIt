package com.example.projectfinal;

public class profit_loss {
    public static String question[] ={
            "Q1. Alfred buys an old scooter for Rs. 4700 and spends Rs. 800 on its repairs. If he sells the scooter for Rs. 5800, his gain percent is:",
            "Q2. The cost price of 20 articles is the same as the selling price of x articles. If the profit is 25%, then the value of x is:",
            "Q3. If selling price is doubled, the profit triples. Find the profit percent.",
            "Q4. In a certain store, the profit is 320% of the cost. If the cost increases by 25% but the selling price remains constant, approximately what percentage of the selling price is the profit?",
            "Q5. A vendor bought toffees at 6 for a rupee. How many for a rupee must he sell to gain 20%?",
            "Q6. The percentage profit earned by selling an article for Rs. 1920 is equal to the percentage loss incurred by selling the same article for Rs. 1280. At what price should the article be sold to make 25% profit?",
            "Q7. A shopkeeper expects a gain of 22.5% on his cost price. If in a week, his sale was of Rs. 392, what was his profit?",
            "Q8. A man buys a cycle for Rs. 1400 and sells it at a loss of 15%. What is the selling price of the cycle?",
            "Q9. Sam purchased 20 dozens of toys at the rate of Rs. 375 per dozen. He sold each one of them at the rate of Rs. 33. What was his percentage profit?",
            "Q10. Some articles were bought at 6 articles for Rs. 5 and sold at 5 articles for Rs. 6. Gain percent is:",
            "Q11. On selling 17 balls at Rs. 720, there is a loss equal to the cost price of 5 balls. The cost price of a ball is:",
            "Q12. When a plot is sold for Rs. 18,700, the owner loses 15%. At what price must that plot be sold in order to gain 15%?",
            "Q13. 100 oranges are bought at the rate of Rs. 350 and sold at the rate of Rs. 48 per dozen. The percentage of profit or loss is:",
            "Q14. A shopkeeper sells one transistor for Rs. 840 at a gain of 20% and another for Rs. 960 at a loss of 4%. His total gain or loss percent is:",
            "Q15. A trader mixes 26 kg of rice at Rs. 20 per kg with 30 kg of rice of other variety at Rs. 36 per kg and sells the mixture at Rs. 30 per kg. His profit percent is:",

    };
    public static String choices[][]={
            {"4(4/7)%","5(5/11)%","10%","12%"},
            {"15","16","18","25"},
            {"66(2/3)","100","101","106"},
            {"30%","70%","100%","250%"},
            {"3","4","5","6"},
            {"Rs. 2000","Rs. 2200","Rs. 2400","Data inadequate"},
            {"Rs. 18.20","Rs. 70","Rs. 72","Rs. 88.25"},
            {"Rs. 1090","Rs. 1160","Rs. 1190","Rs. 1202"},
            {"3.5","4.5","5.6","6.5"},
            {"30%","33.3%","35%","44%"},
            {"Rs. 45","Rs. 50","Rs. 55","Rs. 60"},
            {"Rs. 21,000","Rs. 22,500","Rs. 25,300","Rs. 25,800"},
            {"14(2/7)% gain","15% gain","14(2/7)% loss","15 % loss"},
            {"5(15/17)% loss","5(15/17)% gain","6(2/3)% gain","None of these"},
            {"No profit, no loss","5%","8%","10%"}

    };
    public static String correctAnswer[]={
            "5(5/11)%",
            "16",
            "100",
            "70%",
            "5",
            "Rs. 2000",
            "72",
            "Rs. 1190",
            "5.6",
            "44%",
            "Rs. 60",
            "Rs. 25,300",
            "14(2/7)% gain",
            "5(15/17)% gain",
            "5%"

    };

    public static String desAns[]={
            "Cost Price (C.P.) = Rs. (4700 + 800) = Rs. 5500.\n" +
                    "\n" +
                    "Selling Price (S.P.) = Rs. 5800.\n" +
                    "\n" +
                    "Gain = (S.P.) - (C.P.) = Rs.(5800 - 5500) = Rs. 300.\n" +
                    "\n" +
                    "Gain % = (300/5500 * 100)% = 5(5/11)%\n",

            "Let C.P. of each article be Re. 1 C.P. of x articles = Rs. x.\n" +
                    "\n" +
                    "S.P. of x articles = Rs. 20.\n" +
                    "\n" +
                    "Profit = Rs. (20 - x).\n"+
            "[(20-x)/x * 100 = 25]\n"+
            "2000 - 100x = 25x\n" +
                    "\n" +
                    "125x = 2000\n" +
                    "\n" +
                    " x = 16\n",

            "Let C.P. be Rs. x and S.P. be Rs. y.\n" +
                    "\n" +
                    "Then, 3(y - x) = (2y - x)    y = 2x.\n" +
                    "\n" +
                    "Profit = Rs. (y - x) = Rs. (2x - x) = Rs. x.\n" +
                    "\n" +
                    " Profit % = (x/x * 100)% = 100%\n",

            "Let C.P.= Rs. 100. Then, Profit = Rs. 320, S.P. = Rs. 420.\n" +
                    "\n" +
                    "New C.P. = 125% of Rs. 100 = Rs. 125\n" +
                    "\n" +
                    "New S.P. = Rs. 420.\n" +
                    "\n" +
                    "Profit = Rs. (420 - 125) = Rs. 295.\n" +
                    "\n" +
                    " Required percentage = (295/420 * 100)% = 1475/21 %\n"+
            "= 70% (Approximately)\n",

            "C.P. of 6 toffees = Re. 1\n" +
                    "\n" +
                    "S.P. of 6 toffees = 120% of Re. 1 = Rs 6/5 \n"+
            "For Rs 6/5, toffees sold = 6\n"+
            "For Re. 1, toffees sold = (6 * 5/6) = 5\n",

            "Let C.P. be Rs. x.\n" +
                    "\n" +
                    "Then, (1920 - x)/x * 100 = (x - 1280)/x * 100\n"+
            " 1920 - x = x - 1280\n" +
                    "\n" +
                    " 2x = 3200\n" +
                    "\n" +
                    " x = 1600\n" +
                    "\n" +
                    " Required S.P. = 125% of Rs. 1600 = Rs(125/100 * 1600)\n"+
            "= Rs 2000\n",

            "C.P. = Rs (100/122.5 * 392) = Rs (1000/1225 * 392)\n"+
            "=Rs 320\n"+
            "Profit = Rs. (392 - 320) = Rs. 72.",

            "S.P. = 85% of Rs. 1400 = Rs(85/100 * 1400) = Rs. 1190\n",

            "Cost Price of 1 toy = Rs(375/12) = Rs 31.25\n"+
            "Selling Price of 1 toy = Rs. 33\n" +
                    "\n" +
                    "So, Gain = Rs. (33 - 31.25) = Rs. 1.75\n" +
                    "\n" +
                    " Profit % = (1.75/31.25 * 100)% = 28/5 % = 5.6%\n",

            "Suppose, number of articles bought = L.C.M. of 6 and 5 = 30.\n" +
                    "\n" +
                    "C.P. of 30 articles = Rs (5/6 * 30) = Rs 25\n"+
            "S.P. of 30 articles = Rs (6/5 * 30) = Rs 36\n"+
            "Gain % = (11/25 * 100)% = 44%\n",

            "(C.P. of 17 balls) - (S.P. of 17 balls) = (C.P. of 5 balls)\n" +
                    "\n" +
                    " C.P. of 12 balls = S.P. of 17 balls = Rs.720.\n" +
                    "\n" +
                    " C.P. of 1 ball = Rs (720/12) = Rs 60\n",

            "85 : 18700 = 115 : x\n" +
                    "\n" +
                    " x =(18700 * 115)/85 = 25300\n"+
            "Hence, S.P. = Rs. 25,300.\n",

            "C.P. of 1 orange = Rs. (350/100) = Rs 3.50\n"+
            "S.P. of 1 orange = Rs (48/12) = Rs 4\n"+
            "Gain % = (0.50 * 100)/3.50 % = (100/7)% = 14(2/7)% \n",

            "C.P. of 1st transistor = Rs.(100 * 840)/120 = Rs 700\n"+
            "C.P. of 2nd transistor = Rs.(100 * 960)/96 = Rs 1000\n"+
            "So, total C.P. = Rs. (700 + 1000) = Rs. 1700.\n" +
                    "\n" +
                    "Total S.P. = Rs. (840 + 960) = Rs. 1800.\n"+
            "Gain % = (100 * 100)/1700 % = 5(15/17)%\n",

            "C.P. of 56 kg rice = Rs. (26 x 20 + 30 x 36) = Rs. (520 + 1080) = Rs. 1600.\n" +
                    "\n" +
                    "S.P. of 56 kg rice = Rs. (56 x 30) = Rs. 1680.\n" +
                    "Gain = (80 * 100)/1600 % = 5%\n"
    };
}
