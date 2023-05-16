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
                    "}\n",

            "Q11. Which of the following statement is correct?\n",
            "Q12. Which of the following concepts means adding new components to a program as it runs?\n",
            "Q13. Which of the following statement is correct?\n",
            "Q14. Which of the following statement is correct?\n",
            "Q15. Which of the following statement is correct about the program given below?\n" +
                    "#include<iostream.h>\n" +
                    "const double BixConstant(const int, const int = 0);\n" +
                    "int main()\n" +
                    "{\n" +
                    "    const int c = 2 ;\n" +
                    "    cout<< BixConstant(c, 10)<< \" \"; \n" +
                    "    cout<< BixConstant(c, 20)<< endl; \n" +
                    "    return 0;\n" +
                    "}\n" +
                    "const double BixConstant(const int x, const int y)\n" +
                    "{\n" +
                    "    return( (y + (y * x) * x % y) * 0.2);\n" +
                    "}\n",
            "Q16. Which of the following statements is correct?\n" +
                    "1. We can return a global variable by reference.\n" +
                    "2. We cannot return a local variable by reference.\n",
            "Q17. How many objects can be created from an abstract class?\n",
            "Q18. Which of the following statement is correct?\n",
            "Q19. Which of the following implicitly creates a default constructor when the programmer does not explicitly define at least one constructor for a class?\n",
            "Q20. For automatic objects, constructors and destructors are called each time the objects\n"

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
            {"The program will print the output 80 80.","The program will print the output 81 80.","The program will print the output 81 81.","It will result in a compile time error."},
            {"C++ allows static type checking.","C++ allows dynamic type checking.","C++ allows static member function be of type const.","Both A and B."},
            {"Data hiding","Dynamic typing","Dynamic binding","Dynamic loading"},
            {"The order of the default argument will be right to left.","The order of the default argument will be left to right.","The order of the default argument will be alternate.","The order of the default argument will be random."},
            {"Only one parameter of a function can be a default parameter.","Minimum one parameter of a function must be a default parameter.","All the parameters of a function can be default parameters.","No parameter of a function can be default."},
            {"The program will print the output 2 4","The program will print the output 20 40","The program will print the output 10 20","The program will report compile time error"},
            {"Only 1 is correct","Only 2 is correct","Both 1 and 2 are correct","Both 1 and 2 are incorrect"},
            {"Zero","One","Two","As many as we want"},
            {"A constructor of a derived class can access any public and protected member of the base class.","Constructor cannot be inherited but the derived class can call them.","A constructor of a derived class cannot access any public and protected member of the base class.","Both A and B."},
            {"Preprocessor","Linker","Loader","Compiler"},
            {"enter and leave scope","inherit parent class","are constructed","are destroyed"}

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
            "The program will print the output 80 80.",
            "Both A and B.",
            "Dynamic loading",
            "The order of the default argument will be right to left.",
            "All the parameters of a function can be default parameters.",
            "The program will print the output 2 4",
            "Only 2 is correct",
            "Zero",
            "Both A and B.",
            "Compiler",
            "enter and leave scope"

    };
    public static String desAns[]={
            "Structures can have functions as members.",
            "Dynamic binding",
            "Derived class pointer cannot point to base class.",
            "Both A and B.",
            "Composition",
            "10 10",
            "237",
            "A reference is a constant pointer.",
            "Both 1 and 2 are incorrect.",
            "The program will print the output 80 80.",
            "Both A and B.",
            "Dynamic loading",
            "The order of the default argument will be right to left.",
            "All the parameters of a function can be default parameters.",
            "The program will print the output 2 4",
            "Only 2 is correct",
            "Zero",
            "Both A and B.",
            "Compiler",
            "enter and leave scope"
    };
}
