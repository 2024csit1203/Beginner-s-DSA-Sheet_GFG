class Solution {
    int missingNumber(int array[], int n) {
        
        int sum1 = 0;// Your Code Here
        for(int i = 0; i < array.length; i++){
            sum1 = sum1 + array[i];
        }
        int sum2 = n*(n+1)/2;
        int diff = sum2 - sum1;
        return diff;
    }
}
