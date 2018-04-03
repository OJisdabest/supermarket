package com.ohindley

class Team {

String teamName

int numberOfEmployees

String sectionName

String description

Team_Leader teamLeader

static hasMany = [shift:Shift, task:Task, employee:Employee]

String toString() {

return teamName

}

Boolean teamSize() {
if (numberOfEmployees > 0 && numberOfEmployees < 20)
return true;
}

    static constraints = {
	teamName blank:false, nullable:false;
	numberOfEmployees blank:false, nullable:false, minSize:0, maxSize:20;
	sectionName blank:false, nullable:false;
	description blank:false, nullable:false, maxSize:500, widget:'textarea';
	shift blank:true, nullable:true;
	task blank:true, nullable:true;
	employee blank:true, nullable:true;
    }
}
