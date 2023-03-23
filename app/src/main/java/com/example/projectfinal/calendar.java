package com.example.projectfinal;

public class calendar {
    public static String question[] ={
            "Q1. It was Sunday on Jan 1, 2006. What was the day of the week Jan 1, 2010?",
            "Q2. What was the day of the week on 28th May, 2006?",
            "Q3. What was the day of the week on 17th June, 1998?",
            "Q4. What will be the day of the week 15th August, 2010?",
            "Q5. Today is Monday. After 61 days, it will be:",
            "Q6. If 6th March, 2005 is Monday, what was the day of the week on 6th March, 2004?",
            "Q7. On what dates of April, 2001 did Wednesday fall?",
            "Q8. How many days are there in x weeks x days?",
            "Q9. The last day of a century cannot be",
            "Q10. On 8th Feb, 2005 it was Tuesday. What was the day of the week on 8th Feb, 2004?",
            "Q11. The calendar for the year 2007 will be the same for the year:",
            "Q12. Which of the following is not a leap year?",
            "Q13. On 8th Dec, 2007 Saturday falls. What day of the week was it on 8th Dec, 2006?",
            "Q14. January 1, 2008 is Tuesday. What day of the week lies on Jan 1, 2009?",
            "Q15. January 1, 2007 was Monday. What day of the week lies on Jan. 1, 2008?",
            "Q16. An accurate clock shows 8 o'clock in the morning. Through how may degrees will the hour hand rotate when the clock shows 2 o'clock in the afternoon?",
            "Q17. The reflex angle between the hands of a clock at 10.25 is:",
            "Q18. A clock is started at noon. By 10 minutes past 5, the hour hand has turned through:",
            "Q19. A watch which gains 5 seconds in 3 minutes was set right at 7 a.m. In the afternoon of the same day, when the watch indicated quarter past 4 o'clock, the true time is:",
            "Q20. How much does a watch lose per day, if its hands coincide every 64 minutes?",
            "Q21. The angle between the minute hand and the hour hand of a clock when the time is 4.20, is:",
            "Q22. At what angle the hands of a clock are inclined at 15 minutes past 5?",
            "Q23. At 3:40, the hour hand and the minute hand of a clock form an angle of:",
            "Q24. How many times are the hands of a clock at right angle in a day?",
            "Q25. The angle between the minute hand and the hour hand of a clock when the time is 8.30, is:",
            "Q26. How many times in a day, are the hands of a clock in straight line but opposite in direction?",
            "Q27. How many times do the hands of a clock coincide in a day?",
            "Q28. How many times in a day, the hands of a clock are straight?",
            "Q29. A watch which gains uniformly is 2 minutes low at noon on Monday and is 4 min. 48 sec fast at 2 p.m. on the following Monday. When was it correct?"
    };
    public static String choices[][]={
            {"Sunday","Saturday","Friday","Wednesday"},
            {"Thursday","Friday","Saturday","Sunday"},
            {"Monday","Tuesday","Wednesday","Thursday"},
            {"Sunday","Monday","Tuesday","Friday"},
            {"Wednesday","Saturday","Tuesday","Thursday"},
            {"Sunday","Saturday","Tuesday","Wednesday"},
            {"1st, 8th, 15th, 22nd, 29th","2nd, 9th, 16th, 23rd, 30th","3rd, 10th, 17th, 24th","4th, 11th, 18th, 25th"},
            {"7x^2","8x","14x","7"},
            {"Monday","Wednesday","Tuesday","Friday"},
            {"Tuesday","Monday","Sunday","Wednesday"},
            {"2014","2016","2017","2018"},
            {"700","800","1200","2000"},
            {"Sunday","Thursday","Tuesday","Friday"},
            {"Monday","Wednesday","Thursday","Sunday"},
            {"Monday","Tuesday","Wednesday","Sunday"},
            {"144°","150°","168°","180°"},
            {"180°","192(1/2)°","195°","197(1/2)°"},
            {"145°","150°","155°","160°"},
            {"59(7/12) min. past 3","4 p.m.","58(7/11) min. past 3","2(3/11) min. past 4"},
            {"32(8/11)min","36(5/11)min","90 min.","96 min."},
            {"0°","10°","5°","20°"},
            {"58(1/2)°","64°","67(1/2)°","72(1/2)°"},
            {"120°","125°","130°","135°"},
            {"22","24","44","48"},
            {"80°","75°","60°","105°"},
            {"20","22","24","48"},
            {"20","21","22","24"},
            {"22","24","44","48"},
            {"2 p.m. on Tuesday","2 p.m. on Wednesday","3 p.m. on Thursday","1 p.m. on Friday"}
    };
    public static String correctAnswer[]={
            "Friday",
            "Sunday",
            "Wednesday",
            "Sunday",
            "Saturday",
            "Sunday",
            "4th, 11th, 18th, 25th",
            "8x",
            "Tuesday",
            "Sunday",
            "2018",
            "700",
            "Friday",
            "Thursday",
            "Tuesday",
            "180°",
            "197(1/2)°",
            "155°",
            "4 p.m.",
            "32(8/11)min",
            "10°",
            "67(1/2)°",
            "130°",
            "44",
            "75°",
            "22",
            "22",
            "44",
            "2 p.m. on Wednesday"
    };

