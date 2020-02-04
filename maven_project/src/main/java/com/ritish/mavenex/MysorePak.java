package com.ritish.mavenex;
public class MysorePak extends Sweets
{

    public MysorePak(int sugar_content, int weight, int price, String sweetname) {
        super(sugar_content, weight, price, sweetname);  
    }

    @Override
    void Sweet_description() {
        System.out.println("Mysore pak is an Indian sweet prepared in ghee that is popular in Southern India. It originated in the Indian state of Karnataka.");
    }

}