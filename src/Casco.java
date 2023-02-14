public class Casco extends Armadura{
    //CONSTRUCTORES.
    public Casco(){

    }

    public Casco (double defensa, double multiplicador){
        super(defensa,multiplicador);
    }
    //---------------------------------------------------------------------------//
    //MÉTODOS.


    public String accionEspecial (boolean proyectil){
        if(proyectil = true){
            System.out.println("Casco equipado");
        }else{
            System.out.println("Casco sin equipar");
        }
        return "";
    }


}
