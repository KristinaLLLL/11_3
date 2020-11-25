package com.company;

public class Variable {
    private double x;
    Variable(char x){
        this.x=0;
    }


    public void evaluate(double i){
        this.x=i;
    }
    double getX(){
        return x;
    }
}
