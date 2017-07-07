(function(){

    var app=angular.module("greeting",[]);
    
    var helloctrl = function($scope){
        $scope.greetingmsg = "Hi angi ...";
    }
    app.controller("hellocontroller", helloctrl);
    
}());