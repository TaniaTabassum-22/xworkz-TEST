// 10 Alice, Bob, and Charlie participated in a 400 meter race. The time taken by Alice, Bob, and Charlie to complete the race was X, Y, and Z seconds respectively. 
// Note that X, Y, and Z are distinct. Determine who had the highest average speed in the race.

public class Race {

    public static void main(String[] args) {
        int[] times = {57, 88, 59}; 

        String[] names = {"Alice", "Bob", "Charlie"};

        int minTime = times[0];
        String fastestParticipant = names[0];

        for (int i = 1; i < times.length; i++) {
            if (times[i] < minTime) {
                minTime = times[i];
                fastestParticipant = names[i];
            }
        }

        System.out.println(fastestParticipant + " had the highest average speed.");
    }
}