package com.ohindley

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TaskSpec extends Specification implements DomainUnitTest<Task> {

    def setup() {
    }

    def cleanup() {
    }

    void assignPeople() {
	when: "Number of people is 0"
		def task1 = new Task(taskName:'Cleaning',
			numberOfPeople:0)
	then: " we must assign people to task."
	task1.assignPeople()==true;
    }
}
