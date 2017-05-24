/**
 * Class to hold the price, temperature and type of an Item
 *
 * @param price Item Price
 * @param temp temperature Item Price
 * @param itemType type of Item
 *
 * @author Jyoti Chawla
 * @since 23/05/2016
 * @version 1.0
 */
package cafe
import Temp._
import ItemType._

class Item(price: Double, temp: Temp, itemType: ItemType) {
  def getPrice(): Double = {
    price
  }
  def getTemperature(): Temp = {
    temp
  }
  def getItemType(): ItemType = {
    itemType
  }
}