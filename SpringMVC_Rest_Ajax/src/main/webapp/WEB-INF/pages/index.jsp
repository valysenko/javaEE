<%--
  Created by IntelliJ IDEA.
  User: Vladyslav
  Date: 21.04.2015
  Time: 1:58
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;" charset=UTF-8">
    <script type="text/javascript"
            src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js">
    </script>
    <%--<script type="text/javascript"--%>
            <%--src="<c:url value='/resources/rest_ajax.js'/>">--%>
    <%--</script>--%>
    <script type="text/javascript">
        var RestGet = function() {
            $.ajax({
                type: 'GET',
                url:   'http://localhost:8080'+'/MyData/' + Date.now(),
                dataType: 'json',
                async: true,
                success: function(result) {
                    alert('At ' + result.time
                    + ': ' + result.message);
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    alert('Get '+jqXHR.status + ' ' + jqXHR.responseText);
                }
            });
        }

        var RestPut = function() {

            var JSONObject= {
                'time': Date.now(),
                'message': 'User PUT call !!!'
            };

            $.ajax({
                type: 'PUT',
                url:   '/MyData',
                contentType: 'application/json; charset=utf-8',
                data: JSON.stringify(JSONObject),
                dataType: 'json',
                async: true,
                success: function(result) {
                    alert('At ' + result.time
                    + ': ' + result.message);
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    alert(jqXHR.status + ' ' + jqXHR.responseText);
                }
            });
        }

        var RestPost = function() {
            $.ajax({
                type: 'POST',
                url:   '/MyData',
                dataType: 'json',
                async: true,
                success: function(result) {
                    alert('At ' + result.time
                    + ': ' + result.message);
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    alert(jqXHR.status + ' ' + jqXHR.responseText);
                }
            });
        }

        var RestDelete = function() {
            $.ajax({
                type: 'DELETE',
                url:   '/MyData/' + Date.now(),
                dataType: 'json',
                async: true,
                success: function(result) {
                    alert('At ' + result.time
                    + ': ' + result.message);
                },
                error: function(jqXHR, textStatus, errorThrown) {
                    alert(jqXHR.status + ' ' + jqXHR.responseText);
                }
            });
        }

    </script>

    <title>Welcome To REST With Ajax !!!</title>
</head>
<body>
    <h1>Welcome To REST With Ajax !!!</h1>
    <button type="button" onclick="RestGet()">GET</button>
    <button type="button" onclick="RestPut()">PUT</button>
    <button type="button" onclick="RestPost()">POST</button>
    <button type="button" onclick="RestDelete()">DELETE</button>
</body>
</html>
