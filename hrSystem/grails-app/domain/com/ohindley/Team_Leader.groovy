package com.ohindley

class Team_Leader {

String fullName

String department

String employeeID

String sectionName

int officePhone

String leaderEmail

String password

    static constraints = {
	fullName blank:false, nullable:false;
	department blank:false, nullable:false;
	employeeID blank:false, nullable:false, unique: true;
	sectionName blank:false, nullable:false;
	officePhone blank:false, nullable:false;
	leaderEmail blank:false, nullable:false, email:true;
	password blank:false, nullable:false;
    }
}