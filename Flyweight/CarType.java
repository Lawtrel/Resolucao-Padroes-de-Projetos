package Flyweight;

public class CarType {
  private String model;
  private String brand;
  private Integer yearOfManufacture;
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
  public CarType(String model) {
    this.model = model;
  }
}
