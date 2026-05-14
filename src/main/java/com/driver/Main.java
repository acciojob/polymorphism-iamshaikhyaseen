package com.driver;

public class Main {
  public static void main(String[] args){
    Product p=new Product();
    int x=2;
    int y=3;
    int z=4;
    double l=5;
    double m=6;
    System.out.println(p.product(x,y));
    System.out.println(p.product(x,y,z));
    System.out.println(p.product(l,m));
  }
}
class Product{
  public int product(int x, int y){
   return x*y; 
  }
  public int product(int x, int y, int z){
   return x*y*z; 
  }
  public double product(double x, double y){
   return x*y; 
  }
}
