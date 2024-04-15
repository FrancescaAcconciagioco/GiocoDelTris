package giocoDelTris;

public class testTris {
public static void main(String[] args) {
		
		
		Tris partita = new Tris();
		
		while(partita.inCorso()) {
			//fai qualcosa per far girare la partita 
			
			int i = (int) (Math.random() * 3); //genero riga randomica
			int j = (int) (Math.random() * 3); //genero colonna randomica
			
			if(partita.makeMossa(i, j))
				partita.printGriglia();
			
		}

	}
}
