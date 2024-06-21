<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="model.TblProductocl2" %>
<%@page import="java.util.*" %>
<link href="css/web.css" type="text/css" rel="stylesheet">
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="#c5dec9">
<h2 align="center">Registrar Empleado</h2>


<form method="post" action="ControladorProducto">
<table border="2" align="center">
<tr>
	<td>Nombre</td>
	<td><input type="text" name="nombre"></td>	
</tr>

<tr>
	<td>Precio</td>
	<td><input type="text" name="precio"></td>	
</tr>

<tr>
	<td>PrecioVen</td>
	<td><input type="text" name="precioven"></td>	
</tr>

<tr>
	<td align="center">Estado<td>
	<select name="estado">
		<option>Seleccione Estado</option>
		<option>Vigente</option>
		<option>Agotado</option>
	</select>
	</td>
</tr>

<tr>
	<td>Descrip</td>
	<td><input type="text" name="descrip"></td>	
</tr>

<tr>
	<td colspan="3" ></td>
	<td align="center"><input type="submit" name="Registra Producto" value="Registrar"></td>
</tr>

</table>
</form>


<h1 align="center">Lista Productos</h1>
<table align="center" border="3">
<tr>
<th>Codigo de Producto</th>
<th>Nombre de Producto</th>
<th>Precio de Venta</th>
<th>Precio de Compra</th>
<th>Estado de Producto</th>
<th>Descripcion de Producto</th>

<%
List<TblProductocl2> ListadoProducto=(List<TblProductocl2>)request.getAttribute("listado");
if(ListadoProducto!=null){
	for(TblProductocl2 lis:ListadoProducto){
%>	
<tr>
<td>
<%=lis.getIdproductocl2() %>
</td>
<td>
<%=lis.getNombrecl2() %>
</td>
<td>
<%=lis.getPrecioventacl2() %>
</td>
<td>
<%=lis.getDescripcl2() %>
</td>
<td>
<%=lis.getEstadocl2() %>
</td>
<td>
<%=lis.	getDescripcl2()  %>
</td>
</tr>
<% 

	}
}
%>

</body>
</html>
