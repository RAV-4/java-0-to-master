/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rav4
 */
public class test {
    
    public static void main(String[] args) {
        Knapsack ks = new Knapsack();
        int[] profits = {1, 1, 1, 1, 1};
        int[] weights = {100, 210, 260, 80, 90};
        int maxProfit = ks.solveKnapsack(profits, weights, 260);
        System.out.println("Total knapsack profit ---> " + maxProfit);
        int[] prueba = new int[6];
        
        List<Item> i = new ArrayList<>();
        i.add(new Item("MLA1", 100));
        i.add(new Item("MLA2", 210));
        i.add(new Item("MLA3", 260));
        i.add(new Item("MLA4", 80));
        i.add(new Item("MLA5", 90));
        
        
        List<Item> r = ks.coupon(i, 260);
        r.forEach(it ->{
        System.out.println(it.getId());
        });
    }
}
