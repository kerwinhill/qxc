function login(){
    var uname = $("#username").val();
    var upwd = $("#pwd").val();
    $.post("login.do",
        {
            username:uname,
            pwd:upwd
        },
        function(data){

            if(data.result){
                location.href = "index.html";
            }else{
                $("#msg").html("<div class=\"field\"><span style='color: red'>"+data.msg+"</div>");
            }
        }
    );
}
