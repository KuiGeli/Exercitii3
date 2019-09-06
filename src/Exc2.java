

public class Exc2 {

    public static void main(String[] args) {
        int[] n = new int[]{5, 3, 15, 6, 12, 5};
        int maxim = 0;


        for (int x = 1; x<n.length;x++){

           int maximCheck = n[x-1];
            if (maximCheck>n[x]){
                maxim = n[x-1];
            }

        }

        System.out.println(maxim);


    }


}
