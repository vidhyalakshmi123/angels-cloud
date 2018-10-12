<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@include file="header.jsp"%>

<html>
<head>
 
</head>
<body>
<div>

<c:url value="/admin/addproduct" var="url"></c:url>
	<form:form modelAttribute="supplier" action="${url }" method="post" enctype="multipart/form-data">
	<table>
	<tr>
		<td colspan="2">Supplier Details</td>
		<c:if test="${flag}">
			<input type="text" name="suppid" value="${supplier.suppid}"/>
		</c:if>
	</tr>
	<tr>
	<td>Supplier Name</td>
	         <c:if test="${flag}">
				<td><input type="text" name="suppname" value="${supplier.suppname}" /></td>
			</c:if>
			<c:if test="${!flag}">
	            <td><input type="text" name="suppname"/></td>
	        </c:if>
	</tr>
	<tr>
	<td>Supplier Address</td>
	<c:if test="${flag}">
				<td><input type="text" name="Address" value="${supplier.address}" /></td>
    </c:if>
    <c:if test="${!flag}">
	<td><input type="text" name="Address"/></td>
	</c:if>
	</tr>
	<tr>
	<td colspan="2">
		<input type="submit" value="AddSupplier"/>
	</td>
	</tr>
</table>
<!-- Supplier Form Completed -->

<!-- Displaying the Supplier data using Table -->
<table>

	<tr bgcolor="pink">
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Supplier Address</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${suppdetail}" var="supplier">
		<tr bgcolor="cyan">
			<td>${supplier.suppid}</td>
			<td>${supplier.suppname}</td>
			<td>${supplier.address}</td>
			<td><a href="<c:url value="/deleteSupplier/${supplier.suppid}"/>">Delete</a>
				<a href="<c:url value="/updateSupplier/${supplier.suppid}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>
</form:form>
</div>
<!-- Completed Displaying Table -->


<a href="<c:url value='/all/getallsuppliers'></c:url>">Browse all products</a>
	
<jsp:include page="footer.jsp"/>

</body>
</html>
</body>

</html>

