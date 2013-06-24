/*
   Copyright [2013] [Abhinava Srivastava]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
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
