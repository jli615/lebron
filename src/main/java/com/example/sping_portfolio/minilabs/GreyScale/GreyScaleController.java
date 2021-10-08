package com.example.sping_portfolio.minilabs.GreyScale;
import com.example.sping_portfolio.controllers.ImageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.sping_portfolio.controllers.ImageInfo;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

import java.util.ArrayList;


public class GreyScaleController {
    public class MainController {

        @GetMapping("/greet")
        // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
        public String greeting(@RequestParam(name = "GreyScale", required = false, defaultValue = "World") String GreyScale, Model model) {
            // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
            model.addAttribute("GreyScale", GreyScale);   // MODEL is passed to html
            return "GreyScaleController";                     // returns HTML VIEW (greeting)
        }
        public void main(String[] args)
        {
            String file0 = "/images/lebron.png";
            GrayScaleMain.lix.add(new ImageInfo(file0, file0, 12));
            GrayScaleMain.lix.get(0).read_image();
            String file1 = "/images/kyrie.png";
            GrayScaleMain.lix.add(new ImageInfo(file1, file1, 12));
            GrayScaleMain.lix.get(1).read_image();
            String file2 = "/images/akumpo.png";
            GrayScaleMain.lix.add(new ImageInfo(file2, file2, 12));
            GrayScaleMain.lix.get(2).read_image();
            String file3 = "/images/chef.png";
            GrayScaleMain.lix.add(new ImageInfo(file3, file3, 12));
            GrayScaleMain.lix.get(3).read_image();
            String file4 = "/images/cp3.png";
            GrayScaleMain.lix.add(new ImageInfo(file4, file4, 12));
            GrayScaleMain.lix.get(4).read_image();
            String file5 = "/images/dame.png";
            GrayScaleMain.lix.add(new ImageInfo(file5, file5, 12));
            GrayScaleMain.lix.get(5).read_image();
            String file6 = "/images/harden.png";
            GrayScaleMain.lix.add(new ImageInfo(file6, file6, 12));
            GrayScaleMain.lix.get(6).read_image();

        }
    }
}
