package chess;

import java.util.ArrayList;

public class Queen {
  private ChessMove move;
  private ChessPosition new_position;
  private Bishop bishop;
  private Rook rook;

  public ArrayList<ChessMove> getQueenMoves(ChessBoard board, ChessPosition position) {
    ArrayList<ChessMove> moveList=new ArrayList<>();
    ArrayList<ChessMove> diagonalList=new ArrayList<>();
    ArrayList<ChessMove> straightList=new ArrayList<>();
    bishop = new Bishop();
    rook = new Rook();

    diagonalList = bishop.GetBishopMoves(board,position);
    straightList = rook.GetRookMoves(board,position);

    for(ChessMove move:diagonalList){
      moveList.add(move);
    }
    for(ChessMove move:straightList){
      moveList.add(move);
    }

    return moveList;
  }
}
