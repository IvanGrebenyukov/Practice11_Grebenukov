enum class DaysOfTheWeek()
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    //Метод который возвращает название дня недели по его номеру в неделе
    fun NumberOfDay(number: Int){
        when{
            (number == 1) -> println("Сегодня: " +DaysOfTheWeek.MONDAY.name)
            (number == 2) -> println("Сегодня: " +DaysOfTheWeek.TUESDAY.name)
            (number == 3) -> println("Сегодня :" +DaysOfTheWeek.WEDNESDAY.name)
            (number == 4) -> println("Сегодня: " +DaysOfTheWeek.THURSDAY.name)
            (number == 5) -> println("Сегодня: " +DaysOfTheWeek.FRIDAY.name)
            (number == 6) -> println("Сегодня: " + DaysOfTheWeek.SATURDAY.name)
            (number == 7) -> println("Сегодня: " +DaysOfTheWeek.SUNDAY.name)
            else -> println("Дня недели под таким номером не существует")
        }
    }

    //Метод для подсчета дней между двумя введенными днями
    fun DaysBetween(startDay: DaysOfTheWeek, endDay: DaysOfTheWeek): Int
    {
        var days = (endDay.ordinal - startDay.ordinal) % 7
        if(days <= 0)
            days += 7
        return days
    }

    //Метод для возвращения случайного дня из enum
    fun GetRandomDayOfWeek(): DaysOfTheWeek{
        return values().random()
    }

    //Метод, который возвращает следующий день недели
    fun NextDay(day: DaysOfTheWeek): DaysOfTheWeek{
        val index = (day.ordinal + 1) % values().size
        return values()[index]
    }

    //Метод, который проверяет выходной день или рабочий
    fun Weekend(day: DaysOfTheWeek): String{
        if(day == SATURDAY || day == SUNDAY)
            return "Выходной день"
        else
            return "Рабочий день"
    }
}