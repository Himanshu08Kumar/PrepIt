package com.example.projectfinal;

public class boats {
    public static String question[] ={
            "Q1. A boat can travel with a speed of 13 km/hr in still water. If the speed of the stream is 4 km/hr, find the time taken by the boat to go 68 km downstream.",
            "Q2. A man's speed with the current is 15 km/hr and the speed of the current is 2.5 km/hr. The man's speed against the current is:",
            "Q3. A boat running upstream takes 8 hours 48 minutes to cover a certain distance, while it takes 4 hours to cover the same distance running downstream. What is the ratio between the speed of the boat and speed of the water current respectively?",
            "Q4. A motorboat, whose speed in 15 km/hr in still water goes 30 km downstream and comes back in a total of 4 hours 30 minutes. The speed of the stream (in km/hr) is:",
            "Q5. In one hour, a boat goes 11 km/hr along the stream and 5 km/hr against the stream. The speed of the boat in still water (in km/hr) is:",
            "Q6. A boat running downstream covers a distance of 16 km in 2 hours while for covering the same distance upstream, it takes 4 hours. What is the speed of the boat in still water?",
            "Q7. The speed of a boat in still water in 15 km/hr and the rate of current is 3 km/hr. The distance travelled downstream in 12 minutes is:",
            "Q8. A boat takes 90 minutes less to travel 36 miles downstream than to travel the same distance upstream. If the speed of the boat in still water is 10 mph, the speed of the stream is:",
            "Q9. A man can row at 5 kmph in still water. If the velocity of current is 1 kmph and it takes him 1 hour to row to a place and come back, how far is the place?",
            "Q10. A boat covers a certain distance downstream in 1 hour, while it comes back in 1 hours. If the speed of the stream be 3 kmph, what is the speed of the boat in still water?",
            "Q11. A boatman goes 2 km against the current of the stream in 1 hour and goes 1 km along the current in 10 minutes. How long will it take to go 5 km in stationary water?",
            "Q12. A man can row three-quarters of a kilometre against the stream in 11(1/4) minutes and down the stream in 7(1/2) minutes. The speed (in km/hr) of the man in still water is:",
            "Q13. Speed of a boat in standing water is 9 kmph and the speed of the stream is 1.5 kmph. A man rows to a place at a distance of 105 km and comes back to the starting point. The total time taken by him is:",
            "Q14. A man takes twice as long to row a distance against the stream as to row the same distance in favour of the stream. The ratio of the speed of the boat (in still water) and the stream is:",
            "Q15. A man rows to a place 48 km distant and come back in 14 hours. He finds that he can row 4 km with the stream in the same time as 3 km against the stream. The rate of the stream is:"
    };
    public static String choices[][]={
            {"2 hours","3 hours","4 hours","5 hours"},
            {"8.5 km/hr","9 km/hr","10 km/hr","12.5 km/hr"},
            {"2 : 1","3 : 2","8 : 3","8 : 5"},
            {"4","5","6","10"},
            {"3 km/hr","5 km/hr","8 km/hr","9 km/hr"},
            {"4 km/hr","6 km/hr","8 km/hr","7 km/hr"},
            {"1.2 km","1.8 km","2.4 km","3.6 km"},
            {"2 mph","2.5 mph","3 mph","4 mph"},
            {"2.4 km","2.5 km","3 km","3.6 km"},
            {"12 kmph","13 kmph","14 kmph","15 kmph"},
            {"40 minutes","1 hour","1 hr 15 min","1 hr 30 min"},
            {"2","3","4","5"},
            {"16 hours","18 hours","20 hours","24 hours"},
            {"2 : 1","3 : 1","3 : 2","4 : 3"},
            {"1 km/hr","1.5 km/hr","2 km/hr","2.5 km/hr"}
    };
    public static String correctAnswer[]={
            "4 hours",
            "10 km/hr",
            "8 : 3",
            "5",
            "8 km/hr",
            "6 km/hr",
            "3.6 km",
            "2 mph",
            "2.4 km",
            "15 kmph",
            "1 hr 15 min",
            "5",
            "24 hours",
            "3 : 1",
            "1 km/hr"
    };

