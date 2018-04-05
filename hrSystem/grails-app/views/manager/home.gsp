<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket | Management Page</title>
    <asset:stylesheet src="home.css"/>
</head>
<body>
    <div id="content" role="main">
	<!--controller for Employees-->
	<div class="row">
	    <div class="first">
		<h3>Employee Management</h3>
	    <p>This link will take you to a page where you can create/edit/display employees.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Employee" action="create">Add Employee</g:link>
		</button>
	    </div>
	<!--controller for Shifts-->
	    <div class="second">
		<h3>Shift Management</h3>
	    <p>This link will take you to a page where you can create/edit/display shifts.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Shift" action="create">Add Shift</g:link>
		</button>
	    </div>
	<!--controller for Team Leaders-->
	    <div class="first">
		<h3>Team Leader Management</h3>
	    <p>This link will take you to a page where you can create/edit/display team leaders.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Team_Leader" action="create">Add Team Leader</g:link>
		</button>
	    </div>
	<!--controller for Teams-->
	    <div class="second">
		<h3>Team Management</h3>
	    <p>This link will take you to a page where you can create/edit/display teams.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Team" action="create">Add Team</g:link>
		</button>
            </div>
	<!--controller for Assigning Employees to Teams-->
	    <div class="first">
		<h3>Assign Employees to Teams</h3>
	    <p>This link will take you to a page where you can assign employees to teams.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Team" action="index">Assign Employees to Teams</g:link>
		</button>
            </div>
	<!--controller for Searching for Employees-->
	    <div class="second">
		<h3>Advanced Search for Employees</h3>
	    <p>This link will take you to a page where you can search for specific employees via their full name, employeeID and/or tax code.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Employee" action="advSearch">Search for Employees</g:link>
		</button>
	    </div>
	</div>
    </div>
</body>
</html>
