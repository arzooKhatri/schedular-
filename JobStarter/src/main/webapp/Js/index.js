
$(document).ready(function() {
			debugger;
			$("#mailbtn").click(function() {
				alert("hello");
				jQuery.ajax({
					url : 'userlogin',
					type : 'GET',
					success : function() {
						alert("done");
					}
				});
			});
		});

$(document).ready(function() {
			debugger;
			$("#smsbtn").click(function() {
				alert("hello");
				jQuery.ajax({
					url : 'home',
					type : 'GET',
					success : function() {
						alert("done");
					}
				});
			});
		});
$(document).ready(function() {
			debugger;
			$("#notificationbtn").click(function() {
				alert("hello");
				jQuery.ajax({
					url : 'about',
					type : 'GET',
					success : function() {
						alert("done");
					}
				});
			});
		});