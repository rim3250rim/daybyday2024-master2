function developData() {
    // AJAX 요청을 사용하여 서버에서 데이터를 가져옴
    $.ajax({
        url: '/test2',
        method: 'GET',
        success: function (data) {
            // 데이터를 성공적으로 가져왔을 때 실행되는 함수
            updateTable(data);
        },
        error: function (error) {
            console.error('Error fetching data:', error);
        }
    });
}

function updateTable(data) {
    var tableBody = $('#dataTable tbody');
    tableBody.empty();  // 기존 데이터 비우기
    // 서버에서 받은 데이터를 테이블에 추가


    for (var i = 0; i < data.length; i++) {
        var row = '<tr>' +
            '<td>' + data[i].dpName + '</td>' +
            '<td>' + data[i].emName + '</td>' +
            '</tr>';
        tableBody.append(row);
    }
}


function developsData() {
    // AJAX 요청을 사용하여 서버에서 데이터를 가져옴
    $.ajax({
        url: '/test2',
        method: 'GET',
        success: function (data) {
            // 데이터를 성공적으로 가져왔을 때 실행되는 함수
            updateTable(data);
        },
        error: function (error) {
            console.error('Error fetching data:', error);
        }
    });
}

function updateTable(data) {
    var tableBody = $('#dataTable tbody');
    tableBody.empty();  // 기존 데이터 비우기
    // 서버에서 받은 데이터를 테이블에 추가


    for (var i = 0; i < data.length; i++) {
        var row = '<tr>' +
            '<td>' + data[i].dpName + '</td>' +
            '<td>' + data[i].emName + '</td>' +
            '</tr>';
        tableBody.append(row);
    }
}