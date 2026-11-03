class Solution {
public int minMoves(int[] nums) {
int max = 0, ans = 0;


    for (int n : nums)
        max = Math.max(max, n);

    for (int n : nums)
        ans += max - n;

    return ans;
}

}
