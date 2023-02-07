public class Lanza extends Arma{

    //VARIABLES DE CLASE.
    private int largo_lanza;


    //---------------------------------------------------------------------------//
    //CONSTRUCTORES.

    public Lanza (){
    }

    //Hereda del constructor Arma
    public Lanza (double damage, double multiplicador, double distancia,double tiempo_para_damage, int largo_lanza) {

        super (damage,multiplicador,distancia,tiempo_para_damage);

        this.largo_lanza=largo_lanza;
    }

    //---------------------------------------------------------------------------//
    //MÉTODOS.

    @Override
    public double doing_damage(double distancia_enemigo){

        if(distancia_enemigo == largo_lanza | distancia_enemigo>= (largo_lanza/2)){
            double lanza_damage= getMultiplicador()*getDamage();
            return lanza_damage;
        }
        return 0.0;
    }







}
