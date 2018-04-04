package com.ohindley

class HrSystem2TagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

    def loginToggle2 = {

	out << "<div style='margin: 15px 0 40px;'>"

	if (request.getSession(false) && session.user){
		out << "<span style='float:left; margin-left: 15px'>"
		out << "Welcome ${session.user}."
		out << "</span><span style='float:right; margin-right:15px'>"
		out << "<a href='${createLink(controller:'Team_Leader', action:'logout')}'>"
		out << "Team Leader Logout </a></span>"
	}
	else{
		out <<"<span style='float:right; margin-right:10px'>"
		out <<"<a href='${createLink(controller:'Team_Leader', action:'login')}'>"
		out << "Team Leader Login </a></span>"
	}
		out << "</div><br/>"
    }

}
