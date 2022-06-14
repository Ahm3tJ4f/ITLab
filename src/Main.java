public class Main {
    public static void main(String[] args) {
        int[] arr = new  int[1000];

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random()*1000-500);
        }

        int i = 0;
        while (i != arr.length-1){
        if(arr[i] > arr[i+1]  ){

                arr[i] += arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] -= arr[i+1];

                i=  -1;
            }
            i++;
        }


        for (int k : arr) {
            System.out.println(k);
        }


    }
}

