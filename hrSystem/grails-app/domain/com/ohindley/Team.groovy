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

    static constraints = {
	teamName blank:false, nullable:false;
	numberOfEmployees blank:false, nullable:false, minSize:20, maxSize:60;
	sectionName blank:false, nullable:false;
	description blank:false, nullable:false, maxSize:500, widget:'textarea';
	shift blank:true, nullable:true;
	task blank:true, nullable:true;
	employee blank:true, nullable:true;
    }
}
