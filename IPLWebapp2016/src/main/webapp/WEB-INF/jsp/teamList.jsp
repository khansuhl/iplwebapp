
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<center>
	<h4>IPL 2016 teams list</h4>
	<table>
		<c:forEach var="team" items="${teamInfo}">
			<tr>
				<td><a
					href="<c:url value="teamDetails"/>?teamName=${team.name}">${team.name}</a></td>
			</tr>
		</c:forEach>
	</table>
</center>