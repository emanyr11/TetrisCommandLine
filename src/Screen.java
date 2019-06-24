import java.util.ArrayList;

//import java.util.Arrays;
// clear rotate
// Check if out of bounds 
// Move left 
/**
 * 
 * @author mcg2693
 *
 */
public class Screen {
	private char[][] onscreen = new char[4][4];
	int up = 0;
	int left = 5;
	int height = -4;
	int id = 0;
	private int highscore = 0;
	public static boolean moving = true;
	int counterl = 0;
	char[][] logic = { { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' } };

	char[][] screen = { { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
			{ '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' } };

	public boolean clearLine() {
		int counter = 0;
		ArrayList<char[]> temp = new ArrayList<>();
		char[] empty = { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' };

		for (int x = 0; x < logic.length; x++) {
			temp.add(logic[x]);
		}
		for (int i = 20; i > 0; i--) {

			for (int j = 0; j < 12; j++) {
				if (logic[i][j] == '#') {
					counter++;
				}
			}
			if (counter == 10) {
				temp.remove(i);
				// index = i;
				temp.add(0, empty);
				// setHighscore(getHighscore() + 1);
				highscore++;
			}

			counter = 0;
		}
		/*
		 * System.out.println("reusing these lines"); for(char[] c:temp) {
		 * System.out.println(Arrays.toString(c)); }
		 * System.out.println("temp size after removing element "+temp.size());
		 */

		for (int i = 0; i < logic.length; i++) {
			logic[i] = temp.get(i);
		}
		screen = logic;

		return false;

	}

	public boolean toScreen() {
		clearTrails();
		// System.out.println("up value: "+up);
		if ((up + 4) == screen.length - 1) // hit bottom
		{
			moving = false;
			addToLogicArray();
		} else if (logicCheck() == false) // is space below
		{
			moving = false;
			addToLogicArray();
		} else {
			up++;
			height++;
		}

		if ((height >= -4)) {
			if (onscreen[3][0] == '#') {
				screen[up + 3][left] = onscreen[3][0];
			}
			if (onscreen[3][1] == '#') {
				screen[up + 3][left + 1] = onscreen[3][1];
			}
			if (onscreen[3][2] == '#') {
				screen[up + 3][left + 2] = onscreen[3][2];
			}
			if (onscreen[3][3] == '#') {
				screen[up + 3][left + 3] = onscreen[3][3];
			}

			if (height >= -3) {
				if (onscreen[2][0] == '#') {
					screen[up + 2][left] = onscreen[2][0];
				}
				if (onscreen[2][1] == '#') {
					screen[up + 2][left + 1] = onscreen[2][1];
				}
				if (onscreen[2][2] == '#') {
					screen[up + 2][left + 2] = onscreen[2][2];
				}
				if (onscreen[2][3] == '#') {
					screen[up + 2][left + 3] = onscreen[2][3];
				}
				if (height >= -2) {
					if (onscreen[1][0] == '#') {
						screen[up + 1][left] = onscreen[1][0];
					}
					if (onscreen[1][1] == '#') {
						screen[up + 1][left + 1] = onscreen[1][1];
					}
					if (onscreen[1][2] == '#') {
						screen[up + 1][left + 2] = onscreen[1][2];
					}
					if (onscreen[1][3] == '#') {
						screen[up + 1][left + 3] = onscreen[1][3];
					}
					if (height >= -1) {
						if (onscreen[0][0] == '#') {
							screen[up][left] = onscreen[0][0];
						}
						if (onscreen[0][1] == '#') {
							screen[up][left + 1] = onscreen[0][1];
						}
						if (onscreen[0][2] == '#') {
							screen[up][left + 2] = onscreen[0][2];
						}
						if (onscreen[0][3] == '#') {
							screen[up][left + 3] = onscreen[0][3];
						}
					}
				}
			}
		}

		if (((up != 0) || (up != 1) || (up != 2) || (up != 3)) && (height >= 0)) // Clear above peices
		{// TOP
			if (id == 1) // straight line
			{
				screen[up - 1][left + 1] = ' ';
			}
			if (id == 2) // straight R
			{
				screen[up][left] = ' ';
				screen[up][left + 1] = ' ';
				screen[up][left + 2] = ' ';
				screen[up][left + 3] = ' ';

				screen[up + 1][left] = ' ';
				screen[up + 1][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
				screen[up + 1][left + 3] = ' ';

				screen[up + 2][left] = ' ';
				screen[up + 2][left + 1] = ' ';
				screen[up + 2][left + 2] = ' ';
				screen[up + 2][left + 3] = ' ';

			}
			if (id == 3) // square
			{
				screen[up + 1][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';

			} else if (id == 4) // zigzag
			{
				screen[up + 1][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
				screen[up + 2][left + 3] = ' ';
				// screen[up+2][left+1] = ' ';
			} else if (id == 5) // zigzag R
			{
				screen[up + 1][left + 1] = ' ';
				screen[up][left + 2] = ' ';
				// screen[up+2][left+3] = ' ';
			} else if (id == 6) // alt zig zag
			{
				screen[up + 2][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
				screen[up + 1][left + 3] = ' ';
			} else if (id == 7) // alt zig zag R
			{
				screen[up][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
				// screen[up+1][left+3] = ' ';
			} else if (id == 8) // tee
			{
				screen[up + 1][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
				screen[up + 1][left + 3] = ' ';
			} else if (id == 9) // tee R1
			{
				// screen[up+1][left+1] = ' ';
				// screen[up+1][left+2] = ' ';
				screen[up + 1][left + 2] = ' ';
				screen[up][left + 3] = ' ';

			} else if (id == 10) // tee R2
			{
				// screen[up+1][left+1] = ' ';
				// screen[up+1][left+2] = ' ';
				// screen[up+1][left+3] = ' ';
				screen[up + 2][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
				screen[up + 2][left + 3] = ' ';
			} else if (id == 11) // tee R3
			{
				screen[up][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';

			} else if (id == 12) // elll
			{
				screen[up][left + 1] = ' ';
				screen[up + 2][left + 2] = ' ';
			} else if (id == 13) // elll R1
			{
				screen[up + 1][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
				screen[up + 1][left + 3] = ' ';
			} else if (id == 14) // elll R2
			{
				screen[up][left + 1] = ' ';
				screen[up][left] = ' ';
			} else if (id == 15) // elll R3
			{
				screen[up + 2][left] = ' ';
				screen[up + 2][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
			} else if (id == 16) // alt elll
			{
				screen[up + 2][left] = ' ';
				screen[up][left + 1] = ' ';

			} else if (id == 17) // alt elll R1
			{
				screen[up + 1][left] = ' ';
				screen[up + 2][left + 1] = ' ';
				screen[up + 2][left + 3] = ' ';
			} else if (id == 18) // alt elll R2
			{
				screen[up][left + 1] = ' ';
				screen[up][left + 2] = ' ';
			} else if (id == 19) // alt elll R3
			{
				screen[up + 1][left] = ' ';
				screen[up + 1][left + 1] = ' ';
				screen[up + 1][left + 2] = ' ';
			}
			/*
			 * if(left+3!=10) { screen[up-1][left+4] = ' '; // MOves left }
			 */

		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("+----------------------------------------------------------+");
		System.out.println("||" + "   _________  _______  _________  ________  ___  ________|");
		System.out.println("| |" + " |\\___   ___\\\\  ___ \\|\\___   ___\\\\   __  \\|\\  \\|\\   ____\\|");
		System.out.println("|  |" + "\\|___ \\  \\_\\ \\   __/\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\ \\  \\___|_|");
		System.out.println("|   |" + "    \\ \\  \\ \\ \\  \\_|/__  \\ \\  \\ \\ \\   _  _\\ \\  \\ \\_____  \\|");
		System.out.println("|    |" + "    \\ \\  \\ \\ \\  \\_|\\ \\  \\ \\ \\\\   \\  \\    \\ \\  \\|____|\\  \\|");
		System.out.println("|     |" + "    \\ \\__\\ \\ \\_______\\  \\ \\__\\\\  \\__\\  _ \\ \\__\\____\\_\\  \\|");
		System.out.println("|      |" + "    \\|__|  \\|_______|   \\|__|  \\|__|\\|__|\\|__|\\_________\\|");
		System.out.println("|       |" + "                                            \\|_________| |");
		System.out.print("+-----------------------------------------------------------------+");
		for (int i = 0; i < screen.length; i++) {

			for (int j = 0; j < screen[i].length; j++) {

				System.out.print(screen[i][j]);
				counterl++;

			}
			System.out.println("                                                      |");

		}
		System.out.println("+-----------------------------------------------------------------+");
		System.out.println("|Highscore: " + highscore + "                                                     |");
		System.out.println("+-----------------------------------------------------------------+");
		// System.out.println("logic array");
		/*
		 * for(int i = 0; i < screen.length; i ++) {
		 * 
		 * for(int j = 0; j < screen[i].length; j ++) { System.out.print(logic[i][j]); }
		 * System.out.println();
		 * 
		 * }
		 */
		return moving;
	}

	public void moveLeft() {
		if ((((((id == 14) || (id == 15) || (id == 16) || (id == 2))))) && (((((left == 1)))))) {
			clearTrails();

		} else if (left > 0) {
			clearTrails();
			left--;
		}
		if ((id == 9) && (left >= 0)) {
			clearTrails();
			left--;
		}

		// id 9 needs if
	}

	public void moveRight() {
		if (((id == 1) || (id == 16))) {
			if (left < 9) {
				clearTrails();
				left++;
			}
		} else if (((((((((id == 2) || (id == 4) || (id == 6) || (id == 8) || (id == 9) || (id == 10)
				|| (id == 13)))))))) && ((((((((left == 7))))))))) {
			clearTrails();

		} else if (id == 19) {
			if (left == 7) {
				clearTrails();
				left--;
			}
			clearTrails();
			this.left++;

		}

		else {
			if (left + 4 < 12)// square
			{
				clearTrails();
				this.left++;
			}
		}

	}

	public void nextPiece(char[][] current, int id) {
		this.id = id;
		onscreen = current;
		height = 0;
		up = 0;
		left = 5;
		moving = true;

	}

	public void rotate(char[][] rotate) {
		onscreen = rotate;
	}

	public boolean logicCheck() {
		boolean tester = false; // BOTTOM
		if (id == 1) {
			// ystem.out.println(id+ "line");
			if ((logic[up + 4][left + 1] == ' ')) // stright up
			{
				tester = true;
			} else {
				tester = false;
			}
		}
		if (id == 2) {
			System.out.println(id + "line");
			if ((((logic[up + 4][left] == ' ') && (logic[up + 4][left + 1] == ' ') && (logic[up + 4][left + 2] == ' ')
					&& (logic[up + 4][left + 3] == ' ')))) // stright flat
			{
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 3) {
			System.out.println(id + "Square");
			if ((logic[up + 4][left + 1] == ' ') && // Square
					(logic[up + 4][left + 2] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 4) {
			System.out.println(id + "Zigzahg");
			if (((logic[up + 4][left + 3] == ' ') && // Zigzahg
					(logic[up + 4][left + 2] == ' ') && (logic[up + 3][left + 1] == ' '))) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 5) {
			System.out.println(id + "ZigzahgR");
			if ((logic[up + 4][left + 1] == ' ') && // ZigzahgR
					(logic[up + 3][left + 2] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 6) {
			System.out.println(id + "alt zigzag");
			if ((logic[up + 4][left + 1] == ' ') && // zigzag
					(logic[up + 4][left + 2] == ' ') && (logic[up + 3][left + 3] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}

		} else if (id == 7) {
			System.out.println(id + "alt zigzagR");
			if ((logic[up + 3][left + 1] == ' ') && // zigzag
					(logic[up + 4][left + 2] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}

		} else if (id == 8) {
			System.out.println(id + "tee");
			if ((logic[up + 3][left + 1] == ' ') && // tee
					(logic[up + 4][left + 2] == ' ') && (logic[up + 3][left + 3] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 9) {
			System.out.println(id + "tee");
			if ((logic[up + 3][left + 2] == ' ') && // tee
					(logic[up + 4][left + 3] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 10) {
			System.out.println(id + "tee");
			if (((logic[up + 4][left + 1] == ' ') && // tee
					(logic[up + 4][left + 2] == ' ') && (logic[up + 4][left + 3] == ' '))) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 11) {
			System.out.println(id + "tee");
			if ((logic[up + 4][left + 1] == ' ') && // tee
					(logic[up + 3][left + 2] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 12) {
			System.out.println(id + "elll");
			if ((logic[up + 4][left + 1] == ' ') && (logic[up + 4][left + 2] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 13) {
			System.out.println(id + "elll");
			if (((logic[up + 4][left + 1] == ' ') && (logic[up + 3][left + 2] == ' ')
					&& (logic[up + 3][left + 3] == ' '))) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 14) {
			System.out.println(id + "elll");
			if (((logic[up + 3][left] == ' ') && (logic[up + 2][left] == ' ') && (logic[up + 4][left + 1] == ' '))) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 15) {
			System.out.println(id + "elll");
			if (((logic[up + 4][left] == ' ') && (logic[up + 4][left + 1] == ' ')
					&& (logic[up + 4][left + 2] == ' '))) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 16) {
			System.out.println(id + "elll alt");
			if ((logic[up + 4][left] == ' ') && // tee
					(logic[up + 4][left + 1] == ' ')) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 17) {
			System.out.println(id + "elll alt");
			if (((logic[up + 4][left] == ' ') && // tee
					(logic[up + 4][left + 1] == ' ') && // tee
					(logic[up + 4][left + 2] == ' '))) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 18) {
			System.out.println(id + "elll alt");
			if (((logic[up + 4][left] == ' ') && // tee
					(logic[up + 2][left + 2] == ' ') && // tee
					(logic[up + 3][left + 2] == ' '))) {
				tester = true;
			} else {
				tester = false;
			}
		} else if (id == 19) {
			if (((logic[up + 3][left] == ' ') && // tee
					(logic[up + 3][left + 1] == ' ') && // tee
					(logic[up + 4][left + 3] == ' '))) {
				tester = true;
			} else {
				tester = false;
			}
		}
		return tester;

	}

	public int fullLine() {
		return 0;
	}

	public void addToLogicArray() {
		if (onscreen[3][0] == '#') {
			logic[up + 3][left] = onscreen[3][0];
		}
		if (onscreen[3][1] == '#') {
			logic[up + 3][left + 1] = onscreen[3][1];
		}
		if (onscreen[3][2] == '#') {
			logic[up + 3][left + 2] = onscreen[3][2];
		}
		if (onscreen[3][3] == '#') {
			logic[up + 3][left + 3] = onscreen[3][3];
		}
		if (onscreen[2][0] == '#') {
			logic[up + 2][left] = onscreen[2][0];
		}
		if (onscreen[2][1] == '#') {
			logic[up + 2][left + 1] = onscreen[2][1];
		}
		if (onscreen[2][2] == '#') {
			logic[up + 2][left + 2] = onscreen[2][2];
		}
		if (onscreen[2][3] == '#') {
			logic[up + 2][left + 3] = onscreen[2][3];
		}
		if (onscreen[1][0] == '#') {
			logic[up + 1][left] = onscreen[1][0];
		}
		if (onscreen[1][1] == '#') {
			logic[up + 1][left + 1] = onscreen[1][1];
		}
		if (onscreen[1][2] == '#') {
			logic[up + 1][left + 2] = onscreen[1][2];
		}
		if (onscreen[1][3] == '#') {
			logic[up + 1][left + 3] = onscreen[1][3];
		}
		if (onscreen[0][0] == '#') {
			logic[up][left] = onscreen[0][0];
		}
		if (onscreen[0][1] == '#') {
			logic[up][left + 1] = onscreen[0][1];
		}
		if (onscreen[0][2] == '#') {
			logic[up][left + 2] = onscreen[0][2];
		}
		if (onscreen[0][3] == '#') {
			logic[up][left + 3] = onscreen[0][3];
		}

	}

	public void clearTrails() {
		if (onscreen[3][0] == '#') {
			screen[up + 3][left] = ' ';
		}
		if (onscreen[3][1] == '#') {
			screen[up + 3][left + 1] = ' ';
		}
		if (onscreen[3][2] == '#') {
			screen[up + 3][left + 2] = ' ';
		}
		if (onscreen[3][3] == '#') {
			screen[up + 3][left + 3] = ' ';
		}
		if (onscreen[2][0] == '#') {
			screen[up + 2][left] = ' ';
		}
		if (onscreen[2][1] == '#') {
			screen[up + 2][left + 1] = ' ';
		}
		if (onscreen[2][2] == '#') {
			screen[up + 2][left + 2] = ' ';
		}
		if (onscreen[2][3] == '#') {
			screen[up + 2][left + 3] = ' ';
		}
		if (onscreen[1][0] == '#') {
			screen[up + 1][left] = ' ';
		}
		if (onscreen[1][1] == '#') {
			screen[up + 1][left + 1] = ' ';
		}
		if (onscreen[1][2] == '#') {
			screen[up + 1][left + 2] = ' ';
		}
		if (onscreen[1][3] == '#') {
			screen[up + 1][left + 3] = ' ';
		}
		if (onscreen[0][0] == '#') {
			screen[up][left] = ' ';
		}
		if (onscreen[0][1] == '#') {
			screen[up][left + 1] = ' ';
		}
		if (onscreen[0][2] == '#') {
			screen[up][left + 2] = ' ';
		}
		if (onscreen[0][3] == '#') {
			screen[up][left + 3] = ' ';
		}
	}

	public int getHighscore() {
		return highscore;
	}

	public void setHighscore(int highscore) {
		this.highscore = highscore;
	}

	public void setID(int newid) {
		this.id = newid;
	}
}
