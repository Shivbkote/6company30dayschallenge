class Solution {
    public int findTheWinner(int n, int k) {
    
        List<Integer> player = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            player.add(i);
        }
        int index = 0;
        while (player.size() > 1) {
           
            index = (index + k - 1) % player.size();
            
            
            player.remove(index);
        }
        return player.get(0);
    }
    public static void main(String[] args) {
    Solution solution = new Solution();

    // Test 1
    int result1 = solution.findTheWinner(6, 5);
    System.out.println("Winner for (n=6, k=5): " + result1);

    // Test 2
    int result2 = solution.findTheWinner(5, 2);
    System.out.println("Winner for (n=5, k=2): " + result2);
}
}


