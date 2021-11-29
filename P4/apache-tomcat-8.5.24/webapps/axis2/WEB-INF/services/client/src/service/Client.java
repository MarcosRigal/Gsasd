package service;

import service.*;
import service.CalculatorServiceStub.Division;
import service.CalculatorServiceStub.Multiplicacion;
import service.CalculatorServiceStub.Resta;
import service.CalculatorServiceStub.Suma;

public class Client {

  public static void main(String[] args) throws Exception {
    CalculatorServiceStub stub = new CalculatorServiceStub();

    service.CalculatorServiceStub.Suma request = new service.CalculatorServiceStub.Suma();

    service.CalculatorServiceStub.SumaResponse response = stub.suma(request);

    System.out.println("Response: " + response.get_return());
  }
}
