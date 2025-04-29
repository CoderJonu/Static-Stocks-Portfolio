# Static-Stocks-Portfolio
Greetings to all the readers!
This is a Stocks Portfolio program where you will be able to see your total amount based on the stocks you've purchased. The program is implemented using Java, and includes concepts such as:
  Java packages
  File reading and writing
  Appending data to files
  Conditional statements
  Basic input-output operations

How It Works:
In this program, we provide 10 companies from which you can choose to buy stocks. Upon running the code, you need to enter your:
Name
  Choice of company to buy the stock from
  Number of stocks you want to buy
  Rate at which you bought the stocks
  Current rate at which the stocks are being sold
The program then calculates the total amount you will receive, based on your profit or loss from the stocks. All the data is stored in specific files.

File Structure:
After executing the code, three files will be generated:
  Stocks.txt
    This file contains the total history of all users, including the details of the companies they invested in and the amount they spent.
  [username].txt
    This file contains the stock information for the specific user (e.g., if your name is Adam, this file will be adam.txt). It stores the information about the stocks Adam has bought.
  [username]_net.txt
    This file contains the total amount the user (e.g., Adam) has after calculating both profits and losses. For example, adam_net.txt will show the final amount Adam has after his transactions.
Example:
If the user's name is Adam, the following files will be generated:
  Stocks.txt - Contains the history of previous users.
  adam.txt - Contains the specific stock transactions that Adam has made.
  adam_net.txt - Displays Adam's total amount after adding his profit or loss.
Summary:
  The program stores data in text files for future reference.
  Each user gets a personalized file with their stock information.
  The total net amount is calculated based on the current rate of the stocks.
  
I hope this makes it clear how the program works! Thank you for reading!