    public static String desAns[]={
            "On 31st December, 2005 it was Saturday.\n" +
                    "\n" +
                    "Number of odd days from the year 2006 to the year 2009 = (1 + 1 + 2 + 1) = 5 days.\n" +
                    "\n" +
                    " On 31st December 2009, it was Thursday.\n" +
                    "\n" +
                    "Thus, on 1st Jan, 2010 it is Friday.\n",
            "28 May, 2006 = (2005 years + Period from 1.1.2006 to 28.5.2006)\n" +
                    "\n" +
                    "Odd days in 1600 years = 0\n" +
                    "\n" +
                    "Odd days in 400 years = 0\n" +
                    "\n" +
                    "5 years = (4 ordinary years + 1 leap year) = (4 x 1 + 1 x 2)  6 odd days\n" +
                    "\n" +
                    "Jan. Feb. March April May (31 + 28 + 31 + 30 + 28 ) = 148 days\n" +
                    " 148 days = (21 weeks + 1 day)  1 odd day.\n" +
                    "\n" +
                    "Total number of odd days = (0 + 0 + 6 + 1) = 7  0 odd day.\n" +
                    "\n" +
                    "Given day is Sunday\n",
            "17th June, 1998 = (1997 years + Period from 1.1.1998 to 17.6.1998)\n" +
                    "\n" +
                    "Odd days in 1600 years = 0\n" +
                    "\n" +
                    "Odd days in 300 years = (5 x 3)  1\n" +
                    "\n" +
                    "97 years has 24 leap years + 73 ordinary years.\n" +
                    "\n" +
                    "Number of odd days in 97 years ( 24 x 2 + 73) = 121 = 2 odd days.\n" +
                    "\n" +
                    "Jan. Feb. March April May June (31 + 28 + 31 + 30 + 31 + 17) = 168 days\n" +
                    " 168 days = 24 weeks = 0 odd day.\n" +
                    "\n" +
                    "Total number of odd days = (0 + 1 + 2 + 0) = 3.\n" +
                    "\n" +
                    "Given day is Wednesday.\n",
            "15th August, 2010 = (2009 years + Period 1.1.2010 to 15.8.2010)\n" +
                    "\n" +
                    "Odd days in 1600 years = 0\n" +
                    "\n" +
                    "Odd days in 400 years = 0\n" +
                    "\n" +
                    "9 years = (2 leap years + 7 ordinary years) = (2 x 2 + 7 x 1) = 11 odd days  4 odd days.\n" +
                    "\n" +
                    "Jan. Feb. March April May June July Aug. (31 + 28 + 31 + 30 + 31 + 30 + 31 + 15) = 227 days\n" +
                    " 227 days = (32 weeks + 3 days)  3 odd days.\n" +
                    "\n" +
                    "Total number of odd days = (0 + 0 + 4 + 3) = 7  0 odd days.\n" +
                    "\n" +
                    "Given day is Sunday.\n",
            "Each day of the week is repeated after 7 days.\n" +
                    "\n" +
                    "So, after 63 days, it will be Monday.\n" +
                    "\n" +
                    " After 61 days, it will be Saturday.\n",
            "The year 2004 is a leap year. So, it has 2 odd days.\n" +
                    "\n" +
                    "But, Feb 2004 not included because we are calculating from March 2004 to March 2005. So it has 1 odd day only.\n" +
                    "\n" +
                    " The day on 6th March, 2005 will be 1 day beyond the day on 6th March, 2004.\n" +
                    "\n" +
                    "Given that, 6th March, 2005 is Monday.\n" +
                    "\n" +
                    " 6th March, 2004 is Sunday (1 day before to 6th March, 2005).\n",
            "We shall find the day on 1st April, 2001.\n" +
                    "1st April, 2001 = (2000 years + Period from 1.1.2001 to 1.4.2001)\n" +
                    "\n" +
                    "Odd days in 1600 years = 0\n" +
                    "\n" +
                    "Odd days in 400 years = 0\n" +
                    "\n" +
                    "Jan. Feb. March April\n" +
                    "(31 + 28 + 31 + 1)     = 91 days  0 odd days.\n" +
                    "\n" +
                    "Total number of odd days = (0 + 0 + 0) = 0\n" +
                    "\n" +
                    "On 1st April, 2001 it was Sunday.\n" +
                    "\n" +
                    "In April, 2001 Wednesday falls on 4th, 11th, 18th and 25th\n",
            "x weeks x days = (7x + x) days = 8x days\n",
            "100 years contain 5 odd days.\n" +
                    "\n" +
                    " Last day of 1st century is Friday.\n" +
                    "\n" +
                    "200 years contain (5 x 2)  3 odd days.\n" +
                    "\n" +
                    " Last day of 2nd century is Wednesday.\n" +
                    "\n" +
                    "300 years contain (5 x 3) = 15  1 odd day.\n" +
                    "\n" +
                    " Last day of 3rd century is Monday.\n" +
                    "\n" +
                    "400 years contain 0 odd day.\n" +
                    "\n" +
                    " Last day of 4th century is Sunday.\n" +
                    "\n" +
                    "This cycle is repeated.\n" +
                    "\n" +
                    " Last day of a century cannot be Tuesday or Thursday or Saturday.\n",
            "The year 2004 is a leap year. It has 2 odd days.\n" +
                    "\n" +
                    " The day on 8th Feb, 2004 is 2 days before the day on 8th Feb, 2005.\n" +
                    "\n" +
                    "Hence, this day is Sunday.\n",
            "Count the number of odd days from the year 2007 onwards to get the sum equal to 0 odd day.\n" +
                    "\n" +
                    "Year : 2007 2008 2009 2010 2011 2012 2013 2014 2015 2016 2017 Odd day : 1 2 1 1 1 2 1 1 1 2 1\n" +
                    "Sum = 14 odd days  0 odd days.\n" +
                    "\n" +
                    " Calendar for the year 2018 will be the same as for the year 2007.\n",
            "The century divisible by 400 is a leap year.\n" +
                    "\n" +
                    " The year 700 is not a leap year.\n",
            "The year 2006 is an ordinary year. So, it has 1 odd day.\n" +
                    "\n" +
                    "So, the day on 8th Dec, 2007 will be 1 day beyond the day on 8th Dec, 2006.\n" +
                    "\n" +
                    "But, 8th Dec, 2007 is Saturday.\n" +
                    "\n" +
                    " 8th Dec, 2006 is Friday.\n",
            "The year 2008 is a leap year. So, it has 2 odd days.\n" +
                    "\n" +
                    "1st day of the year 2008 is Tuesday (Given)\n" +
                    "\n" +
                    "So, 1st day of the year 2009 is 2 days beyond Tuesday.\n" +
                    "\n" +
                    "Hence, it will be Thursday.\n",
            "The year 2007 is an ordinary year. So, it has 1 odd day.\n" +
                    "\n" +
                    "1st day of the year 2007 was Monday.\n" +
                    "\n" +
                    "1st day of the year 2008 will be 1 day beyond Monday.\n" +
                    "\n" +
                    "Hence, it will be Tuesday.\n",
            "Angle traced by the hour hand in 6 hours = (360/12 * 6)° = 180°\n",

            "Angle traced by hour hand in 125/12 hrs = (360/12 * 125/12)°\n"+
            "= 312(1/2)°\n"+
            "Angle traced by minute hand in 25 min = (360 /60 * 25)° = 150° \n"+
            "Reflex angle = 360° - (312(1/2) - 150)° = 360° - 162(1/2)° = 197(1/2)° \n",

            "Angle traced by hour hand in 12 hrs = 360°.\n" +
                    "\n" +
                    "Angle traced by hour hand in 5 hrs 10 min. i.e., 31/6 hrs \n"+
                    "(360/12 * 31/6)° = 155°\n",
            "Time from 7 a.m. to 4.15 p.m. = 9 hrs 15 min. = 37 / 4 hrs\n"+
            "3 min. 5 sec. of this clock = 3 min. of the correct clock.\n"+
            "37/720 hrs of this clock = 1/20 hrs of the correct clock.\n"+
            "37/4 hrs of this clock = (1/20 * 720/37 * 37/4) hrs of the correct clock\n"+
            "= 9 hrs of the correct clock.\n" +
                    "\n" +
                    " The correct time is 9 hrs after 7 a.m. i.e., 4 p.m.\n",
            "55 min. spaces are covered in 60 min.\n" +
                    "\n" +
                    "60 min. spaces are covered in\t(60/55 * 60) min = 65(5/11) min\n"+
            "Loss in 64 min. = 65(5/11)-64 = 16/11 min\n"+
            "Loss in 24 hrs = (16/11 * 1/64 * 24 * 60 ) min = 32(8/11) min\n",
            "Angle traced by hour hand in 13/3 hrs = (360/12 * 13/3)° = 130°\n"+
            "Angle traced by min. hand in 20 min. = (360/60 * 20)° = 120°\n"+
            "Required angle = (130 - 120)° = 10°.",
            "Angle traced by hour hand in 21/4 hrs = (360/12 * 21/4)° = 157(1/2)°\n"+
            "Angle traced by min. hand in 15 min. = (360/60 * 15)° = 90°\n"+
            "Required angle = 157(1/2)° - 90° = 67(1/2)° \n",
            "Angle traced by hour hand in 12 hrs. = 360°.\n" +
                    "\n" +
                    "Angle traced by it in 11/3 hrs = (360/12 * 11/3)° = 110°\n"+
            "Angle traced by minute hand in 60 min. = 360°.\n" +
                    "Angle traced by it in 40 min. = (360/60 * 40)° = 240°\n"+
            "Required angle (240 - 110)° = 130°.\n",
            "In 12 hours, they are at right angles 22 times.\n" +
                    "\n" +
                    " In 24 hours, they are at right angles 44 times.\n",
            "Angle traced by hour hand in 17/2 hrs = (360/12 * 17/2)° = 255°\n"+
            "Angle traced by min. hand in 30 min. = (360/60 * 30)° = 180°\n"+
            "Required angle = (255 - 180)° = 75°.\n" +
                    "\n",
            "The hands of a clock point in opposite directions (in the same straight line) 11 times in every 12 hours. (Because between 5 and 7 they point in opposite directions at 6 o'clcok only).\n" +
                    "\n" +
                    "So, in a day, the hands point in the opposite directions 22 times.",
            "The hands of a clock coincide 11 times in every 12 hours (Since between 11 and 1, they coincide only once, i.e., at 12 o'clock).\n" +
                    "\n" +
                    "AM\n" +
                    "\n" +
                    "12:00\n" +
                    "1:05\n" +
                    "2:11\n" +
                    "3:16\n" +
                    "4:22\n" +
                    "5:27\n" +
                    "6:33\n" +
                    "7:38\n" +
                    "8:44\n" +
                    "9:49\n" +
                    "10:55\n" +
                    "\n" +
                    "\n" +
                    "PM\n" +
                    "\n" +
                    "12:00\n" +
                    "1:05\n" +
                    "2:11\n" +
                    "3:16\n" +
                    "4:22\n" +
                    "5:27\n" +
                    "6:33\n" +
                    "7:38\n" +
                    "8:44\n" +
                    "9:49\n" +
                    "10:55\n" +
                    "\n" +
                    "The hands overlap about every 65 minutes, not every 60 minutes.\n" +
                    "\n" +
                    " The hands coincide 22 times in a day.\n",
            "In 12 hours, the hands coincide or are in opposite direction 22 times.\n" +
                    "\n" +
                    " In 24 hours, the hands coincide or are in opposite direction 44 times a day.\n",
            "Time from 12 p.m. on Monday to 2 p.m. on the following Monday = 7 days 2 hours = 170 hours.\n" +
                    "\n" +
                    " The watch gains { 2 + 4(4/5) }min or 34/5 min in 170 hrs\n"+
                    "Now 34/5 min. are gained in 170 hrs.\n"+
                    " 2 min. are gained in\t (170 * 5/34 * 2)hrs = 50 hrs\n "+
                    "Watch is correct 2 days 2 hrs. after 12 p.m. on Monday i.e., it will be correct at 2 p.m. on Wednesday.\n"
    };
}
