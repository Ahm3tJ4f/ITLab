public class Main {
    public static void main(String[] args) {
        int[] arr = new  int[10];
        Algorithm alg = new Algorithm();

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*1000-500);
        }

        arr = alg.sort(arr);

        for (int k : arr) {
            System.out.println(k);
        }


    }
}