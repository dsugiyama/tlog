!_TLOGF_H

integer,parameter :: TLOG_EVENT_1_IN  = 10
integer,parameter :: TLOG_EVENT_1_OUT = 11 
integer,parameter :: TLOG_EVENT_2_IN  = 12
integer,parameter :: TLOG_EVENT_2_OUT = 13 
integer,parameter :: TLOG_EVENT_3_IN  = 14
integer,parameter :: TLOG_EVENT_3_OUT = 15 
integer,parameter :: TLOG_EVENT_4_IN  = 16
integer,parameter :: TLOG_EVENT_4_OUT = 17 
integer,parameter :: TLOG_EVENT_5_IN  = 18
integer,parameter :: TLOG_EVENT_5_OUT = 19 
integer,parameter :: TLOG_EVENT_6_IN  = 20
integer,parameter :: TLOG_EVENT_6_OUT = 21 
integer,parameter :: TLOG_EVENT_7_IN  = 22
integer,parameter :: TLOG_EVENT_7_OUT = 23 
integer,parameter :: TLOG_EVENT_8_IN  = 24
integer,parameter :: TLOG_EVENT_8_OUT = 25 
integer,parameter :: TLOG_EVENT_9_IN  = 26
integer,parameter :: TLOG_EVENT_9_OUT = 27

integer, parameter :: TLOG_EVENT_1 = 31
integer, parameter :: TLOG_EVENT_2 = 32
integer, parameter :: TLOG_EVENT_3 = 33
integer, parameter :: TLOG_EVENT_4 = 34
integer, parameter :: TLOG_EVENT_5 = 35
integer, parameter :: TLOG_EVENT_6 = 36
integer, parameter :: TLOG_EVENT_7 = 37
integer, parameter :: TLOG_EVENT_8 = 38
integer, parameter :: TLOG_EVENT_9 = 39

interface
  subroutine tlog_initialize_
  end subroutine
  subroutine tlog_finalize_
  end subroutine
  subroutine tlog_log_(e)
    integer e
  end subroutine
end interface
