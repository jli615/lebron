package com.example.sping_portfolio.minilabs.GreyScale;

import java.util.ArrayList;
import com.example.sping_portfolio.controllers.ImageInfo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


public class GrayScaleMain
{
    boolean Greyscale;
    public static ArrayList<ImageInfo> lix = new ArrayList<>();
    public static ArrayList<ImageInfo> li = new ArrayList<>();
    public ArrayList<ImageInfo> GreyScaleMethod()
    {
        if(Greyscale == true)
        {
            for(int x =0; x <= 10; x++)
            {
                li.add(lix.get(x));
                li.get(x).grayscale();
            }
            return li;
        }
        else
        {
            return lix;
        }
    }
}
