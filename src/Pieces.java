
public class Pieces {
	char[][] current = new char[4][4];
	private char[][] straightPiece ={{' ','#',' ',' '},
									 {' ','#',' ',' '},
									 {' ','#',' ',' '},
									 {' ','#',' ',' '}};
	
	private char[][] straightPieceR ={{' ',' ',' ',' '},
							{' ',' ',' ',' '},
							{' ',' ',' ',' '},
							{'#','#','#','#'}};
	
	private char[][] squarePiece ={{' ',' ',' ',' '},
						   		   {' ',' ',' ',' '},
						   		   {' ','#','#',' '},
						   		   {' ','#','#',' '}};
	
	private char[][] zigzagPiece ={{' ',' ',' ',' '},
						   {' ',' ',' ',' '},
			               {' ','#','#',' '},
			               {' ',' ','#','#'}};

	private char[][] zigzagPieceR ={{' ',' ',' ',' '},
						   			{' ',' ','#',' '},
						   			{' ','#','#',' '},
						   			{' ','#',' ',' '}};
	
	private char[][] zigzagPiecealt ={{' ',' ',' ',' '},
							  		 {' ',' ',' ',' '},
							  		 {' ',' ','#','#'},
							  		 {' ','#','#',' '}};


	private char[][] zigzagPiecealtR ={{' ',' ',' ',' '},
							  		   {' ','#',' ',' '},
							  		   {' ','#','#',' '},
							  		   {' ',' ','#',' '}};
	
	private char[][] tPiece ={{' ',' ',' ',' '},
					  		  {' ',' ',' ',' '},
					  		  {' ','#','#','#'},
					  		  {' ',' ','#',' '}};
	
	private char[][] tPieceR1 ={{' ',' ',' ',' '},
								{' ',' ',' ','#'},
								{' ',' ','#','#'},
								{' ',' ',' ','#'}};
	
	private char[][] tPieceR2 ={{' ',' ',' ',' '},
			  	 	  			{' ',' ',' ',' '},
			  	 	  			{' ',' ','#',' '},
			  	 	  			{' ','#','#','#'}};

	private char[][] tPieceR3={{' ',' ',' ',' '},
			  	      		   {' ','#',' ',' '},
			  	      		   {' ','#','#',' '},
			  	      		   {' ','#',' ',' '}};
	
	private char[][] lPiece=  {{' ',' ',' ',' '},
					   		   {' ','#',' ',' '},
					   		   {' ','#',' ',' '},
					   		   {' ','#','#',' '}};
	
	private char[][] lPieceR1={{' ',' ',' ',' '},
					   		   {' ',' ',' ',' '},
					   		   {' ','#','#','#'},
					   		   {' ','#',' ',' '}};
	
	private char[][] lPieceR2=  {{' ',' ',' ',' '},
			   		     		 {'#','#',' ',' '},
			   		     		 {' ','#',' ',' '},
			   		     		 {' ','#',' ',' '}};
	
	private char[][] lPieceR3=  {{' ',' ',' ',' '},
			   			 		 {' ',' ',' ',' '},
			   			 		 {' ',' ','#',' '},
			   			 		 {'#','#','#',' '}};
	
	
	private char[][] lPieceAlt= {{' ',' ',' ',' '},
			   		     		 {' ','#',' ',' '},
			   		     		 {' ','#',' ',' '},
			   		     		 {'#','#',' ',' '}};

	private char[][] lPieceAltR1={{' ',' ',' ',' '},
   		     			  		  {' ',' ',' ',' '},
   		     			  		  {'#',' ',' ',' '},
   		     			  		  {'#','#','#',' '}};
	
	private char[][] lPieceAltR2={{' ',' ',' ',' '},
								  {' ','#','#',' '},
								  {' ','#',' ',' '},
								  {' ','#',' ',' '}};
	
