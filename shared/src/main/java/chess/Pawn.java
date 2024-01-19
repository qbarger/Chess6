package chess;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pawn {
  private ChessMove move;
  private ChessMove move2;
  private ChessPosition new_position;
  private ChessPosition new_position2;

  public ArrayList<ChessMove> GetPawnMoves(ChessBoard board, ChessPosition position){
    ArrayList<ChessMove> moveList = new ArrayList<>();
    ChessPiece curr_piece = board.getPiece(position);
    int row =position.getRow();
    int col =position.getColumn();
    int i = 0;
    int j = 0;

    /* Determine which color the pawn is */
    if(curr_piece.getTeamColor() == ChessGame.TeamColor.WHITE){
      if(row == 2){
        i = row + 1;
        j = col;
        new_position = new ChessPosition(i,j);
        new_position2 = new ChessPosition(i + 1,j);
        move = new ChessMove(position,new_position,null);
        move2 = new ChessMove(position,new_position2,null);
        moveList.add(move);
        moveList.add(move2);
      }
      else {
        i = row + 1;
        j = col;
        new_position = new ChessPosition(i,j);
        move = new ChessMove(position,new_position,null);
        moveList.add(move);
      }

    }
    else {
      if(row == 7){
        i = row - 1;
        j = col;
        new_position = new ChessPosition(i,j);
        new_position2 = new ChessPosition(i - 1,j);
        move = new ChessMove(position,new_position,null);
        move2 = new ChessMove(position,new_position2,null);
        moveList.add(move);
        moveList.add(move2);
      }
      else {
        i = row - 1;
        j = col;
        new_position = new ChessPosition(i,j);
        move = new ChessMove(position,new_position,null);
        moveList.add(move);
      }
    }
    return moveList;
  }
}