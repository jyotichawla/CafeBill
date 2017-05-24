/**
 * The TestCafeBill is the test class for CafeBill
 *
 * @author Jyoti Chawla
 * @since 22/05/2016
 * @version 1.0
 */

package cafe
import org.scalatest.{ Matchers, WordSpecLike }

class TestCafeBill extends WordSpecLike with Matchers {

  "CafeBill app" should {
    "return .50 for only cola" in {
      CafeBill.calculateBill(Array("cola")) shouldBe .50
    }
  }

  "CafeBill app" should {
    "return 1.0 for only coffee" in {
      CafeBill.calculateBill(Array("coffee")) shouldBe 1.0
    }
  }

  "CafeBill app" should {
    "return 4.5 for only steak sandwich" in {
      CafeBill.calculateBill(Array("steak sandwich")) shouldBe 4.5
    }
  }

  "CafeBill app" should {
    "return 2.0 for only cheese sandwich" in {
      CafeBill.calculateBill(Array("cheese sandwich")) shouldBe 2.0
    }
  }

  "CafeBill app" should {
    "return 3.0 for coffee and cheese sandwich" in {
      CafeBill.calculateBill(Array("coffee", "cheese sandwich")) shouldBe 3.0
    }
  }

  "CafeBill app" should {
    "return 5.0 for cola and steak sandwich" in {
      CafeBill.calculateBill(Array("cola", "steak sandwich")) shouldBe 5.0
    }
  }

  "CafeBill app" should {
    "return 3.5 for cola, coffee and cheese sandwich" in {
      CafeBill.calculateBill(Array("cola", "coffee", "cheese sandwich")) shouldBe 3.5
    }
  }
  "CafeBill app" should {
    "return 2.5 for cola, tea and cheese sandwich" in {
      CafeBill.calculateBill(Array("cola", "tea", "cheese sandwich")) shouldBe 2.5
    }
    "CafeBill app" should {
      "return 0 for tea" in {
        CafeBill.calculateBill(Array("tea")) shouldBe 0
      }
    }
  }
}
