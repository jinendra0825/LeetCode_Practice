class Solution {
    public int numTrees(int n) {
        long result = 1;

        for(int i= 0 ; i < n ; i++){
            result = result * 2 * ( 2 * i + 1) / (i + 2);
        }
    return (int) result;
    }

}