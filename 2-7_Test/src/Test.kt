fun main(args: Array<String>){
    var i:Int = 0
    println("Welcome to test about \"Test\"\n")
    println("""1 - Когда появился первый тест?
            |Варианты ответов:
            |a - XV в
            |b - XX в
            |c - XIX в
            |d - в глубокой древности""".trimMargin()+"\n")
    var answer1 = readLine()
    when(answer1.toString()){
        "a" -> {println("""Неверный ответ. Правильный ответ \"d\".
                |Факт:
                |Во времена Средневековья европейские университеты ввели системы экзаменов на тестировании.\n"""+"\n"); }
        "b" -> println("""Неверный ответ. Правильный ответ \"d\".
                |Факт:
                |тест в современном понимании появился в ХХ веке.
                |В 20-е годы в Америке начался самый настоящий тестовый бум. Ведь теперь каждый мог пройти 
                |тестирование и узнать, какую профессию он может получить, какие недостатки характера стоит 
                |скрывать, способности к какой профессии у него есть.\n""".trimMargin() +"\n")
        "c" -> println("""Неверный ответ. Правильный ответ \"d\". 
                |Факт:
                |В 1987 американский психолог Джеймс Кеттел ввел термин \"интеллектуальный тест\". 
                |Термин приобрел безумную популярность, его начали употреблять в научных кругах, 
                |а сам процесс тестирования начал применяться разными лабораториями.""".trimMargin()+"\n")
        "d" -> {println("""Верный ответ. Факт:
                |Уже три тысячи лет назад в Китае существовали системы приема на службу в армии, 
                |а у античных греков тестирование было спутником образования – оно использовалось 
                |для оценки физических и умственных навыков 
                |учеников. Во времена Средневековья европейские университеты ввели системы экзаменов
                """.trimMargin()+"\n");
            i++;}
        !in "a".."d" -> "Такого варианта ответа не существует"
    }
    println("""2 - Что такое тест? Выберите неправильный вариант ответа
            |Варианты ответов:
            |a - вопросы с вариантами ответов из одной области 
            |b - испытание
            |c - исследование
            |d - игра-соревнование с вопросами из разных областей""".trimMargin()+"\n")
    var answer2 = readLine()
    when(answer2.toString()){
        "a" -> println("Неверный ответ. Правильный ответ d\n")
        "b" -> println("Неверный ответ. Правильный ответ d\n")
        "c" -> println("Неверный ответ. Правильный ответ d\n")
        "d" -> {println("Правильный ответ. Викторина - игра-соревнование с вопросами из разных областей\n"); i++}
        else -> println("Такого варианта не существует\n")
    }
    println("""3 - Как большинство людей отвечают на вопросы в тесте?
            |Варианты ответов:
            |a - наугад
            |b - гуглят
            |c - узнают правильные ответы у человека, уже прошедшего тест
            |d - пользуются интуицией""".trimMargin()+"\n")

    var answer3 = readLine()
    when(answer3.toString()){
        in "a".."d" -> {println("Верный ответ\n"); i++;}
        else -> println("Такого варианта не существует\n")
    }
    println("""4 - Что из перечисленных варантов не является тестом?
            |Варианты ответов:
            |a - Тест Люшера
            |b - Тест Миллера
            |c - Тест Жан Батист
            |d - Тест Тьюринга""".trimMargin()+"\n")
    var answer4 = readLine()
    when(answer4){
        "c" -> {println("""Верный ответ. Факт:
                |Жан Батист Тест — французский политик и адвокат"""+"\n"); i++;}
        "b" -> println("""Неверный ответ. Правильный ответ c.
            |Факт:
            |(из юриспруденции) тест, применяемый в Верховном суде США с 1973 года 
            |для определения, может ли тот или иной материал быть признан непристойным и быть запрещён, 
            |не попадая под защиту первой поправки к конституции""".trimMargin()+"\n")
        "a" -> println("""Неверный ответ. Правильный ответ c.
            |Факт:
            |Цветовой тест Люшера на исследование личности. 
            |По мнению Люшера, восприятие цвета объективно и универсально, но цветовые предпочтения являются 
            |субъективными, и это различие позволяет объективно измерить субъективные состояния с помощью 
            |цветового теста.""".trimMargin()+"\n")
        "d" -> println("""Неверный ответ. Правильный ответ c.
            |Факт: 
            |Тест Тьюринга - Эмпирический тест для определения, может ли машина мыслить.
            |«Человек взаимодействует с одним компьютером и одним человеком. На основании ответов на вопросы 
            |он должен определить, с кем он разговаривает: с человеком или компьютерной программой. 
            |Задача компьютерной программы — ввести человека в заблуждение, заставив сделать неверный выбор»""".trimMargin()+"\n")
        else -> println("Такого варианта не существует\n");
    }
    println("""Как называется вид тестирования ПО, проводимое для подверждения эффективности новой версии на 
        определенной группе пользователей
            |Варианты ответов:
            |a - Альфа тестирование
            |b - A/B тестирование
            |c - Бета тестирование
            |d - Гамма тестирование
            |e - Обезьянье тестирование""".trimMargin()+"\n")
    var answer5 = readLine()
    when(answer5){
        "a" -> println("""Неверный ответ. Правильный ответ b.
            |Факт:
            |Альфа-тестирование - тестирование, обычно проводимое на ранней стадии 
            |разработки продукта и включающее имитацию реального использования продукта штатными разработчиками
            |или тестироващиками""".trimMargin()+"\n")
        "b" -> {println("""Верный ответ. 
            |Факт:
            |A/B Тестирование - автоматизированный статистический маркетинговый инструмент,который позволяет проверить 
            |эффективность гипотез, сравнить два элемента (если сравнивают больше двух, уже говорят о сплит-тестировании) 
            |и выбрать наиболее эффективный из них. Суть теста в том, что пользователи будут видеть разные варианты 
            |страниц, писем, объявлений и, соответственно, по разному на них реагировать. 
            |Побеждает в итоге вариант, который покажет лучшие результаты""".trimMargin()+"\n"); i++;}
        "c" -> println("""Неверный ответ. Правильный ответ b.
            |Факт:
            |Бета-тестирование - тестирование, заключающееся в интенсивном использованим почти готовой версии 
            |продукта с целью выявления максимального числа ошибок в его работе для их последующего 
            |устранения перед окончательным выходом продукта на рынок, к массовому потребителю, с привлечением  
            |добровольцев из числа обычных будущих пользователей продукта""".trimMargin()+"\n")
        "d" -> println("""Неверный ответ. Правильный ответ b.
            |Факт:
            |Гамма-тестирование - Третья стадия тестирования программного продукта (после альфа и бета тестирования)
            |перед его коммерческим выпуском. На этапе гамма тестирования не в окончательном виде могут быть только
            |документация и упаковка""".trimMargin()+"\n")
        "e" -> println("""Неверный ответ. Правильный ответ b.
            |Факт:
            |Обезьянье тестирование - Тестирование приложения без какого-либо плана, тестирование выборочных мест, 
            |чтобы обнаружить какие-то сложные системные сбои, а затем и дефекты, которые к этому привели.""".trimMargin()+"\n")
        else -> println("Такого варианта не существует")
    }
    println("Вы дали: $i правильных ответов из 5")
}
