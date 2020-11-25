package com.company;

public class Add {
    private double a;
    private double b;
    Add(Const a, Const b){
        this.a=a.getConst();
        this.a=b.getConst();
        getAdd();
    }
    Add(Variable a, Const b){
        this.a=a.getX();
        this.b=b.getConst();
        getAdd();
    }
    Add(Const a, Variable b){
        this.a=a.getConst();
        this.b=b.getX();
        getAdd();
    }
    Add(Variable a, Variable b){
        this.a=a.getX();
        this.b=b.getX();
        getAdd();
    }
    double getAdd(){
        return this.a+this.b;
    }
}
