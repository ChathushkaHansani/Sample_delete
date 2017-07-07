/*IFIE method*/
(function () {

var printer = function () {
            document.write("Printing from main <br/>");
            
                var job1 = function () {
                document.write("printing job1 <br/>");
                
                };
                 var job2 = function () {
                document.write("printing job2 <br/>");
                
                };
                
                return {
                    printjob1 : job1,
                    printjob2 : job2
                };
            };
 
 var p = printer ();
    p.printjob1 ();
    p.printjob2 ();
}());