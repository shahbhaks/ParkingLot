**Requirements**
1.The parking lot should have multiple floors where customers can park their cars.
2.The parking lot should have multiple entry and exit points.
3.Customers can collect a parking ticket from the entry points and can pay the parking fee at the exit points on their way out.
4.Customers can pay the tickets at the automated exit panel or to the parking attendant.
5.Customers can pay via both cash and credit cards.
6.Customers should also be able to pay the parking fee at the customer’s info portal on each floor. If the customer has paid at the info portal, they don’t have to pay at the exit.
7.The system should not allow more vehicles than the maximum capacity of the parking lot. If the parking is full, the system should be able to show a message at the entrance panel and on the parking display board on the ground floor.
8.Each parking floor will have many parking spots. The system should support multiple types of parking spots such as Compact, Large, Handicapped, Motorcycle, etc.
9.The Parking lot should have some parking spots specified for electric cars. These spots should have an electric panel through which customers can pay and charge their vehicles.
10.The system should support parking for different types of vehicles like car, truck, van, motorcycle, etc.
Each parking floor should have a display board showing any free parking spot for each spot type.
11.The system should support a per-hour parking fee model. For example, customers have to pay $4 for the first hour, $3.5 for the second and third hours, and $2.5 for all the remaining hours.

**Actors**
1.Admin: Mainly responsible for adding and modifying parking floors, parking spots, entrance, and exit panels, adding/removing parking attendants, etc.
2.Customer: All customers can get a parking ticket and pay for it.
3.Parking attendant: Parking attendants can do all the activities on the customer’s behalf, and can take cash for ticket payment.
4.System: To display messages on different info panels, as well as assigning and removing a vehicle from a parking spot.

**Usecases**
1.Add/Remove/Edit parking floor: To add, remove or modify a parking floor from the system. Each floor can have its own display board to show free parking spots.
2.Add/Remove/Edit parking spot: To add, remove or modify a parking spot on a parking floor.
3.Add/Remove a parking attendant: To add or remove a parking attendant from the system.
4.Take ticket: To provide customers with a new parking ticket when entering the parking lot.
5.Scan ticket: To scan a ticket to find out the total charge.
6.Credit card payment: To pay the ticket fee with credit card.
7.Cash payment: To pay the parking ticket through cash.
8.Add/Modify parking rate: To allow admin to add or modify the hourly parking rate.