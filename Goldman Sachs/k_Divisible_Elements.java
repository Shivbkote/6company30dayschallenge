class Solution {
    public int countDistinct(int[] num, int k, int p) {
        int n = num.length;
        Set<Long> ways = new HashSet<>(); 
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            long hc = 1; 
            for(int j = i; j < n; j++) {
                hc = 199L * hc + num[j]; 
                if(num[j] % p == 0)
                    cnt++;
                if(cnt <= k) { 
                    ways.add(hc);
                }
            }
        }
        return ways.size();
    }
}