// Controller for Library Page
app.controller('libraryController', function($scope, $http) {

	$scope.selectedBranch = 'CSE';
	$scope.selectedSemester = 'Select Semester';
	$scope.selectedSubject = 'Select Subject';

	$scope.branch = ['CSE','IT','ECE','EEE'];
	$scope.semester = ['Select Semester','First', 'Second', 'Third', 'Fourth', 'Fifth', 'Sixth', 'Seventh', 'Eighth'];
	$scope.subject = ['Select Subject', 'Bot saare'];
});