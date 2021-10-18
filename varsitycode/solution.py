class ShoppingBag:

    def calculate_bag_total(self, items, discounts):
        
        mp = {}
        for item in items:
            itemCode = item[0:3]
            itemCost = (int)(item[3:6])
            if itemCode not in mp:
                mp[itemCode] = { "cost": itemCost, "quantity": 1}
            else:
                mp[itemCode] = { "cost": itemCost, "quantity": mp[itemCode]["quantity"] + 1}
        
        bagTotal = 0
        
        for item in items:
            largestDiscount = 0
            itemCode = item[0:3]
            itemCost = (int)(item[3:6])
            
            for discount in discounts:
                discountItemCode = discount[0:3]
                
                if (discountItemCode != itemCode) or mp[discountItemCode]["quantity"] < ((int) (discount[3])):
                    continue
                
                if discount[4] == 'C':
                    if largestDiscount < (int) (discount[5:]):
                        largestDiscount = (int) (discount[5:])
                else:
                    if largestDiscount < (itemCost * ((int) (discount[5:])) / 100):
                        largestDiscount = (itemCost * ((int) (discount[5:])) / 100)
            
            bagTotal += itemCost - largestDiscount
        return bagTotal
            
                