package chess;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * Represents a single chess piece
 * <p>
 * Note: You can add to this class, but you may not alter
 * signature of the existing methods.
 */
public class ChessPiece {
    private ChessGame.TeamColor pieceColor;
    private ChessPiece.PieceType pieceType;
    private PieceMove piece;

    public ChessPiece(ChessGame.TeamColor pieceColor, ChessPiece.PieceType type) {
        this.pieceColor = pieceColor;
        this.pieceType = type;
        piece = new PieceMove(pieceType);
    }

    /**
     * The various different chess piece options
     */
    public enum PieceType {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }

    /**
     * @return Which team this chess piece belongs to
     */
    public ChessGame.TeamColor getTeamColor() {
        return pieceColor;
    }

    /**
     * @return which type of chess piece this piece is
     */
    public PieceType getPieceType() {
        return pieceType;
    }

    /**
     * Calculates all the positions a chess piece can move to
     * Does not take into account moves that are illegal due to leaving the king in
     * danger
     *
     * @return Collection of valid moves
     */
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        ArrayList<ChessMove> setOfMoves = new ArrayList<>();
        if (pieceType == PieceType.BISHOP){
            setOfMoves = piece.BishopMoveCalculator(myPosition, board);
        }
        if (pieceType == PieceType.KING){
            setOfMoves = piece.KingMoveCalculator(myPosition, board);
        }
        if (pieceType == PieceType.KNIGHT){
            setOfMoves = piece.KnightMoveCalculator(myPosition, board);
        }
        if (pieceType == PieceType.ROOK){
            setOfMoves = piece.RookMoveCalculator(myPosition, board);
        }
        if (pieceType == PieceType.QUEEN){
            setOfMoves = piece.QueenMoveCalculator(myPosition, board);
        }
        if (pieceType == PieceType.PAWN){
            setOfMoves = piece.PawnMoveCalculator(myPosition,board);
        }
        return setOfMoves;
    }

    @Override
    public String toString() {
        return "ChessPiece{" + "pieceColor=" + pieceColor + ", pieceType=" + pieceType + ", piece=" + piece + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null){return false;}
        if (getClass() != o.getClass()){return false;}
        ChessPiece other = (ChessPiece) o;
        return pieceColor == other.pieceColor && pieceType == other.pieceType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieceColor, pieceType, piece);
    }
}