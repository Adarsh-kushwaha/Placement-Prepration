package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class FittestTrainee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] fitData = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fitData[i][j] = sc.nextInt();
            }
        }

        fitTrainee(fitData);

    }

    static void fitTrainee(int[][] fitData) {
        int max = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < fitData.length; i++) {
            int sum = 0;

            for (int j = 0; j < fitData.length; j++) {
                sum = sum + fitData[i][j];
            }

            int avg = sum / 3;
            System.out.println("avg fitness of traine" + (i + 1) + " " + avg);

            list.add(avg);
            max = Math.max(avg, max);

        }

        for (int i = 0; i < 3; i++) {
            if (list.get(i) >= max) {
                System.out.println("Trainee Number " + (i + 1));
            }

        }
    }
}
