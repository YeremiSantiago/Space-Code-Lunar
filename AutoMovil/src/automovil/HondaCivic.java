package automovil;

/**
 *
 * @author Jeremy Santiago
 */
public class HondaCivic extends AutoMovil {

    //Constructor de HondaCivic
    public HondaCivic() {
        super();
        System.out.println("Constructor de HondaCivic");
    }

    //Sobreescribir 2 metodos
    
   @Override
 public void acelerar() {
        System.out.println("El HondaCivic esta acelerando muy rapido");
    }   
    
 @Override
     public void frenar() {
        System.out.println("El HondaCivic ha frenado de repente");
    }
    
    
}
