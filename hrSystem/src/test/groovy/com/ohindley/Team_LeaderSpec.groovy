package com.ohindley

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class Team_LeaderSpec extends Specification implements DomainUnitTest<Team_Leader> {

    def setup() {
    }

    def cleanup() {
    }

    void passwordValidation() {
	when: "Password length is greater than 9"
		def teamleader = new Team_Leader(fullName:'Mike Wasowski',
			password:'Monstersinc')
	then: " password is valid"
	teamleader.passwordValidation()==true;
    }
}
