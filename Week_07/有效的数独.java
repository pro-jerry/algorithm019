class Solution {
  public boolean isValidSudoku(char[][] board) {
     init data
    HashMapInteger, Integer [] rows = new HashMap[9];
    HashMapInteger, Integer [] columns = new HashMap[9];
    HashMapInteger, Integer [] boxes = new HashMap[9];
    for (int i = 0; i  9; i++) {
      rows[i] = new HashMapInteger, Integer();
      columns[i] = new HashMapInteger, Integer();
      boxes[i] = new HashMapInteger, Integer();
    }

     validate a board
    for (int i = 0; i  9; i++) {
      for (int j = 0; j  9; j++) {
        char num = board[i][j];
        if (num != '.') {
          int n = (int)num;
          int box_index = (i  3 )  3 + j  3;

           keep the current cell value
          rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
          columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
          boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);

           check if this value has been already seen before
          if (rows[i].get(n)  1  columns[j].get(n)  1  boxes[box_index].get(n)  1)
            return false;
        }
      }
    }

    return true;
  }
}
