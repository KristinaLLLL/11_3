package com.company;

public class Subtract{
    private double a;
    private double b;
    private Object Variable;

    Subtract(Const a, Const b){

        this.a=a.getConst();
        this.a=b.getConst();
        getSubtract();
    }
    Subtract(Variable a, Const b){
        this.a=a.getX();
        this.b=b.getConst();
        getSubtract();
    }

    Subtract(Variable a, Variable b){
        this.a=a.getX();
        this.b=b.getX();
        getSubtract();
    }
    public double getSubtract(){
        return this.a-this.b;
    }

   }

