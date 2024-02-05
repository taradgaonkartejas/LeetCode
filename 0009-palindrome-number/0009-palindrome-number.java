class Solution {
    public boolean isPalindrome(int x) {
        int count=0;
        int num=x;
        do{
            num=num/10;
            count++;
        }while(num>=1);
        num=x;
       int no=0;
        for(int i=0;i<count;i++){
            no=no*10;
            no=no+num%10;
            num=(int)num/10;
        }

        if(x<0){
            return false;
        }else{
            if(no==x){
            return true;
        }else{
            return false;
        }
        }
    }
}