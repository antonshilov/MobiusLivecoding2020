package com.antonshilov.mobiuslivecoding20.data

object MockDataSource {

    private const val chipFood = "Еда"
    private const val chipSelfImprovement = "Саморазвитие"
    private const val chipTechnologies = "Технологии"
    private const val chipHome = "Дом"
    private const val chipLeisure = "Досуг"
    private const val chipHealth = "Забота о себе"
    private const val chipScience = "Наука"

    val operations =
        listOf(
            Operation(
                "СберПрайм",
                "Платёж 9 июля",
                "199 ₽ в месяц",
                OperationType.PRIME
            ),
            Operation(
                "Переводы",
                "Автопродление 21 августа",
                "199 ₽ в месяц",
                OperationType.TRANSACTION
            ),
            Operation(
                "СберПрайм",
                "Платёж 9 мая",
                "Оформление подписки",
                OperationType.PRIME
            ),
            Operation(
                "Перевод",
                "Перевод маме 12 августа",
                "20000 ₽ в месяц",
                OperationType.TRANSACTION
            ),
            Operation(
                "Пополнение",
                "Пополнение со сберкнижки счёта 6 августа",
                "40000 ₽",
                OperationType.TRANSACTION
            ),
            Operation(
                "Okko",
                "Покупка фильма",
                "Покупка блокбастера",
                OperationType.PRIME
            ),
            Operation(
                "Оплата КУ",
                "Оплата за электроснабжение, горячую воду, холодную воду, электричество и газ",
                "8000 ₽",
                OperationType.TRANSACTION
            )
        )

    val chips = listOf(
        chipFood,
        chipSelfImprovement,
        chipTechnologies,
        chipHome,
        chipLeisure,
        chipHealth,
        chipScience
    )
}


