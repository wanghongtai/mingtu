
var num;
var numCount;
function reg() {
    /*添加功能*/
    var country= $("[name=country]").val();
    var brandName= $("[name=brandName]").val();
    var regPhone= $("[name=phone]").val();
    $.ajax({
        dataType:"json",//注意不是datatype哦
        type:'post',
        url: contextPath+'/regInfo/saveItem',
        data:{"brandname":brandName,"countryName":country,"regPhone":regPhone},
        success:function(data){
            console.log(data);
            alert("添加成功");
        },
        error:function(){
            alert("请求失败");
        },
    });
}

$(document).ready(function(){

    //console.log("cxtPath=============="+contextPath)

    /*累计*/
    $.ajax({
        type:'post',
        url:contextPath+'/sysInfo/count',
        success:function(data){
            console.log(data);
            num=data;
            if(num>=0){
                $(".cumulative_query").html(num);
                $(".effective_query").html((num*0.8).toFixed(0));
            }
            console.log(num);
        },
        error:function(){
            alert("请求失败");
        }
    })

    /*当日*/
    $.ajax({
        type:'post',
        url:contextPath+'/sysInfo/todayCount',
        success:function(data){
            console.log(data);
            numCount=data;
            console.log("today"+numCount);
            if(num>=0){
                $(".enquiry_today").html(numCount);
            }
            console.log(numCount);
        },
        error:function(){
            console.log("fail");
        }
    });
    /*添加访问记录*/
    $.ajax({
        type:'post',
        url:contextPath+'/sysAcc/saveItem',
        success:function(data){
            console.log(data);
        },
        error:function(){
            alert("请求失败");
        }
    });

});




