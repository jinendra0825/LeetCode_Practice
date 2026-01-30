class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) return false;

        String twice = s + s;
        return twice.contains(goal);
    }
}
