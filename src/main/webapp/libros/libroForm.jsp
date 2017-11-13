<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="frm" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo Libro</h1>
	<frm:form action="guardarLibro" method="post" modelAttribute="objeLibro">
		<frm:hidden path="codiLibr"/>
		<label>Nombre</label>
		<frm:input path="nombLibr" />
				<label>Autor</label>
                <frm:input path="autoLibr" />
                <label>Genero</label>
                <frm:input path="geneLibr" />
                <label>Año</label>
                <frm:input path="anioLibr" />
                <label>Estado</label>
                <frm:input path="estaLibr"/>
		<input type="submit" value="Guardar" />
	</frm:form>
    </body>
</html>
