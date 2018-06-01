
public class TesteSistema {

	public static void main(String[] args) {
		Gerente Geraldo = new Gerente();
		Geraldo.setNome("Geraldo Lurdes");
		Geraldo.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(Geraldo);
		
		
		
	}

}
