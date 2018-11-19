package ex7s4;

public class Centralizado extends Car {
	public Centralizado(int nDoors) {
		super(nDoors);
	}
	
	@Override
    public void lockDoor(int n) {
		if(n == 1 && !doorLocked(n)) {
			for(int i = 1 ; i <= super.doors(); i++) {
				super.lockDoor(i);
			}
		}else {
			super.lockDoor(n);
		}
    }
	@Override
    public void unlockDoor(int n) {
		if(n == 1 && doorLocked(n)) {
			System.out.println("entrei");
			for(int i = 0; i < super.doors(); i++) {
				super.unlockDoor(i);
			}
		}else {
			super.unlockDoor(n);
		}
	}
}
 