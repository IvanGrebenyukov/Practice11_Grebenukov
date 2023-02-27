fun main()
{
    println("С каким классом хотите работать (Color/Days)")
    var proverka = readLine()!!.toString()
    while(true){
        if(proverka == "Color" || proverka == "Days")
            break
        else{
            println("Введите Color или Days")
            proverka = readLine()!!.toString()
        }
    }
    when(proverka)
    {
        "Color" ->
        {
            var color: Colors = Colors.GREEN

            //Проверяем темный или светлый цвет
            println(color.IsDarkOrLightColor(color))

            //Выводим название и код цвета
            println("Название и код цвета ${color.NameWithHexCode(color)}")

            //Получаем рандомный цвет из класа enum
            println("Рандомный цвет: ${color.RandomColor()}")

            //Выводим список всех цветов
            println("Все цвета: ${color.AllColors()}")
        }
        "Days" ->
        {
            var day1: DaysOfTheWeek = DaysOfTheWeek.FRIDAY
            var day2: DaysOfTheWeek = DaysOfTheWeek.WEDNESDAY

            //Получаем следующий день после введенного дня недели
            println("Следующий день ${day1.NextDay(day1)}")

            //Получаем выходной день или рабочий
            println(day1.Weekend(day1))

            //Получаем название дня недели по его номеру
            day1.NumberOfDay(8)

            //Получаем сколько дней между двумя введенными днями
            println("Разница между днями: ${day1.DaysBetween(day1, day2)}")

            //Получаем рандомный день из класса enum
            println("Рандомный день недели ${day1.GetRandomDayOfWeek()}")
        }
    }
}