    public static String desAns[]={
            "Speed downstream = (13 + 4) km/hr = 17 km/hr.\n" +
                    "\n" +
                    "Time taken to travel 68 km downstream =(68/17)hrs = 4 hrs.\n",


            "Man's rate in still water = (15 - 2.5) km/hr = 12.5 km/hr.\n" +
                    "\n" +
                    "Man's rate against the current = (12.5 - 2.5) km/hr = 10 km/hr\n \n",


            "Let the man's rate upstream be x kmph and that downstream be y kmph.Then, distance covered upstream in 8 hrs 48 min = Distance covered downstream in 4 hrs.\n"+"{x * 8(4/5)} = (y * 4)\n"+" (44/5)x = 4y\n"+"y = 11/5 X\n"+"Required ratio = (y + x)/2 : (y - x)/2\n"+"(16x/5 * 1/2) : (6x/5 * 1/2)\n"+"8/5 : 3/5\n"+"8 : 3\n",


            "Let the speed of the stream be x km/hr. Then,\n" +
                    "\n" +
                    "Speed downstream = (15 + x) km/hr,\n" +
                    "\n" +
                    "Speed upstream = (15 - x) km/hr.\n"+"30 /(15 +x) + 30 /(15 - x) = 4(1/2) \n"+"900 / (225 - x^2) = 9/2 \n"+" 9x^2 = 225 \n "+"x^2 = 25 \n "+"x = 5 km/hr\n",


            "Speed in still water = 1/2 (11+5) kmph = 8 kmph",


            "Rate downstream = (16/2)kmph = 8 kmph\n"+"Rate upstream = 16/4 kmph = 4 kmph \n"+"Speed in still water = 1/2(8 + 4) kmph = 6 kmph \n",


            "Speed downstream = (15 + 3) kmph = 18 kmph \n"+"Distance travelled = (18 * 12/60) km = 3.6 km\n",


            "Let the speed of the stream x mph. Then,\n" +
                    "\n" +
                    "Speed downstream = (10 + x) mph,\n" +
                    "\n" +
                    "Speed upstream = (10 - x) mph.\n "+
                    "36/(10 - x) - 36/(10 + x) = 90/60 \n"+"72x x 60 = 90 (100 - x^2)\n" +
                    "\n" +
                    " x^2 + 48x - 100 = 0\n" +
                    "\n" +
                    " (x+ 50)(x - 2) = 0\n" +
                    "\n" +
                    " x = 2 mph. \n",


            "Speed downstream = (5 + 1) kmph = 6 kmph.\n" +
                    "\n" +
                    "Speed upstream = (5 - 1) kmph = 4 kmph.\n" +
                    "\n" +
                    "Let the required distance be x km.\n" +
                    "\n" +
                    "Then, x/6 + x/4 = 1\n"+" 2x + 3x = 12\n" +
                    "\n" +
                    " 5x = 12\n" +
                    "\n" +
                    " x = 2.4 km.\n",


            "Let the speed of the boat in still water be x kmph. Then,\n" +
                    "\n" +
                    "Speed downstream = (x + 3) kmph,\n" +
                    "\n" +
                    "Speed upstream = (x - 3) kmph.\n" +
                    "\n" +
                    " (x + 3) * 1 = (x - 3) * 3/2\n" +
                    " 2x + 6 = 3x - 9\n" +
                    "\n" +
                    " x = 15 kmph.\n",


            "Rate downstream = (1/10 * 60) km/hr = 6 km/hr \n"+"Rate upstream = 2 km/hr.\n"+"Speed in still water = 1/2 (6+2)km/hr = 4 km/hr\n"+"Required time = 5/4 hrs = 1(1/4) hrs = 1 hr 15 min \n",


            "We can write three-quarters of a kilometre as 750 metres,\n" +
                    "\n" +
                    "and 11(1/4) minutes as 675 seconds.\n" +
                    "\n" +
                    "Rate upstream = 750/675 m/sec = 10/9 m/sec\n"+
                    "Rate downstream = (750 / 450) m/sec = 5/3 m/sec \n"
            +" Rate in still water = 1/2 (10/9 + 5/3) m/sec\n"+" = 25/18 m/sec\n"
            + "(25/18 * 18/5) km/hr = 5 km/hr\n",



            "Speed upstream = 7.5 kmph.\n" +
                    "\n" +
                    "Speed downstream = 10.5 kmph.\n" +
                    "\n" +
                    " Total time taken = (105/7.5 + 105/10.5)hours = 24 hours \n",


            "Let man's rate upstream be x kmph.\n" +
                    "\n" +
                    "Then, his rate downstream = 2x kmph.\n" +
                    "\n" +
                    " (Speed in still water) : (Speed of stream) = (2x + x)/2 : (2x - x)/2 \n"+
            "3x/2 : x/2 \n"+" = 3 : 1\n",



            "Suppose he move 4 km downstream in x hours. Then,\n" +
                    "\n" +
                    "Speed downstream = 4/x km/hr \n"+
                    "Speed upstream = 3/x km/hr"+
                    "48/(4/x) + 48/(3/x) = 14 or x = 1/2 \n"+
                    "So, Speed downstream = 8 km/hr, Speed upstream = 6 km/hr.\n" +
                    "\n" +
                    "Rate of the stream = 1/2(8-6) kkm/hr = 1 km/hr\n"
    };
}
