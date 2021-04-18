public class CalcularDistancia {
    //Atributos
    private Double menorDistancia;
    private int punto1;
    private int punto2;

    //Constructor
    public CalcularDistancia(){
        implementarElementos();
    }

    //Metodos
    public void implementarElementos(){
        setPunto1(0);
        setPunto2(0);
    }

    public void calcularMenorDistancia(Puntos parametros){
        int puntos = parametros.getCoordenadaX().size();
        for (int contador1 = 0; contador1 < puntos-1; contador1++){
            for(int contador2 = contador1+1; contador2 < puntos; contador2++){
                double x1 = (double) parametros.getCoordenadaX().get(contador1);
                double x2 = (double) parametros.getCoordenadaX().get(contador2);
                double y1 = (double) parametros.getCoordenadaY().get(contador1);
                double y2 = (double) parametros.getCoordenadaY().get(contador2);
                double resultado = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));
                if (getMenorDistancia() == null) {
                    cargarResultado(resultado, contador1, contador2);
                }
                if (resultado < getMenorDistancia()){
                    cargarResultado(resultado, contador1, contador2);
                }
            }
        }
    }

    public void cargarResultado(double resultado, int contador1, int contador2){
        setMenorDistancia(resultado);
        setPunto1(contador1);
        setPunto2(contador2);
    }

    //Setters && Getters
    public Double getMenorDistancia() {
        return menorDistancia;
    }

    public void setMenorDistancia(Double menorDistancia) {
        this.menorDistancia = menorDistancia;
    }

    public int getPunto1() {
        return punto1;
    }

    public void setPunto1(int punto1) {
        this.punto1 = punto1;
    }

    public int getPunto2() {
        return punto2;
    }

    public void setPunto2(int punto2) {
        this.punto2 = punto2;
    }
}