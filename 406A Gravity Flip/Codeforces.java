import java.util.Arrays;
import java.util.Scanner;

public class Codeforces {

    public int[] solution(int[] cubes){
        Arrays.sort(cubes);
        return cubes;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            // input
            int num = scanner.nextInt();
            scanner.nextLine();
            int[] cubes = new int[num];
            for(int i = 0; i < num; i++){
                cubes[i] = scanner.nextInt();
            }
            // solve
            int[] res =  new Solution().solution(cubes);
            // output
            System.out.println(String.join(" ", Arrays.stream(res).mapToObj(String::valueOf).toArray(String[]::new)));
        }
    }
}