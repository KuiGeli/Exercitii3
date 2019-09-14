

public class Exc2 {

    public static void main(String[] args) {
        int[] n = new int[]{101, 3, 15, 90, 100, 70};
        int maxim = n[0];


        for (int x = 1; x<n.length;x++){



            if (maxim<n[x]){
                maxim = n[x];
            }

        }

        System.out.println(maxim);


    }


}
