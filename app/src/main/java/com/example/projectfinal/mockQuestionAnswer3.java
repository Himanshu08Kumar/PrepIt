package com.example.projectfinal;

public class mockQuestionAnswer3 {
    public static String question[]={
            "Q1. Which of the following statements is correct in C++?",
            "Q2. Which of the following concepts means waiting until runtime to determine which function to call?",
            "Q3. Which of the following statements is correct?",
            "Q4. In which of the following a virtual call is resolved at the time of compilation?",
            "Q5. Which of the following concepts provides facility of using object of one class inside another class?",
            "Q6. What will be the output of the following program?\n" +
                    "#include<iostream.h> \n" +
                    "class IndiaBix\n" +
                    "{\n" +
                    "    int x, y, z; \n" +
                    "    public:\n" +
                    "    void Apply(int xx = 12, int yy = 21, int zz = 9)\n" +
                    "    {\n" +
                    "        x = xx;\n" +
                    "        y = yy += 10;\n" +
                    "        z = x -= 2;\n" +
                    "    }\n" +
                    "    void Display(void)\n" +
                    "    {\n" +
                    "        cout<< x << \" \" << y << endl; \n" +
                    "    } \n" +
                    "    void SetValue(int xx, int yy)\n" +
                    "    {\n" +
                    "        Apply(xx, 0, yy);\n" +
                    "    }\n" +
                    "};\n" +
                    "int main()\n" +
                    "{\n" +
                    "    IndiaBix *pBix= new IndiaBix;\n" +
                    "   (*pBix).SetValue(12, 20);\n" +
                    "    pBix->Display();\n" +
                    "    delete pBix;\n" +
                    "    return 0; \n" +
                    "}\n",
            "Q7. What will be the output of the following program?\n" +
                    "#include<iostream.h>\n" +
                    "long BixFunction(int x, int y = 5, float z = 5)\n" +
                    "{\n" +
                    "    return(++x * ++y + (int)++z);\n" +
                    "}\n" +
                    "int main()\n" +
                    "{\n" +
                    "    cout<< BixFunction(20, 10); \n" +
                    "    return 0;\n" +
                    "}\n",
            "Q8. Which of the following statement is correct?",
            "Q9. Which of the following statements is correct?\n" +
                    "1. Once a reference variable has been defined to refer to a particular variable it can refer to any other variable.\n" +
                    "2. A reference is not a constant pointer.\n",
            "Q10. Which of the following statement is correct about the program given below?\n" +
                    "#include<iostream.h> \n" +
                    "int main()\n" +
                    "{\n" +
                    "    int x = 80; \n" +
                    "    int &y = x;\n" +
                    "    x++;\n" +
                    "    cout << x << \" \" << --y;\n" +
                    "    return 0;\n" +
                    "}\n"
    };
    public static String choices[][]={
            {"Classes cannot have data as protected members.","Structures can have functions as members.","Class members are public by default.","Structure members are private by default."},
            {"Data hiding","Dynamic casting","Dynamic binding","Dynamic loading"},
            {"Base class pointer cannot point to derived class.","Derived class pointer cannot point to base class.","Pointer to derived class cannot be created.","Pointer to base class cannot be created."},
            {"A. From inside the destructor.","B. From inside the constructor.","C. From inside the main().","Both A and B."},
            {"Encapsulation","Abstraction","Composition","Inheritance"},
            {"10 10","12 10","12 21","12 31"},
            {"237","242","240","The program will report error on compilation."},
            {"A reference is a constant pointer.","A reference is not a constant pointer.","An array of references is acceptable.","It is possible to create a reference to a reference."},
            {"Only 1 is correct.","Only 2 is correct.","Both 1 and 2 are correct.","Both 1 and 2 are incorrect."},
            {"The program will print the output 80 80.","The program will print the output 81 80.","The program will print the output 81 81.","It will result in a compile time error."}

    };
    public static String correctAnswer[]={
            "Structures can have functions as members.",
            "Dynamic binding",
            "Derived class pointer cannot point to base class.",
            "Both A and B.",
            "Composition",
            "10 10",
            "237",
            "A reference is a constant pointer.",
            "Both 1 and 2 are incorrect.",
            "The program will print the output 80 80."

    };
}
