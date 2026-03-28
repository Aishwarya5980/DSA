import java.util.Arrays;
class SecondLargestNumber {
    static int getSecondLargestInt(int[] arr){
        int largest= Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    
    public static void main(String[] args) {
        int[] arr = { 20,91,42,48 };
        System.out.println(getSecondLargestInt(arr));
    }
}
