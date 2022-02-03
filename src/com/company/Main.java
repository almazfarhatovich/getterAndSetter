package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Laptop laptop = new Laptop();
        laptop.setLaptopName("Acer");
        laptop.setMemory(256);
        laptop.setColor("Серый");
        laptop.setCpu("intel");

        System.out.print(laptop.getLaptopName()+"\n"+laptop.getMemory()+"\n"+laptop.getColor()+"\n"+laptop.getCpu());
    }
}
