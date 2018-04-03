package com.ohindley

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ManagerSpec extends Specification implements DomainUnitTest<Manager> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
	when:"A manager has full name, email and office"
		def manager = new Manager(fullName:'Brock Lesnar',
			managerEmail:'blesnar@hotmail.com',
			office:'B1-900')
	then:" the toString method will merge them."
	manager.toString()=='Brock Lesnar, blesnar@hotmail.com, B1-900'
    }
}
