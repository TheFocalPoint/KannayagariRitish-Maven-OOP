package com.ritish.mavenex;

public abstract class Sweets
{
   private int sugar_content;
   private int weight;
   private int price;
   private String sweetname;
   public Sweets(int sugar_content,int weight,int price,String sweetname)
   {
       this.sugar_content=sugar_content;
       this.weight=weight;
       this.price=price;
       this.sweetname=sweetname;
   }
   public String get_sweetname()
   {
       return sweetname;
   }
    public int get_sugarcontent()
    {
        return sugar_content;
    } 
    public int get_weight()
    {
        return weight;
    }
    public int get_price()
    {
        return price;
    }
abstract void Sweet_description();
 
@Override
 public String toString() {
     return " My name is "+this.sweetname+":  weight is "+this.weight+" Sweet content "+this.sugar_content+ " Sweet weight "+this.weight+" it costs around $ "+this.price+"\n";
 }
 
}