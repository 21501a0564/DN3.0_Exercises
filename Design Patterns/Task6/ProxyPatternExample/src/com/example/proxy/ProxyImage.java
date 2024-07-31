package com.example.proxy;

public class ProxyImage implements Image {
    private RealImage realImg;
    private String fn;

    public ProxyImage(String fn) {
        this.fn = fn;
    }

    @Override
    public void dis() {
        if (realImg == null) {
            realImg = new RealImage(fn);
        }
        realImg.dis();
    }
}
