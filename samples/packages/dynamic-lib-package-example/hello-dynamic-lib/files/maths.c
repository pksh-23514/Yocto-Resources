#include "dynamic_lib.h"

int add (int num1, int num2)
{
	return (num1 + num2);
}

int sub (int num1, int num2)
{
	return ((num1 > num2) ? (num1 - num2) : (num2 - num1));
}
