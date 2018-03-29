package com.ohindley

class Team {

String teamName

int numberOfEmployees

String sectionName

String description

    static constraints = {
	teamName blank:false, nullable:false;
	numberOfEmployees blank:false, nullable:false, minSize:20, maxSize:60;
	sectionName blank:false, nullable:false;
	description blank:false, nullable:false, maxSize:500, widget:'textarea';
    }
}
