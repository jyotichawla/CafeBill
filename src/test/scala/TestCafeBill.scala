/**
 * The TestCafeBill is the test class for CafeBill
 *
 * @author Jyoti Chawla
 * @since 23/05/2016
 * @version 2.0
 */

package cafe
import org.scalatest.{ Matchers, WordSpecLike }

class TestCafeBill extends WordSpecLike with Matchers {

  "CafeBill app" should {
    "return .50 for only cola" in {
      CafeBill.getTotalBill(Array("cola")) shouldBe .50
    }
  }

  "CafeBill app" should {
    "return 1.0 for only coffee" in {
      CafeBill.getTotalBill(Array("coffee")) shouldBe 1.0
    }
  }

  "CafeBill app" should {
    "return 5.40 for only steak sandwich" in {
      CafeBill.getTotalBill(Array("steak sandwich")) shouldBe 5.40
    }
  }

  "CafeBill app" should {
    "return 2.20 for only cheese sandwich" in {
      CafeBill.getTotalBill(Array("cheese sandwich")) shouldBe 2.20
    }
  }

  "CafeBill app" should {
    "return 1.50 for coffee and cola" in {
      CafeBill.getTotalBill(Array("coffee", "cola")) shouldBe 1.50
    }
  }

  "CafeBill app" should {
    "return 3.0 for 3 coffee" in {
      CafeBill.getTotalBill(Array("coffee", "coffee", "coffee")) shouldBe 3.0
    }
  }

  "CafeBill app" should {
    "return 3.30 for coffee and cheese sandwich" in {
      CafeBill.getTotalBill(Array("coffee", "cheese sandwich")) shouldBe 3.30
    }
  }

  "CafeBill app" should {
    "return 6.0 for cola and steak sandwich" in {
      CafeBill.getTotalBill(Array("cola", "steak sandwich")) shouldBe 6.0
    }
  }
    "CafeBill app" should {
    "return 8.40 for cola, steak sandwich and cheese sandwich" in {
      CafeBill.getTotalBill(Array("cola", "steak sandwich", "cheese sandwich")) shouldBe 8.40
    }
  }

  "CafeBill app" should {
    "return 3.85 for cola, coffee and cheese sandwich" in {
      CafeBill.getTotalBill(Array("cola", "coffee", "cheese sandwich")) shouldBe 3.85
    }
  }
   "CafeBill app" should {
      "return 0 for tea" in {
        CafeBill.getTotalBill(Array("tea")) shouldBe 0
      }
    }

  "CafeBill app" should {
    "return 1020.0 for 500 cheese sandwiches" in {
      CafeBill.getTotalBill(Array.fill[String](500)("cheese sandwich")) shouldBe 1020.0
    }
  }
  "CafeBill app" should {
    "return 920.0 for 200 steak sandwiches" in {
      CafeBill.getTotalBill(Array.fill[String](200)("steak sandwich")) shouldBe 920.0
    }
    
  }
}