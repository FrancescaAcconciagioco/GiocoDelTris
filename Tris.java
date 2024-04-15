package giocoDelTris;

public class Tris {
		
		private scacchiera griglia;
		private String giocatore;
		private int numeroMosse;
		
		public Tris() {
			this.giocatore = "X";
			this.griglia = new scacchiera();
			this.numeroMosse = 0;
		}
		
		public boolean makeMossa(int row, int col) {
			boolean success = this.griglia.scriviSimbolo(row, col, giocatore);
			if(success) {
				giocatore = giocatore.equals("X") ? "O" : "X";
				
				/*
				   if(giocatore.equals("X"))
				    giocatore = "O";
				else
					giocatore = "X";
				 */
				
				numeroMosse ++;
			}
			return success;
		}
		
		public boolean inCorso() {
			if(verificaDiagonali() || verificaRigheColonne() || this.numeroMosse == 9)
				return false;
			else
				return true;
		}
		
		private boolean verificaDiagonali() {
			
			//check diagonale principale 
			if( griglia.getValue(0, 0).equals(griglia.getValue(1, 1)) && 
				griglia.getValue(1, 1).equals(griglia.getValue(2, 2)) && 
				!griglia.getValue(2, 2).equals(" ") ) {
				System.out.println("Vince la diagonale principale");
				return true;
			}
			
			//check diagonale secondaria
			if( griglia.getValue(0, 2).equals(griglia.getValue(1, 1)) &&
				griglia.getValue(1, 1).equals(griglia.getValue(0, 2)) && 
				!griglia.getValue(0, 2).equals(" ") ) {
				System.out.println("Vince la diagonale secondaria");
				return true;
			}
			
			//non ha vinto nessuna diagonale
			return false;
		}
		
		private boolean verificaRigheColonne() {
	    	
	    	for (int i=0; i<3; i++) {
	    		
	    		boolean verificaRiga = true;
	    		boolean verificaColonna = true;
	    		
	    		String appoggioRiga = griglia.getValue(i, 0);
	    		String appoggioColonna = griglia.getValue(0, i);
	    		
	    		if (appoggioRiga.equals(" ")) {
	    			verificaRiga = false;
	    		}
	    		
	    		if(appoggioColonna.equals(" ")) {
	    			verificaColonna = false;
	    			
	    		}
	    		
	    		for (int j=1; j<3; j++) {
	    			verificaRiga = verificaRiga && appoggioRiga.equals(griglia.getValue(i, j));
	    			appoggioRiga = griglia.getValue(i, j);
	    			
	    			verificaColonna = verificaColonna && appoggioColonna.equals(griglia.getValue(j, i));
	    			appoggioColonna = griglia.getValue(j, i);
	    		}
	    		
	    		if(verificaRiga) {
	    			System.out.println("vince la riga");
	    			return true;
	    		}
	    		
	    		if(verificaColonna) {
	    			System.out.println("vince la colonna");
	    			return true;
	    		}
	    		 
	    	}
	    	
	    	return false;
	    	
	    }
					
	    public void printGriglia() {
	    	griglia.stampaGriglia();
	    }

	}

