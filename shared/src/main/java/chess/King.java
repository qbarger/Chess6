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
      if(board.getPiece(new_position) == null) {
        new_position=new ChessPosition(i, j);
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(curr_piece.getTeamColor() != pieceCheck.getTeamColor()){
          new_position=new ChessPosition(i, j);
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* move invalid */
        }
      }
    }

    /* Up-Right */
    i = row + 1;
    j = col + 1;
    if(i < 9 && j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        new_position=new ChessPosition(i, j);
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(curr_piece.getTeamColor() != pieceCheck.getTeamColor()){
          new_position=new ChessPosition(i, j);
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* move invalid */
        }
      }
    }

    /* Up-Left */
    i = row + 1;
    j = col - 1;
    if(i < 9 && j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        new_position=new ChessPosition(i, j);
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(curr_piece.getTeamColor() != pieceCheck.getTeamColor()){
          new_position=new ChessPosition(i, j);
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* move invalid */
        }
      }
    }

    /* Right */
    i = row;
    j = col + 1;
    if(j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        new_position=new ChessPosition(i, j);
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(curr_piece.getTeamColor() != pieceCheck.getTeamColor()){
          new_position=new ChessPosition(i, j);
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* move invalid */
        }
      }
    }

    /* Left */
    i = row;
    j = col - 1;
    if(j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        new_position=new ChessPosition(i, j);
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(curr_piece.getTeamColor() != pieceCheck.getTeamColor()){
          new_position=new ChessPosition(i, j);
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* move invalid */
        }
      }
    }

    /* Down */
    i = row - 1;
    j = col;
    if(i > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        new_position=new ChessPosition(i, j);
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(curr_piece.getTeamColor() != pieceCheck.getTeamColor()){
          new_position=new ChessPosition(i, j);
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* move invalid */
        }
      }
    }

    /* Down-Right */
    i = row - 1;
    j = col + 1;
    if(i > 0 && j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        new_position=new ChessPosition(i, j);
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(curr_piece.getTeamColor() != pieceCheck.getTeamColor()){
          new_position=new ChessPosition(i, j);
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* move invalid */
        }
      }
    }

    /* Down-Left */
    i = row - 1;
    j = col - 1;
    if(i > 0 && j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        new_position=new ChessPosition(i, j);
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(curr_piece.getTeamColor() != pieceCheck.getTeamColor()){
          new_position=new ChessPosition(i, j);
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
        else {
          /* move invalid */
        }
      }
    }
    return moveList;
  }
}