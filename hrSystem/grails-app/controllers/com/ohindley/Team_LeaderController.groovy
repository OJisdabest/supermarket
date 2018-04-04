package com.ohindley

class Team_LeaderController {

    def scaffold = Team_Leader

    def login() {
	
    }

    def validate() {
	def user = Team_Leader.findByLeaderEmail(params.leaderEmail)
	    if (user && user.password == params.password) {
		session.user = user
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
