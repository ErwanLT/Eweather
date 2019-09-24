$(document).ready(function(){
    var humidityOptions = {

        chart: {
            type: 'solidgauge'
        },

        title: null,

        pane: {
            center: ['50%', '85%'],
            size: '80%',
            startAngle: -90,
            endAngle: 90,
            background: {
                backgroundColor:
                    Highcharts.defaultOptions.legend.backgroundColor || '#EEE',
                innerRadius: '60%',
                outerRadius: '100%',
                shape: 'arc'
            }
        },

        tooltip: {
            enabled: false
        },

        // the value axis
        yAxis: {
            stops: [
                [0.1, '#90d7ff'], // green
                [0.5, '#6e8ecd'], // yellow
                [0.9, '#3e61af'] // red
            ],
            lineWidth: 0,
            minorTickInterval: null,
            tickAmount: 2,
            title: {
                y: -70
            },
            labels: {
                y: 16
            }
        },

        plotOptions: {
            solidgauge: {
                dataLabels: {
                    y: 5,
                    borderWidth: 0,
                    useHTML: true
                }
            }
        }
    };

    var uvOptions = {

        chart: {
            type: 'solidgauge'
        },

        title: null,

        pane: {
            center: ['50%', '85%'],
            size: '80%',
            startAngle: -90,
            endAngle: 90,
            background: {
                backgroundColor:
                    Highcharts.defaultOptions.legend.backgroundColor || '#EEE',
                innerRadius: '60%',
                outerRadius: '100%',
                shape: 'arc'
            }
        },

        tooltip: {
            enabled: false
        },

        // the value axis
        yAxis: {
            stops: [
                [0.2, '#4DC7A0'],
                [0.5, '#DEB887'],
                [0.7, '#FF8C00'],
                [0.9, '#DC143C'],
                [1, '#8A2BE2']
            ],
            lineWidth: 0,
            minorTickInterval: null,
            tickAmount: 2,
            title: {
                y: -70
            },
            labels: {
                y: 16
            }
        },

        plotOptions: {
            solidgauge: {
                dataLabels: {
                    y: 5,
                    borderWidth: 0,
                    useHTML: true
                }
            }
        }
    };

    // The humidity gauge
    var charthumidity = Highcharts.chart('container-humidity', Highcharts.merge(humidityOptions, {
        yAxis: {
            min: 0,
            max: 100,
            title: {
                text: 'Humidité'
            }
        },

        credits: {
            enabled: false
        },

        series: [{
            name: 'humidité',
            data: humidity,
            dataLabels: {
                format:
                    '<div style="text-align:center">' +
                    '<span style="font-size:25px">{y}</span><br/>' +
                    '<span style="font-size:12px;opacity:0.4">%</span>' +
                    '</div>'
            },
            tooltip: {
                valueSuffix: '%'
            }
        }]

    }));

    // The uv gauge
    var chartUV = Highcharts.chart('container-uv', Highcharts.merge(uvOptions, {
        yAxis: {
            min: 0,
            max: 10,
            title: {
                text: 'Indice UV'
            }
        },

        credits: {
            enabled: false
        },

        series: [{
            name: 'humidité',
            data: uvIndex,
            dataLabels: {
                format:
                    '<div style="text-align:center">' +
                    '<span style="font-size:25px">{y}</span><br/>' +
                    '<span style="font-size:12px;opacity:0.4">%</span>' +
                    '</div>'
            },
            tooltip: {
                valueSuffix: '%'
            }
        }]

    }));
});