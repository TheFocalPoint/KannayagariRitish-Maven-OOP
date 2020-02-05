package com.ritish.mavenex;
public class MysorePak extends Sweets
{

    public MysorePak(int sugar_content, int weight, int price, String sweetname,String type) {
        super(sugar_content, weight, price, sweetname,type);  
    }

    @Override
    void description() {
        System.out.println("Mysore pak is an Indian sweet prepared in ghee that is popular in Southern India. It originated in the Indian state of Karnataka.");
    }

}