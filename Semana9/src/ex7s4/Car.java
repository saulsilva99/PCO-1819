package ex7s4;

public class Car {
    private boolean[] lockedDoors;
    /**
     * Construtor.
     * @param nDoors numero de portas.
     *
     * @requires nDoors > 2;
     * @ensures forall int i in 1..doors() | !doorLocked(i);
     */
    public Car(int nDoors) {
        lockedDoors = new boolean[nDoors]; 
    } 

    /**
     * Tranca porta.
     * @param n numero da porta.
     *
     * @requires n > 0 && n <= doors();
     * @ensures doorLocked(n);
     */
    public void lockDoor(int n) {
        lockedDoors[n-1] = true;
    }
    /**
     * Destranca porta.
     * @param n numero da porta.
     *
     * @requires n > 0 && n <= doors();
     * @ensures !doorLocked(n);
     */
    public void unlockDoor(int n) {
        lockedDoors[n-1] = false;
    }
    /**
     * Verifica se uma porta está trancada.
     * @param n número da porta.
     *
     * @requires n > 0 && n <= doors();
     * @return true se a porta está trancada, false caso contrário.
     */
    public boolean doorLocked(int n) {
        return lockedDoors[n-1];
    }

    public int doors() {
        return lockedDoors.length;
    }
    

}