package miPrincipal;

public abstract class LlamadaTelefonica {
    // Atributos
    private String titular;
    private String numero;

    // Constructor
    public LlamadaTelefonica(String titular, String numero)
    {
        setTitular(titular);
        setNumero(numero);
    }

    // Metodos set/get
    public void setTitular(String titular)
    {
        // No hay nada que validar
    }

    public void setNumero(String numero)
    {
        // No hay nada que validar
    }

    public String getTitular()
    {
        return "";
    }

    public String getNumero()
    {
        return "";
    }

    // Metodo de instancia
    public abstract double costoLlamada();

    // Metodo toString()
    public String toString()
    {
        String resultado = String.format("");
        return resultado;
    }
}