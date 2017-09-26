<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html >
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>All available course</h1>
	<c:if test="${not empty listCourses}">

		<ul>
			<c:forEach var="course" items="${listCourses}">
				 <p>Id:  ${course.courseId} </p>
    			 <p>Course Name: ${course.courseName}</p>
    			 <hr/>
			</c:forEach>
		</ul>

	</c:if>
    
</body>
</html>