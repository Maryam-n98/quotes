# Lab: 08 - OO Design and GSON

We should use GSON to parse the .json file. The app should choose one randomly quote each time it is run. 

declared min and mix to calculate random which is mean the index for the quotes.

max will be equal to the size of the array we have in the JSON file

Use gson to read the Json file.

use BufferedReader to read the JSON file

make a List of Quotes Type and use inside it gson and TypeToken to read json file and took what we want.

in the print line, I used Math.random to take one randomly and print the toSting that have the Author and the text for each quote. 
# Lab: 09 - Web requests
When running the application, It will read the quotes from the API.
 if the Api have an error or we have an Error in connection then read from the JSON file 
after that, this application adds data that take it to add put it in our Json file using BufferedWriter().
