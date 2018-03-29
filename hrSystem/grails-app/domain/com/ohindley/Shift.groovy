package com.ohindley

class Shift {

String timeOfDay

String dayOfWeek

int numberOfHours

String startingTime

    static constraints = {
	timeOfDay blank:false, nullable:false;
	dayOfWeek blank:false, nullable:false;
	numberOfHours blank:false, nullable:false, minSize:2, maxSize:8;
	startingTime blank:false, nullable:false;
    }
}
