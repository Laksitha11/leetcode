class Solution {
    public boolean isPalindrome(int x) {
     if (x < 0) return false; 
    int y=x;
        int rem=0;
        while(x>0){
           int digit= x%10;
           rem= rem *10+digit;  
            x=x/10;
        }
        return y == rem;

    }
}