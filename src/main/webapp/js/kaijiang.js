


function loaddata(year){
    $("#kaijiangDiv").empty();
    $.ajax({
        url:"api/queryLastResult.do",
        type:"post",
        data:{year:year},
        success:function(data){
            var sumitem = "";
            console.log(data);

            /*
            * {"result":true,"msg":"成功！","data":[{"id":8,"codeid":7,"year":2019,"timer":"2019-08-27","b1":344,"b1code":1,"b1color":"red","b1shengxiao":"鼠","b1jmsht":"木","b2":346,"b2code":3,"b2color":"blue","b2shengxiao":"鸡","b2jmsht":"火","b3":352,"b3code":9,"b3color":"blue","b3shengxiao":"兔","b3jmsht":"木","b4":347,"b4code":4,"b4color":"blue","b4shengxiao":"猴","b4jmsht":"火","b5":354,"b5code":11,"b5color":"green","b5shengxiao":"牛","b5jmsht":"火","b6":357,"b6code":14,"b6color":"blue","b6shengxiao":"狗","b6jmsht":"土","b7":361,"b7code":18,"b7color":"red","b7shengxiao":"马","b7jmsht":"木"}]}
            * */
            if(data.data.length>0) {
                sumitem = "<div class=\"current\">\n" +
                    "            <table width=\"100%\" border=\"0\" bordercolorlight=\"#000000\" bordercolordark=\"#FFFFFF\" bgcolor=\"#EFF7FE\"\n" +
                    "              height=\"50\">\n" +
                    "              <tbody>\n" +
                    "                <tr>\n" +
                    "                  <td colspan=\"2\" class=\"topkjgdcsleft\">\n" +
                    "                    <div>第"+data.data[0].codeid+"期 開獎結果:</div>\n" +
                    "                    <div class=\"topkjgdcsright\">\n" +
                    "                      <marquee direction=\"left\">\n" +
                    "                        <font color=\""+data.data[0].b1color+"\" style=\"font-size:18px;font-weight: bold;\">"+data.data[0].b1code+"</font>-\n" +
                    "                        <font color=\""+data.data[0].b2color+"\" style=\"font-size:18px;font-weight: bold;\">"+data.data[0].b2code+"</font>-\n" +
                    "                        <font color=\""+data.data[0].b3color+"\" style=\"font-size:18px;font-weight: bold;\">"+data.data[0].b3code+"</font>-\n" +
                    "                        <font color=\""+data.data[0].b4color+"\" style=\"font-size:18px;font-weight: bold;\">"+data.data[0].b4code+"</font>-\n" +
                    "                        <font color=\""+data.data[0].b5color+"\" style=\"font-size:18px;font-weight: bold;\">"+data.data[0].b5code+"</font>-\n" +
                    "                        <font color=\""+data.data[0].b6color+"\" style=\"font-size:18px;font-weight: bold;\">"+data.data[0].b6code+"</font>&nbsp;&nbsp;T&nbsp;\n" +
                    "                        <font color=\""+data.data[0].b7color+"\" style=\"font-size:18px;font-weight: bold;\">"+data.data[0].b7code+"</font>\n" +
                    "                      </marquee>\n" +
                    "                    </div>\n" +
                    "                  </td>\n" +
                    "                </tr>\n" +
                    "                <tr>\n" +
                    "                  <td>\n" +
                    "                    <div class=\"kjbegohot\">\n" +
                    "                      <table class=\"numbers\">\n" +
                    "                        <tbody>\n" +
                    "                          <tr>\n" +
                    "                            <td><span class=\"ball  "+data.data[0].b1color+"\">"+data.data[0].b1code+"</span></td>\n" +
                    "                            <td><span class=\"ball  "+data.data[0].b2color+"\">"+data.data[0].b2code+"</span></td>\n" +
                    "                            <td><span class=\"ball  "+data.data[0].b3color+"\">"+data.data[0].b3code+"</span></td>\n" +
                    "                            <td><span class=\"ball  "+data.data[0].b4color+"\">"+data.data[0].b4code+"</span></td>\n" +
                    "                            <td><span class=\"ball  "+data.data[0].b5color+"\">"+data.data[0].b5code+"</span></td>\n" +
                    "                            <td><span class=\"ball  "+data.data[0].b6color+"\">"+data.data[0].b6code+"</span></td>\n" +
                    "                            <td><span class=\"plus\"></span></td>\n" +
                    "                            <td><span class=\"ball  "+data.data[0].b7color+"\">"+data.data[0].b7code+"</span></td>\n" +
                    "                          </tr>\n" +
                    "                          <tr>\n" +
                    "                            <td>"+data.data[0].b1shengxiao+"</td>\n" +
                    "                            <td>"+data.data[0].b2shengxiao+"</td>\n" +
                    "                            <td>"+data.data[0].b3shengxiao+"</td>\n" +
                    "                            <td>"+data.data[0].b4shengxiao+"</td>\n" +
                    "                            <td>"+data.data[0].b5shengxiao+"</td>\n" +
                    "                            <td>"+data.data[0].b6shengxiao+"</td>\n" +
                    "                            <td></td>\n" +
                    "                            <td>"+data.data[0].b7shengxiao+"</td>\n" +
                    "                          </tr>\n" +
                    "                        </tbody>\n" +
                    "                      </table>\n" +
                    "                    </div>\n" +
                    "                  </td>\n" +
                    "                </tr>\n" +
                    "                <tr>\n" +
                    "                  <td colspan=\"2\" height=\"29\">\n" +
                    "                    <div align=\"center\">\n" +
                    "                      <span style=\" color: #000; font-size: 12px;\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;下一期"+data.data[0].year+"年 第" +
                    "                        <font color=\"#FF0000\">"+(data.data[0].codeid+1)+"</font>期台灣七星彩開獎時間:&nbsp;2019年08月26日 21:30:00</span>\n" +
                    "                    </div>\n" +
                    "                  </td>\n" +
                    "                </tr>\n" +
                    "              </tbody>\n" +
                    "            </table>\n" +
                    "          </div>\n"
            }
            // for (var i = 0; i < data.data.length; i++) {
            //     var item = " <tr>\n" +
            //         "                    <td style=\"text-align:left; padding-left:20px;\">\n" +
            //         "                        "+data.data[i].code+"\n" +
            //         "                    </td>\n" +
            //         "                    <td>\n" +
            //         "                        <div style='display: inline-block;width: 32px;height: 32px;background-color: "+data.data[i].color+"' ></div>\n" +
            //         "                    </td>\n" +
            //         "                    <td width=\"10%\">\n" +
            //         "                        "+data.data[i].shengxiao+"\n" +
            //         "                    </td>\n" +
            //         "                    <td>"+data.data[i].jmsht+"</td>\n" +
            //         "                    <td>"+data.data[i].year+"</td>\n" +
            //         "                    <td>\n" +
            //         "                        <div class=\"button-group\">\n" +
            //         "                            <a class=\"button border-main\" id=\"triggerBtn\" onclick=\"showbox("+data.data[i].id+","+data.data[i].code+","+data.data[i].year+",'"+data.data[i].color+"','"+data.data[i].jmsht+"','"+data.data[i].shengxiao+"')\" >\n" +
            //         "                                <span class=\"icon-edit\"></span> 修改\n" +
            //         "                            </a>\n" +
            //         "\n" +
            //         "                        </div>\n" +
            //         "                    </td>\n" +
            //         "                </tr>";
            //     sumitem += item;
            // }

            $("#kaijiangDiv").html(sumitem);

        }

    });
}



function loadmaxyear(){

    var year;

    $.ajax({
        url:"api/loadmaxyear.do",
        type:"post",
        data:{year:year},
        success:function(data){
            year = data.data;
        },
        async:false

    });

    return year;

}







