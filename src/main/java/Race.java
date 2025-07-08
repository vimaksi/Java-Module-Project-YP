public class Race {
    static String leader = "";
    static int distance = 0;
    static int newDistance = 0;

    public static String findLeader(String newRider, int newSpeed) {
        newDistance = 24 * newSpeed;
        if (newDistance > distance) {
            leader = newRider;
            distance = newDistance;
        }
        return leader;
    }
}
