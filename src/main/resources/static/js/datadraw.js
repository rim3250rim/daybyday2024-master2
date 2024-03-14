// 시계열 데이터 생성 함수
function generateTimeSeriesData(numPoints) {
    const data = [];
    const startDate = new Date();

    for (let i = 0; i < numPoints; i++) {
        const currentDate = new Date(startDate);
        currentDate.setDate(startDate.getDate() + i);
        const dataPoint = {
            x: currentDate.toISOString().split('T')[0],
            y: Math.random() * 100 // 임의의 데이터 생성
        };
        data.push(dataPoint);
    }

    return data;
}

// 시계열 데이터를 그래프로 표시하는 함수
function displayTimeSeriesChart(data) {
    const ctx = document.getElementById('timeSeriesChart').getContext('2d');

    const chart = new Chart(ctx, {
        type: 'line',
        data: {
            labels: data.map(point => point.x),
            datasets: [{
                label: 'Time Series Data',
                borderColor: 'rgb(75, 192, 192)',
                data: data.map(point => point.y),
            }]
        }
        ,
        data: {
            labels: data.map(point => point.x),
            datasets: [{
                label: 'Time time Data',
                borderColor: 'rgb(12, 22, 192)',
                data: data.map(point => point.y),
            }]
        }
        ,
        options: {
            scales: {
                x: {
                    type: 'time',
                    time: {
                        unit: 'day'
                    }
                },
                y: {
                    beginAtZero: true
                }
            }
        }
    });
}

// 시계열 데이터 생성 및 표시
const timeSeriesData = generateTimeSeriesData(20); // 10개의 데이터 포인트 생성
displayTimeSeriesChart(timeSeriesData);