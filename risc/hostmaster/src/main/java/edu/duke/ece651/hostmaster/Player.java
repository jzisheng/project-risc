package edu.duke.ece651.hostmaster;

public class Player {
  Board board;
  public Player(){
    this.board = new Board();
  }
  public Coordinate readCoordinate(){
    return new Coordinate();
  }
public Board getBoard() {
	return board;
}
public void setBoard(Board board) {
	this.board = board;
}
}
