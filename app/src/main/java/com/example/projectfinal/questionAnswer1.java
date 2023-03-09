package com.example.projectfinal;

public class questionAnswer1 {
    public static String question[] ={"Q1. What will be the output of the program ?\n"+
            "public class Test \n" +
                    "{\n" +
                    "    public static void main(String [] args) \n" +
                    "    {\n" +
                    "        signed int x = 10;\n" +
                    "        for (int y=0; y<5; y++, x--)\n" +
                    "            System.out.print(x + \", \");\n" +
                    "    }\n" +
                    "}"+
                    "\n",
            "Q2. What is the widest valid returnType for methodA in line 3?\n"+
                    "public class ReturnIt \n" +
                    "{ \n" +
                    "    returnType methodA(byte x, double y) /* Line 3 */\n" +
                    "    { \n" +
                    "        return (long)x / y * 2; \n" +
                    "    } \n" +
                    "}\n",
            "Q3. Which of the following class level (nonlocal) variable declarations will not compile?",
            "Q4. public class BoolTest \n" +
                    "{\n" +
                    "    public static void main(String [] args) \n" +
                    "    {\n" +
                    "        Boolean b1 = new Boolean(\"false\");\n" +
                    "        boolean b2;\n" +
                    "        b2 = b1.booleanValue();\n" +
                    "        if (!b2) \n" +
                    "        {\n" +
                    "            b2 = true;\n" +
                    "            System.out.print(\"x \");\n" +
                    "        }\n" +
                    "        if (b1 & b2) /* Line 13 */\n" +
                    "        {\n" +
                    "            System.out.print(\"y \");\n" +
                    "        }\n" +
                    "        System.out.println(\"z\");\n" +
                    "    }\n" +
                    "}\n",
            "Q5. What will be the output of the program?\n"+
                    "int i = 0; \n" +
                    "while(1) \n" +
                    "{\n" +
                    "    if(i == 4) \n" +
                    "    {\n" +
                    "        break;\n" +
                    "    } \n" +
                    "    ++i; \n" +
                    "} \n" +
                    "System.out.println(i = + i);\n",
            "Q6. What will be the output of the program?\n"+
                    "public class MyProgram \n" +
                    "{\n" +
                    "    public static void main(String args[])\n" +
                    "    {\n" +
                    "        try \n" +
                    "        {\n" +
                    "            System.out.print(\"Hello world \");\n" +
                    "        }\n" +
                    "        finally \n" +
                    "        {\n" +
                    "            System.out.println(\"Finally executing \");\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n",
            "Q7. Which collection class allows you to associate its elements with key values, and allows you to retrieve objects in FIFO (first-in, first-out) sequence?",
            "Q8. Which interface does java.util.Hashtable implement?",
            "Q9. What will be the output of the program?\n"+
            "TreeSet map = new TreeSet();\n" +
                    "map.add(\"one\");\n" +
                    "map.add(\"two\");\n" +
                    "map.add(\"three\");\n" +
                    "map.add(\"four\");\n" +
                    "map.add(\"one\");\n" +
                    "Iterator it = map.iterator();\n" +
                    "while (it.hasNext() ) \n" +
                    "{\n" +
                    "    System.out.print( it.next() + \" \" );\n" +
                    "}\n",
            "Q10. What two statements are true about properly overridden hashCode() and equals() methods?\n" +
                    "1. hashCode() doesn't have to be overridden if equals() is.\n" +
                    "2. equals() doesn't have to be overridden if hashCode() is.\n" +
                    "3. hashCode() can always return the same value, regardless of the object that invoked it.\n" +
                    "4. equals() can be true even if it's comparing different objects.\n"

    };
    public static String choices[][] ={
            {"10, 9, 8, 7, 6","9, 8, 7, 6, 5","Compilation fails","An exception is thrown at runtime"},
            {"int","byte","long","double"},
            {"protected int a;","transient int b = 3;","private synchronized int e;","volatile int d;"},
            {"x","x z","y z","Compilation fails."},
            {"i=0","i=3","i=4","Compilation fails."},
            {"Nothing. The program will not compile because no exceptions are specified.","Nothing. The program will not compile because no catch clauses are specified.","Hello world.","Hello world Finally executing"},
            {"java.util.ArrayList","java.util.LinkedHashMap","java.util.HashMap","java.util.TreeMap"},
            {"Java.util.Map","Java.util.List","Java.util.HashTable","Java.util.Collection"},
            {"one two three four","four three two one","four one three two","one two three four one"},
            {"1 and 2","2 and 3","3 and 4","1 and 3"}
    };
    public static String correctAnswer[]={
            "Compilation fails",
            "double",
            "private synchronized int e;",
            "x z",
            "Compilation fails.",
            "Hello world Finally executing",
            "java.util.LinkedHashMap",
            "Java.util.Map",
            "four one three two",
            "3 and 4"
    };
}
