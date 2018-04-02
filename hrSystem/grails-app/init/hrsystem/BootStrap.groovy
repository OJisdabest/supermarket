package com.ohindley

class BootStrap {

    def init = { servletContext ->


	//Declaring Managers	
	def manager1=new Manager (
		fullName:'Oliver Hindley',
		userName:'ohindley',
		password:'secret999',
		managerEmail:'ohindley@email.com',
		office:'A1-001',
		department:'Electronics').save()

	def manager2=new Manager (
		fullName:'Jamie Hindley',
		userName:'jhindley',
		password:'astonvilla123',
		managerEmail:'jhindley@email.com',
		office:'A1-002',
		department:'Sales').save()

	def manager3=new Manager (
		fullName:'Tracey Hindley',
		userName:'thindley',
		password:'password456',
		managerEmail:'thindley@email.com',
		office:'A1-003',
		department:'Bakery').save()

	//Declaring Team Leaders
	def teamleader1=new Team_Leader (
		fullName:'Bob Lee',
		department:'Electronics',
		employeeID:'E0001',
		sectionName:'Repairs',
		officePhone:'01140001',
		leaderEmail:'blee@email.com',
		password:'scunthorpeunited',
		manager: manager1).save()

	def teamleader2=new Team_Leader (
		fullName:'Robert Sorrentino',
		department:'Business',
		employeeID:'E0002',
		sectionName:'Sales',
		officePhone:'01140002',
		leaderEmail:'rsorrentino@email.com',
		password:'liverpoolfc',
		manager: manager2).save()

	def teamleader3=new Team_Leader (
		fullName:'Bethany Kennedy',
		department:'Clothing',
		employeeID:'E0003',
		sectionName:'Store',
		officePhone:'01140003',
		leaderEmail:'bkennedy@email.com',
		password:'bethanyk123',
		manager: manager3).save()

	def teamleader4=new Team_Leader (
		fullName:'Aidan Whelan',
		department:'Electronics',
		employeeID:'E0004',
		sectionName:'Repairs',
		officePhone:'01140004',
		leaderEmail:'awhelan@email.com',
		password:'pizza123',
		manager: manager1).save()

	def teamleader5=new Team_Leader (
		fullName:'Peter Collindridge',
		department:'Clothing',
		employeeID:'E0005',
		sectionName:'Store',
		officePhone:'01140005',
		leaderEmail:'pcollindridge@email.com',
		password:'england1994',
		manager: manager3).save()

	//Declaring Employees
	def employee1=new Employee (
		fullName:'Michael Jordan',
		dateOfBirth: new Date('10/04/1990'),
		residence:'Barnsley',
		hourlyRate:'10.50',
		employeeID:'E0010',
		dateEmployed: new Date('20/01/2016'),
		taxCode:'TX001',
		contract:'Full-Time',
		teamLeader: teamleader1,
		manager: manager1).save()

	def employee2=new Employee (
		fullName:'Elon Musk',
		dateOfBirth: new Date('22/07/1974'),
		residence:'Rotherham',
		hourlyRate:'9.50',
		employeeID:'E0011',
		dateEmployed: new Date('31/03/2017'),
		taxCode:'TX002',
		contract:'Part-Time',
		teamLeader: teamleader2,
		manager: manager2).save()

	def employee3=new Employee (
		fullName:'Tony Stark',
		dateOfBirth: new Date('05/01/1964'),
		residence:'Sheffield',
		hourlyRate:'10.00',
		employeeID:'E0012',
		dateEmployed: new Date('15/02/2017'),
		taxCode:'TX003',
		contract:'Full-Time',
		teamLeader: teamleader3,
		manager: manager3).save()

	//Declaring Tasks
	def task1=new Task (
		taskName:'Repairs',
		numberOfPeople:'2',
		sectionName:'Repairs',
		department:'Electronics',
		timeRequired:'4 hours',
		description:'Repairing electronics',
		taskCompleted:'True').save()

	def task2=new Task (
		taskName:'Sales',
		numberOfPeople:'2',
		sectionName:'Sales',
		department:'Business',
		timeRequired:'12 hours',
		description:'Making Sales',
		taskCompleted:'True').save()

	def task3=new Task (
		taskName:'Stock',
		numberOfPeople:'4',
		sectionName:'Store',
		department:'Clothing',
		timeRequired:'24 hours',
		description:'Refilling stock in store',
		taskCompleted:'false').save()

	//Declaring Shifts
	def shift1=new Shift (
		shiftID:'1',
		timeOfDay:'Morning',
		dayOfWeek:'Monday',
		numberOfHours:'8',
		startingTime:'6:00am').save()

	def shift2=new Shift (
		shiftID:'1',
		timeOfDay:'Afternoon',
		dayOfWeek:'Wednesday',
		numberOfHours:'6',
		startingTime:'1:00pm').save()

	def shift3=new Shift (
		shiftID:'1',
		timeOfDay:'Evening',
		dayOfWeek:'Friday',
		numberOfHours:'4',
		startingTime:'6:00pm').save()

	//Declaring Teams
	def team1=new Team (
		teamName:'Team Repairs',
		numberOfEmployees:'2',
		sectionName:'Electronics',
		description:'Repairs team for electronics',
		teamLeader:teamleader1).save()

	def team2=new Team (
		teamName:'Team Business',
		numberOfEmployees:'2',
		sectionName:'Sales',
		description:'Sales team for business',
		teamLeader:teamleader2).save()

	def team3=new Team (
		teamName:'Team Clothing',
		numberOfEmployees:'2',
		sectionName:'Store',
		description:'Store team for clothing',
		teamLeader:teamleader3).save()

	employee1.addToTeam(team2)
	employee2.addToTeam(team1)
	employee3.addToTeam(team3)

	shift1.addToTeam(team1)
	shift1.addToTeam(team2)
	shift2.addToTeam(team1)
	shift2.addToTeam(team3)
	shift3.addToTeam(team3)

	task1.addToTeam(team1)
	task1.addToTeam(team2)
	task2.addToTeam(team1)
	task3.addToTeam(team3)

	task1.addToShift(shift2)
	task2.addToShift(shift1)
	task3.addToShift(shift3)

	shift1.addToEmployee(employee1)
	shift2.addToEmployee(employee3)
	shift3.addToEmployee(employee2)

	task1.addToEmployee(employee3)
	task2.addToEmployee(employee1)
	task3.addToEmployee(employee2)
	
    }
    def destroy = {
    }
}
