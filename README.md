# Samuel-Week1-ATM-Checker-Real


**Validates credit card using the Luhn's algorithm**


1. Get the credit card number inputed and converts it in a form thatan easily be used for our calculation.


2. Multiply elements with odd indexes by 2


3. If multiplid digit n > 9, add individual digits, else add all products from No2 like that.


4. Add the sum from No3 to the elements with even number indexes


5. If the remainder from the division of the sum from No4 is equal to 10, the card number is valid. Else it is not valid.

      `No4 % 10 == 0`

