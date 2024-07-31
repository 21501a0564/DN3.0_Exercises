package com.example.builder;

public class BuilderPatternTest {
    public static void main(String[] args) {
        
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard(true)
                .setBluetooth(true)
                .build();

      
        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard(false)
                .setBluetooth(false)
                .build();

        System.out.println(gamingComputer);
        System.out.println(officeComputer);
    }
}
