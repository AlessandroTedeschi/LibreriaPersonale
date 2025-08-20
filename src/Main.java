import model.Genere;
import model.Libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro.Builder("Divina Commedia", "Dante", "9542750420", Genere.FANTASY)
                .valutazione(3)
                .build();

        System.out.println(l1);

    }



}