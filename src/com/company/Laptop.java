package com.company;

public class Laptop {
    private String laptopName;
    private int memory;
    private String color;
    private String cpu;

    public String getLaptopName(){
        return laptopName;
    }
    public void setLaptopName(String laptopName) {
        if (laptopName.matches("[A-Za-z]-[0-9]")){

        }
          else{
            this.laptopName = laptopName;
        }
    }
    public int getMemory(){
        return memory;
    }
    public void setMemory(int memory) {
        if (memory < 0) {
            System.out.println("память не должен быть отрицательным!");
        } else {
            this.memory = memory;
        }
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    void turnOn() {
        System.out.println("laptop turn on");
    }
    void shutDown(){
        System.out.println("laptop shut down");
    }
}


//        #ITEM1
//        #CREATE Laptop class
//        #DEFINE String laptopName; //noutbuktun aty
//        #DEFINE int memory; //pamyat
//        #DEFINE String color; //Color color;
//        #DEFINE String CPU; //processor
//        #CREATE create two methods
//        #1 turn on
//        #2 shut down