package miPrincipal;

public class LlamadaTelefonicaSaliente extends LlamadaTelefonica{
    // Atributos
    private double duracion;
    private double costoPorMinuto;

    // Constructor
    public LlamadaTelefonicaSaliente(String titular, String Numero, double duracion, double costoPorMinuto)
    {
        super(titular, Numero);
        setDuracion(duracion);
        setCostoPorMinuto(costoPorMinuto);
    }

    // Metodos set/get
    public void setDuracion(double duracion)
    {
        // La duracion debe ser mayor o igual que 0 (cero)
    }

    public void setCostoPorMinuto(double costoPorMinuto)
    {
        // El costo por minuto debe ser mayor o igual que 0 (cero)
    }

    public double getDuracion()
    {
        return 0.0;
    }

    public double getCostoPorMinuto()
    {
        return 0.0;
    }

    // Implementar metodo de instancia costoLlamada()
    public double costoLlamada()
    {
        // El costo de la llamada es duracion * costoPorMinuto
        return 0.0;
    }

    // Metodo toString()
    public String toString()
    {
        String resultado = "Llamada Saliente: " + super.toString() + String.format("");
        return resultado;
    }
}