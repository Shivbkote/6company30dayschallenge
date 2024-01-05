class Solution {
 private Set<Integer> used = new HashSet<>();
 private int rows;
 private int cols;
 private int total;

  public Solution(int num_rows, int num_cols) {
    this.rows = num_rows;
    this.cols = num_cols;
    this.total = num_rows * num_cols;
  }

  public int[] flip() {
    
    if (used.size() == total)
      return new int[] {};
    int index = new Random().nextInt(total);
    while (used.contains(index))
      index = ++index % total;
    used.add(index);
    return new int[] {index / cols, index % cols};
  }

  public void reset() {
    used.clear();
  }

 
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */