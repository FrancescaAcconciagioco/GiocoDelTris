package giocoDelTris;

public class scacchiera {
		
		private String[][] griglia;
		private final static int NCelle = 3;
		
		//creazione griglia
		public scacchiera() {
			griglia = new String[NCelle][NCelle];
			
			for (int riga = 0; riga < NCelle; riga++) {
	            for (int colonna = 0; colonna < NCelle; colonna++) {
	            	griglia[riga][colonna] = " ";
	            }
	        }
		}
		
		//stampo griglia
		public void stampaGriglia() {
			for (int riga = 0; riga < NCelle; riga++) {
	            for (int colonna = 0; colonna < NCelle; colonna++) {
	            	System.out.print(griglia[riga][colonna] + " ");
	            }
	            System.out.println();//mandiamo a capo
	        }
			System.out.println("----------");
		}
		
		//scrivi simbolo
		public boolean scriviSimbolo(int r, int c, String simbolo) {
			if(r >= 0 && r < NCelle && c >= 0 && c < NCelle) {
				if(griglia[r][c].equals(" ")) {
					griglia[r][c] = simbolo;
					return true;
				}
				else
					return false;
			}
			else {
				return false;
			}
		}
		
		//restituisce il simbolo
		public String getValue(int row, int col) {
			if(row >= 0 && row < NCelle && col >= 0 && col < NCelle) {
				return griglia[row][col];
			}
			else
				return " ";
		}

	}
