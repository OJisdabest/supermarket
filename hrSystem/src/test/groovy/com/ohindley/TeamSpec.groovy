package com.ohindley

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamSpec extends Specification implements DomainUnitTest<Team> {

    def setup() {
    }

    def cleanup() {
    }

    void teamSize() {
	when: "A team size is above 0 or below 20"
		def team1 = new Team(teamName:'Clean up Crew',
			numberOfEmployees:5)
	then: " team size is valid."
	team1.teamSize()==true;
    }
}
