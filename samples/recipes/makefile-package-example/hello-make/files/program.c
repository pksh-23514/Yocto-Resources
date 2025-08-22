#include <stdio.h>
#include <unistd.h>

int main()
{
	#ifdef USE_SYSCALL
		write (1, "Hello System Call!\n", 19);
	#else
		printf ("Hello World\n");
	#endif
	return 0;
}
