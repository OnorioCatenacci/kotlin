fun box(): String {
    val l = java.util.ArrayList<Int>()
    l.add(1)
    val x = l[0] < 2
    if (x != true) return "Fail: $x}"
    val y = l[0] compareTo 2
    if (y != -1) return "Fail (y): $y}"
    return "OK"
}