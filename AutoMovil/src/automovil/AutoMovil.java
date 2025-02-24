package automovil;

/**
 *
 * @author Jeremy Santiago
 */
public class AutoMovil {

    //Atributos
    private String color;
    private int año;
    private String modelo;
    private String marca;

    //Metodos
    public void acelerar() {
        System.out.println("El auto esta acelerando");
    }

    public void frenar() {
        System.out.println("El auto ha frenado");
    }

    public void apagado() {
        System.out.println("El auto se ha apagado");
    }

    public void explotar() {
        System.out.println("El auto ha explotado");
    }

    //Getters
    public String getColor() {
        return color;
    }

    public int getAño() {
        return año;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    //Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Constructor de la clase
    public AutoMovil() {
        System.out.println("Constructor de AutoMovil");
    }

}
