package com.ohindley

class Manager {

String fullName

String userName

String password

String managerEmail

String office

String department

static hasMany = [teamLeader:Team_Leader, employee:Employee]

/* for unit testing
String toString() {

return "$fullName, $managerEmail, $office"

}*/

String toString() {

return fullName;

}

    static constraints = {
	fullName blank:false, nullable:false;
	userName blank:false, nullable:false, unique:true;
	password blank:false, nullable:false;
	managerEmail blank:false, nullable:false, email:true;
	office blank:false, nullable:false;
	department blank:false, nullable:false;
	teamLeader blank: true, nullable:true;
	employee blank: true, nullable:true;
    }
}
