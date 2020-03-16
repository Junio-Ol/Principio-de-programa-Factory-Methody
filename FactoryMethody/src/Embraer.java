
public class Embraer implements FabricaDeAvioes {

	@Override
	public Avioes criarAviao(int nroPassageiros, int carga) {
		
		if(nroPassageiros == 150 & carga == 10) {
			return new Legacy500();
		} else {
			return new Embraer193();
		}
	}

	
	
	
}
