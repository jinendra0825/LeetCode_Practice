class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gSize = g.length;
        int sSize = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int l = 0 ;
        int r = 0;

        while(l < sSize && r < gSize){
            if(g[r] <= s[l]){
                r++;
            }

            l++;
        }

        return r;
    }
}