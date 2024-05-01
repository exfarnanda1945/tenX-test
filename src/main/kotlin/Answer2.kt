fun answer2() {
    allColor2.forEachIndexed { index, color ->
        println("${index + 1}. Color $color is ${if (isColorCloseToWhiteOrBlack(color)) "approach to black/white color" else "colorfull"}")
    }
}

fun calculateEuclideanDistance(color1: Color, color2: Color): Double {
    val (red1, green1, blue1) = color1
    val (red2, green2, blue2) = color2

    return squareRoot(
        ((red2 - red1) * (red2 - red1)
                + (green2 - green1) * (green2 - green1)
                + (blue2 - blue1) * (blue2 - blue1)).toDouble()
    )
}

fun isColorCloseToWhiteOrBlack(color: Color): Boolean {
    val whiteColor = Color(255, 255, 255)
    val blackColor = Color(0, 0, 0)

    val whiteThreshold = 200
    val blackThreshold = 50

    val euclideanDistanceForWhiteColor = calculateEuclideanDistance(color, whiteColor)
    val euclideanDistanceForBlackColor = calculateEuclideanDistance(color, blackColor)

    return euclideanDistanceForBlackColor >= blackThreshold && euclideanDistanceForWhiteColor <= whiteThreshold
}

fun squareRoot(number: Double): Double {
    var guess = number * 0.5
    val precision = 0.1

    while (true) {
        val nextGuess = 0.5 * (guess + number / guess)

        if (absoluteValue(nextGuess - guess) < precision) {
            return nextGuess
        }

        guess = nextGuess
    }
}

fun absoluteValue(x: Double): Double {
    return if (x < 0) -x else x
}


val allColor2 = arrayListOf(
    Color(87, 76, 63),
    Color(67, 76, 73),
    Color(99, 105, 93),
    Color(178, 173, 169),
    Color(48, 35, 46),
    Color(22, 20, 18),
    Color(10, 40, 50),
    Color(67, 76, 73),
    Color(173, 166, 167),
    Color(87, 76, 63),
    Color(10, 40, 50),
    Color(99, 105, 93),
    Color(178, 173, 169),
    Color(67, 76, 73),
    Color(22, 20, 18),
    Color(22, 20, 18),
    Color(87, 76, 63),
    Color(140, 132, 139),
    Color(87, 76, 63),
    Color(99, 105, 93),
    Color(99, 105, 93),
    Color(87, 76, 63),
    Color(67, 76, 73),
    Color(173, 166, 167),
    Color(48, 35, 46),
)