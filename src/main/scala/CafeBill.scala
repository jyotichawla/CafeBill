/**
 * <h1>Customer Bill!</h1>
 * Billing system for a cafe
 *
 * @author Jyoti Chawla
 * @since 22/05/2016
 * @version 1.0
 */
package cafe

import scala.math.BigDecimal.RoundingMode

object CafeBill {
  val priceList: Map[String, Double] = Map(("cola", 0.5), ("coffee", 1.0), ("cheese sandwich", 2.0),
    ("steak sandwich", 4.5))

  /**
   * This method is used to retrieve the price of the item.
   */
  private def price(item: String): Option[Double] = priceList.get(item toLowerCase)

  /**
   * This method is used to calculate the total bill of items.
   */
  def calculateBill(items: Array[String]): Double = {
    val total = items.flatMap(price).sum
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

}