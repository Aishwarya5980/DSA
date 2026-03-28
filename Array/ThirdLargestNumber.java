import java.util.Arrays;
class ThirdLargestNumber {
    static int getThirdLargestInt(int[] arr){
        int largest= Integer.MIN_VALUE;
        int secondlargest= Integer.MIN_VALUE;
        int thirdlargest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                thirdlargest=secondlargest;
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i] > secondlargest && arr[i] != largest) {
                thirdlargest=secondlargest;
                secondlargest = arr[i];
            }else if(arr[i] > thirdlargest && arr[i] != largest && arr[i] != secondlargest){
                thirdlargest= arr[i];
            }
            
        }
        return thirdlargest;
    }
    
    public static void main(String[] args) {
        int[] arr = { 20,91,42,48 };
        System.out.println(getThirdLargestInt(arr));
    }
}
