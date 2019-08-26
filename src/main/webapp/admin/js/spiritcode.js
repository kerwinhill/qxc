function addspiritcode(){

    $.ajax({
        url:"../api/addSpiritcode.do",
        data:$('#listform').serialize(),
        success:function(data){
            alert(data);
            location.href = "index.html";

        }

    });
}