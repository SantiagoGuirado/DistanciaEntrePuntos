public class Main {
    //Atributos
    private static Puntos puntos;
    private static Leer leer;
    private static CalcularDistancia calcularDistancia;

    //Metodos
    public static void main(String[] args) {
        implementarElementos();

        cargarPuntos();
        getCalcularDistancia().calcularMenorDistancia(getPuntos());
        mostrarResultado();
    }

    public static void implementarElementos(){
        setPuntos(new Puntos());
        setLeer(new Leer());
        setCalcularDistancia(new CalcularDistancia());
    }

    public static void cargarPuntos(){
        System.out.println("Ingrese las coordenadas de los puntos.");
        System.out.println("Para dejar de cargar puntos ingrese 0 en ambas coordenadas.");
        int contador = 1;
        boolean salida = false;
        do {
            System.out.println("Punto " + contador + ":");
            System.out.println("X:");
            double x = getLeer().leerDouble();
            System.out.println("Y:");
            double y = getLeer().leerDouble();

            if (x == 0 && y == 0){
                salida = true;
            } else {
                getPuntos().getCoordenadaX().add(x);
                getPuntos().getCoordenadaY().add(y);
            }
            contador++;
        } while (!salida && contador < 201);
    }

    public static void mostrarResultado(){
        System.out.println("");
        System.out.print("La menor distancia es: " + getCalcularDistancia().getMenorDistancia() + " ");
        System.out.println("entre los puntos " + (getCalcularDistancia().getPunto1()+1) + " y " + (getCalcularDistancia().getPunto2()+1));
        System.out.println("");
        System.out.println("Coordenadas");
        System.out.println("Punto " + (getCalcularDistancia().getPunto1()+1) + ": X=" + getPuntos().getCoordenadaX().get(getCalcularDistancia().getPunto1()) + " Y=" + getPuntos().getCoordenadaY().get(getCalcularDistancia().getPunto1()) );
        System.out.print("Punto " + (getCalcularDistancia().getPunto2()+1) + ": X=" + getPuntos().getCoordenadaX().get(getCalcularDistancia().getPunto2()) + " Y=" + getPuntos().getCoordenadaY().get(getCalcularDistancia().getPunto2()) );
    }

    //Setters && Getters
    public static Puntos getPuntos() {
        return puntos;
    }

    public static void setPuntos(Puntos puntos) {
        Main.puntos = puntos;
    }

    public static Leer getLeer() {
        return leer;
    }

    public static void setLeer(Leer leer) {
        Main.leer = leer;
    }

    public static CalcularDistancia getCalcularDistancia() {
        return calcularDistancia;
    }

    public static void setCalcularDistancia(CalcularDistancia calcularDistancia) {
        Main.calcularDistancia = calcularDistancia;
    }
}