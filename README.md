# Requirements

## Step 1: Cafe X Standard Bill
* You are building a simple billing system for a cafe selling cola, coffee, cheese sandwich and steak sandwich.
* Cold Cola costs 50p, Hot Coffee costs £1.00, Cold Cheese sandwich costs £2.00 and Hot Steak Sandwich costs £4.50
* Build a billing system which takes a list of items per order and outputs the total cost
* For example: . [“Cola”, “Coffee”, “Cheese Sandwich”] returns 3.5
* Make reasonable assumptions about the inputs to your solution; for example, many candidates take a list of strings as input

## Step 2: Service Charge
* Update your billing functions to add service charge on top of the standard bill
* No service when all purchased items are drinks
* 10% of the total bill (rounded to 2 decimal places) when purchased items include any food item
* 20% of the total bill (rounded to 2 decimal places) when purchased items include any hot food item
* These can be a maximum of £20 service charge
