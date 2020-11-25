package com.company;

public class Divide {
    private double i1;
    private double i2;
   Divide(Const a, Const b){
        this.i1=a.getConst();
        this.i2=b.getConst();
        getDivide();
   }
    Divide(Variable a, Const b){
        this.i1=a.getX();
        this.i2=b.getConst();
        getDivide();
    }
    Divide(Const a, Variable b){
        this.i1=a.getConst();
        this.i2=b.getX();
        getDivide();
    }
    Divide(Variable a, Variable b){
        this.i1=a.getX();
        this.i2=b.getX();
        getDivide();
    }
   double getDivide(){
       return this.i1/this.i2;
   }

}
