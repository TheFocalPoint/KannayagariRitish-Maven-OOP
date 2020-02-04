package com.ritish.mavenex;
class Snickers extends Chocolates
{

    public Snickers(int Chocolate_content, int weight, int price, String chocolate_name) {
        super(Chocolate_content, weight, price, chocolate_name);

    }

    @Override
    void Chocolate_description() {
        System.out.println( "I am in Snickers Class");

    }
    
}