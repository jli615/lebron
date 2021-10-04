package com.example.sping_portfolio.minilabs.arithmeticTwo;
import java.util.ArrayList;

public class arithmeticController
{
public static void main(String[] args)
{
    parentArithmetic arith1 = new arithFor();
    parentArithmetic arith2 = new arithRecurse();
    parentArithmetic arith3 = new arithStream();
    parentArithmetic arith4 = new arithWhile();
    parentArithmetic.forr = true;
    if (parentArithmetic.forr == true)
    {
        arith1.arithmeticMethodone();
        arith1.arithmeticMethodtwo();
        arith1.print();
    }
    if (parentArithmetic.recurse == true)
    {
        arith2.arithmeticMethodone();
        arith2.print();
    }
    if (parentArithmetic.stream == true)
    {
        arith3.arithmeticMethodone();
        arith3.print();
    }
    if (parentArithmetic.whilee == true)
    {
        arith4.arithmeticMethodone();
        arith4.print();
    }
}
}
