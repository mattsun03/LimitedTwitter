<%@ page contentType="text/html; charset=Windows-31J"
	pageEncoding="Windows-31J"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja" lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<title>sample1</title>
<!-- <script type="text/javascript" -->
<!-- 	src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script> -->

<script type="text/javascript" src="js/framework/jquery-1.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("button").click(function() {
			$("p").load("./sample.txt");
		})
	})
</script>
</head>
<body>
	<button>•ÏX</button>
	<p>•ÏX‘O</p>
</body>
</html>
