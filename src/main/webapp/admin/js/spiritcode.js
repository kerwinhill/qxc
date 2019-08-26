function addspiritcode(){

    $.ajax({
        url:"../api/addSpiritcode.do",
        type:"POST",
        data:$('#listform').serialize(),
        success:function(data){
            alert(data);
            location.href = "index.html";
        }
    });
}



function loaddata(year){

    $.ajax({
        url:"../api/load.do",
        type:"post",
        data:{year:year},
        success:function(data){
            var sumitem = "";
            for (var i = 0; i < data.data.length; i++) {
                var item = " <tr>\n" +
                    "                    <td style=\"text-align:left; padding-left:20px;\">\n" +
                    "                        "+data.data[i].code+"\n" +
                    "                    </td>\n" +
                    "                    <td>\n" +
                    "                        <font color=\"red\">"+data.data[i].color+"</font>\n" +
                    "                    </td>\n" +
                    "                    <td width=\"10%\">\n" +
                    "                        "+data.data[i].shengxiao+"\n" +
                    "                    </td>\n" +
                    "                    <td>"+data.data[i].jmsht+"</td>\n" +
                    "                    <td>"+data.data[i].year+"</td>\n" +
                    "                    <td>\n" +
                    "                        <div class=\"button-group\">\n" +
                    "                            <a class=\"button border-main\" id=\"triggerBtn\" onclick=\"show()\" href=\"#\">\n" +
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