fun answer1() {
    val filterColor = listAllColor.filter { color ->
        !eliminateColor.contains(color)
    }

    filterColor.forEachIndexed { index, color ->
        println("${index}. $color")
    }
}


val listAllColor = arrayListOf(
    Color(34, 23, 55),
    Color(67, 76, 73),
    Color(99, 105, 93),
    Color(178, 173, 169),
    Color(144, 89, 54),
    Color(22, 20, 18),
    Color(10, 40, 50),
    Color(171, 180, 211),
    Color(150, 150, 90),
    Color(50, 150, 150),
    Color(209, 109, 107),
    Color(111, 117, 212),
    Color(214, 113, 165),
    Color(45, 137, 212),
    Color(182, 240, 245),
    Color(199, 184, 72),
    Color(204, 75, 193),
    Color(140, 132, 139),
    Color(87, 76, 63),
    Color(170, 209, 167),
    Color(1, 90, 20),
    Color(174, 214, 174),
    Color(196, 106, 112),
    Color(173, 166, 167),
    Color(48, 35, 46),
)

val eliminateColor = arrayListOf(
    Color(67, 76, 73),
    Color(99, 105, 93),
    Color(178, 173, 169),
    Color(22, 20, 18),
    Color(10, 40, 50),
    Color(140, 132, 139),
    Color(87, 76, 63),
    Color(173, 166, 167),
    Color(48, 35, 46),
)