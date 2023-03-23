package com.example.projectfinal;

public class Permutation {
    public static String question[] ={
            "Q1. From a group of 7 men and 6 women, five persons are to be selected to form a committee so that at least 3 men are there on the committee. In how many ways can it be done?",
            "Q2. In how many different ways can the letters of the word 'LEADING' be arranged in such a way that the vowels always come together?",
            "Q3. In how many different ways can the letters of the word 'CORPORATION' be arranged so that the vowels always come together?",
            "Q4. Out of 7 consonants and 4 vowels, how many words of 3 consonants and 2 vowels can be formed?",
            "Q5. In how many ways can the letters of the word 'LEADER' be arranged?",
            "Q6. In a group of 6 boys and 4 girls, four children are to be selected. In how many different ways can they be selected such that at least one boy should be there?",
            "Q7. How many 3-digit numbers can be formed from the digits 2, 3, 5, 6, 7 and 9, which are divisible by 5 and none of the digits is repeated?",
            "Q8. In how many ways a committee, consisting of 5 men and 6 women can be formed from 8 men and 10 women?",
            "Q9. A box contains 2 white balls, 3 black balls and 4 red balls. In how many ways can 3 balls be drawn from the box, if at least one black ball is to be included in the draw?",
            "Q10. In how many different ways can the letters of the word 'DETAIL' be arranged in such a way that the vowels occupy only the odd positions?",
            "Q11. In how many ways can a group of 5 men and 2 women be made out of a total of 7 men and 3 women?",
            "Q12. How many 4-letter words with or without meaning, can be formed out of the letters of the word, 'LOGARITHMS', if repetition of letters is not allowed?",
            "Q13. In how many different ways can the letters of the word 'MATHEMATICS' be arranged so that the vowels always come together?",
            "Q14. In how many different ways can the letters of the word 'OPTICAL' be arranged so that the vowels always come together?"
    };
    public static String choices[][]={
            {"564","645","735","756"},
            {"360","480","720","5040"},
            {"810","1440","2880","50400"},
            {"210","1050","25200","21400"},
            {"72","144","360","720"},
            {"159","194","205","209"},
            {"5","10","15","20"},
            {"266","5040","11760","86400"},
            {"32","48","64","96"},
            {"32","48","36","60"},
            {"63","90","126","45"},
            {"40","400","5040","2520"},
            {"10080","4989600","120960","120970"},
            {"120","720","4320","2160"}
    };
    public static String correctAnswer[]={
            "756",
            "720",
            "50400",
            "25200",
            "360",
            "209",
            "20",
            "11760",
            "64",
            "36",
            "63",
            "5040",
            "120960",
            "720"
    };

