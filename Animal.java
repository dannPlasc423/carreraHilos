public class Animal extends Thread {
    public Pista pista = new Pista();
    public int velocidad;
    public String animal;

    public Animal(/** Pista pista, */
    int velocidad, String animal) {
        // this.pista = pista;
        this.velocidad = velocidad;
        this.animal = animal;
    }

    @Override
    public void run() {
        for (;;) {
            if (pista.avanceMinuto(this.velocidad, this.animal)) {
                break;
            }
            System.out.println(this.animal + " ha recorrido " + pista.distanciaRecorrida + "m.");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
    }
}
