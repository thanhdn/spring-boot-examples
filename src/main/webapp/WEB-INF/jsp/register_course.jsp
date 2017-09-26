<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Register a course</h1>
    <form action="/register-course" method="post">
    	<p>Id: <input type="number" name="courseId"  /></p>
        <p>Course name: <input type="text" name="courseName" /></p>
        <p><input type="submit" value="Submit" /> 
        <input type="reset" value="Reset" /></p>
    </form>
</body>
</html>