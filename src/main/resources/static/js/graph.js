

/* 2인가구 그래프 */
    var dataList = /*[[${listhouesTwoRoom}]]*/ [];

    // 데이터를 추출하여 그래프에 사용할 형태로 가공
    var labels = dataList.map(function(data) {
    return data.housetype;  //
});


    var values = dataList.map(function(data) {
    return data.gagoo; //
});

    // Chart.js를 사용하여 그래프를 그립니다.
    var ctx = document.getElementById('twoRoomChart').getContext('2d');
    var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
    labels: labels,
    datasets: [{
    label: '1인가구 가구타입별 총가구수',
    data: values,
    backgroundColor: 'rgba(75, 192, 192, 0.2)',
    borderColor: 'rgba(75, 192, 192, 1)',
    borderWidth: 1
}]
},


    options: {
    scales: {
    x: {
    title: {
    display: true,
    text : '가구타입',
    color:'blue'
}
},
    y: {
    title: {
    display: true,
    text: '총가구수',
    color:'green',
},
    beginAtZero: true
}
},
    plugins: {
    title: {
    display: true,
    text: '1인가구 가구타입별 총가구수',
    position: 'bottom',
    color:'orange',
}
}
}
});