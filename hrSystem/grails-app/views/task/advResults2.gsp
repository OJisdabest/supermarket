<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Supermarket - Search for Tasks</title>
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>
</head>
<body>
	<div class="row">
		<h1>Supermarket</h1>
			<h3>Results</h3>
			<p>Searched
			for tasks matching <em>${term}</em>.
			Found <strong>${tasks.size()}</strong> tasks.
			</p>
				<ul>
					<g:each var="task" in="${tasks}">
						<li><g:link controller="Task" action="show" id="${task.id}">${task.taskName}</g:link></li>
					</g:each>
				</ul>
					<g:link action='advSearch2'>Search Again</g:link>
	</div>
</body>
</html>
