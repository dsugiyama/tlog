/* 
 * $Id: tlog.h,v 1.1.1.1 2005/06/20 09:56:18 msato Exp $
 * $PCCC_Release$
 * $PCCC_Copyright$
 */
#ifndef _TLOG_H
#define _TLOG_H

#define TRUE 1
#define FALSE 0

#define MAX_THREADS 240
#define TLOG_DEFAULT_FILENAME "trace.log"

typedef enum tlog_type {
    TLOG_UNDEF = 0,	/* undefined */
    TLOG_START = 1,
    TLOG_END = 2, 	/* END*/
    
    TLOG_EVENT_1_IN   = 10,
    TLOG_EVENT_1_OUT  = 11,
    TLOG_EVENT_2_IN   = 12,
    TLOG_EVENT_2_OUT  = 13,
    TLOG_EVENT_3_IN   = 14,
    TLOG_EVENT_3_OUT  = 15,
    TLOG_EVENT_4_IN   = 16,
    TLOG_EVENT_4_OUT  = 17,
    TLOG_EVENT_5_IN   = 18,
    TLOG_EVENT_5_OUT  = 19,
    TLOG_EVENT_6_IN   = 20,
    TLOG_EVENT_6_OUT  = 21,
    TLOG_EVENT_7_IN   = 22,
    TLOG_EVENT_7_OUT  = 23,
    TLOG_EVENT_8_IN   = 24,
    TLOG_EVENT_8_OUT  = 25,
    TLOG_EVENT_9_IN   = 26,
    TLOG_EVENT_9_OUT  = 27,
    TLOG_EVENT_10_IN  = 28,
    TLOG_EVENT_10_OUT = 29,
    TLOG_EVENT_11_IN  = 30,
    TLOG_EVENT_11_OUT = 31,
    TLOG_EVENT_12_IN  = 32,
    TLOG_EVENT_12_OUT = 33,
    TLOG_EVENT_13_IN  = 34,
    TLOG_EVENT_13_OUT = 35,
    TLOG_EVENT_14_IN  = 36,
    TLOG_EVENT_14_OUT = 37,
    TLOG_EVENT_15_IN  = 38,
    TLOG_EVENT_15_OUT = 39,
    TLOG_EVENT_16_IN  = 40,
    TLOG_EVENT_16_OUT = 41,
    TLOG_EVENT_17_IN  = 42,
    TLOG_EVENT_17_OUT = 43,
    TLOG_EVENT_18_IN  = 44,
    TLOG_EVENT_18_OUT = 45,
    TLOG_EVENT_19_IN  = 46,
    TLOG_EVENT_19_OUT = 47,
    TLOG_EVENT_20_IN  = 48,
    TLOG_EVENT_20_OUT = 49,

    TLOG_EVENT_1 = 50,
    TLOG_EVENT_2 = 51,
    TLOG_EVENT_3 = 52,
    TLOG_EVENT_4 = 53,
    TLOG_EVENT_5 = 54,
    TLOG_EVENT_6 = 55,
    TLOG_EVENT_7 = 56,
    TLOG_EVENT_8 = 57,
    TLOG_EVENT_9 = 58,

    TLOG_END_END
} TLOG_TYPE;

#define TLOG_BLOCK_SIZE 1024
typedef struct _TLOG_BLOCK {
    struct _TLOG_BLOCK *next;
    double data[TLOG_BLOCK_SIZE/sizeof(double)];
} TLOG_BLOCK;

/* every log record is 2 double words. */
typedef struct tlog_record {
    unsigned short int proc_id;	/* processor id */
    char log_type;	/* major type */
    char arg1;		/* minor type */
    int arg2;
    double time_stamp;
} TLOG_DATA;

typedef struct tlog_handle {
    TLOG_BLOCK *block_top;
    TLOG_BLOCK *block_tail;
    TLOG_DATA *free_p;
    TLOG_DATA *end_p;
} TLOG_HANDLE;

#ifdef __cplusplus
extern "C" {
#endif

/* prototypes */
void tlog_initialize(int numt);
void tlog_finalize(void);
void tlog_log(enum tlog_type type);
void tlog_log2(enum tlog_type type, int tnum);
void tlog_log_filename(char *name);
void tlog_flush(void);

/* timer routine */
double tlog_timestamp(void);
double tlog_timestamp_init(void);
double tlog_get_time(void);

void _tlog_block_swap_bytes(TLOG_DATA *dp);

#ifdef __cplusplus
}
#endif

#endif /* _TLOG_H */
