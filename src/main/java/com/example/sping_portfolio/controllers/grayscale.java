package com.example.sping_portfolio.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.sping_portfolio.controllers.ImageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class grayscale {
    boolean toggle = true;
                   // returns HTML VIEW (greeting)
    @GetMapping("/image")
    public String image(Model model)
    {
        if (toggle) toggle=false; else toggle=true;
        String web_server = "http://localhost:8080/";
        //String web_server = "https://csa.nighthawkcodingsociety.com";
        List<ImageInfo> lii = new ArrayList<>();
        List<ImageInfo> liig = new ArrayList<>();
        //boolean grayscale = true;
        if (toggle == false) {

            String file0 = "/images/lebron.png";
            lii.add(new ImageInfo(file0, web_server + file0, 1));
            lii.get(0).read_image();

            String file1 = "/images/akumpo.png";
            lii.add(new ImageInfo(file1, web_server + file1, 1));
            lii.get(1).read_image();

            String file2 = "/images/dwade.png";
            lii.add(new ImageInfo(file2, web_server + file2, 1));
            lii.get(2).read_image();

            String file3 = "/images/harden.png";
            lii.add(new ImageInfo(file3, web_server + file3, 7));
            lii.get(3).read_image();

            String file4 = "/images/kobe.png";
            lii.add(new ImageInfo(file4, web_server + file4, 7));
            lii.get(4).read_image();

            String file5 = "/images/kyrie.png";
            lii.add(new ImageInfo(file5, web_server + file5, 7));
            lii.get(5).read_image();

            String file6 = "/images/meta.png";
            lii.add(new ImageInfo(file6, web_server + file6, 7));
            lii.get(6).read_image();

            String file7 = "/images/VC.png";
            lii.add(new ImageInfo(file7, web_server + file7, 7));
            lii.get(7).read_image();

            String file8 = "/images/zoin.png";
            lii.add(new ImageInfo(file8, web_server + file8, 7));
            lii.get(8).read_image();

            String file9 = "/images/zo.png";
            lii.add(new ImageInfo(file9, web_server + file9, 7));
            lii.get(9).read_image();

            String file10 = "/images/lebron james1 .png";
            lii.add(new ImageInfo(file10, web_server + file10, 7));
            lii.get(10).read_image();


        } else {
            String file0 = "/images/lebron.png";
            liig.add(new ImageInfo(file0, web_server+file0, 12));
            String str0 = liig.get(0).grayscale();
            lii.add(new ImageInfo(str0, web_server+file0, 12));
            lii.get(0).read_image();

        }

        model.addAttribute("lii", lii);
        return "image";
    }
    /*
    @GetMapping("/image/grayscale")
    public String image_grayscale(Model model) {
        String web_server = "http://localhost:8080/";
        //String web_server = "https://csa.nighthawkcodingsociety.com";
        List<ImageInfo> lii = new ArrayList<>();

        String file0 = "/images/lebron.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        String str = lii.get(0).grayscale();
//        String str = lii.get(0).grayscale();
        model.addAttribute("str", str);
        return "image_grayscale";

     */
    }


