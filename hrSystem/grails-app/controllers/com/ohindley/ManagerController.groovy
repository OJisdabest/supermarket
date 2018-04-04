package com.ohindley

class ManagerController {

    def scaffold = Manager

    def login() {
	
    }

    def validate() {
	def user = Manager.findByUserName(params.userName)
	def password = Manager.findByPassword(params.password)
	    if (user || password) {
		session.user = user
		session.password = password
		render view:'home'
	    }
	    else {
		flash.message = "Invalid username or password."
		render view:'login'
	    }
    }
    
    def logout = {
	session.user = null
	redirect(uri:'/')
    }
}
