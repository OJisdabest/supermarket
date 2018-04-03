package com.ohindley

class Task {

String taskName

int numberOfPeople

String sectionName

String department

String timeRequired

String description

boolean taskCompleted

static hasMany = [shift:Shift, team:Team, employee:Employee]

static belongsTo = [Team, Shift]

String toString() {

return taskName

}

Boolean assignPeople() {

if (numberOfPeople == 0)
return true;

}

    static constraints = {
	taskName blank:false, nullable:false;
	numberOfPeople blank:false, nullable:false, minSize:1, maxSize:10;
	sectionName blank:false, nullable:false;
	department blank:false, nullable:false;
	timeRequired blank:false, nullable:false;
	description blank:false, nullable:false, maxSize:500, widget:'textarea';
	taskCompleted blank:false, nullable:false; 
	shift blank:true, nullable:true;
	team blank:true, nullable:true;
	employee blank:true, nullable:true;
    }
}
