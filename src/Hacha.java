public class Hacha extends Arma {
    //VARIABLES DE CLASE.

    private int largo_hacha;

    //---------------------------------------------------------------------------//
    //CONSTRUCTORES.

    public Hacha(){

    }

    public Hacha(double damage, double multiplicador, double distancia,double tiempo_para_damage,int largo_hacha){
        super (damage,multiplicador,distancia,tiempo_para_damage);

        this.largo_hacha=largo_hacha;
    }

    //---------------------------------------------------------------------------//
    //MÉTODOS.

    @Override
    public double doing_damage(double distancia_enemigo){
        if(distancia_enemigo == largo_hacha){
            double hacha_damage = getDamage()*3;

            return hacha_damage;
        }
        return 0.0;
    }




}
