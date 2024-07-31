package com.example.proxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("image1.jpg");
        Image img2 = new ProxyImage("image2.jpg");

        img1.dis();
        
        img2.dis();

        img1.dis();
    }
}
