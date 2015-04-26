/**
 * Created by Vladyslav on 21.04.2015.
 */


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
