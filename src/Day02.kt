fun main() {
     fun part1(direction: List<String>): Int {
          var hd = 0
          var dep = 0

          for(i in direction.indices) {
              var dir = direction[i].split(" ")

              when(dir[0]) {
                  "forward" -> {
                      hd += dir[1].toInt()
                  }
                  "down" -> {
                      dep += dir[1].toInt()
                  }
                  "up" -> {
                      dep -= dir[1].toInt()
                  }
              }
          }

          return hd * dep
    }

    fun part2(input: List<String>): Int {
       
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 1)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
