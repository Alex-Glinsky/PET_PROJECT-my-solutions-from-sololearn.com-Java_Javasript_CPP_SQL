# Solutions from MOOC sololearn.com 
Java-Javasript-CPP-SQL
C# Tasks

1.Trip Planner
You need to plan a road trip. You are traveling at an average speed of 40 miles an hour.
Given a distance in miles as input (the code to take input is already present), output to the console the time it will take you to cover it in minutes.
Sample Input:
150
Sample Output:
225
Explanation: It will take 150/40 = 3.75 hours to cover the distance, which is equivalent to 3.75*60 = 225 minutes.

2.The Snail in the Well
The snail climbs up 7 feet each day and slips back 2 feet each night.
How many days will it take the snail to get out of a well with the given depth?
Sample Input:
31
Sample Output:
6
Explanation: Let's break down the distance the snail covers each day:
Day 1: 7-2=5
Day 2: 5+7-2=10
Day 3: 10+7-2=15
Day 4: 15+7-2=20
Day 5: 20+7-2=25
Day 6: 25+7=32
So, on Day 6 the snail will reach 32 feet and get out of the well at day, without slipping back that night.
Hint: You can use a loop to calculate the distance the snail covers each day, and break the loop when it reaches the desired distance.

3.Currency Converter
You are making a currency converter app.
Create a function called convert, which takes two parameters: the amount to convert, and the rate, and returns the resulting amount.
The code to take the parameters as input and call the function is already present in the Playground.
Create the function to make the code work.
Sample Input:
100
1.1
Sample Output:
110
Converting 100 at the rate of 1.1 is equal to 100*1.1 = 110.

4.Contact Manager
You are working on a Contact Manager app.
You have created the contact object constructor, which has two arguments, name and number.
You need to add a print() method to the object, which will output the contact data to the console in the following format: name: number
The given code declares two objects and calls their print() methods. Complete the code by defining the print() method for the objects.
Notice the space after the colon, when outputting the contact data.

5.Store Manager
You are working on a Store Manager program, which stores the prices in an array.
You need to add functionality to increase the prices by the given amount.
The increase variable is taken from user input. You need to increase all the prices in the given array by that amount and output to the console the resulting array.
Use a loop to iterate through the array and increase all items.

6.Words
You are making a text encryptor. It should take multiple words and output a combined version, where each word is separated by a dollar sign $.
For example, for the words "hello", "how", "are", "you", the output should be "$hello$how$are$you$".
The given code declares a class named Add, with a constructor that takes one rest parameter.
Complete the code by adding a print() method to the class, which should generate the requested output.
Note, that the dollar sign is placed at the beginning and at the end of the output.

SQL

1.Cakes
A local bakery creates unique cake sets. Each cake set contains three different cakes.
Here is the cakes table:
Apple cake    100
Banana cake   200
Pound cake    180
Sponge cake   100
Genoise cake  360
Chiffton cake 250
Opera cake     90
Cheese cake   370
Тoday a customer want a cake set that has minimal calories.
Write a query to sort the cakes by calorie count and select the first 3 cakes from the list to offer the customer.
Try to combine ORDER BY and LIMIT keywords.

2.Apartments
You want to rent an apartment and have the following table named Apartments:

id    city    adress    price     status
1     Las Vegas  732 Hall Street 1000 Not rented
2 Marlboro    985 Huntz Lane          800 Not rented
3 Moretown    3757 Wines Lane         700 Not rented
4 Owatonna    314 Pritchard Court     500 Rented
5 Grayslake   3234 Cunningham Court   600 Rented
6 Great Neck  19227 Romines Mill Road 900 Not rented

Write a query to output the apartments whose prices are greater than the average and are also not rented, sorted by the 'Price' column.
Recall the AVG keyword.
