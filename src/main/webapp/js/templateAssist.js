/**
 * 高级自定义模版，放到最底部</body>与</html>之间。用于统计、百度优化等辅助功能
 */

//如果URL的后缀名是html，或者无文件(默认index.html)的话，才开启。也就是只有当访问前端页面时才会开启,后台使用无效
if(window.location.pathname.split('.').pop().toLowerCase() == 'html' || window.location.pathname.split('.').pop().toLowerCase() == '/'){
	
	/*Baidu tongji*/
	var _hmt = _hmt || [];
	(function() {
	  var hm = document.createElement("script");
	  hm.src = "//hm.baidu.com/hm.js?9074d34d253e26da296dafbeccd0fed7";
	  var s = document.getElementsByTagName("script")[0]; 
	  s.parentNode.insertBefore(hm, s);
	})();
	
	/*Baidu 链接提交 自动推送工具代码*/
	(function(){
		var bp = document.createElement('script');
	    var curProtocol = window.location.protocol.split(':')[0];
	    if (curProtocol === 'https') {
	        bp.src = 'https://zz.bdstatic.com/linksubmit/push.js';        
	    }else {
	        bp.src = 'http://push.zhanzhang.baidu.com/push.js';
	    }
	    var s = document.getElementsByTagName("script")[0];
	    s.parentNode.insertBefore(bp, s);
	})();
	
	/*360 SEO 链接提交，自动推送工具*/
	(function(){
		/*如果URL的后缀名是html，或者无文件(默认index.html)的话，才开启360自动推送*/
	   var src = (document.location.protocol == "http:") ? "http://js.passport.qihucdn.com/11.0.1.js?568d0f71d2e79af4ab27da345712bc03":"https://jspassport.ssl.qhimg.com/11.0.1.js?568d0f71d2e79af4ab27da345712bc03";
	   document.write('<script src="' + src + '" id="sozz"><\/script>');
	   var qihucdn = document.createElement('script');
	   qihucdn.src = (document.location.protocol == "http:") ? "http://js.passport.qihucdn.com/11.0.1.js?568d0f71d2e79af4ab27da345712bc03":"https://jspassport.ssl.qhimg.com/11.0.1.js?568d0f71d2e79af4ab27da345712bc03";;
	   qihucdn.id = "sozz";
	   var s = document.getElementsByTagName("script")[0];
	   s.parentNode.insertBefore(qihucdn,s);
	})();
}