	private char[][] lPieceAltR3={{' ',' ',' ',' '},
								  {' ',' ',' ',' '},
								  {'#','#','#',' '},
								  {' ',' ','#',' '}};

	public char[][] getStraightPiece() {
		return straightPiece;
	}

	public void setStraightPiece(char[][] straightPiece) {
		this.straightPiece = straightPiece;
	}

	public char[][] getStraightPieceR() {
		return straightPieceR;
	}

	public void setStraightPieceR(char[][] straightPieceR) {
		this.straightPieceR = straightPieceR;
	}

	public char[][] getSquarePiece() {
		return squarePiece;
	}

	public void setSquarePiece(char[][] squarePiece) {
		this.squarePiece = squarePiece;
	}

	public char[][] getZigzagPiece() {
		return zigzagPiece;
	}

	public void setZigzagPiece(char[][] zigzagPiece) {
		this.zigzagPiece = zigzagPiece;
	}

	public char[][] getZigzagPieceR() {
		return zigzagPieceR;
	}

	public void setZigzagPieceR(char[][] zigzagPieceR) {
		this.zigzagPieceR = zigzagPieceR;
	}

	public char[][] getZigzagPiecealt() {
		return zigzagPiecealt;
	}

	public void setZigzagPiecealt(char[][] zigzagPiecealt) {
		this.zigzagPiecealt = zigzagPiecealt;
	}

	public char[][] getZigzagPiecealtR() {
		return zigzagPiecealtR;
	}

	public void setZigzagPiecealtR(char[][] zigzagPiecealtR) {
		this.zigzagPiecealtR = zigzagPiecealtR;
	}

	public char[][] gettPiece() {
		return tPiece;
	}

	public void settPiece(char[][] tPiece) {
		this.tPiece = tPiece;
	}

	public char[][] gettPieceR1() {
		return tPieceR1;
	}

	public void settPieceR1(char[][] tPieceR1) {
		this.tPieceR1 = tPieceR1;
	}

	public char[][] gettPieceR2() {
		return tPieceR2;
	}

	public void settPieceR2(char[][] tPieceR2) {
		this.tPieceR2 = tPieceR2;
	}

	public char[][] gettPieceR3() {
		return tPieceR3;
	}

	public void settPieceR3(char[][] tPieceR3) {
		this.tPieceR3 = tPieceR3;
	}

	public char[][] getlPiece() {
		return lPiece;
	}

	public void setlPiece(char[][] lPiece) {
		this.lPiece = lPiece;
	}

	public char[][] getlPieceR1() {
		return lPieceR1;
	}

	public void setlPieceR1(char[][] lPieceR1) {
		this.lPieceR1 = lPieceR1;
	}

	public char[][] getlPieceR2() {
		return lPieceR2;
	}

	public void setlPieceR2(char[][] lPieceR2) {
		this.lPieceR2 = lPieceR2;
	}

	public char[][] getlPieceR3() {
		return lPieceR3;
	}

	public void setlPieceR3(char[][] lPieceR3) {
		this.lPieceR3 = lPieceR3;
	}

	public char[][] getlPieceAlt() {
		return lPieceAlt;
	}

	public void setlPieceAlt(char[][] lPieceAlt) {
		this.lPieceAlt = lPieceAlt;
	}

	public char[][] getlPieceAltR1() {
		return lPieceAltR1;
	}

	public void setlPieceAltR1(char[][] lPieceAltR1) {
		this.lPieceAltR1 = lPieceAltR1;
	}

	public char[][] getlPieceAltR2() {
		return lPieceAltR2;
	}

	public void setlPieceAltR2(char[][] lPieceAltR2) {
		this.lPieceAltR2 = lPieceAltR2;
	}

	public char[][] getlPieceAltR3() {
		return lPieceAltR3;
	}

	public void setlPieceAltR3(char[][] lPieceAltR3) {
		this.lPieceAltR3 = lPieceAltR3;
	}

}
