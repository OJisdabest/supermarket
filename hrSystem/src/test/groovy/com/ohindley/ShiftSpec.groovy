package com.ohindley

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ShiftSpec extends Specification implements DomainUnitTest<Shift> {

    def setup() {
    }

    def cleanup() {
    }

    void doublePay() {
	when: "Number of hours is greater than 10"
		def shift1 = new Shift(shiftID:500,
			numberOfHours:'12')
	then: " double pay is initiated."
	shift1.doublePay()==true;
    }
}
