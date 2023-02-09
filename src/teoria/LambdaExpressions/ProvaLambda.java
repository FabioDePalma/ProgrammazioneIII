package teoria.LambdaExpressions;

import java.util.ArrayList;
import java.util.Random;

public class ProvaLambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < 50; i++) {
            arr.add(ran.nextInt(100));
        }

        // lamba espression per iterare sulla lista
        arr.forEach(n -> System.out.print(n+ " " ));
    }


}
