package chess;

import java.util.ArrayList;

public class King {
  private ChessMove move;
  private ChessPosition new_position;

  public ArrayList<ChessMove> GetKingMoves(ChessBoard board, ChessPosition position){
    ArrayList<ChessMove> moveList = new ArrayList<>();
    ChessPiece curr_piece = board.getPiece(position);
    int row = position.getRow();
    int col = position.getColumn();
    int i = 0;
    int j = 0;

    /* Up */
    i = row + 1;
    j = col;
    if(i < 9){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
    }

    /* Up-Right */
    i = row + 1;
    j = col + 1;
    if(i < 9 && j < 9){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
    }

    /* Up-Left */
    i = row + 1;
    j = col - 1;
    if(i < 9 && j > 0){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
    }

    /* Right */
    i = row;
    j = col + 1;
    if(j < 9){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
    }

    /* Left */
    i = row;
    j = col - 1;
    if(j > 0){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
    }

    /* Down */
    i = row - 1;
    j = col;
    if(i > 0){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
    }

    /* Down-Right */
    i = row - 1;
    j = col + 1;
    if(i > 0 && j < 9){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
    }

    /* Down-Left */
    i = row - 1;
    j = col - 1;
    if(i > 0 && j > 0){
      new_position = new ChessPosition(i,j);
      move = new ChessMove(position,new_position,null);
      moveList.add(move);
    }
    return moveList;
  }
}