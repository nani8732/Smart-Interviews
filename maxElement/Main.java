    import java.util.*;

    public class Main {
        public static int maxElement(int[] arr,int n){
            int maxE = arr[0];
            for(int i=1;i<n;i++){
                if(arr[i] > maxE){
                    maxE = arr[i];
                }
            }
            return maxE;
        }

        public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int t = cs.nextInt();
        while(t-- > 0){
                int n = cs.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = cs.nextInt();
                }
                System.out.println(maxElement(arr,n));

        }



        }
    }