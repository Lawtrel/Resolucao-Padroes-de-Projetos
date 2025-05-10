package Flyweight;

public class Car {
  private final CarType carType;
  private String licensePlate;
  private String chassisNumber;
  private Double price;


  /* LISTA DE ATRIBUTOS DO CARRO
  * - licensePlate
  * - chassisNumber
  * - model
  * - brand
  * - yearOfManufacture
  * - price
  *
  * DISTRIBUA OS ATRIBUTOS ENTRE Car E CarType, OBSERVANDO A NATUREZA DE CADA ATRIBUTO
  * */

  // CONSTRUTOR
  public Car(CarType carType) {
    this.carType = carType;
  }
}
