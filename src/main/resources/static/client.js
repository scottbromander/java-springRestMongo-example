$(document).ready(function(){
    $.ajax({
        type: "GET",
        url: "/students",
        success: function(response){
            appendDom(response._embedded.students);
        }
    });
});

function appendDom(arrayOfStudents){
    for(var i = 0; i < arrayOfStudents.length; i++){
        var student = arrayOfStudents[i];

        $("#container").append("<div></div>");
        var el = $("#container").children().last();
        el.append("<p>" + student.name + "</p>");
    }
}