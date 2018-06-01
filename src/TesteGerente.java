
public class TesteGerente {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Rafael");
		g1.setCpf("448390854-55-99");
		g1.setSalario(4000);
		
		g1.setSenha(1334);
		boolean autenticou = g1.autentica(1334);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
