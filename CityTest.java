/**
 * Test case for the City model
 * @author Madi Binyon
 * @version 1.00, 8 January 2019
 */
public class CityTest extends City {
  public static void main(String[] args) {

    for (int i = 0; i < cityBuildings.length; i++) {
      System.out.println(cityBuildings[i].toString());
    }

    for (int i = 0; i < population.length; i++) {
      System.out.println(population[i].toString());
    }

    for (int i = 0; i < population.length; i ++) {
      if (population[i] instanceof Employee) {
        ((Employee) population[i]).getID();
        ((Employee) population[i]).givePay(100);
        ((Employee) population[i]).getPay();
      }
    }

    for (int i = 0; i < population.length; i ++) {
      if (population[i] instanceof Employee) {
        ((Employee) population[i]).getID();
        ((Employee) population[i]).givePay(1000);
        ((Employee) population[i]).getPay();
      }
    }


  }
}
