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
			<formset>
				<legend>Advanced Search for Employees</legend>
					<table>
						<g:form action="advResults">
							<tr>
								<td>Name</td>
								<td><g:textField name="fullName"/></td>
							</tr>
							<tr>
								<td>Employee ID</td>
								<td><g:textField name="employeeID"/></td>
							</tr>
							<tr>
								<td>Tax Code</td>
								<td><g:textField name="taxCode"/></td>
							</tr>
							<tr>
								<td>Query Type:</td>
								<td><g:radioGroup name="queryType" labels="['And','Or','Not']" values="['and','or','not']" value="and"> ${it.radio}${it.label}</g:radioGroup>
								</td>
							</tr>
							<tr>
								<td/>
								<td>
									<g:submitButton name="search" value="Search"/></td>
							</tr>
						</g:form>
					</table>
			</formset>
	</div>
</body>
</html>
