package com.ritish.mavenex;
import java.util.*;
class ChocolatesSorter implements Comparator<Chocolates>
{

    @Override
    public int compare(Chocolates o1, Chocolates o2) {
        return o1.get_weight()-o2.get_weight();
    }
  

}