(function(){

    var app=angular.module("greeting",[]);
    
    var empcrl= function($scope){
        var employee={
        title:"Employee Details",
        fname:"chathushka",
            city:"malambe",
            image:"https://pbs.twimg.com/media/DCmFjSdUAAAjOIN.jpg"
        };
        $scope.employee=employee;
    }
 
    app.controller("employeecontroller", empcrl);
    
}())