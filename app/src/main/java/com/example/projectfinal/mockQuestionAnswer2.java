package com.example.projectfinal;

public class mockQuestionAnswer2 {
    public static String question[]={
            "Q1.How many times \"Jain\" is get printed?\n"+
            "#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int x;\n" +
                    "    for(x=-1; x<=10; x++)\n" +
                    "    {\n" +
                    "        if(x < 5)\n" +
                    "            continue;\n" +
                    "        else\n" +
                    "            break;\n" +
                    "        printf(\"Jain\");\n" +
                    "    }\n" +
                    "    return 0;\n" +
                    "}\n",
            "Q2. What will be the output of the program?\n" +
                    "#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    char ch;\n" +
                    "    if(ch = printf(\"\"))\n" +
                    "        printf(\"It matters\\n\");\n" +
                    "    else\n" +
                    "        printf(\"It doesn't matters\\n\");\n" +
                    "    return 0;\n" +
                    "}\n",
            "Q3. What will be the output of the program?\n" +
                    "#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int i=2;\n" +
                    "    int j = i + (1, 2, 3, 4, 5);\n" +
                    "    printf(\"%d\\n\", j);\n" +
                    "    return 0;\n" +
                    "}\n",
            "Q4. What will you do to treat the constant 3.14 as a float?",
            "Q5. If a function contains two return statements successively, the compiler will generate warnings. Yes/No ?",
            "Q6. What will be the output of the program?\n" +
                    "#include<stdio.h>\n" +
                    "#define str(x) #x\n" +
                    "#define Xstr(x) str(x)\n" +
                    "#define oper multiply\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "    char *opername = Xstr(oper);\n" +
                    "    printf(\"%s\\n\", opername);\n" +
                    "    return 0;\n" +
                    "}\n",
            "Q7. What will be the output of the program ?\n" +
                    "#include<stdio.h>\n" +
                    "power(int**);\n" +
                    "int main()\n" +
                    "{\n" +
                    "    int a=5, *aa; /* Address of 'a' is 1000 */\n" +
                    "    aa = &a;\n" +
                    "    a = power(&aa);\n" +
                    "    printf(\"%d\\n\", a);\n" +
                    "    return 0;\n" +
                    "}\n" +
                    "power(int **ptr)\n" +
                    "{\n" +
                    "    int b;\n" +
                    "    b = **ptr***ptr;\n" +
                    "    return (b);\n" +
                    "}\n",
            "Q8. Which statement will you add to the following program to ensure that the program outputs \"IndiaBIX\" on execution?\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "    char s[] = \"IndiaBIX\";\n" +
                    "    char t[25];\n" +
                    "    char *ps, *pt;\n" +
                    "    ps = s;\n" +
                    "    pt = t;\n" +
                    "    while(*ps)\n" +
                    "        *pt++ = *ps++;\n" +
                    "\n" +
                    "    /* Add a statement here */\n" +
                    "    printf(\"%s\\n\", t);\n" +
                    "    return 0;\n" +
                    "}\n",
            "Q9. Which of the following statements are correct about an array?\n" +
                    "1:\tThe array int num[26]; can store 26 elements.\n" +
                    "2:\tThe expression num[1] designates the very first element in the array.\n" +
                    "3:\tIt is necessary to initialize the array at the time of declaration.\n" +
                    "4:\tThe declaration num[SIZE] is allowed if SIZE is a macro.\n",
            "Q10. Which of the following statements are correct about the below declarations?\n" +
                    "char *p = \"Sanjay\";\n" +
                    "char a[] = \"Sanjay\";\n" +
                    "1:\tThere is no difference in the declarations and both serve the same purpose.\n" +
                    "2:\tp is a non-const pointer pointing to a non-const string, whereas a is a const pointer pointing to a non-const pointer.\n" +
                    "3:\tThe pointer p can be modified to point to another string, whereas the individual characters within array a can be changed.\n" +
                    "4:\tIn both cases the '\\0' will be added at the end of the string \"Sanjay\".\n"

    };
    public static String choices[][]={
            {"Infinite times","11 times","0 times","10 times"},
            {"It matters","It doesn't matters","matters","No output"},
            {"4","7","6","5"},
            {"use float(3.14f)","use 3.14f","use f(3.14)","use (f)(3.14)"},
            {"Yes","No","",""},
            {"Error: in macro substitution","Error: invalid reference 'x' in macro","print 'multiply'","No output"},
            {"5","25","125","Garbage value"},
            {"*pt='';","pt='\\0';","pt='\\n';\n","*pt='\\0';"},
            {"1","1,4","2,3","2,4"},
            {"1, 2","2, 3, 4","3, 4","2, 3"}
    };
    public static String correctAnswer[]={
            "0 times",
            "It doesn't matters",
            "7",
            "use 3.14f",
            "Yes",
            "print 'multiply'",
            "25",
            "*pt='\\0';",
            "1,4",
            "2, 3, 4"
    };
    public static String desAns[]={
            "0 times",
            "It doesn't matters",
            "7",
            "use 3.14f",
            "Yes",
            "print 'multiply'",
            "25",
            "*pt='\\0';",
            "1,4",
            "2, 3, 4"
    };
}
