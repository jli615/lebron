package com.example.sping_portfolio.minilabs.arithmetic;

import java.util.Scanner;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class arithmeticSequenceFor extends arithmeticSequenceMain{
    private int ac;
    public arithmeticSequenceFor(int nth)
    {
        ac=nth;
    }
}