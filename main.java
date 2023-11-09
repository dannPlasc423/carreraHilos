public class main{
    public static void main(String[] args) {
        Animal coyote = new Animal(90, "Coyote");
        Animal gato = new Animal(100, "Gato");
        Animal ardilla = new Animal(70, "Ardilla");

        coyote.start();
        gato.start();
        ardilla.start();
    }
}