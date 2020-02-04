package com.ritish.mavenex;
public class KajuKatli extends Sweets
{

    public KajuKatli(int sugar_content, int weight, int price, String sweetname) {
      
        super(sugar_content, weight, price, sweetname); 
    }

    @Override
    void Sweet_description() 
    {
    System.out.println("Kaju katli, also known as kaju barfi, is an Indian dessert similar to a barfi");
    }
    
}