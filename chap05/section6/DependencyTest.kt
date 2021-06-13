package chap05.section6

class Patient1(val name: String, var id: Int){
    fun doctorList(d: Doctor1) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}
class Doctor1(val name: String, val p: Patient1){
    val customerId: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}

fun main() {
    val patient1 = Patient1("Kildong", 1234)
    val doc1 = Doctor1("KimSabu", patient1)
    doc1.patientList()
}