    public static String desAns[]= {
            "We may have (3 men and 2 women) or (4 men and 1 woman) or (5 men only).\n" +
                    "\n" +
                    " Required number of ways\t= (7C3 x 6C2) + (7C4 x 6C1) + (7C5)\n "+
            "(7 * 6 * 5/ 3 *2 * 1) x (6 * 5/ 2 * 1) + (7C3 x 6C1) + (7C2)\n"
            +"= 525 + ( 7 * 6 * 5/ 3 * 2 * 1) * 6 + (7 * 6 / 2 * 1) \n"+
            "\t= (525 + 210 + 21)\n" +
                    "= 756\n",
            "The word 'LEADING' has 7 different letters.\n" +
                    "\n" +
                    "When the vowels EAI are always together, they can be supposed to form one letter.\n" +
                    "\n" +
                    "Then, we have to arrange the letters LNDG (EAI).\n" +
                    "\n" +
                    "Now, 5 (4 + 1 = 5) letters can be arranged in 5! = 120 ways.\n" +
                    "\n" +
                    "The vowels (EAI) can be arranged among themselves in 3! = 6 ways.\n" +
                    "\n" +
                    " Required number of ways = (120 x 6) = 720.\n",
            "In the word 'CORPORATION', we treat the vowels OOAIO as one letter.\n" +
                    "\n" +
                    "Thus, we have CRPRTN (OOAIO).\n" +
                    "\n" +
                    "This has 7 (6 + 1) letters of which R occurs 2 times and the rest are different.\n" +
                    "\n" +
                    "Number of ways arranging these letters = 7!/2!= 2520.\n" +
                    "2!\n" +
                    "Now, 5 vowels in which O occurs 3 times and the rest are different, can be arranged in 5!/3!\n" +
                    "\n" +
                    "= 20 ways.\n" +

                    " Required number of ways = (2520 x 20) = 50400.\n",
            "Number of ways of selecting (3 consonants out of 7) and (2 vowels out of 4)\n" +
                    "\n" +
                    "     \t= (7C3 x 4C2)\n" +
                    "= ( 7 * 6 * 5/ 3 * 2 * 1) x (4 * 3/2 * 1) \n"+
            "\t= 210.\n" +
                    "Number of groups, each having 3 consonants and 2 vowels = 210.\n" +
                    "\n" +
                    "Each group contains 5 letters.\n" +
                    "\n" +
                    "Number of ways of arranging 5 letters among themselves\t= 5!"+
            "\t= 5 x 4 x 3 x 2 x 1\n" +
                    "= 120.\n" +
                    " Required number of ways = (210 x 120) = 25200\n",
            "The word 'LEADER' contains 6 letters, namely 1L, 2E, 1A, 1D and 1R.\n" +
                    "\n" +
                    " Required number of ways = 6! / 1! * 2! * 1! * 1! * 1!\n"+"360\n",
            "We may have (1 boy and 3 girls) or (2 boys and 2 girls) or (3 boys and 1 girl) or (4 boys).\n" +
                    "\n" +
                    " Required number\n" +
                    "of ways\t= (6C1 x 4C3) + (6C2 x 4C2) + (6C3 x 4C1) + (6C4)\n" +
                    "= (6C1 x 4C1) + (6C2 x 4C2) + (6C3 x 4C1) + (6C2)\n" +
                    "= (6 x 4) + {(6 * 5 / 2 * 1) x (4 * 3/ 2 * 1) +( 6 * 5 * 4/3 * 2 * 1) x 4 } + ( 6 * 5/2 * 1) \n"+
            "= (24 + 90 + 80 + 15)\n" +
                    "= 209.\n",
            "Since each desired number is divisible by 5, so we must have 5 at the unit place. So, there is 1 way of doing it.\n" +
                    "\n" +
                    "The tens place can now be filled by any of the remaining 5 digits (2, 3, 6, 7, 9). So, there are 5 ways of filling the tens place.\n" +
                    "\n" +
                    "The hundreds place can now be filled by any of the remaining 4 digits. So, there are 4 ways of filling it.\n" +
                    "\n" +
                    " Required number of numbers = (1 x 5 x 4) = 20.\n",
            "Required number of ways\t= (8C5 x 10C6)\n" +
                    "= (8C3 x 10C4)\n"+
                    "= {( 8 * 7 * 6/3 * 2 * 1) x ( 10 * 9 * 8 * 7/ 4 * 3 * 2 * 1)}\n" +
                    "11760 \n",
            "We may have(1 black and 2 non-black) or (2 black and 1 non-black) or (3 black).\n" +
                    "\n" +
                    " Required number of ways\t= (3C1 x 6C2) + (3C2 x 6C1) + (3C3)\n"+
            "= { (3 * 6*5/2*1) + ( 3*2/2*1 * 6) +1} \n"+
            "= (45 + 18 + 1)\n" +
                    "= 64\n",
            "There are 6 letters in the given word, out of which there are 3 vowels and 3 consonants.\n" +
                    "\n" +
                    "Let us mark these positions as under:\n" +
                    "\n" +
                    "(1) (2) (3) (4) (5) (6)\n" +
                    "\n" +
                    "Now, 3 vowels can be placed at any of the three places out 4, marked 1, 3, 5.\n" +
                    "\n" +
                    "Number of ways of arranging the vowels = 3P3 = 3! = 6.\n" +
                    "\n" +
                    "Also, the 3 consonants can be arranged at the remaining 3 positions.\n" +
                    "\n" +
                    "Number of ways of these arrangements = 3P3 = 3! = 6.\n" +
                    "\n" +
                    "Total number of ways = (6 x 6) = 36.\n",
            "Required number of ways = (7C5 x 3C2) = (7C2 x 3C1) \n"+
            " = (7*6/2*1 * 3) = 63\n",
            "'LOGARITHMS' contains 10 different letters.\n" +
                    "\n" +
                    "Required number of words\t= Number of arrangements of 10 letters, taking 4 at a time.\n" +
                    "= 10P4\n" +
                    "= (10 x 9 x 8 x 7)\n" +
                    "= 5040.\n",
            "In the word 'MATHEMATICS', we treat the vowels AEAI as one letter.\n" +
                    "\n" +
                    "Thus, we have MTHMTCS (AEAI).\n" +
                    "\n" +
                    "Now, we have to arrange 8 letters, out of which M occurs twice, T occurs twice and the rest are different.\n" +
                    "\n" +
                    " Number of ways of arranging these letters = 8! / 2! *2! = 10080\n"+
                    " Now, AEAI has 4 letters in which A occurs 2 times and the rest are different.\n" +
                    "\n" +
                    "Number of ways of arranging these letters =4!/2! = 12\n"+
            "Required number of words = (10080 x 12) = 120960\n",
            "The word 'OPTICAL' contains 7 different letters.\n" +
                    "\n" +
                    "When the vowels OIA are always together, they can be supposed to form one letter.\n" +
                    "\n" +
                    "Then, we have to arrange the letters PTCL (OIA).\n" +
                    "\n" +
                    "Now, 5 letters can be arranged in 5! = 120 ways.\n" +
                    "\n" +
                    "The vowels (OIA) can be arranged among themselves in 3! = 6 ways.\n" +
                    "\n" +
                    " Required number of ways = (120 x 6) = 720.\n"
    };
}
