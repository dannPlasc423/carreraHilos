public class Pista {
    public int distancia = 700;
    public int distanciaRecorrida = 0;
    public boolean end = false;

    public synchronized boolean avanceMinuto(int velocidad, String animal){
        this.distanciaRecorrida += velocidad;
        if(this.distanciaRecorrida >= this.distancia){
            System.out.println(animal + " ha llegado a la meta");
            return true;
        }
        return false;
    }

}
