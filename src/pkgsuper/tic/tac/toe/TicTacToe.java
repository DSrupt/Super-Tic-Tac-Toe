class TicTacToe {
  private int[][] TTT = new int[3][3];

  // initialize every value to -1
  TicTacToe(){
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
          TTT[i][j] = -1;
      }
    }
  }

  /*
      i and j indicate the position of the players choice.
      value is the value to be changed to.
      X = 1 O = 0
      returns false if the spot is already chosen.
      The view will update only if this method returns true.
  */
  boolean mark(int i, int j, int value){
    if(TTT[i][j]==-1){
      TTT[i][j] = value;
      return true;
    }
    else {
      return false;
    }
  }

  // returns true if every tile in the Game has been selected.
  boolean isFull(){
      for (int i=0;i<3 ;i++ ) {
        for (int j=0;j<3 ;j++ ) {
          if(TTT[i][j] == -1)
          {
            return false;
          }
        }
      }
      return true;
  }
  boolean isOver(){
    // check horizontal
    if(isFull()){
      winner = -1;
      return true;
    }

    for(int i=0;i<3;i++){
      if( (TTT[i][0] == TTT[i][1]) && (TTT[i][0] == TTT[i][2])){
        winner = TTT[i][0];
        return true;
      }
    }
    //check vertical
    for(int i=0;i<3;i++){
      if( (TTT[0][i] == TTT[1][i]) && (TTT[0][i] == TTT[2][i])){
        winner = TTT[0][i];
        return true;
      }

    }
    //check diagonal
    if( (TTT[0][0] == TTT[1][1]) && (TTT[0][0] == TTT[2][2])){
      winner = TTT[0][0];
      return true;
    }
    if( (TTT[0][2] == TTT[1][1]) && (TTT[0][2] == TTT[2][0])){
      winner = TTT[0][2];
      return true;
    }
    return false;
  }
private int winner = -1;
}
