#include "opencv2/highgui/highgui.hpp"
#include "opencv2/imgproc/imgproc.hpp"
#include <iostream>
#include <stdio.h>
#include <vector>

using namespace cv;
using cv::circle;

/** @function main */
int main(int argc, char** argv)
{

	Mat frame;
	//--- INITIALIZE VIDEOCAPTURE
	VideoCapture cap;
	// open the default camera using default API
	// cap.open(0);
	// OR advance usage: select any API backend
	int deviceID = 0;             // 0 = open default camera
	int apiID = cv::CAP_ANY;      // 0 = autodetect default API
	// open selected camera using selected API
	cap.open(deviceID + apiID);
	// check if we succeeded
	if (!cap.isOpened()) {
		std::cerr << "ERROR! Unable to open camera\n";
		return -1;
	}
	Mat src, src_gray, tmp, dst,tmp2,transfer;
	
	
	/// Read the image
	//src = imread("C:/Users/bwom123/Downloads/redtarget.jpg", 1);



	while (true) {

		imshow("original", cap.read(src));
		/// Convert it to gray
		cvtColor(src, src_gray, COLOR_BGR2GRAY);

		/// Reduce the noise so we avoid false circle detection
		GaussianBlur(src_gray, src_gray, Size(9, 9), 2, 2);

		std::vector<Vec3f> circles;



		tmp = src;
		dst = tmp;

		/// Show your results


				/// Apply the Hough Transform to find the circles
		HoughCircles(src_gray, circles, HOUGH_GRADIENT, 1, src_gray.rows / 8, 200, 100, 0, 0);



		/// Draw the circles detected
		for (size_t i = 0; i < circles.size(); i++)
		{
			Point center(cvRound(circles[i][0]), cvRound(circles[i][1]));
			int radius = cvRound(circles[i][2]);
			// circle center
			circle(src, center, 3, Scalar(0, 255, 0), -1, 8, 0);
			// circle outline
			//circle(src, center, radius, Scalar(0, 0, 255), 3, 8, 0);
		}



		while (true)
		{
			int c;
			c = waitKey(10);

			if ((char)c == 27)
			{
				break;
			}
			if ((char)c == 'u')
			{

				pyrUp(tmp, src, Size(tmp.cols * 2, tmp.rows * 2));
				printf("** Zoom In: Image x 2 \n");
				transfer = src;
				dst = src;


				/// Convert it to gray
				cvtColor(dst, tmp2, COLOR_BGR2GRAY);

				/// Reduce the noise so we avoid false circle detection
				GaussianBlur(tmp2, tmp2, Size(9, 9), 2, 2);
				/// Apply the Hough Transform to find the circles
				HoughCircles(tmp2, circles, HOUGH_GRADIENT, 1, tmp2.rows / 8, 200, 100, 0, 0);



				/// Draw the circles detected
				for (size_t i = 0; i < circles.size(); i++)
				{
					Point center(cvRound(circles[i][0]), cvRound(circles[i][1]));
					int radius = cvRound(circles[i][2]);
					// circle center
					circle(dst, center, 3, Scalar(0, 255, 0), -1, 8, 0);
					// circle outline
					//circle(dst, center, radius, Scalar(0, 0, 255), 3, 8, 0);
				}
				imshow("AAAAAH", dst);
				tmp = transfer;

			}
			else if ((char)c == 'd')
			{


				pyrDown(tmp, src, Size(tmp.cols / 2, tmp.rows / 2));
				printf("** Zoom Out: Image / 2 \n");
				transfer = src;
				dst = src;


				/// Convert it to gray
				cvtColor(dst, tmp2, COLOR_BGR2GRAY);

				/// Reduce the noise so we avoid false circle detection
				GaussianBlur(tmp2, tmp, Size(9, 9), 2, 2);
				/// Apply the Hough Transform to find the circles
				HoughCircles(tmp, circles, HOUGH_GRADIENT, 1, tmp.rows / 8, 200, 100, 0, 0);



				/// Draw the circles detected
				for (size_t i = 0; i < circles.size(); i++)
				{
					Point center(cvRound(circles[i][0]), cvRound(circles[i][1]));
					int radius = cvRound(circles[i][2]);
					// circle center
					circle(dst, center, 3, Scalar(0, 255, 0), -1, 8, 0);
					// circle outline
					//circle(dst, center, radius, Scalar(0, 0, 255), 3, 8, 0);
				}
				imshow("AAAAAH", dst);
				tmp = transfer;

			}

			imshow("AAAAAH", dst);
			tmp = src;



		}
	}
	return 0;
}