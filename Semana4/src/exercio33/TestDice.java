package exercio33;

public class TestDice {
	
	private void DiceTimes(int n) {
		int i = 0;

		Dice d = new Dice();
		while(i < n) {
			System.out.println(d.roll());
			i++;
		}
	}
	



	
	
	
	
	
	
	
	public static void main(String[] args) {
		//TestDice t = new TestDice();
		//t.DiceTimes(20);
		Dice d = new Dice(); // Criar instãncia Dice
		d.imprimeVinteVezes(); // instância criada do Dice e chamar a função que queremos
		
	}

}
