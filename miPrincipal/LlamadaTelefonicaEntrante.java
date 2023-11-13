package miPrincipal;

public class LlamadaTelefonicaEntrante extends LlamadaTelefonica{
    // Atributos
    private double precio;

    // Constructor
    public LlamadaTelefonicaEntrante(String titular, String Numero, double precio)
    {
        super(titular, Numero);
        setPrecio(precio);
    }

    // Metodos set/get
    public void setPrecio(double precio)
    {
        // El precio debe ser mayor o igual que 0 (cero)
    }

    public double getPrecio()
    {
        return 0.0;
    }

    // Implementar metodo de instancia costoLlamada()
    public double costoLlamada()
    {
        // El costo de la llamada es el mismo del precio
        return 0.0;
    }

    // Metodo toString()
    public String toString()
    {
        String resultado = "Llamada Entrante: " + super.toString() + String.format("");
        return resultado;
    }
}