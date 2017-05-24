/**
 * <h1>Customer Bill!</h1>
 * Billing system for a cafe including service charge
 *
 * @author Jyoti Chawla
 * @since 23/05/2016
 * @version 2.0
 */

package cafe

import scala.math.BigDecimal.RoundingMode
import scala.collection.mutable.ListBuffer
import Temp._
import ItemType._

object CafeBill {

  val coffee = new Item(1.0, hot, drink)
  val cola = new Item(.50, cold, drink)
  val cheeseSandwich = new Item(2.0, cold, food)
  val steakSandwich = new Item(4.5, hot, food)

  var orderList = new ListBuffer[Item]()

  /** Adds items in the order to the ListBuffer */
  def addItemsToOrder(order: Array[String]) {
    for (item <- order) {
      item.toLowerCase() match {
        case "cola"            => orderList.append(cola)
        case "coffee"          => orderList.append(coffee)
        case "cheese sandwich" => orderList.append(cheeseSandwich)
        case "steak sandwich"  => orderList.append(steakSandwich)
        case _                 =>
      }
    }
  }

  var hotFoodFlag: Boolean = false
  var foodFlag: Boolean = false

  /** Determines if the item is hot food or cold food */
  def serviceChargeHelper() {
    for (item <- orderList) {
      if (item.getItemType() == food && item.getTemperature == hot) {
        hotFoodFlag = true
      }
      if (item.getItemType == food) {
        foodFlag = true
      }
    }
  }
  /** Calculates the total bill of the items ordered */
  def getTotalBill(order: Array[String]): Double = {
    addItemsToOrder(order)
    serviceChargeHelper()
    var total = 0.0
    var serviceChargeRate = 0
    var serviceCharge = 0.0
    for (item <- orderList) {
      total += item.getPrice()
    }
    if (hotFoodFlag)
      serviceChargeRate = 20
    if ((foodFlag) && (!hotFoodFlag))
      serviceChargeRate = 10
    serviceCharge = ((total * serviceChargeRate) / 100)
    if (serviceCharge > 20.0)
      serviceCharge = 20.0

    total += serviceCharge

    /** Reset list and flags */
    orderList = new ListBuffer[Item]()
    hotFoodFlag = false
    foodFlag = false

    return BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }
}
