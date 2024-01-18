package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Bishop {
  private ChessMove move;
  private ChessPosition new_position;

  public ArrayList<ChessMove> GetMoves(ChessBoard board, ChessPosition position){
    ArrayList<ChessMove> moveList = new ArrayList<>();
    int row = position.getRow();
    int col = position.getColumn();
    int i = 0;
    int j = 0;

    /* Up and right diagonal*/
    i = row + 1;
    j = col + 1;
    while(i < 9 && j < 9){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
      i++;
      j++;
    }

    /* Up and left diagonal*/
    i = row + 1;
    j = col - 1;
    while(i < 9 && j > 0){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
      i++;
      j--;
    }

    /* Down and left diagonal*/
    i = row - 1;
    j = col - 1;
    while(i > 0 && j > 0){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
      i--;
      j--;
    }

    /* Down and right diagonal*/
    i = row - 1;
    j = col + 1;
    while(i > 0 && j < 9){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
      i--;
      j++;
    }
    return moveList;
  }
}