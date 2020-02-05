package com.ritish.mavenex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class TestDriver
{
    static int get_totalweight(ArrayList<Gifts> al)
    {
        int totalweight=0;
        for(Gifts i : al)
        {
            totalweight+=i.get_weight();
        }
        return totalweight;
    }
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
    String type="";

    System.out.println("Enter the number of Gifts");
    int n =sc.nextInt();
    ArrayList<Gifts> list =new ArrayList<Gifts>();
    for(int i=0;i<n;i++)
    {
          System.out.println("Enter the type of Gift");
          type=sc.next();
          if(type.equals("Chocolates"))
          {
              System.out.println("Enter the chocolatecontent");
            chocolatecontent = sc.nextInt();
            System.out.println("Enter the weight ");
            choco_weight = sc.nextInt();
            System.out.println("Enter the price ");
            choco_price = sc.nextInt();
            System.out.println("Enter the Chocolatename");
            Choco_name =sc.next();
            
            if(Choco_name.equals("Hersheys"))
            {
                Hersheys h= new Hersheys(chocolatecontent, choco_weight, choco_price, Choco_name, type);
                list.add(h);
            }
            else if(Choco_name.equals("FerreroRocher"))
            {
                FerreroRocher f=new FerreroRocher(chocolatecontent, choco_weight, choco_price, Choco_name, type);
                list.add(f);
            }
            else
            {
              Snickers s =new Snickers(chocolatecontent, choco_weight, choco_price, Choco_name, type);
              list.add(s);
            }

          } 
          else
          {
            System.out.println("Enter the SugarContent of "+type);
            sugarcontent = sc.nextInt();
            System.out.println("Enter the weight ");
            weight = sc.nextInt();
            System.out.println("Enter the price ");
            price = sc.nextInt();
            System.out.println("Enter the sweetname");
            sweetname =sc.next();
            if(sweetname.equals("KajuKatli"))
            {
                KajuKatli k =new KajuKatli(sugarcontent, weight, price, sweetname, type);
                list.add(k);
            }
            else if(sweetname.equals("MysorePak"))
            {
                MysorePak m =new MysorePak(sugarcontent, weight, price, sweetname, type);
                list.add(m);
            }
            else
            {
                Rasgulla r =new Rasgulla(sugarcontent, weight, price, sweetname, type);
                list.add(r);
            }
          }  
    }
   
    int totalweight = get_totalweight(list);
    System.out.println("The Total Weight is "+totalweight);
   
    Collections.sort(list,new ChocolatesSorter());
    System.out.println("After Sorting the Chocolates based on Weights");
    for(Gifts c: list)
    {
        if(c.get_type().equals("Chocolates"))
        System.out.println(c);
    }
    
    System.out.println("Enter the min value for range of weights");
    int min = sc.nextInt();
    System.out.println("Enter the max value for range of weights");
    int max = sc.nextInt();
    System.out.println("Gifts in the range ");
    for(Gifts g : list)
    {
        if(g.get_weight()>=min && g.get_weight()<=max)
        {
            System.out.println(g);
        }
    }
 
   
    
   
    sc.close();
   


}
}