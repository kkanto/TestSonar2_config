 
listView('TestSonar2 Jobs') {
    description('TestSonar2 Jobs')
    jobs {
        regex('TestSonar2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
