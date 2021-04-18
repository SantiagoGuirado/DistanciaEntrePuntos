import java.util.ArrayList;
import java.util.List;

public class Puntos {
    //Atributos
    private List<Double> coordenadaX;
    private List<Double> coordenadaY;

    //Constructor
    public  Puntos(){
        implementarElementos();
    }

    //Metodos
    public void implementarElementos(){
        setCoordenadaX(new ArrayList<>());
        setCoordenadaY(new ArrayList<>());
    }

    //Setters && Getters
    public List<Double> getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(List<Double> coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public List<Double> getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(List<Double> coordenadaY) {
        this.coordenadaY = coordenadaY;
    }
}