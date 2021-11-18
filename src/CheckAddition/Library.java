package CheckAddition;

import javax.xml.validation.Validator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public int[] prepFill (int num) {
        int[]  list = {223, 75, 1138, 6, 4475, 44, 733, 324, 296, 15869, 743, 69, 411, 32, 19};
        Arrays.sort(list);
        int cont = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < num) cont ++;
        }
        int[] shortList = new int[cont];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < num){
                shortList[i] = list[i];
            }
            cont ++;
        } return shortList;
    }

    public void calculate(int[] temp, int sum){
        int n = temp.length;
        for (int i = 0; i < (1<<n); i++) {
            int sumc=0;
            int count=0;
            System.out.print("Los números ( ");
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) > 0) {
                    System.out.print(temp[j] + " ");
                    sumc=sumc+temp[j];
                    count++;
                }
            if(sum==sumc){
                System.out.println(") "+" SÍ suman "+sumc +" ******" +
                        "*****************************************" +
                        "*****************************************");
            }else{
                System.out.println(") no suman");
            }
        }
    }
}

