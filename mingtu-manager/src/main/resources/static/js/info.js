
var info=[];
$(document).ready(function () {
    $.ajax({
        type:'post',
        url:contextPath+'/regInfo/list',
        success:function(data){
            console.log(data);
            if(data&&data.list){
                info= data.list
            }
            freshTable();
            console.log(data);
        },
        error:function(){
            alert("请求失败");
        }
    })
})



//刷新页面
function freshTable() {
    var tableHtml = "";
    tableHtml += " <tr><td>序号</td><td>注册国家</td><td>注册商标</td><td>注册电话</td></tr>";
    for(var i=0; i<info.length; i++){
        var stu = info[i];
        //追加内容
        tableHtml += "<tr>" +
            "<td>" + (i+1)+ "</td>" +
            "<td>" + stu.countryName+ "</td>" +
            "<td>" + stu.brandname+ "</td>" +
            "<td>" + stu.regPhone+ "</td>" +
            "</tr>";
    }
    //bootstrap初始化页面之后加了tbody元素
    $("#studentList tbody").html(tableHtml);
}














