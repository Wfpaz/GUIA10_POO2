
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>Mantenimiento de Libros</title>
    </head>
    <body>
        <h1>Lista de Libros</h1>
        <h3>
            <a href="nuevoLibro">Ingresar Nuevo libro</a>
        </h3>
        <table border="1">
            <th>Codigo</th>
            <th>Nombre</th>
            <th>Autor</th>
            <th>Genero</th>
            <th>año</th>
            <th>Estado</th>
                <c:forEach var="libroTemp" items="${listLibros}">
                <tr>
                    <td><c:out value="${libroTemp.codiLibr}"/></td>
                    <td>${libroTemp.nombLibr}</td>
                    <td>${libroTemp.autoLibr}</td>
                    <td>${libroTemp.geneLibr}</td>
                    <td>${libroTemp.anioLibr}</td>
                    <td>${libroTemp.estaLibr}</td>
                    <td>
		            <a href="editarLibro?codi=${libroTemp.codiLibr}">Editar</a>
	                <a href="eliminarLibro?codi=${libroTemp.codiLibr}">Eliminar</a>
                        
                    </td>
                </tr>
                </c:forEach>
            
        </table>
    </body>
</html>
