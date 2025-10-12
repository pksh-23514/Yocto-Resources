#include <stdio.h>
#include "static_lib.h"

void print (char *str, int times)
{
	while (times--)
	{
		printf ("%s\n", str);
	}
}
