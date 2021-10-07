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



    public abstract ArrayList<ImageInfo> GreyScaleMethod();
}
