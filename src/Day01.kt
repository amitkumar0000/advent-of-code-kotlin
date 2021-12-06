fun main() {
     fun part1(input: List<String>): Int {
        var prev = -1
        var count = 0
        for(l in input.indices) {
            if(prev == -1) {
                prev = input[l].toInt()
                continue
            }
            if(input[l].toInt() > prev) {
                count++
            }
            prev = input[l].toInt()

        }
        return count
    }

    fun part2(input: List<String>): Int {
         if(input.size < 3)
            return 0
        var ws = input[0].toInt() + input[1].toInt() + input[2].toInt()
        var count = 0
        for(i in 3 until input.size) {
            var nws = ws - input[i-3].toInt() + input[i].toInt()
            if(nws > ws) {
                count++
            }
        }
        return count
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 1)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
