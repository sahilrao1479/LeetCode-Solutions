 class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a, (x,y) -> x[0] - y[0]);
        List<int[]> ans = new ArrayList<>();
        int[] p = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i][0] <= p[1])
                p[1] = Math.max(p[1], a[i][1]);
            else {
                ans.add(p);
                p = a[i];
            }
        }

        ans.add(p);
        return ans.toArray(new int[0][]);
    }
}