class Solution 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        
        
        for(int i = 0; i < a.length; i++){
            min = Math.min(a[i], min);
            max = Math.max(a[i], max);
        }
        Pair p = new Pair(min,max);
        return p;
    }
}
