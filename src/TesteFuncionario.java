
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente f1 = new Gerente();
	
		f1.setNome("Niko");
		f1.setSalario(2000);
		f1.setCpf("4385783-993-99");
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
		
		Designer d = new Designer();
		
		d.setSalario(500);
		
		System.out.println(d.getBonificacao());
	}
}
