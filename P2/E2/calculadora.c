/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include <time.h>
#include <stdio.h>
#include <stdlib.h>

struct operandos
{
	int a;
	int b;
};
typedef struct operandos operandos;

int suma(operandos *operandos) { return operandos->a + operandos->b; }

int main(int argc, char *argv[])
{

	int operando1, operando2;

	system("clear");
	printf("Este programa mide el tiempo que tarda en realizarse una llamada a una función sumar local 100.000 veces\n");
	printf("Introduzca el operando 1: ");
	scanf("%d", &operando1);

	while (abs(operando1) - 10 > 0)
	{
		printf("Error, los operandos deben ser números de 1 cifra.\n");
		printf("Introduzca el operando 1: ");
		scanf("%d", &operando1);
	}

	printf("Introduzca el operando 2: ");
	scanf("%d", &operando2);

	while (abs(operando2) - 10 > 0)
	{
		printf("Error, los operandos deben ser números de 1 cifra.\n");
		printf("Introduzca el operando 2: ");
		scanf("%d", &operando2);
	}

	int result = 0;
	operandos operandos = {operando1, operando2};

	clock_t begin = clock();

	/* here, do your time-consuming job */

	for (int i = 0; i < 100000; i++)
	{
		result = result + suma(&operandos);
	}
	clock_t end = clock();
	double time_spent = (double)(end - begin) / CLOCKS_PER_SEC;

	printf("El resultado de la suma es: %d\n", result);
	printf("Ha tardado: %f segundos\n", time_spent);
	exit(0);
}
