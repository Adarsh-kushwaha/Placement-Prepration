package Infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//question - https://stackoverflow.com/questions/68694587/what-is-the-maximum-possible-number-of-monsters-you-can-defeat

public class MonsterPower {
    public static void main(String[] args) {
        // taking input number of monster and initial exp of player
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of monster ");
        int n = sc.nextInt();
        System.out.println("Initial experirence ");
        int exp = sc.nextInt();

        // define array of moster power and bounus
        int[] MonstPower = new int[n];
        int[] MonstBounus = new int[n];

        System.out.println("power of monsters");
        for (int i = 0; i < n; i++) {
            MonstPower[i] = sc.nextInt();
        }
        System.out.println("bonus on killing the monsters");
        for (int i = 0; i < n; i++) {
            MonstBounus[i] = sc.nextInt();
        }

        class Monster {
            private final int power, bonus;

            public Monster(int power, int bonus) {
                this.power = power;
                this.bonus = bonus;
            }
        }

        Monster[] monsters = new Monster[n];

        for (int i = 0; i < n; i++) {
            monsters[i] = new Monster(MonstPower[i], MonstBounus[i]);
        }

        Arrays.sort(monsters, Comparator.comparing(p -> p.power));
        int count = 0;
        for (Monster m : monsters) {
            if (m.power > exp) {
                break;
            }
            exp = exp + m.bonus;
            count = count + 1;
        }

       System.out.println("Number of monster killed : " + count);
    }
}
