package chess;

import java.util.ArrayList;

public class Queen {

  private ChessPosition new_position;
  private ChessMove move;

  public ArrayList<ChessMove> GetQueenMoves(ChessPosition position, ChessBoard board) {
    ArrayList<ChessMove> moveList=new ArrayList<>();
    ChessPiece curr_piece=board.getPiece(position);
    int row=position.getRow();
    int col=position.getColumn();
    int i=0;
    int j=0;

    /* Queen's moves are Bishop and Rook moves together */
    /* Up, Down, Right, Left */

    /* Up */
    i=row + 1;
    j=col;
    while (i < 9) {
      new_position=new ChessPosition(i, j);
      if (board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i++;
      } else {
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

    /* Right */
    i=row;
    j=col + 1;
    while (j < 9) {
      new_position=new ChessPosition(i, j);
      if (board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        j++;
      } else {
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

    /* Left */
    i=row;
    j=col - 1;
    while (j > 0) {
      new_position=new ChessPosition(i, j);
      if (board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        j--;
      } else {
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

    /* Down */
    i=row - 1;
    j=col;
    while (i > 0) {
      new_position=new ChessPosition(i, j);
      if (board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i--;
      } else {
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

    /* Diagonals */

    /* Up and right diagonal*/
    i=row + 1;
    j=col + 1;
    while (i < 9 && j < 9) {
      new_position=new ChessPosition(i, j);
      if (board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i++;
        j++;
      } else {
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

    /* Up and left diagonal*/
    i=row + 1;
    j=col - 1;
    while (i < 9 && j > 0) {
      new_position=new ChessPosition(i, j);
      if (board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i++;
        j--;
      } else {
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
    i=row - 1;
    j=col - 1;
    while (i > 0 && j > 0) {
      new_position=new ChessPosition(i, j);
      if (board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i--;
        j--;
      } else {
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

    /* Down and right diagonal*/
    i=row - 1;
    j=col + 1;
    while (i > 0 && j < 9) {
      new_position=new ChessPosition(i, j);
      if (board.getPiece(new_position) == null) {
        move=new ChessMove(position, new_position, null);
        moveList.add(move);
        i--;
        j++;
      } else {
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
    return moveList;
  }
}