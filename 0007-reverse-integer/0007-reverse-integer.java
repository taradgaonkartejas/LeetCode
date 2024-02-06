class Solution {
    public int reverse(int x) {
        if(x==0){
            return 0;
        }
        long ans=0;
        long no=x;
        while(no!=0){
            ans=ans*10+no%10;
            no=no/10;
        }
        if(ans>Integer.MAX_VALUE || ans<= Integer.MIN_VALUE){
        return 0;
        }else{
            return (int)ans;
        }
    }
}