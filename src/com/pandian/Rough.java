package com.pandian;

public class Rough {
    public static void main(String[] args){
        Test1 d= new Test1(10,20);
        int b;
        b = d.add();
        System.out.println(b);
    }
}
class Test1{
    private int a;
    private int b;
    Test1(int a,int b){
        this.a = a;
        this.b =b;
    }
    protected int add(){
        return a+b;
    }
}
