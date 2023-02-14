public class Main {

    public static void main(String[] args) {

        //Creaccion de objetos

        Armadura Armadura_1 = new Armadura();
        Arma Arma_1 = new Arma(25,2,16,3);
        Espada Espada_1 = new Espada(30,1.5,6,2);
        Lanza Lanza_1 = new Lanza(15,2.5,30,2,20);
        Hacha Hacha_1 = new Hacha(55,3,1,1,6);
        Casco Casco_1 = new Casco(100,1.5);
        Botas Botas_1 = new Botas(30,1.5);

        //--------------------------------------------------------------------//
        //Creación del array y listado de los objetos previamente creados dentro del array.

        Equipo miArray [] = new Equipo[7];
        miArray[0]=Armadura_1;
        miArray[1]=Arma_1;
        miArray[2]=Espada_1;
        miArray[3]=Lanza_1;
        miArray[4]=Hacha_1;
        miArray[5]=Casco_1;
        miArray[6]=Botas_1;

        for (int i=0; i<miArray.length; i++){
            System.out.println(miArray[i]);

        }

    }

}