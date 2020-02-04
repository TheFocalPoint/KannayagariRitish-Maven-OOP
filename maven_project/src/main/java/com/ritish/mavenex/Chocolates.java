package com.ritish.mavenex;
public abstract class Chocolates
{
     private int weight;
     private int Chocolate_content;
     private int price;
     private String chocolate_name;


    public Chocolates(int Chocolate_content,int weight,int price,String chocolate_name)
    {
        this.chocolate_name =chocolate_name;
        this.Chocolate_content =Chocolate_content;
        this.weight = weight;
        this.price = price;
    }

    public int get_chocolate_content()
    {
        return  Chocolate_content;
    }

    public int get_weight()
    {
        return weight;
    }

    public int get_price()
    {
        return price;
    }

    public String get_choclate_name()
    {
        return chocolate_name;
    }

    abstract void Chocolate_description(); 
    public String toString()
    {
        return "Chocolate name: "+this.chocolate_name+" Chocolate Content "+this.Chocolate_content+" Chocolate price "+this.price+" Chocolate weight "+this.weight;    }
} 