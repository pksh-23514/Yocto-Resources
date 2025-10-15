#include <stdio.h>
#include "dynamic_lib.h"

void print (char *str, int times)
{
	while (times--)
	{
		printf("%s\n", str);
	}
}
