package br.com.sw_software.challenge

import br.com.sw_software.challenge.isPalindrome
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class TestPalidrome {

  @Test
  fun `civic is a palidrome` () {
    isPalindrome("civic") shouldBeEqualTo true
  }

  @Test
  fun `" civic" is not a palidrome` () {
    isPalindrome(" civic") shouldBeEqualTo false
  }

  @Test
  fun `"greetings" is not a palindrome` () {
    isPalindrome("greetings") shouldBeEqualTo false
  }

  @Test
  fun `"100001" a palindrome` () {
    isPalindrome("100001") shouldBeEqualTo true
  }

  @Test
  fun `"Fish hsif" is not a palindrome` () {
    isPalindrome("Fish hsif") shouldBeEqualTo false
  }

  @Test
  fun `"pennep" a palindrome` () {
    isPalindrome("pennep") shouldBeEqualTo true
  }

  @Test
  fun `"greetins" is not a palindrome` () {
    isPalindrome("greetings") shouldBeEqualTo false
  }
}