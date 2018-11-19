package ex7s4;

public class Test {

	public static void main(String[] args) {
		Centralizado c = new Centralizado(4);
		c.doors();
		c.lockDoor(2);
		System.out.println("porta 1: " + c.doorLocked(1));
		System.out.println("porta 2: " + c.doorLocked(2));
		System.out.println("porta 3: " + c.doorLocked(3));
		System.out.println("porta 4: " + c.doorLocked(4));
		System.out.println("=======");
		//c.unlockDoor(2);
		c.lockDoor(1);
		System.out.println("porta 1: " + c.doorLocked(1));
		System.out.println("porta 2: " + c.doorLocked(2));
		System.out.println("porta 3: " + c.doorLocked(3));
		System.out.println("porta 4: " + c.doorLocked(4));
	}

} 
