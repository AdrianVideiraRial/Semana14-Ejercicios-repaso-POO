public class Botas extends Armadura{
    //CONSTRUCTORES

    public Botas (){

    }

    public Botas(double defensa, double multiplicador){
        super(defensa,multiplicador);
    }

    //---------------------------------------------------------------------------//
    //MÉTODOS.


       public String accionEspecial (boolean meele, int distancia){
        if(meele = true){
            double esquiva = getDefensa()+distancia;
        }else{
            double esquivaFallida = getDefensa()-(2*distancia);
        }
        return "";
    }


}
