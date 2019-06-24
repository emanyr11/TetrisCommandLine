import java.io.IOException;
//import java.util.InputMismatchException;
import java.util.Random;
//import java.util.Scanner;

// Update peices
// Clear trails around peice
// Rotate peices
public class TetriCLIApplication {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Random generator = new Random();
		int shapePick = generator.nextInt(19) + 1;
		// int shapePick = 9;
		Screen sc = new Screen();
		Pieces piece = new Pieces();
		char[][] current = new char[4][4];
		// int shapePicknext = generator.nextInt(7) + 1;
		// int straightRotateCounter = 0;
		// int zigzagRotateCounter = 0;
		// int zigzagAltRotateCounter = 0;
		// int tRotateCounter = 0;
		// int lRotateCounter = 0;
		// int lAltRotateCounter = 0;
		int movecounter = 0;
		// int input = 0;
		// Scanner scan = new Scanner(System.in);

		System.out.println(
				"+-------------------------------------------------------------------------------------------------------+");
		System.out.println("|                                                                       				|");
		System.out.println("|                                                                       				|");
		System.out.println("|                                                                       				|");
		System.out.println(
				"|              <<b<<b<<b<<b<<b<<<<b<<b<<b<<b<<b<<<b<<b<<b<<b<<b<<<<b<<b<<b<<b<<<<b<<b<<b<<<b<<b         |");
		System.out.println(
				"|                <<b<<    <<b<<                <<b<<    <<b<<  <<b<<    <<b<<   <<b<<                   |");
		System.out.println(
				"|                <<b<<    <<b<<b<<b<<b<<b<<    <<b<<    <<b<<b<<b<<b    <<b<<   <<<b<<b<<b<<b<<         |");
		System.out.println(
				"|                <<b<<    <<b<<                <<b<<    <<b<<  <<b<<    <<b<<              <<b<<        |");
		System.out.println(
				"|                <<b<<    <<b<<b<<b<<b<<b<<    <<b<<    <<b<<   <<b<<<<b<<b<<b<<<<b<<b<<b<<b<<b         |");
		System.out.println("|       																				|");
		System.out.println("|                                                                       				|");
		System.out
				.println("|                         -PRESS 1 To Start-                                 				|");
		System.out.println("|Controls:                                                              				|");
		System.out.println("|  D Key - move left                                               				|");
		System.out.println("|  A Key - move right                                             				|");
		System.out.println("|  S Key - move down                                          				|");
		System.out.println("|  Space bar - Rotate                                         				|");
		System.out.println("|                                             By Emmanuel Reid					  	|");
		System.out.println(
				"+-------------------------------------------------------------------------------------------------------+");

		if (shapePick == 1) {
			current = piece.getStraightPiece();
		}
		if (shapePick == 2) {
			current = piece.getStraightPieceR();
		} else if (shapePick == 3) {
			current = piece.getSquarePiece();
		} else if (shapePick == 4) {
			current = piece.getZigzagPiece();
		} else if (shapePick == 5) {
			current = piece.getZigzagPieceR();
		} else if (shapePick == 6) {
			current = piece.getZigzagPiecealt();
		} else if (shapePick == 7) {
			current = piece.getZigzagPiecealtR();
		} else if (shapePick == 8) {
			current = piece.gettPiece();
		} else if (shapePick == 9) {
			current = piece.gettPieceR1();
		} else if (shapePick == 10) {
			current = piece.gettPieceR2();
		} else if (shapePick == 11) {
			current = piece.gettPieceR3();
		} else if (shapePick == 12) {
			current = piece.getlPiece();
		} else if (shapePick == 13) {
			current = piece.getlPieceR1();
		} else if (shapePick == 14) {
			current = piece.getlPieceR2();
		} else if (shapePick == 15) {
			current = piece.getlPieceR3();
		} else if (shapePick == 16) {
			current = piece.getlPieceAlt();
		} else if (shapePick == 17) {
			current = piece.getlPieceAltR1();
		} else if (shapePick == 18) {
			current = piece.getlPieceAltR2();
		} else if (shapePick == 19) {
			current = piece.getlPieceAltR3();
		}

		boolean test = false;
		sc.toScreen();
		sc.nextPiece(current, shapePick);

