package CheckAddition;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Library l = new Library();
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Números a calcular");
        int numIntro = 0;
        numIntro = sc.nextInt();
        int num = 816;
        int[] list = new int[numIntro];


        for (int i = 0; i < numIntro; i++) {
            System.out.println("Introduce el número " + (i+1) +" de los posibles.");
            list[i] = sc.nextInt();
            //list[i] = r.nextInt(10);
        }

        System.out.println("Introduce el número final.");
        int sum = sc.nextInt();


        //l.calculate(l.prepFill(num), num);
        Arrays.sort(list);
        l.calculate(list, sum);
    }
}


