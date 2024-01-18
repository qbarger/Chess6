package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Bishop {
  private ChessMove move;
  private ChessPosition new_position;

  public ArrayList<ChessMove> GetBishopMoves(ChessBoard board, ChessPosition position){
    ArrayList<ChessMove> moveList = new ArrayList<>();
    ChessPiece curr_piece = board.getPiece(position);
    int row = position.getRow();
    int col = position.getColumn();
    int i = 0;
    int j = 0;

    /* Up and right diagonal*/
    i = row + 1;
    j = col + 1;
    while(i < 9 && j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i++;
        j++;
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
          break;
        }
        else {
          break;
        }
      }
    }

    /* Up and left diagonal*/
    i = row + 1;
    j = col - 1;
    while(i < 9 && j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i++;
        j--;
      }
      else {
        ChessPiece pieceCheck=board.getPiece(new_position);
        if (pieceCheck.getTeamColor() != curr_piece.getTeamColor()) {
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
          break;
        } else {
          break;
        }
      }
    }

    /* Down and left diagonal*/
    i = row - 1;
    j = col - 1;
    while(i > 0 && j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i--;
        j--;
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
          break;
        }
        else {
          break;
        }
      }
    }

    /* Down and right diagonal*/
    i = row - 1;
    j = col + 1;
    while(i > 0 && j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i--;
        j++;
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
          break;
        }
        else {
          break;
        }
      }
    }
    return moveList;
  }
}