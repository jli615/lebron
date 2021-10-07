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
        public static void main(String[] args)
        {
            ArrayList<ImageInfo> lix = new ArrayList<>();
            String file0 = "/images/lebron.png";
            lix.add(new ImageInfo(file0, web_server+file0, 12));
            lix.get(0).read_image();
            String file1 = "/images/kyrie.png";
            lix.add(new ImageInfo(file1, web_server+file1, 12));
            lix.get(0).read_image();
            String file2 = "/images/akumpo.png";
            lix.add(new ImageInfo(file2, web_server+file2, 12));
            lix.get(0).read_image();
            String file3 = "/images/chef.png";
            lix.add(new ImageInfo(file3, web_server+file3, 12));
            lix.get(0).read_image();
            String file4 = "/images/cp3.png";
            lix.add(new ImageInfo(file4, web_server+file4, 12));
            lix.get(0).read_image();
            String file5 = "/images/dame.png";
            lix.add(new ImageInfo(file5, web_server+file5, 12));
            lix.get(0).read_image();
            String file6 = "/images/harden.png";
            lix.add(new ImageInfo(file6, web_server+file6, 12));
            lix.get(0).read_image();
        }
    }
}
