package recfun
import common._

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if (r == 0 || c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def isBalanced(chars: List[Char], n: Int): Boolean =
      if (chars.isEmpty && n == 0) true
      else if (chars.head == '(') isBalanced(chars.tail, n + 1)
      else if (chars.head == ')') {if (n == 0) false else isBalanced(chars.tail, n - 1)}
      else isBalanced(chars.tail, n)

    isBalanced(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =
    if (money == 0) 1
    else if (coins.isEmpty) 0
    else if (coins.head <= money) countChange(money, coins.tail) + countChange(money - coins.head, coins)
    else countChange(money, coins.tail)
}
