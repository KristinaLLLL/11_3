package com.company;

public class Multiply {
    private double a;
    private double b;
    Multiply(Const a, Const b){
        this.a=a.getConst();
        this.a=b.getConst();
        getMultiply();
    }
    Multiply(Variable a, Const b){
        this.a=a.getX();
        this.b=b.getConst();
        getMultiply();
    }
    Multiply(Const a, Variable b){
        this.a=a.getConst();
        this.b=b.getX();
        getMultiply();
    }
    Multiply(Variable a, Variable b){
        this.a=a.getX();
        this.b=b.getX();
        getMultiply();
    }
    double getMultiply(){
        return this.a*this.b;
    }

}
