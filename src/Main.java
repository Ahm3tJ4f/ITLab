import java.security.AllPermission;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1};

        System.out.println(findMissing(arr));
    }

    public static int findMissing(int[] numbers)
    {
        int lastIndex = numbers.length-1;
        int d = (numbers[lastIndex] - numbers[0]) / (numbers.length);

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] != numbers[i-1]+d){
                return numbers[i-1]+d;
            }
        }
        return numbers[0];
        }
}
