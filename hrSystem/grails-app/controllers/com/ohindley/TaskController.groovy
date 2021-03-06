package com.ohindley

import grails.converters.*

class TaskController {
    static allowedMethods = [index: "GET", show: "GET"]

    def scaffold = Task

    def index(Task task) {
	render Task.list() as XML
	}
    def show (Task task) {
	if (params.id && Task.exists(params.id)) {
	    render Task.findById(params.id) as JSON
	}
	else {
	    render Task.list() as JSON
	}
    }

    def advSearch2() {

    }

    def advResults2() {
	def taskProps = Task.metaClass.properties*.name
	def tasks = Task.withCriteria {"${params.queryType}" 
				{params.each { field, value ->
					if (taskProps.grep(field) && value) {
						ilike(field, value)
					}
			}
		}
	}
	return [ tasks : tasks ]
    }
}
