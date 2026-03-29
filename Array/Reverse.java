import java.util.Arrays;
class Reverse{
    static void print(int[] arr){
        int[] temp=new int[arr.length];
        for(int i=0; i<(arr.length); i++){
            temp[i]=arr[arr.length-i-1];
        }
        System.out.println(Arrays.toString(temp));
    }
    static void reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void reverse2(int[] arr){
        int[] temp=new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            temp[arr.length-1-i]=arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }    
    static int maxProduct(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int mul=Integer.MIN_VALUE;
        // To maximise the result return the maximum of  product of the last 
        // three elements of the array and the product of the first two elements
        // and last element.
        // if(n>3){
        //     mul= arr[n-1]*arr[n-2]*arr[n-3];
        // }else if(n<=2){
        //     mul= arr[n-1]*arr[n-2];
        // }else{
        //     mul= arr[n-1];
        // }
        
        // mul=Math.max(arr[n-1]*arr[n-2]*arr[n-3],arr[0]*arr[1]*arr[2]);
        // return mul;
        return Math.max(arr[0] * arr[1] * arr[n - 1],
                        arr[n - 1] * arr[n - 2] * arr[n - 3]);
        
    }
    
    public static void main(String [] args){
        int[] arr= {56,32,85,98,22};
        reverse2(arr);
        maxProduct(arr);
    }
}
