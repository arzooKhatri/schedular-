<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">	
<title>Insert title here</title>
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<%-- <spring:url value="/webapp/WEB-INF/js/index.js" var="indexJs" />
 <script src="${indexJs}"></script> --%>


</head>
<body>
<table style="width:100%" border=1px solid black>
<tr bgcolor="pink">
			<td>Serial No.</td>
			<td>job Name</td>
			<td>Job Group Name</td>
			<td>Next Fire Date Time</td>
			<td>Action</td>
</tr>
<tr><h1>View Scheduler List</h1></tr>
<tr>
			<td>1</td>
			<td>Mail Utility job</td>
			<td>mail regarding</td>
			<td>17-3-2023 at 5pm</td>
			<td><button id="mailbtn">Mail start</button>
			</td>
</tr>
<tr>
			<td>2</td>
			<td>SMS Utility job</td>
			<td>sms regarding</td>
			<td>18-3-2023 at 5pm</td>
			<td><button id="smsbtn">SMS start</button>
			</td>
</tr>
<tr>
			<td>3</td>
			<td>Notification Utility job</td>
			<td>notification regarding</td>
			<td>19-3-2023 at 5pm</td>
			<td><button id="notificationbtn">Notification start</button>
			</td>
</tr>
</table>
<script  src="Js/index.js" ></script>
</body>
</html>  