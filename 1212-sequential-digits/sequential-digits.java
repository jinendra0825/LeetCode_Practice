class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        
        int num = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                
                num = num * 10 + j;

                if(num > high){
                    break;
                }

                if (num >= low && num <= high) {
                    if(ans.contains(num)) continue;
                    else ans.add(num);
                }
            }

            num = i;

        }

        Collections.sort(ans);

        return ans;
    }
}