		try {
			while (true) {
				char c = ' ';
				try {
					c = (char) System.in.read();
				} catch (IOException e) {

					e.printStackTrace();
				}
				if (sc.moving == false) {
					c = 's';
					sc.setID(shapePick);
					sc.toScreen();
				}
				if (movecounter == 1) {
					if (c == 's') {
						// test=true;
						test = sc.toScreen();
						movecounter--;
					}

				} else {
					if (c == 's') {
						test = sc.toScreen();
					} else if (c == ' ') {
						System.out.println(sc.id);

						// System.out.println(shapePicknext);
						if (sc.id == 1) {
							if ((sc.left > 1) && (sc.left < 6)) {
								current = piece.getStraightPieceR();
								sc.clearTrails();
								sc.setID(2);
								sc.rotate(current);
								sc.toScreen();
							} else {
								System.out.println("Not enough room to rotate");
							}

						} else if (sc.id == 2) {
							current = piece.getStraightPiece();
							sc.clearTrails();
							sc.setID(1);
							sc.rotate(current);
							sc.toScreen();
						} else if (sc.id == 3) {
							current = piece.getSquarePiece();
							sc.clearTrails();
							sc.setID(3);
							sc.toScreen();
						} else if (sc.id == 4) {
							current = piece.getZigzagPieceR();
							sc.clearTrails();
							sc.setID(5);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 5) {
							current = piece.getZigzagPiece();
							sc.clearTrails();
							sc.setID(4);
							sc.rotate(current);
							sc.toScreen();
						}
						if (sc.id == 6) {
							current = piece.getZigzagPiecealtR();
							sc.clearTrails();
							sc.setID(7);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 7) {
							current = piece.getZigzagPiecealt();
							sc.clearTrails();
							sc.setID(6);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 8) {
							current = piece.gettPieceR1();
							sc.clearTrails();
							sc.setID(9);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 9) {
							if ((sc.left > 0) && (sc.left < 8)) {
								current = piece.gettPieceR2();
								sc.clearTrails();
								sc.setID(10);
								sc.rotate(current);
								sc.toScreen();
							} else {
								System.out.println("Not enough room ");
							}

						} else if (sc.id == 10) {
							current = piece.gettPieceR3();
							sc.clearTrails();
							sc.setID(11);
							sc.rotate(current);
							sc.toScreen();
						}
						if (sc.id == 11) {
							current = piece.gettPiece();
							sc.clearTrails();
							sc.setID(8);
							sc.rotate(current);
							sc.toScreen();

						}
						if (sc.id == 12) {
							current = piece.getlPieceR1();
							sc.clearTrails();
							sc.setID(13);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 13) {
							current = piece.getlPieceR2();
							sc.clearTrails();
							sc.setID(14);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 14) {
							current = piece.getlPieceR3();
							sc.clearTrails();
							sc.setID(15);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 15) {
							current = piece.getlPiece();
							sc.clearTrails();
							sc.setID(12);
							sc.rotate(current);
							sc.toScreen();
						}
						if (sc.id == 16) {
							current = piece.getlPieceAltR1();
							sc.clearTrails();
							sc.setID(17);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 17) {
							current = piece.getlPieceAltR2();
							sc.clearTrails();
							sc.setID(18);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 18) {
							current = piece.getlPieceAltR3();
							sc.clearTrails();
							sc.setID(19);
							sc.rotate(current);
							sc.toScreen();

						} else if (sc.id == 19) {
							current = piece.getlPieceAlt();
							sc.clearTrails();
							sc.setID(16);
							sc.rotate(current);
							sc.toScreen();
						}
					}

					else if (c == 'a') {
						// System.out.println("Move left");

						sc.setID(shapePick);
						sc.moveLeft();
						// test = sc.toScreen();
						sc.toScreen();
					} else if (c == 'd') {
						// System.out.println("Move right");
						sc.setID(shapePick);
						sc.moveRight();
						// test = sc.toScreen();
						sc.toScreen();
					}

				}

				if (!test) {
					// if array out of bounds break
					// print j=highdscore first
					sc.clearLine();
					shapePick = generator.nextInt(19) + 1;
					// shapePicknext = generator.nextInt(2) + 1;
					// shapePicknext = 1;
					if (shapePick == 1) {
						current = piece.getStraightPiece();
					}
					if (shapePick == 2) {
						current = piece.getStraightPieceR();
					} else if (shapePick == 3) {
						current = piece.getSquarePiece();
					} else if (shapePick == 4) {
						current = piece.getZigzagPiece();
					} else if (shapePick == 5) {
						current = piece.getZigzagPieceR();
					} else if (shapePick == 6) {
						current = piece.getZigzagPiecealt();
					} else if (shapePick == 7) {
						current = piece.getZigzagPiecealtR();
					} else if (shapePick == 8) {
						current = piece.gettPiece();
					} else if (shapePick == 9) {
						current = piece.gettPieceR1();
					} else if (shapePick == 10) {
						current = piece.gettPieceR2();
					} else if (shapePick == 11) {
						current = piece.gettPieceR3();
					} else if (shapePick == 12) {
						current = piece.getlPiece();
					} else if (shapePick == 13) {
						current = piece.getlPieceR1();
					} else if (shapePick == 14) {
						current = piece.getlPieceR2();
					} else if (shapePick == 15) {
						current = piece.getlPieceR3();
					} else if (shapePick == 16) {
						current = piece.getlPieceAlt();
					} else if (shapePick == 17) {
						current = piece.getlPieceAltR1();
					} else if (shapePick == 18) {
						current = piece.getlPieceAltR2();
					} else if (shapePick == 19) {
						current = piece.getlPieceAltR3();
					}
					sc.nextPiece(current, shapePick);
					movecounter = 1;
					// System.out.println(sc.getHighscore());

				}
			}
		} catch (Exception e) {

		} finally {
			System.out.println("+----------------------------------+");
			System.out.println("|     Highscore :" + sc.getHighscore() + " Game Over       |");
			System.out.println("+----------------------------------+");
		}

	}

}
