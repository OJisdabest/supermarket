package com.ohindley

class Team_Leader {

String fullName

String department

String employeeID

String sectionName

String officePhone

String leaderEmail

String password

Team team

Manager manager

static hasMany = [employee:Employee]

String toString() {

return fullName

}

    static constraints = {
	fullName blank:false, nullable:false;
	department blank:false, nullable:false;
	employeeID blank:false, nullable:false, unique: true;
	sectionName blank:false, nullable:false;
	officePhone blank:false, nullable:false;
	leaderEmail blank:false, nullable:false, email:true;
	password blank:false, nullable:false;
	team blank:true, nullable:true;
	manager blank:false, nullable:false;
	employee blank:true, nullable:true;
    }
}
