function addspiritcode(){

    $.ajax({
        url:"../api/addSpiritcode.do",
        type:"POST",
        data:$('#listform').serialize(),
        success:function(data){
            alert(data.msg);
            location.href = "spiritcode.html";
        }
    });
}



function loaddata(){
    $("#listcontent").empty();
    $.ajax({
        url:"../api/loadSpiritCode.do",
        type:"post",
        data:{year:$("#yearcheck").val()},
        success:function(data){
            var sumitem = "";
            for (var i = 0; i < data.data.length; i++) {
                var item = " <tr>\n" +
                    "                    <td style=\"text-align:left; padding-left:20px;\">\n" +
                    "                        "+data.data[i].code+"\n" +
                    "                    </td>\n" +
                    "                    <td>\n" +
                    "                        <div style='display: inline-block;width: 32px;height: 32px;background-color: "+data.data[i].color+"' ></div>\n" +
                    "                    </td>\n" +
                    "                    <td width=\"10%\">\n" +
                    "                        "+data.data[i].shengxiao+"\n" +
                    "                    </td>\n" +
                    "                    <td>"+data.data[i].jmsht+"</td>\n" +
                    "                    <td>"+data.data[i].year+"</td>\n" +
                    "                    <td>\n" +
                    "                        <div class=\"button-group\">\n" +
                    "                            <a class=\"button border-main\" id=\"triggerBtn\" onclick=\"showbox("+data.data[i].id+","+data.data[i].code+","+data.data[i].year+",'"+data.data[i].color+"','"+data.data[i].jmsht+"','"+data.data[i].shengxiao+"')\" >\n" +
                    "                                <span class=\"icon-edit\"></span> 修改\n" +
                    "                            </a>\n" +
                    "\n" +
                    "                        </div>\n" +
                    "                    </td>\n" +
                    "                </tr>";
                sumitem += item;
            }

            $("#listcontent").html(sumitem);

        }

    });


}



function loadmaxyear(){

    var year;

    $.ajax({
        url:"../api/loadmaxyear.do",
        type:"post",
        data:{year:year},
        success:function(data){
            year = data.data;
        },
        async:false

    });

    return year;

}




function deleteSpiritCode(){

    if(confirm("您確定要刪除"+$("#yearcheck").val()+"年的號碼記錄嗎？")){
        $.ajax({
            url: "../api/deleteSpiritCode.do",
            type: "post",
            data: {year: $("#yearcheck").val()},
            success: function (data) {
                alert(data.msg);
                var y = loadmaxyear();
                $("#yearcheck").val(y)
                loaddata();
            }
        });
    }



}





function deleteSpiritCode(){

    if(confirm("您確定要刪除"+$("#yearcheck").val()+"年的號碼記錄嗎？")){
        $.ajax({
            url: "../api/deleteSpiritCode.do",
            type: "post",
            data: {year: $("#yearcheck").val()},
            success: function (data) {
                alert(data.msg);
                var y = loadmaxyear();
                $("#yearcheck").val(y)
                loaddata();
            }
        });
    }



}


function editSpiritCode(){

    $.ajax({
        url:"../api/editSpiritCode.do",
        type:"POST",
        data:$('#editform').serialize(),
        success:function(data){
            alert(data.msg);
            loaddata();
            closebox();
        }
    });
}
