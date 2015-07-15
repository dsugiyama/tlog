// $Id: tlogInit.java,v 1.1.1.1 2005/06/20 09:56:18 msato Exp $
// $Release$
// $Copyright$

import java.awt.*;

public class tlogInit {

  final static byte TLOG_EVENT_1_IN  = 10;
  final static byte TLOG_EVENT_1_OUT = 11;
  final static byte TLOG_EVENT_2_IN  = 12;
  final static byte TLOG_EVENT_2_OUT = 13;
  final static byte TLOG_EVENT_3_IN  = 14;
  final static byte TLOG_EVENT_3_OUT = 15;
  final static byte TLOG_EVENT_4_IN  = 16;
  final static byte TLOG_EVENT_4_OUT = 17;
  final static byte TLOG_EVENT_5_IN  = 18;
  final static byte TLOG_EVENT_5_OUT = 19;
  final static byte TLOG_EVENT_6_IN  = 20;
  final static byte TLOG_EVENT_6_OUT = 21;
  final static byte TLOG_EVENT_7_IN  = 22;
  final static byte TLOG_EVENT_7_OUT = 23;
  final static byte TLOG_EVENT_8_IN  = 24;
  final static byte TLOG_EVENT_8_OUT = 25;
  final static byte TLOG_EVENT_9_IN  = 26;
  final static byte TLOG_EVENT_9_OUT = 27;
  final static byte TLOG_EVENT_10_IN  = 28;
  final static byte TLOG_EVENT_10_OUT = 29;
  final static byte TLOG_EVENT_11_IN  = 30;
  final static byte TLOG_EVENT_11_OUT = 31;
  final static byte TLOG_EVENT_12_IN  = 32;
  final static byte TLOG_EVENT_12_OUT = 33;
  final static byte TLOG_EVENT_13_IN  = 34;
  final static byte TLOG_EVENT_13_OUT = 35;
  final static byte TLOG_EVENT_14_IN  = 36;
  final static byte TLOG_EVENT_14_OUT = 37;
  final static byte TLOG_EVENT_15_IN  = 38;
  final static byte TLOG_EVENT_15_OUT = 39;
  final static byte TLOG_EVENT_16_IN  = 40;
  final static byte TLOG_EVENT_16_OUT = 41;
  final static byte TLOG_EVENT_17_IN  = 42;
  final static byte TLOG_EVENT_17_OUT = 43;
  final static byte TLOG_EVENT_18_IN  = 44;
  final static byte TLOG_EVENT_18_OUT = 45;
  final static byte TLOG_EVENT_19_IN  = 46;
  final static byte TLOG_EVENT_19_OUT = 47;
  final static byte TLOG_EVENT_20_IN  = 48;
  final static byte TLOG_EVENT_20_OUT = 49;

  final static byte TLOG_EVENT_1 = 50;
  final static byte TLOG_EVENT_2 = 51;
  final static byte TLOG_EVENT_3 = 52;
  final static byte TLOG_EVENT_4 = 53;
  final static byte TLOG_EVENT_5 = 54;
  final static byte TLOG_EVENT_6 = 55;
  final static byte TLOG_EVENT_7 = 56;
  final static byte TLOG_EVENT_8 = 57;
  final static byte TLOG_EVENT_9 = 58;

  final static int BASE_COLOR_COUNT = 8;
  final static int COLOR_DEPTH_COUNT = 4;

  private static Color generateColor(int index) {
    int base_key  = index % BASE_COLOR_COUNT;
    int depth_key = (index / BASE_COLOR_COUNT) + 1;
    int depth_range = COLOR_DEPTH_COUNT + 2;
    float h = 3.0f * base_key / BASE_COLOR_COUNT;
    float b = 1.0f * depth_key / depth_range;
    return Color.getHSBColor(h, 1.0f, b);
  }

  private static void defineEventType(int key, String label) {
    tlogData.defineEvent2Type(key, key + 1, label, generateColor(key / 2));
  }

  public static void init() {

    tlogData.setMaxType(128);

    tlogData.defineEvent2Type(TLOG_EVENT_1_IN,
			      TLOG_EVENT_1_OUT,
			      "1 in/out",Color.white);
    tlogData.defineEvent2Type(TLOG_EVENT_2_IN,
			      TLOG_EVENT_2_OUT,
			      "2 in/out",Color.green);
    tlogData.defineEvent2Type(TLOG_EVENT_3_IN,
			      TLOG_EVENT_3_OUT,
			      "3 in/out",Color.yellow);
    tlogData.defineEvent2Type(TLOG_EVENT_4_IN,
			      TLOG_EVENT_4_OUT,
			      "4 in/out",Color.blue);
    tlogData.defineEvent2Type(TLOG_EVENT_5_IN,
			      TLOG_EVENT_5_OUT,
			      "5 in/out",Color.magenta);
    tlogData.defineEvent2Type(TLOG_EVENT_6_IN,
			      TLOG_EVENT_6_OUT,
			      "6 in/out",Color.orange);
    tlogData.defineEvent2Type(TLOG_EVENT_7_IN,
			      TLOG_EVENT_7_OUT,
			      "7 in/out",Color.pink);
    tlogData.defineEvent2Type(TLOG_EVENT_8_IN,
			      TLOG_EVENT_8_OUT,
			      "8 in/out",Color.red);
    tlogData.defineEvent2Type(TLOG_EVENT_9_IN,
			      TLOG_EVENT_9_OUT,
			      "9 in/out",Color.gray);

    defineEventType(TLOG_EVENT_10_IN, "10 in/out");
    defineEventType(TLOG_EVENT_11_IN, "11 in/out");
    defineEventType(TLOG_EVENT_12_IN, "12 in/out");
    defineEventType(TLOG_EVENT_13_IN, "13 in/out");
    defineEventType(TLOG_EVENT_14_IN, "14 in/out");
    defineEventType(TLOG_EVENT_15_IN, "15 in/out");
    defineEventType(TLOG_EVENT_16_IN, "16 in/out");
    defineEventType(TLOG_EVENT_17_IN, "17 in/out");
    defineEventType(TLOG_EVENT_18_IN, "18 in/out");
    defineEventType(TLOG_EVENT_19_IN, "19 in/out");
    defineEventType(TLOG_EVENT_20_IN, "20 in/out");

    tlogData.defineEventType(TLOG_EVENT_1,"1 event",Color.white);
    tlogData.defineEventType(TLOG_EVENT_2,"2 event",Color.green);
    tlogData.defineEventType(TLOG_EVENT_3,"3 event",Color.yellow);
    tlogData.defineEventType(TLOG_EVENT_4,"4 event",Color.blue);
    tlogData.defineEventType(TLOG_EVENT_5,"5 event",Color.magenta);
    tlogData.defineEventType(TLOG_EVENT_6,"6 event",Color.orange);
    tlogData.defineEventType(TLOG_EVENT_7,"7 event",Color.pink);
    tlogData.defineEventType(TLOG_EVENT_8,"8 event",Color.red);
    tlogData.defineEventType(TLOG_EVENT_9,"9 event",Color.gray);

  }
}


