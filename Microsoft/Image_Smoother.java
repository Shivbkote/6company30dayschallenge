class Solution {
    public int[][] imageSmoother(int[][] img) {
      var moves = new int[] {-1, 0, 1};
  
      var p = img.length;
      var q = img[0].length;
  
      var res = new int[p][q];
  
      for (var i=0; i<p; i++) {
        for (var j=0; j<q; j++) {
          var cnt = 0;
          var val = 0;
  
          for (var a : moves) {
            for (var b : moves) {
              var x = i + a;
              var y = j + b;
  
              if (x < 0 || x >= p || y < 0 || y >= q) continue;
  
              cnt++;
              val += img[x][y];
            }
          }
          res[i][j] = val / cnt;
        }
      }
      return res;
    }
  }