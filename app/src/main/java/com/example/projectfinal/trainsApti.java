package com.example.projectfinal;

public class trainsApti {
    public static String question[] ={
            "Q1. A train running at the speed of 60 km/hr crosses a pole in 9 seconds. What is the length of the train?",
            "Q2. A train 125 m long passes a man, running at 5 km/hr in the same direction in which the train is going, in 10 seconds. The speed of the train is:",
            "Q3. The length of the bridge, which a train 130 metres long and travelling at 45 km/hr can cross in 30 seconds, is:",
            "Q4. Two trains running in opposite directions cross a man standing on the platform in 27 seconds and 17 seconds respectively and they cross each other in 23 seconds. The ratio of their speeds is:",
            "Q5. A train passes a station platform in 36 seconds and a man standing on the platform in 20 seconds. If the speed of the train is 54 km/hr, what is the length of the platform?",
            "Q6. A train 240 m long passes a pole in 24 seconds. How long will it take to pass a platform 650 m long?",
            "Q7. Two trains of equal length are running on parallel lines in the same direction at 46 km/hr and 36 km/hr. The faster train passes the slower train in 36 seconds. The length of each train is:",
            "Q8. A train 360 m long is running at a speed of 45 km/hr. In what time will it pass a bridge 140 m long?",
            "Q9. Two trains are moving in opposite directions @ 60 km/hr and 90 km/hr. Their lengths are 1.10 km and 0.9 km respectively. The time taken by the slower train to cross the faster train in seconds is:",
            "Q10. A jogger running at 9 kmph alongside a railway track in 240 metres ahead of the engine of a 120 metres long train running at 45 kmph in the same direction. In how much time will the train pass the jogger?",
            "Q11. A 270 metres long train running at the speed of 120 kmph crosses another train running in opposite direction at the speed of 80 kmph in 9 seconds. What is the length of the other train?",
            "Q12. A goods train runs at the speed of 72 kmph and crosses a 250 m long platform in 26 seconds. What is the length of the goods train?",
            "Q13. Two trains, each 100 m long, moving in opposite directions, cross each other in 8 seconds. If one is moving twice as fast the other, then the speed of the faster train is:",
            "Q14. Two trains 140 m and 160 m long run at the speed of 60 km/hr and 40 km/hr respectively in opposite directions on parallel tracks. The time (in seconds) which they take to cross each other, is:",
            "Q15. A train 110 metres long is running with a speed of 60 kmph. In what time will it pass a man who is running at 6 kmph in the direction opposite to that in which the train is going?",
            "Q16. A train travelling at a speed of 75 mph enters a tunnel 3(1/2) miles long. The train is 1/4 mile long. How long does it take for the train to pass through the tunnel from the moment the front enters to the moment the rear emerges?",
            "Q17. A train 800 metres long is running at a speed of 78 km/hr. If it crosses a tunnel in 1 minute, then the length of the tunnel (in meters) is",
            "Q18. A 300 metre long train crosses a platform in 39 seconds while it crosses a signal pole in 18 seconds. What is the length of the platform?",
            "Q19. A train speeds past a pole in 15 seconds and a platform 100 m long in 25 seconds. Its length is:",
            "Q20. A train moves past a telegraph post and a bridge 264 m long in 8 seconds and 20 seconds respectively. What is the speed of the train?"

    };
    public static String choices[][]={
            {"120 metres","180 metres","324 metres","150 metres"},
            {"45 km/hr","50 km/hr","54 km/hr","55 km/hr"},
            {"200 m","225 m","245 m","250 m"},
            {"1 : 3","3 : 2","3 : 4","None of these"},
            {"120 m","240 m","300 m","None of these"},
            {"65 sec","89 sec","100 sec","150 sec"},
            {"50 m","72 m","80 m","82 m"},
            {"40 sec","42 sec","45 sec","48 sec"},
            {"36","45","48","49"},
            {"3.6 sec","18 sec","36 sec","72 sec"},
            {"230 m","240 m","260 m","320 m"},
            {"230 m","240 m","260 m","270 m"},
            {"30 km/hr","45 km/hr","60 km/hr","75 km/hr"},
            {"9","9.6","10","10.8"},
            {"5 sec","6 sec","7 sec","10 sec"},
            {"2.5 min","3 min","3.2 min","3.5 min"},
            {"130","360","500","540"},
            {"320 m","350 m","650 m","Data inadequate"},
            {"50 m","150 m","200 m","Data inadequate"},
            {"69.5 km/hr","70 km/hr","79 km/hr","79.2 km/hr"}

    };
    public static String correctAnswer[]={
            "150 metres",
            "50 km/hr",
            "245 m",
            "3 : 2",
            "240 m",
            "89 sec",
            "50 m",
            "40 sec",
            "48",
            "36 sec",
            "230 m",
            "270 m",
            "60 km/hr",
            "10.8",
            "6 sec",
            "3 min",
            "500",
            "350 m",
            "150 m",
            "79.2 km/hr"

    };
    public static String desAns[]={
            "Speed =(60 * 5/18)m/sec\n"+
            "=(50/3)m/sec\n"+
            "Length of the train = (Speed x Time).\n"+
            " Length of the train = (50/3 * 9)m = 150 m \n",

            "Speed of the train relative to man = (125/10) m/sc\n"+
            " = 25/2 m/sec\n"+
            "=(25/2 * 18/5) km/hr\n"+
            "= 45 km/hr.\n" +
                    "\n" +
                    "Let the speed of the train be x km/hr. Then, relative speed = (x - 5) km/hr.\n" +
                    "\n" +
                    " x - 5 = 45 \n"+
                    "x = 50 km/hr.\n",

            "Speed = (45 * 5/18)m/sec = (25/2) m/sec\n"+
            "Time = 30 sec.\n" +
                    "\n" +
                    "Let the length of bridge be x metres.\n" +
                    "\n" +
                    "Then, (130 + x)/30 = 25/2\n"+
            "2(130 + x) = 750\n" +
                    "\n" +
                    " x = 245 m.\n",

            "Let the speeds of the two trains be x m/sec and y m/sec respectively.\n" +
                    "\n" +
                    "Then, length of the first train = 27x metres,\n" +
                    "\n" +
                    "and length of the second train = 17y metres.\n"+
            "(27x+17y)/(x+y) = 23\n"+
            "27x + 17y = 23x + 23y\n" +
                    "\n" +
                    " 4x = 6y\n"+
            "x/y = 3/2\n",

            "Speed = (54 * 5/18) m/sec = 15 m/sec\n"+
            "Length of the train = (15 x 20)m = 300 m.\n" +
                    "\n" +
                    "Let the length of the platform be x metres.\n" +
                    "\n" +
                    "Then, (x + 300)/36 = 15\n"+
            "x + 300 = 540\n" +
                    "\n" +
                    " x = 240 m\n",

            "Speed = (240/24) m/sec = 10 m/sec\n"+
            "Required time = (240+650)/10 sec = 89 sec\n",

            "Let the length of each train be x metres.\n" +
                    "\n" +
                    "Then, distance covered = 2x metres.\n" +
                    "\n" +
                    "Relative speed = (46 - 36) km/hr"+
            "=(10 * 5/18) m/sec\n"+
            "(25/9) m/sec\n"+
            "2x / 36 = 25 / 9 \n"+
            "2x = 100\n" +
                    "\n" +
                    " x = 50\n",

            "Formula for converting from km/hr to m/s:   X km/hr = (x * 5/18) m/s\n"+
            "Therefore, Speed = (45 * 5/18) m/sec = 25/2 m/sec\n"+
                    "Total distance to be covered = (360 + 140) m = 500 m.\n" +
                    "\n" +
                    "Formula for finding Time = (Distance / Speed)\n"+
            "Required time =(500*2/25) sec = 40 sec\n",

            "Relative speed = (60+ 90) km/hr\n" +
                    "\n" +
                    "   =(150 * 5/18) m/sec\n"+
            "(125/3) m/sec\n"+
            "Distance covered = (1.10 + 0.9) km = 2 km = 2000 m.\n" +
                    "\n" +
                    "Required time =(2000 * 3/125) sec = 48 sec\n",

            "Speed of train relative to jogger = (45 - 9) km/hr = 36 km/hr.\n"+
            "(36 * 5/18) m/sec\n"+
            "= 10 m/sec.\n" +
                    "\n" +
                    "Distance to be covered = (240 + 120) m = 360 m.\n" +
                    "\n" +
                    " Time taken = (360/10)sec = 36 sec\n",

            "Relative speed = (120 + 80) km/hr\n"+
            "(200 * 5/18) m/sec\n"+
            "(500/9) m/sec\n"+
            "Let the length of the other train be x metres.\n" +
                    "\n" +
                    "Then, (x + 270)/9 = 500 / 9\n"+
            " x + 270 = 500\n" +
                    "\n" +
                    " x = 230.\n",

            "Speed =(72 * 5/18) m/sec = 20 m/sec\n"+
            "Time = 26 sec.\n" +
                    "\n" +
                    "Let the length of the train be x metres.\n" +
                    "\n" +
                    "Then, (x+250)/26 = 20\n"+
            "x + 250 = 520\n" +
                    "\n" +
                    " x = 270.\n",

            "Let the speed of the slower train be x m/sec.\n" +
                    "\n" +
                    "Then, speed of the faster train = 2x m/sec.\n" +
                    "\n" +
                    "Relative speed = (x + 2x) m/sec = 3x m/sec\n"+
            "(100+100)/8 = 3x\n"+
            "24x = 200\n"+
            "x = 25/3\n"+
            "So, speed of the faster train = (50/3) m/sec\n"+
            "(50/3 * 18/5) km/hr\n"+
            "60 km/hr\n",

            "Relative speed = (60 + 40) km/hr \n"+
            "=( 100 * 5/18) m/sec = (250/9) m/sec\n"+
            "Distance covered in crossing each other = (140 + 160) m = 300 m.\n" +
                    "\n" +
                    "Required time =(300 * 9/250) sec\n"+
            "= 54/5 sec = 10.8 sec\n",

            "Speed of train relative to man = (60 + 6) km/hr = 66 km/hr.\n" +
                    "\n" +
                    "   =(66 * 5/18) m/sec\n"+
            "= (55/3) m/sec\n"+
            "Time taken to pass the man =(110 * 3/55) sec = 6 sec\n",

            "\n" +
                    "Total distance covered\t\n" +
                    "= ( 7/2 + 1/4) miles\n"+
            "= 15/4 miles\n"+
            "Time Taken= (15/4*75) hrs = 1/20 hrs\n"+
            "=(1/20 * 60) min\n"+
            "= 3 min\n",

            "Speed = (78*5/18) m/sec = (65/3) m/sec\n"+
            "Time = 1 minute = 60 seconds.\n" +
                    "\n" +
                    "Let the length of the tunnel be x metres.\n" +
                    "\n" +
                    "Then,(800+x)/60 = 65/3\n"+
            "=>3(800 + x) = 3900\n" +
                    "\n" +
                    "=> x = 500.\n",

            "Speed =(300/18) m/sec = (50/3) m/sec\n"+
            "Let the length of the platform be x metres.\n" +
                    "\n" +
                    "Then, (x+300)39 = 50/3\n"+
            "=>3(x + 300) = 1950\n" +
                    "\n" +
                    "=> x = 350 m.\n",

            "Let the length of the train be x metres and its speed by y m/sec.\n" +
                    "\n" +
                    "Then, x/y = 15 => y = x/15\n"+
            "x+100/25 = x/15\n"+
            "=>15(x + 100) = 25x\n" +
                    "\n" +
                    "=> 15x + 1500 = 25x\n" +
                    "\n" +
                    "=> 1500 = 10x\n" +
                    "\n" +
                    "=> x = 150 m\n",

            "Let the length of the train be x metres and its speed by y m/sec.\n" +
                    "\n" +
                    "Then, x/y = 8 => x = 8y\n"+
                    "Now, (x+264)/20 = y\n"+
                    "8y + 264 = 20y\n" +
                    "\n" +
                    "=> y = 22.\n" +
                    "\n" +
                    "Therefore Speed = 22 m/sec =(22 * 18/5) km/hr = 79.2 km/hr\n"
    };
}
