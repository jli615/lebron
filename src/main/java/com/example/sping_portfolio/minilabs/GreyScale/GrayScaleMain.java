package com.example.sping_portfolio.minilabs.GreyScale;

import java.util.ArrayList;
import com.example.sping_portfolio.controllers.ImageInfo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


public abstract class GrayScaleMain
{
    boolean Greyscale;
    ArrayList<ImageInfo> lix = new ArrayList<>();
    String file0 = "/images/lebron.png";
        lii.add(new ImageInfo(file0, web_server+file0, 12));
        lii.get(0).read_image();
    ArrayList<ImageInfo> lix = new ArrayList<>();
    String file1 = "/images/kyrie.png";
        lii.add(new ImageInfo(file1, web_server+file1, 12));
        lii.get(0).read_image(); ArrayList<ImageInfo> lix = new ArrayList<>();
    String file2 = "/images/akumpo.png";
        lii.add(new ImageInfo(file2, web_server+file2, 12));
        lii.get(0).read_image(); ArrayList<ImageInfo> lix = new ArrayList<>();
    String file3 = "/images/chef.png";
        lii.add(new ImageInfo(file3, web_server+file3, 12));
        lii.get(0).read_image(); ArrayList<ImageInfo> lix = new ArrayList<>();
    String file4 = "/images/cp3.png";
        lii.add(new ImageInfo(file4, web_server+file4, 12));
        lii.get(0).read_image(); ArrayList<ImageInfo> lix = new ArrayList<>();
    String file5 = "/images/dame.png";
        lii.add(new ImageInfo(file5, web_server+file5, 12));
        lii.get(0).read_image(); ArrayList<ImageInfo> lix = new ArrayList<>();
    String file6 = "/images/harden.png";
        lii.add(new ImageInfo(file6, web_server+file6, 12));
        lii.get(0).read_image();


    public abstract ArrayList<ImageInfo> GreyScaleMethod();
}
