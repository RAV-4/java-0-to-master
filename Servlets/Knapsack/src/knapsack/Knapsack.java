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
public class Knapsack {

    public int solveKnapsack(int[] profits, int[] weights, int capacity) {
        Integer[][] dp = new Integer[profits.length][capacity + 1];
        return this.knapsackRecursive(dp, profits, weights, capacity, 0);
    }
    
    public List<Item> coupon(List<Item> items, int valorCoupon) {
        
        Coupon[][] dp = new Coupon[items.size()][items.size()+1];
        return this.couponRecursivo(dp, items, valorCoupon, 0);
    }
    
    private List<Item> couponRecursivo(Coupon[][] dp, List<Item> precios, int valorCoupon, int indexActual) {
        if (valorCoupon <= 0 || indexActual >= precios.size()) {
           return new ArrayList<>();
        }
        
        if(dp[indexActual][precios.size()] != null) {
            return dp[indexActual][precios.size()].getItems();
        }
        
        List<Item> seleccionado = new ArrayList<>();
        if(precios.get(indexActual).getPrecio() <= valorCoupon) {
            seleccionado.add(precios.get(indexActual));
            seleccionado.addAll(couponRecursivo(dp, precios, valorCoupon-precios.get(indexActual).getPrecio(), indexActual+1));
        }
        List<Item> noSeleccionado = new ArrayList<>();
        noSeleccionado.addAll(couponRecursivo(dp, precios, valorCoupon, indexActual+1));
        
        if(seleccionado.stream().map(Item::getPrecio).reduce(Integer::sum).orElse(0) >= noSeleccionado.stream().map(Item::getPrecio).reduce(Integer::sum).orElse(0)) {
            dp[indexActual][precios.size()] = new Coupon(seleccionado);
            return seleccionado;
        } else{
            dp[indexActual][precios.size()] = new Coupon(noSeleccionado);
            return noSeleccionado;
        }
    }

    private int knapsackRecursive(Integer[][] dp, int[] profits, int[] weights, int capacity,
            int currentIndex) {

        // base checks
        if (capacity <= 0 || currentIndex >= profits.length) {
            return 0;
        }

        // if we have already solved a similar problem, return the result from memory
        if (dp[currentIndex][capacity] != null) {
            return dp[currentIndex][capacity];
        }

        // recursive call after choosing the element at the currentIndex
        // if the weight of the element at currentIndex exceeds the capacity, we shouldn't process this
        int profit1 = 0;
        if (weights[currentIndex] <= capacity) {
            profit1 = profits[currentIndex] + knapsackRecursive(dp, profits, weights,
                    capacity - weights[currentIndex], currentIndex + 1);
        }

        // recursive call after excluding the element at the currentIndex
        int profit2 = knapsackRecursive(dp, profits, weights, capacity, currentIndex + 1);

        dp[currentIndex][capacity] = Math.max(profit1, profit2);
        return dp[currentIndex][capacity];
    }

}
