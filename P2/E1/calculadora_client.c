/*
 * This is sample code generated by rpcgen.
 * These are only templates and you can use them
 * as a guideline for developing your own functions.
 */

#include "calculadora.h"

int main(int argc, char *argv[])
{
	char *host;

	//Comprobamos que se haya llamado al programa correctamente.

	if (argc < 2)
	{
		printf("usage: %s server_host\n", argv[0]);
		exit(1);
	}
	host = argv[1];

	//Solicitamos al usuario que operación desea realizar:

	int operacion, operando1, operando2;

	system("clear");
	printf("Este cliente, se conecta por RPC a un servidor al que solicita una las siguientes operaciones: \n");
	printf("  - Para sumar, pulse 1\n");
	printf("  - Para restar, pulse 2\n");
	printf("  - Para multiplicar, pulse 3\n");
	printf("  - Para dividir, pulse 4\n");
	printf("Introduzca el número de la operación que desea realizar: ");
	scanf("%d", &operacion);
	while (operacion < 1 || operacion > 4)
	{
		printf("Error, escoja una opción valida: ");
		scanf("%d", &operacion);
	}

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

	CLIENT *clnt;

#ifndef DEBUG
	clnt = clnt_create(host, CALCULADORA_PROG, CALCULADORA_VERS, "udp");
	if (clnt == NULL)
	{
		clnt_pcreateerror(host);
		exit(1);
	}
#endif /* DEBUG */

	int *result;
	operandos operandos = {operando1, operando2};

	switch (operacion)
	{
	case 1:
		result = suma_1(&operandos, clnt);
		if (result == (int *)NULL)
		{
			clnt_perror(clnt, "call failed");
		}
		printf("El resultado de la suma es: %d\n", *result);
		break;
	case 2:
		result = resta_1(&operandos, clnt);
		if (result == (int *)NULL)
		{
			clnt_perror(clnt, "call failed");
		}
		printf("El resultado de la resta es: %d\n", *result);
		break;
	case 3:
		result = multiplicacion_1(&operandos, clnt);
		if (result == (int *)NULL)
		{
			clnt_perror(clnt, "call failed");
		}
		printf("El resultado de la multiplicación es: %d\n", *result);
		break;
	case 4:
		result = division_1(&operandos, clnt);
		if (result == (int *)NULL)
		{
			clnt_perror(clnt, "call failed");
		}
		printf("El resultado de la división es: %d\n", *result);
		break;
	default:
		break;
	}

#ifndef DEBUG
	clnt_destroy(clnt);
#endif /* DEBUG */
	exit(0);
}
