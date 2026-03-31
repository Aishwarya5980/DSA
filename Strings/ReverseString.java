class ReverseString {
    static String palindrom(String s){
        int left=0;
        int right=s.length()-1; 
        StringBuilder res = new StringBuilder(s);
        while(left<right){
            char temp=res.charAt(left);
            res.setCharAt(left, res.charAt(right));
            res.setCharAt(right, temp);
            left++;right--;
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s="abiklba";
        System.out.println(palindrom(s));
    }
}
