<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Result</h1>
    <p>Id:  ${course.courseId} </p>
   	<p>Course Name: ${course.courseName}</p>
    <a href="/register-course">Submit another course</a><br/>
    <a href="view-all-course">View all course</a>
</body>
</html>