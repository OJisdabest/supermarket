package com.ohindley

class Employee {

String fullName

Date dateOfBirth

String residence

double hourlyRate

String employeeID

Date dateEmployed

String taxCode

String contract

Team_Leader teamLeader

Manager manager

Shift shift

static hasMany = [team:Team, task:Task]

static belongsTo = [Team, Task, Team_Leader]

String toString() {

return fullName

}

double calculateDaily() {

8*hourlyRate

}

    static constraints = {
	fullName blank:false, nullable:false;
	dateOfBirth blank:false, nullable:false;
	residence blank:false, nullable:false;
	hourlyRate blank:false, nullable:false, scale:2;
	dateEmployed blank:false, nullable:false;
	employeeID blank:false, nullable:false;
	taxCode blank:false, nullable:false;
	contract blank:false, nullable:false;
	teamLeader blank:false, nullable:false;
	manager blank:false, nullable:false;
	shift blank:true, nullable:true;
	task blank:true, nullable:true;
	team blank:true, nullable:true;
	

    }
}
