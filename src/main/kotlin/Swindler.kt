// Класс для торговцев типа "кидала"
class Swindler(id: Int) : Trader(id) {

    override fun makeDecision(): Boolean = makeWrongDecision(false)

}