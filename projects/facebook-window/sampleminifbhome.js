(function () {
   var app = angular.module("minifb", []);
    
    var homectrl = function ($scope, $http,$interval, $log, $location, $anchorScroll){
        var accesstoken="EAACEdEose0cBADuNtxuaSeOWLXCRzSLZBPf5I3TltOiosH7tWTRaMMOlaQ9wZA9fP05kHBfthRZC2C6p1ElFVG4YXMAl7Slg4WCh7j3b7pWiQF87d547lIAT79SXVSFlvw3hPfIBviBLlCPDTLrmgntZCJNHcnZCz3NImZAIBHAg1ZCVkOCDfIfVhR2Y4LkdLEZD";
        var url="https://graph.facebook.com"
        $scope.countdown=5;
        $scope.userid="me";
        
        var countdown=function(){
            $scope.countdown-=1;
            if($scope.countdown<0){
                $scope.search;
            }
        }
        
        var starttime= function(){
            timeflag = $interval(countdown,1000,5);
        }
       starttime();
        
        var onError = function (reason){
            $scope.error=reason;
        }
        
         var onProfileComplete = function (response){
             $scope.user=response.data;
             $http.get(url+"/v2.3/"+$scope.userid+"/picture?redirect=false&type=large&access_token="+accesstoken).then(onProfPicComplete,onError)
        }
         
         var onFriendListComplete=function(response){
            $scope.user.friends=response.data;
             $scope.user.friends.sortOrder="+name";
             $location.hash("friends");
             $anchorScroll();
         }
         
         var onProfPicComplete=function(response){
            $scope.user.img=response.data;
             $http.get(url+"/v2.3/"+$scope.userid+"/friends?limit=500&access_token="+accesstoken).then(onFriendListComplete,onError);
         }
         
        $scope.search=function(){
            $log.info("Searching for"+ $scope.userid);
            
            $http.get(url+"/v2.3/"+ $scope.userid +"?access_token="+accesstoken).then(onProfileComplete);
        }
       /* var promise=$http.get(url+"/v2.3/me?access_token="+accesstoken)
        promise.then(onComplete);*/
        
        
    };
    
    app.controller("minifbcontroller",homectrl);
    
} ())