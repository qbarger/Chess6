package chess;

import java.util.Collection;
import java.util.ArrayList;

public class PieceMove {
  private ChessPosition position;
  private ChessPiece.PieceType pieceType;
  private Bishop bishop;

  public PieceMove(ChessPiece.PieceType pieceType){
    this.pieceType = pieceType;
    this.bishop = new Bishop();
  }

  public ArrayList<ChessMove> BishopMoveCalculator(ChessPosition position, ChessBoard board){
    ArrayList<ChessMove> bishopMoves = new ArrayList<>();
    bishopMoves = bishop.GetMoves(board, position);
    return bishopMoves;
  }

}