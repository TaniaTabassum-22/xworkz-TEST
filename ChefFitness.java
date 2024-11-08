// 6 Chef wants to become fit, so he decided to walk in his office and return home by walking everyday. It is known that chef's office is X kilometers away from his home. 
//Given that his office is open for 5 days in a week, calculate the total number of kilometers chef travels through his office trips in a week.

public class ChefFitness {

    public static void main(String[] args) {

        int[] distances = {10, 10, 10, 10, 10}; 

        int totalDistance = 0;

        for (int i = 0; i < distances.length; i++) {
            totalDistance += 2 * distances[i];  
        }

        System.out.println("The total kilometers Chef travels in a week is: " + totalDistance);
    }
}