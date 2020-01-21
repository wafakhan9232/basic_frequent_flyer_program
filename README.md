# basic_frequent_flyer_program
A very basic program that implements a frequent flyer program using java classes.
A member of the frequent flier has a number of "miles", which they can earn and use in the following ways:
• Every time they travel on a flight, they earn miles depending on the details of the flight
• Every time they purchase a flight, they spend miles depending on the cost of the flight
In addition, the programme has four possible levels: Basic, Bronze, Silver, and Gold. A member can also choose to use their miles to upgrade to the next level, as follows:
• All members start at Basic
• Going from Basic to Bronze costs 100 miles
• Going from Bronze to Silver costs 500 miles
• Going from Silver to Gold costs 1000 miles
Here is an example. A member at rank Basic has a balance of 50 miles, and has two upcoming flights
that they have not yet taken: Flight 1 will earn 70 miles, and Flight 2 will earn 100 miles.
• After the member takes Flight 1, their balance is 120 miles and Flight 1 is removed from the
upcoming flights list
• After the member also takes Flight 2, their balance will be 220 miles and their list of
upcoming flights is empty
• The member then chooses to rank up – their rank goes up to Bronze, and their miles balance
goes to 120
• They then spend 80 miles on a new flight (Flight 3, which will earn 200 miles) – their balance
will then be 40 miles, and Flight 3 is added to the list.
• Next, they take Flight 3 – their balance will then go up to 240 miles and their pending flight
list will again be empty
