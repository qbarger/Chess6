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
        /* one space */
        new_position = new ChessPosition(i,j);
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck == null) {
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* invalid move */
        }

        /* two spaces */
        new_position2 = new ChessPosition(i + 1,j);
        ChessPiece pieceCheck2 = board.getPiece(new_position2);
        if(pieceCheck2 == null && pieceCheck == null) {
          move2=new ChessMove(position, new_position2, null);
          moveList.add(move2);
        }
        else {
          /* invalid move */
        }
      }
      else {
        i = row + 1;
        j = col;
        new_position = new ChessPosition(i,j);
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck == null) {
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* Invalid move */
        }
      }

    }

    /* Pawn is black */
    else {
      if(row == 7){
        i = row - 1;
        j = col;
        /* one space */
        new_position = new ChessPosition(i,j);
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck == null) {
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* invalid move */
        }

        /* two spaces */
        new_position2 = new ChessPosition(i - 1,j);
        ChessPiece pieceCheck2 = board.getPiece(new_position2);
        if(pieceCheck2 == null && pieceCheck == null) {
          move2=new ChessMove(position, new_position2, null);
          moveList.add(move2);
        }
        else {
          /* invalid move */
        }
      }
      else {
        i = row - 1;
        j = col;
        new_position = new ChessPosition(i,j);
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck == null) {
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* invalid move */
        }
      }
    }
    return moveList;
  }
}