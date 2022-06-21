import java.security.AllPermission;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Algorithm alg = new Algorithm();

        Scanner scan = new Scanner(System.in);
        String[] output = new String[10];

        for (int i = 0; i < output.length; i++){
            String word = scan.nextLine();
            word = alg.isDuplicated(word);

            if(!Objects.equals(word, "")){
                output[i] = word;
            }
        }

        for (String word: output){
            if(word != null){
            System.out.println(word);
            }
        }








    }
}
