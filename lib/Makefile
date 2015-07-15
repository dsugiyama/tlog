
ifeq ($(TARGET),thread)
  TAG = -DTLOG_THREAD
endif

CC	= mpicc 
AR	= ar cr
RANLIB	= ranlib

CFLAGS = $(MPI_INC) -fopenmp $(TAG)

SRCS =	tlog.c tlog-time.c tlog_misc.c tlog_event.c
OBJS =	tlog.o tlog-time.o tlog_misc.o tlog_event.o

libtlog.a: $(OBJS)
	rm -f $@
	$(AR) $@ $(OBJS)
	$(RANLIB) $@

tlog_dump: tlog_dump.c tlog_event.o tlog_misc.o
	cc -o tlog_dump tlog_dump.c tlog_event.o tlog_misc.o

clean:
	rm -f *.o *~ core.* libtlog.a
