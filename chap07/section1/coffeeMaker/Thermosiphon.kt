package chap07.section1.coffeeMaker

class Thermosiphon(heater: Heater): Pump, Heater by heater { //위임을 사용
    override fun pump() {
        if (isHot()) {
            println("[Thermosiphon] pumping...")
        }
    }
}