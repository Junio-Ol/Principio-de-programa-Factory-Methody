
public class Cliente {

	public static void main(String[] args)  {
		
		FabricaDeAvioes fabrica = new Boing();
		Avioes aviao = fabrica.criarAviao(160, 10);
		System.out.println(aviao.Categoria());
		
		FabricaDeAvioes fabrica2 = new Embraer();
		Avioes aviao2 = fabrica2.criarAviao(150, 10);
		System.out.println(aviao2.Categoria());
		
	}

}
