<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <!-- FullCalendar Library -->
    <link rel='stylesheet' href="<c:url value="/resources/fullcalendar/fullcalendar.css"/>"/>
    <link rel='stylesheet' href="<c:url value="/resources/css/bootstrap.css"/>"/>
    
    <script src="<c:url value="/resources/lib/jquery.min.js"/>"></script>
    <script src="<c:url value="/resources/lib/moment.min.js"/>"></script>
    <script src="<c:url value="/resources/fullcalendar/fullcalendar.js"/>"></script>
    <!-- Google Calendar API-->
    <script type='text/javascript' src="<c:url value="/resources/fullcalendar/gcal.js"/>"></script>
    <!-- <script src="<c:url value="/resources/js/test.js"/>"></script> -->

<style>
body {
	background: #f8f8f8;
	padding: 60px 60px;
}
</style>

<title>통계 페이지</title>
<body>
<div id='calendar'></div>

<script>
$('#calendar').fullCalendar({
    header: {
        center: 'month,agendaFourDay' // buttons for switching between views
    },
    views: {
        agendaFourDay: {
            type: 'agenda',
            duration: { days: 4 },
            buttonText: '4 day'
        }
    },
    events:${object}
});
</script>
</body>
</html>