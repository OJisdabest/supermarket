<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Supermarket - Search for Employees</title>
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>
<body>
	<div class="row">
		<h1>Supermarket</h1>
			<h3>Results</h3>
			<p>Searched
			for employees matching <em>${term}</em>.
			Found <strong>${employees.size()}</strong> employees.
			</p>
				<ul>
					<g:each var="employee" in="${employees}">
						<li><g:link controller="Manager" action="show" id="${employee.id}">${employee.fullName}</g:link></li>
					</g:each>
				</ul>
					<g:link action='advSearch'>Search Again</g:link>
	</div>
</body>
</html>
