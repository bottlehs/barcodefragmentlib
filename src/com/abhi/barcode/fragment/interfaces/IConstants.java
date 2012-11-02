package com.abhi.barcode.fragment.interfaces;

public interface IConstants {
	String LOG_NAME = "LOG_NAME";	
	int DECODE = 0;
	int QUIT = 1;
	int DECODE_COMPLETE = 2;
	int DECODE_FAILED = 3;
	int SUCESS = 4;
	int RESTART_PREVIEW = 5;
	int AUTO_FOCUS = 6;
	int DECODE_RESULT = 7;
	
	
	int MIN_FRAME_WIDTH = 240;
	int MIN_FRAME_HEIGHT = 240;
	int MAX_FRAME_WIDTH = 600;
	int MAX_FRAME_HEIGHT = 400;
}
