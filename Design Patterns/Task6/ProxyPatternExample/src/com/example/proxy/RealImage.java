package com.example.proxy;

public class RealImage implements Image{
    private String fn;

    public RealImage(String fn) {
        this.fn = fn;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image: " + fn);
    }

    @Override
    public void dis() {
        System.out.println("Displaying image: " + fn);
    }
}
