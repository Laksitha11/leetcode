class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        long ans1 = 0;
        for(int i = 0; i < arr.length; i++) {
            ans1 += Math.abs(arr[i]-brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        long ans = k;
        for(int i = 0; i < arr.length; i++) {
            ans += Math.abs(arr[i]-brr[i]);
        }
        return Math.min(ans, ans1);
    }
}