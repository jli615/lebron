package com.example.sping_portfolio.minilabs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class StudentInfo {
    public String StudentInfo; {

        String name = "JDawg";

        double avgGrade;
        avgGrade = 97.90;

        final int numClass;
        numClass = 5;

        boolean atDelNorte;
        atDelNorte = true;

        System.out.println(name + " has an average grade of " + avgGrade);

        System.out.println(name + " is taking " + numClass + " classes.");

        System.out.println(name + " is currently at Del Norte for the 2021-22 school year: " + atDelNorte);

    }
}
