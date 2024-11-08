// 8 Chef has started working in a candy store. The store has a total of 100 chocolates. Chefs daily goal is to sell X chocolates. For each chocolate sold, he earns 1rupee. 
// However if chef exceeds his daily goal he earns 2 rupees for each extra chocolate sold beyond his goal. Given that chef sells Y chocolates in a day calculate the total amount of money he made.


public class ChefCandyStore {

    public static void main(String[] args) {
        int[] goal = {20, 30, 25}; 
        int[] sold = {25, 35, 20}; 
        
        int totalMoney = 0;

        for (int i = 0; i < goal.length; i++) {
            int X = goal[i];  
            int Y = sold[i];  

            if (Y <= X) {
                totalMoney += Y;  
            } else {
                totalMoney += X + 2 * (Y - X);  
            }
        }

        System.out.println("Chef's total money earned over the days is: " + totalMoney + " rupees.");
    }
}