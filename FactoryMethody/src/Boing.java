

public class Boing implements FabricaDeAvioes {
  

	@Override
	public Avioes criarAviao(int nroPassageiros, int carga) {
		if(nroPassageiros == 150 & carga == 10) {
			return new Boing777();
		} else {
			return new Boing737();
		}
	}	

}
