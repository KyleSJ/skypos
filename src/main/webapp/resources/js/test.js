var DaySales = ;

$('#calendar').fullCalendar({
    header: {
        center: 'month,agendaFourDay' // buttons for switching between views
    },
    views: {
        agendaFourDay: {
            type: 'agenda',
            duration: { days: 4 },
            buttonText: '4 day'
        }
    },
    events:[{
           		title : '오늘 매출량',
           		start : '2016-12-03'
           }]
});