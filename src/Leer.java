import java.util.Scanner;

public class Leer {
    //Atributos
    private Scanner scanner;

    //Constructor
    public Leer(){
        implementarElementos();
    }

    //Metodos
    public void implementarElementos(){
        setScanner(new Scanner(System.in));
    }

    public double leerDouble(){
        return getScanner().nextDouble();
    }

    //Setters && Getters
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
