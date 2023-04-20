package com.example.projectfinal;

public class questionAnswer {
public static String question[] ={
        "Q1. A person crosses a 600 m long street in 5 minutes. What is his speed in km per hour?",
        "Q2. If a person walks at 14 km/hr instead of 10 km/hr, he would have walked 20 km more. The actual distance travelled by him is:",
        "Q3. A train can travel 50% faster than a car. Both start from point A at the same time and reach point B 75 kms away from A at the same time. On the way, however, the train lost about 12.5 minutes while stopping at the stations. The speed of the car is:",
        "Q4. Excluding stoppages, the speed of a bus is 54 kmph and including stoppages, it is 45 kmph. For how many minutes does the bus stop per hour?",
        "Q5. In a flight of 600 km, an aircraft was slowed down due to bad weather. Its average speed for the trip was reduced by 200 km/hr and the time of flight increased by 30 minutes. The duration of the flight is:",
        "Q6. A man complete a journey in 10 hours. He travels first half of the journey at the rate of 21 km/hr and second half at the rate of 24 km/hr. Find the total journey in km.",
        "Q7. The ratio between the speeds of two trains is 7 : 8. If the second train runs 400 km in 4 hours, then the speed of the first train is:",
        "Q8. A man on tour travels first 160 km at 64 km/hr and the next 160 km at 80 km/hr. The average speed for the first 320 km of the tour is:",
        "Q9. A car travelling with 5/7 of its actual speed covers 42 km in 1 hr 40 min 48 sec. Find the actual speed of the car.",
        "Q10. In covering a distance of 30 km, Abhay takes 2 hours more than Sameer. If Abhay doubles his speed, then he would take 1 hour less than Sameer. Abhay's speed is:",
        "Q11. Robert is travelling on his cycle and has calculated to reach point A at 2 P.M. if he travels at 10 kmph, he will reach there at 12 noon if he travels at 15 kmph. At what speed must he travel to reach A at 1 P.M.?",
        "Q12. It takes eight hours for a 600 km journey, if 120 km is done by train and the rest by car. It takes 20 minutes more, if 200 km is done by train and the rest by car. The ratio of the speed of the train to that of the cars is:",
        "Q13. A farmer travelled a distance of 61 km in 9 hours. He travelled partly on foot @ 4 km/hr and partly on bicycle @ 9 km/hr. The distance travelled on foot is:",
        "Q14. A man covered a certain distance at some speed. Had he moved 3 kmph faster, he would have taken 40 minutes less. If he had moved 2 kmph slower, he would have taken 40 minutes more. The distance (in km) is:",
        "Q15. Two ships are sailing in the sea on the two sides of a lighthouse. The angle of elevation of the top of the lighthouse is observed from the ships are 30° and 45° respectively. If the lighthouse is 100 m high, the distance between the two ships is:",
        "Q16. A man standing at a point P is watching the top of a tower, which makes an angle of elevation of 30° with the man's eye. The man walks some distance towards the tower to watch its top and the angle of the elevation becomes 60°. What is the distance between the base of the tower and the point P?",
        "Q17. The angle of elevation of a ladder leaning against a wall is 60° and the foot of the ladder is 4.6 m away from the wall. The length of the ladder is:",
        "Q18. An observer 1.6 m tall is 20√3 away from a tower. The angle of elevation from his eye to the top of the tower is 30°. The height of the tower is:",
        "Q19. From a point P on a level ground, the angle of elevation of the top tower is 30°. If the tower is 100 m high, the distance of point P from the foot of the tower is:",
        "Q20. The angle of elevation of the sun, when the length of the shadow of a tree √3 times the height of the tree, is:"

};
public static String choices[][]={
        {"3.6","7.2","8.4","10"},
        {"50 km","56 km","70 km","80 km"},
        {"100 kmph","110 kmph","120 kmph","130 kmph"},
        {"9","10","12","20"},
        {"1 hour","2 hour","3 hour","4 hour"},
        {"220 km","224 km","230 km","234 km"},
        {"70 km/hr","75 km/hr","84 km/hr","87.5 km/hr"},
        {"35.55 km/hr","36 km/hr","71.11 km/hr","71 km/hr"},
        {"17(6/7) km/hr","25 km/hr","30 km/hr","35 km/hr"},
        {"5 kmph","6 kmph","6.25 kmph","7.5 kmph"},
        {"8 kmph","11 kmph","12 kmph","14 kmph"},
        {"2 : 3","3 : 2","3 : 4","4 : 3"},
        {"14 km","15 km","16 km","17 km"},
        {"35","36(2/3)","37(1/2)","40"},
        {"173 m","200 m","273 m","300 m"},
        {"4√3 units","8 units","12 units","Data inadequate"},
        {"2.3 m","4.6 m","7.8 m","9.2 m"},
        {"21.6 m","23.2 m","24.72 m","None of these"},
        {"149 m","156 m","173 m","200 m"},
        {"30°","45°","60°","90°"}


};
    public static String correctAnswer[]={
            "7.2",
            "50 km",
            "120 kmph",
            "10",
            "1 hour",
            "224 km",
            "87.5 km/hr",
            "71.11 km/hr",
            "35 km/hr",
            "5 kmph",
            "12 kmph",
            "3 : 4",
            "16 km",
            "40",
            "273 m",
            "Data inadequate",
            "9.2 m",
            "21.6 m",
            "173 m",
            "30°"

    };
    public static String desAns[]={
            "Speed = {600/(5*60)}m/sec\n"+
                    "= 2 m/sec.\n" +
                    "\n" +
                    "Converting m/sec to km/hr (see important formulas section)\n" +
                    "(2*18/5)km/hr\n"+
            "7.2 km/hr\n",

            "Let the actual distance travelled be x km.\n" +
                    "\n" +
                    "Then, x/10 = x+20/14 \n"+
            "14x = 10x + 200\n" +
                    "\n" +
                    " 4x = 200\n" +
                    "\n" +
                    " x = 50 km.\n",

            "Let speed of the car be x kmph.\n" +
                    "\n" +
                    "Then, speed of the train = 150/100 x\n"+
            "(3/2*x)kmph\n"+
            "75/x - 75/(3/2)x = 125/(10*60)\n"+
            "75/x - 50/x = 5/24\n"+
            "x = (25*24)/5 = 120 kmph\n",

            "Due to stoppages, it covers 9 km less.\n" +
                    "\n" +
                    "Time taken to cover 9 km = (9/54)*60 min = 10 min\n",

            "Let the duration of the flight be x hours.\n" +
                    "\n" +
                    "Then, 600/x - 600/x+(1/2) = 200\n"
            +"600/x - 1200/2x+1 = 200\n"+
            "x(2x + 1) = 3\n" +
                    "\n" +
                    " 2x^2 + x - 3 = 0\n" +
                    "\n" +
                    " (2x + 3)(x - 1) = 0\n" +
                    "\n" +
                    " x = 1 hr.  \n",

            "(1/2)x/21 + (1/2)x/24 = 10\n"+
            "x/21 + x/24 = 20\n"+
            "15x = 168 x 20\n"+
            "x = (168*20 / 15) = 224 km\n",

            "Let the speed of two trains be 7x and 8x km/hr.\n" +
                    "\n" +
                    "Then, 8x = 400/4 = 100\n"+
            "x = 100/8 = 12.5\n"+
            "Speed of first train = (7 x 12.5) km/hr = 87.5 km/hr.\n",

            "Total time taken = (160/64 + 160/80) hrs\n"+
            "9/2 hrs\n"+
            "Average speed = (320 * 2/9) km/hr\n"+
            "71.11 km/hr\n",

            "Time taken = 1 hr 40 min 48 sec = 1 hr 40(4/5)min\n"+
            "1(51/75) hrs = 126/75 hrs\n"+
            "Let the actual speed be x km/hr.\n" +
                    "\n" +
                    "Then, 5/7x * 126/75 = 42\n"+
            "x = (42 * 7 * 75)/(5 * 126) = 35 km/hr \n",

            "Let Abhay's speed be x km/hr.\n" +
                    "\n" +
                    "Then, 30/x - 30/2x = 3\n"+
            "6x = 30\n" +
                    "\n" +
                    " x = 5 km/hr.\n",

            "Let the distance travelled by x km.\n" +
                    "\n" +
                    "Then, x/10 - x/15 = 2\n "+
            "3x - 2x = 60\n" +
                    "\n" +
                    " x = 60 km.\n" +
                    "\n" +
                    "Time taken to travel 60 km at 10 km/hr = 60/10 hrs = 6hrs\n"+
            "So, Robert started 6 hours before 2 P.M. i.e., at 8 A.M.\n" +
                    "\n" +
                    " Required speed = 60/5 kmph = 12 kmph\n",
            "Let the speed of the train be x km/hr and that of the car be y km/hr.\n" +
                    "\n" +
                    "Then, 120/x + 480/y = 8 \n"+
            "1/x + 4/y = 1/15 ....(i)\n"+
            "And, 200/x + 400/y = 25/3 \n"+
            "1/x + 2/y = 1/24 ...(ii)\n"+
            "Solving (i) and (ii), we get: x = 60 and y = 80.\n" +
                    "\n" +
                    " Ratio of speeds = 60 : 80 = 3 : 4.\n",

            "Let the distance travelled on foot be x km.\n" +
                    "\n" +
                    "Then, distance travelled on bicycle = (61 -x) km.\n" +
                    "\n" +
                    "So, x/4 + (61 - x)/9 = 9\n"
            +" 9x + 4(61 -x) = 9 x 36\n" +
                    "\n" +
                    " 5x = 80\n" +
                    "\n" +
                    " x = 16 km.\n",
            "Let distance = x km and usual rate = y kmph.\n" +
                    "\n" +
                    "Then, x/y - x/(y+3) = 40/60 \n"+
            "2y (y+3) = 9x ...(i)\n"+
            "And, x/(y-2) - x/y = 40/60\n"+
            "y(y-2) = 3x ...(ii)\n"+
            "On dividing (i) by (ii), we get: x = 40.\n",


            "273 m",
            "Data inadequate",
            "Let AB be the wall and BC be the ladder.\n"+
            "Then, ACB = 60° and AC = 4.6 m.\n"+
            "AC/BC = cos 60° = 1/2\n"+
            " BC\t= 2 x AC\n" +
                    "= (2 x 4.6) m\n" +
                    "= 9.2 m.\n",

            "Let AB be the observer and CD be the tower.\n"+
            "Draw BE  CD.\n" +
                    "\n" +
                    "Then, CE = AB = 1.6 m,\n" +
                    "\n" +
                    "      BE = AC = 20√3 m.\n"+
            "DE/BE =  tan 30° =1/√3\n"+
            "DE = 20√3/√3 m = 20m\n"+
            "CD = CE + DE = (1.6 + 20) m = 21.6 m.\n",

            "Let AB be the tower.\n"+
            "Then, APB = 30° and AB = 100 m.\n"+
            "AB/AP =  tan 30° = 1/√3\n" +
                    "AP\t= (AB x √3) m\n" +
                    "= 100√3 m\n" +
                    "= (100 x 1.73) m\n" +
                    "= 173 m.\n",
            "30°"
    };


}
