package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {

		Phone pixel = new Phone();

		pixel.make = "Pixel";
		pixel.model = "pixel 6";
		pixel.noOfCams = 2;
		pixel.color = "blue";
		pixel.screenSize = 6.8;
		pixel.os = "IOS";
		pixel.phoneNumber = "578966855";
		pixel.makeCall();
		pixel.takePictures();
		pixel.printCompleteInfo();

	}

}
