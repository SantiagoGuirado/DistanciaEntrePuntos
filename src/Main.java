public class Main {
    //Atributos
    static Puntos puntos;
    static Leer leer;
    static CalcularDistancia calcularDistancia;

    //Metodos
    public static void main(String[] args) {
        implementarElementos();
        cargarPuntos();
        mostrarResultado();
    }

    public static void implementarElementos(){
        puntos = new Puntos();
        leer = new Leer();
        calcularDistancia = new CalcularDistancia();
    }

    public static void cargarPuntos(){
        System.out.println("Ingrese las coordenadas de los puntos. Para dejar de cargar puntos ingrese una letra.");
        int contador = 1;
        boolean salida = false;
        do {
            try{
                System.out.println("Punto " + contador + ":");
                System.out.println("X");
                double x = leer.leerDouble();
                System.out.println("Y");
                double y = leer.leerDouble();
                puntos.getCoordenadaX().add(x);
                puntos.getCoordenadaY().add(y);
            } catch (Exception e) {
                salida = true;
            }
            contador++;
        } while (salida == false && contador < 201);
    }

    public static void mostrarResultado(){
        calcularDistancia.calcularMenorDistancia(puntos);
        System.out.println("La menor distancia es: " + calcularDistancia.getMenorDistancia());
        System.out.println("Entre los puntos " + (calcularDistancia.getPunto1()+1) + " y " + (calcularDistancia.getPunto2()+1));
        System.out.println("Coordenadas");
        System.out.println("Punto " + (calcularDistancia.getPunto1()+1) + ": X=" + puntos.getCoordenadaX().get(calcularDistancia.getPunto1()) + " Y=" + puntos.getCoordenadaY().get(calcularDistancia.getPunto1()) );
        System.out.println("Punto " + (calcularDistancia.getPunto2()+1) + ": X=" + puntos.getCoordenadaX().get(calcularDistancia.getPunto2()) + " Y=" + puntos.getCoordenadaY().get(calcularDistancia.getPunto2()) );
    }
}