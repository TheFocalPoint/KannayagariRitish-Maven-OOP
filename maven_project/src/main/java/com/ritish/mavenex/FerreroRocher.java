package com.ritish.mavenex;
class FerreroRocher extends Chocolates
{

    public FerreroRocher(int Chocolate_content, int weight, int price, String chocolate_name,String type) {
        super(Chocolate_content, weight, price, chocolate_name,type);

    }

    @Override
    void description() {
        System.out.println( "I am in Ferrero Rocher Class");

    }
    
}