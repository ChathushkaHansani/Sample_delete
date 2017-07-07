(function(){
    var facebook = function($http){
          var url="https://graph.facebook.com";
        var getUser=function(userid,accesstoken){
                return $http.get(url+"/v2.3/"+ userid +"?access_token="+accesstoken).then(function(response){
                        return response.data;
                })
            }  
        var getProfilePic = function(userid,accesstoken){
            return $http.get(url+"/v2.3/"+userid+"/picture?redirect=false&type=large&access_token="+accesstoken).then(function(response){
                      return response.data;
            })
        
        }     
        var getFriendList= function(userid,accesstoken){
            return $http.get(url+"/v2.3/"+userid+"/friends?limit=500&access_token="+accesstoken).then(function(response){
            return response.data;
            })
        };
        return {
            getUserinformation:getUser,
            getProfilepicture:getProfilePic,
            getFriendList:getFriendList
        }
        }
    var app=angular.module("minifb");
    app.factory("facebook", facebook);

}())