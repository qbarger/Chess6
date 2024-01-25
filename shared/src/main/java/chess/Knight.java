package chess;

import java.util.ArrayList;

public class Knight {

  private ChessMove move;
  private ChessPosition new_position;

  public ArrayList<ChessMove> GetKnightMoves(ChessBoard board, ChessPosition position){
    ArrayList<ChessMove> moveList = new ArrayList<>();
    ChessPiece curr_piece = board.getPiece(position);
    int row = position.getRow();
    int col = position.getColumn();
    int i = 0;
    int j = 0;

    /* Up 2 Right 1 */
    i = row + 2;
    j = col + 1;
    if(i < 9 && j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
      }
    }

    /* Up 2 Left 1 */
    i = row + 2;
    j = col - 1;
    if(i < 9 && j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
      }
    }

    /* Right 2 Up 1 */
    i = row + 1;
    j = col + 2;
    if(i < 9 && j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
      }
    }

    /* Right 2 Down 1 */
    i = row - 1;
    j = col + 2;
    if(i > 0 && j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
      }
    }

    /* Left 2 Up 1 */
    i = row + 1;
    j = col - 2;
    if(i < 9 && j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
      }
    }

    /* Left 2 Down 1 */
    i = row - 1;
    j = col - 2;
    if(i > 0 && j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
      }
    }

    /* Down 2 Right 1 */
    i = row - 2;
    j = col + 1;
    if(i > 0 && j < 9){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
      }
    }

    /* Down 2 Left 1 */
    i = row - 2;
    j = col - 1;
    if(i > 0 && j > 0){
      new_position = new ChessPosition(i,j);
      if(board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
      }
      else {
        ChessPiece pieceCheck = board.getPiece(new_position);
        if(pieceCheck.getTeamColor() != curr_piece.getTeamColor()){
          move=new ChessMove(position, new_position, null);
          moveList.add(move);
        }
      }
    }

    return moveList;
  }
}