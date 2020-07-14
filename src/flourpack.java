import javax.swing.*;

public class flourpack {
    public static void main(String[] args) {
        canPack(10, 0, 13);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // bigCount 5kg
        // smallCount 1kg
        // goal <= bigCount+SmallCount

        int sum = (5 * bigCount) + smallCount;
        int bigKg = bigCount * 5;
        int smallKg = 1 * smallCount;
        if( bigCount < 0 || smallCount <0 || sum < goal || goal < 0) {
            return false;
        }
        else return goal % 5 <= smallCount;




    }

}
