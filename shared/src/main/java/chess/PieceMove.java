package chess;

import java.util.Collection;
import java.util.ArrayList;

public class PieceMove {
  private ChessPosition position;
  private ChessPiece.PieceType pieceType;
  private Bishop bishop;
  private King king;
  private Knight knight;
  private Rook rook;

  public PieceMove(ChessPiece.PieceType pieceType){
    this.pieceType = pieceType;
    this.bishop = new Bishop();
    this.king = new King();
    this.knight = new Knight();
    this.rook = new Rook();
  }

  public ArrayList<ChessMove> BishopMoveCalculator(ChessPosition position, ChessBoard board){
    ArrayList<ChessMove> bishopMoves = new ArrayList<>();
    bishopMoves = bishop.GetBishopMoves(board, position);
    return bishopMoves;
  }

  public ArrayList<ChessMove> KingMoveCalculator(ChessPosition position, ChessBoard board){
    ArrayList<ChessMove> kingMoves = new ArrayList<>();
    kingMoves = king.GetKingMoves(board, position);
    return kingMoves;
  }

  public ArrayList<ChessMove> KnightMoveCalculator(ChessPosition position, ChessBoard board){
    ArrayList<ChessMove> knightMoves = new ArrayList<>();
    knightMoves = knight.GetKnightMoves(board,position);
    return knightMoves;
  }

  public ArrayList<ChessMove> RookMoveCalculator(ChessPosition position, ChessBoard board){
    ArrayList<ChessMove> rookMoves = new ArrayList<>();
    rookMoves = rook.GetRookMoves(position,board);
    return rookMoves;
  }

}