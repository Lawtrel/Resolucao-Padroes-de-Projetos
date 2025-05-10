package FactoryMethod;

public class Bike implements Transport {
    /*
        Utilize o @Override aqui, e implemente a interface aqui usando o implements
    */
    @Override
    public void deliver(){
        System.out.println("Entregando por bicicleta");
    }
}
