package com.ritish.mavenex;
public class Rasgulla extends Sweets
{

    public Rasgulla(int sugar_content, int weight, int price, String sweetname,String type) {
     
        super(sugar_content, weight, price, sweetname,type);
       
    }

    @Override
    void description() {
      System.out.println("Rasgulla is indian syrupy desert popular in Indian Subcontinent");
        
    }

}