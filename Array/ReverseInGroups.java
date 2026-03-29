import java.util.Arrays;
class ReverseInGroups {
     static void reverseInGroups(int k, int[] arr){
            int n= arr.length;
            for(int i=0;i<n;i=i+k){
                int start=i;
                int end=Math.min(i+k-1,n-1);
                while(end>start){
                    int temp=arr[end];
                    arr[end]=arr[start];
                    arr[start]=temp;
                    start++;
                    end--;
                }
            }
            System.out.println(Arrays.toString(arr));
            
        }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int k=3;
        reverseInGroups(k,arr);
    }
}
