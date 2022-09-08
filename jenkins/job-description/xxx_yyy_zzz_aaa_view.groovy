 
listView('xxx_yyy_zzz_aaa Jobs') {
    description('xxx_yyy_zzz_aaa Jobs')
    jobs {
        regex('xxx_yyy_zzz_aaa_.+')
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
