(function () {
   var app = angular.module("minifb", []);
    
    var homectrl = function ($scope, facebook,$interval, $log, $location, $anchorScroll){
        var accesstoken="EAACEdEose0cBADuNtxuaSeOWLXCRzSLZBPf5I3TltOiosH7tWTRaMMOlaQ9wZA9fP05kHBfthRZC2C6p1ElFVG4YXMAl7Slg4WCh7j3b7pWiQF87d547lIAT79SXVSFlvw3hPfIBviBLlCPDTLrmgntZCJNHcnZCz3NImZAIBHAg1ZCVkOCDfIfVhR2Y4LkdLEZD";
        var url="https://graph.facebook.com"
        $scope.countdown=5;
        $scope.userid="me";
        
        var countdown=function(){
            $scope.countdown-=1;
            if($scope.countdown<1){
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
             $scope.user=response;
            facebook.getProfilepicture($scope.userid, accesstoken).then(onProfPicComplete, onError);
        }
         
         var onFriendListComplete=function(response){
            $scope.user.friends=response;
             $scope.user.friends.sortOrder="+name";
             $location.hash("friends");
             $anchorScroll();
         }
         
         var onProfPicComplete=function(response){
            $scope.user.img=response;
             facebook.getFriendList($scope.userid, accesstoken).then(onFriendListComplete, onError);
         }
         
        $scope.search=function(){
            $log.info("Searching for"+ $scope.userid);
            
            if(timeflag){
                $interval.cancel(timeflag);
            }
           facebook.getUserinformation($scope.userid, accesstoken).then(onProfileComplete);
            
        }
       /* var promise=$http.get(url+"/v2.3/me?access_token="+accesstoken)
        promise.then(onComplete);*/
        
        
    };
    
    app.controller("minifbcontroller",homectrl);
    
} ())