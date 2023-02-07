public class Espada extends Arma {

    //VARIABLES DE CLASE.


    //---------------------------------------------------------------------------//
    //CONSTRUCTORES.
    public Espada (){
    }

    //Hereda del constructor Arma.
    public Espada(double damage, double multiplicador, double distancia,double tiempo_para_damage){

        super(damage,multiplicador,distancia,tiempo_para_damage);
    }


    //---------------------------------------------------------------------------//

    //MÉTODOS

    @Override
    public double doing_damage(double distancia_enemigo){

        double espada_damage = getDistancia()*getDamage()*(getDistancia()-distancia_enemigo);

        return espada_damage;
    }


}
