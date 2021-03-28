public class CalcularDistancia {
    //Atributos
    private double menorDistancia;
    private int punto1;
    private int punto2;

    //Constructor
    public CalcularDistancia(){
        implementarElementos();
    }

    //Metodos
    public void implementarElementos(){
        setMenorDistancia(0);
        setPunto1(0);
        setPunto2(0);
    }

    public void calcularMenorDistancia(Puntos parametros){
        int puntos = parametros.getCoordenadaX().size();
        for (int contador1 = 0; contador1 < puntos; contador1++){
            for(int contador2 = 0; contador2 < puntos; contador2++){
                double resultado;
                if(!(contador1 == contador2)){
                    double x1 = (double) parametros.getCoordenadaX().get(contador1);
                    double x2 = (double) parametros.getCoordenadaX().get(contador2);
                    double y1 = (double) parametros.getCoordenadaY().get(contador1);
                    double y2 = (double) parametros.getCoordenadaY().get(contador2);

                    resultado = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2 - y1), 2));

                    if (contador1 == 0 && getMenorDistancia() == 0) {
                        setMenorDistancia(resultado);
                        setPunto1(contador1);
                        setPunto2(contador2);
                    }

                    if (resultado < getMenorDistancia()){
                        setMenorDistancia(resultado);
                        setPunto1(contador1);
                        setPunto2(contador2);
                    }
                }
            }
        }
    }

    //Setters && Getters
    public double getMenorDistancia() {
        return menorDistancia;
    }

    public void setMenorDistancia(double menorDistancia) {
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