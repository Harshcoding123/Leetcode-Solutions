class Solution {
    public int maxVowels(String s, int k) {
        int c=0;int ans=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') c++;
            if(i==k-1) ans= Math.max(ans,c);
            if(i>=k){
                char ch2 =s.charAt(i-k);
                if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u') c--;
                ans =Math.max(ans,c);
            }
        }
        return ans;
        
    }
}