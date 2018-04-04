package com.ohindley

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void calculateDaily() {
	when: "An employee has employee ID, full name and hourly rate"
		def employee = new Employee(employeeID:'1',
			fullName:'Oliver Hindley',
			hourlyRate:'9.99')
	then: " the calculateDaily method will calculate daily wage."
	employee.calculateDaily()==79.92
    }
}
