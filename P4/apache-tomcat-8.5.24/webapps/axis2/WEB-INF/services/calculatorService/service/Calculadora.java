package service;

public class Calculadora {

  public int suma(int num1, int num2) {
    return num1 + num2;
  }

  public int resta(int num1, int num2) {
    return num1 - num2;
  }

  public int multiplicacion(int num1, int num2) {
    return num1 * num2;
  }

  public int division(int num1, int num2) {
    int resultado = 0;

    if (num2 != 0) {
      resultado = num1 / num2;
    }

    return resultado;
  }
}
