package com.ritish.mavenex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class TestDriver
{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int sugarcontent = 0;
    int weight = 0;
    int price = 0;
    String sweetname="";
    int chocolatecontent = 0;
    int choco_weight = 0;
    int choco_price = 0;
    String Choco_name = "";

    System.out.println("Enter the Sweet details ");
    System.out.println("Enter the Details of MysorePak");
    System.out.println("Enter the SugarContent of MysorePak");
    sugarcontent = sc.nextInt();
    System.out.println("Enter the weight ");
    weight = sc.nextInt();
    System.out.println("Enter the price ");
    price = sc.nextInt();
    System.out.println("Enter the sweetname");
    sweetname =sc.next();
    MysorePak mysorepak =new MysorePak(sugarcontent, weight, price, sweetname);
    
    
    System.out.println("Enter the Details of Rasgulla");
    System.out.println("Enter the SugarContent of Rasgulla");
    sugarcontent = sc.nextInt();
    System.out.println("Enter the weight ");
    weight = sc.nextInt();
    System.out.println("Enter the price ");
    price = sc.nextInt();
    System.out.println("Enter the sweetname");
    sweetname =sc.next();
    Rasgulla rasgulla = new Rasgulla(sugarcontent, weight, price, sweetname);

       

    System.out.println("Enter the Details of KajuKatli");
    System.out.println("Enter the SugarContent of KajuKatli");
    sugarcontent = sc.nextInt();
    System.out.println("Enter the weight ");
    weight = sc.nextInt();
    System.out.println("Enter the price ");
    price = sc.nextInt();
    System.out.println("Enter the sweetname");
    sweetname =sc.next();
    KajuKatli kajuKatli = new KajuKatli(sugarcontent, weight, price, sweetname);

   
    ArrayList<Sweets> list =new ArrayList<Sweets>();
    list.add(mysorepak);
    list.add(rasgulla);
    list.add(kajuKatli);

    for(Sweets s:list)
    {
        System.out.println(s);
    }
    
    int totalweight = 0;
    for(Sweets sweets: list)
    {
        totalweight+=sweets.get_weight();
    }
    System.out.println("The Total Weight is "+totalweight);
   
    System.out.println("Enter the Chocolate details ");
    System.out.println("Enter the Details of Hersheys");
    System.out.println("Enter the ChocolateContent of Hersheys");
    chocolatecontent = sc.nextInt();
    System.out.println("Enter the weight ");
    choco_weight = sc.nextInt();
    System.out.println("Enter the price ");
    choco_price = sc.nextInt();
    System.out.println("Enter the chocolate name");
    Choco_name =sc.next();
    Hersheys hersheys =new Hersheys(chocolatecontent,choco_weight , choco_price, Choco_name);
    
    
    System.out.println("Enter the Details of Snickers");
    System.out.println("Enter the ChocolateContent of Snickers");
    chocolatecontent = sc.nextInt();
    System.out.println("Enter the weight ");
    choco_weight = sc.nextInt();
    System.out.println("Enter the price ");
    choco_price = sc.nextInt();
    System.out.println("Enter the chocolate name");
    Choco_name =sc.next();
    Snickers snickers =new Snickers(chocolatecontent,choco_weight , choco_price, Choco_name);

      

    
    System.out.println("Enter the Details of Ferrero Rocher");
    System.out.println("Enter the ChocolateContent of Ferrero Rocher");
    chocolatecontent = sc.nextInt();
    System.out.println("Enter the weight ");
    choco_weight = sc.nextInt();
    System.out.println("Enter the price ");
    choco_price = sc.nextInt();
    System.out.println("Enter the chocolate name");
    Choco_name =sc.next();
    FerreroRocher ferreroRocher= new FerreroRocher(chocolatecontent,choco_weight , choco_price, Choco_name);

    ArrayList<Chocolates> chocolates = new ArrayList<Chocolates>();
    chocolates.add(hersheys);
    chocolates.add(ferreroRocher);
    chocolates.add(snickers);


    Collections.sort(chocolates,new ChocolatesSorter());
    System.out.println("After Sorting the Chocolates based on Weights");
    for(Chocolates c: chocolates)
    {
        System.out.println(c);
    }
    sc.close();
   


}
}