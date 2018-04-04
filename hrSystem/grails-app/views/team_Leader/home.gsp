<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket | Management Page</title>
    <asset:stylesheet src="home.css"/>
</head>
<body>
    <div id="content" role="main">
	<!--controller for Tasks-->
	<div class="row">
	    <div class="first">
		<h3>Task Management</h3>
	    <p>This link will take you to a page where you can create tasks.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Employee" action="create">Add Task</g:link>
		</button>
	    </div>
	<!--controller for Employees-->
	    <div class="second">
		<h3>Employee Management</h3>
	    <p>This link will take you to a page where you can display/ list employees.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Employee" action="index">Display/ List Employees</g:link>
		</button>
	    </div>
	<!--controller for Teams-->
	    <div class="first">
		<h3>Team Management</h3>
	    <p>This link will take you to a page where you can display/ list teams.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Team" action="create">Display/ List Teams</g:link>
		</button>
	    </div>
	<!--controller for Tasks-->
	    <div class="second">
		<h3>Task Management</h3>
	    <p>This link will take you to a page where you can display/ list tasks.</p>
		<button type="button" class="btn btn-success">
		    <g:link controller="Task" action="create">Display/ List Tasks</g:link>
		</button>
            </div>
	</div>
    </div>
</body>
</html>
