public class Algorithm {

    public Algorithm () {
    }

    public int[] sort (int[] arr) {
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
        return arr;
    }

    public String isDuplicated (String word){
        char[] chars = word.toCharArray();
        for ( char aChar : chars){
            int counter = 0;
            for (char bChar : chars) {
                if (aChar == bChar) {
                    counter++;
                }
            }
            if (counter == 2) return word;
        }
        return "";
    }

}
