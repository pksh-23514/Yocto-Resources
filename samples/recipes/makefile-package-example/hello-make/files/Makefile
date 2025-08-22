CFLAGS = -g -Wall -DUSE_SYSCALL

TARGET = program

all: $(TARGET)

$(TARGET): $(TARGET).c
	$(CC) $(CFLAGS) $(LDFALGS) -o $(TARGET) $(TARGET).c

clean:
	rm -f $(TARGET)
