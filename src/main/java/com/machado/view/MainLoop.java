package com.machado.view;

import processing.core.PApplet;

public class MainLoop extends PApplet {

    private static final int fps = 60;


    @Override
    public void settings() {
        size(800, 640);
    }

    @Override
    public void setup() {
        frameRate(fps);
    }

    @Override
    public void draw() {
        background(255);
    }

}