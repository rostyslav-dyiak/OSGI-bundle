<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
<h1>Application monitoring system</h1>

<h2>Application status: <b>${status}</b></h2>

<form:form method="POST" action="/start_application">
    <input type="submit" value="Start application"/>
</form:form>
<form:form method="POST" action="/stop_application">
    <input type="submit" value="Stop application"/>
</form:form>

</body>
</html>