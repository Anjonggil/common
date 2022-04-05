package greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeakJoon2747 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i <= N;i++){
            list.add(list.get(i-2) + list.get(i-1));
        }

        System.out.println(list.get(N-1));

    }
}
