# Table-Track
A Restaurant Reservation System

## Problem Definition 
In the modern dining industry, efficient management of reservations is critical for enhancing customer satisfaction and optimizing restaurant operations. Many restaurants still rely on outdated, manual reservation systems that are prone to errors, overbooking, and inefficiencies. These systems often result in frustrated customers due to lost reservations, long wait times, and poor table management. Additionally, restaurant staff spends considerable time managing bookings manually, which detracts from their ability to provide excellent customer service.

Table Track will provide a command-line interface for both customers and restaurant staff to interact with the reservation system. Customers can make reservations, view available time slots, and receive confirmation of their bookings. Restaurant staff will have access to functionalities such as adding, updating, and canceling reservations.

Our main objective is to design and develop robust testing suites for this project. We will employ various testing techniques, including path testing, data flow analysis, logic coverage, integration testing, and validation testing. By thoroughly testing the software application, we aim to ensure its reliability, accuracy, and effectiveness in managing restaurant reservations.

## Design Requirements

### Functions
Customer:
- View available reservation times
- Select an available time and number of people for a table
- Enter name and contact information
- Confirm reservation

Restaurant Staff:
- Update number of people in a reservation
- Update time of a reservation
- Cancel a reservation

### Objectives
- Customers can make reservations
- Restaurant staff can update and cancel reservatiosn

### Constraints
- Economic Factors: Our product is free to use 
- Sustainability and Environmental Factors: Our application allows restaurants to save supplies, as all reservations are done online. 
- Societal Impacts: Our application reduces employees' workload and stress, as customers can book their own reservations, without having to speak to an employee.
- Ethics:
- No User Interface : Table Track will be a command-line based software, with no graphical user interface.
- Only employees can upadate the reservation information. Customers are not allowed to change any reservations.

## Solution 1
- Our first solution was a simple solution that only allowed users to enter a time and number of people. The majority of our test cases failed as we only had the users enter minimal information.

## Solution 2
- We refined our design to allow the user to enter all of their information. With this design, the customer test cases passed, however, the employee test cases failed as we had no way for employees to edit information. We also had no way for the user to choose whether they are an employee or a customer. To improve this design, we need to add a code that employees can enter in order to access the edit and delete methods.

## Final Solution

### Components

### Features

### Environmental, Societal, Safety and Economic Considerations
- Our design took societal constraints into consideration by ensuring that our product would be beneficial for a restaurants' employees and help them lessen their workload. By giving the customer's the ability to make and update their own reservations, employees no longer have to personally accept calls for reservations.
- Our product also took safety constraints into consideration by only allowing employees to make and view changes with a specific code. This ensures that no one except for employees can view and edit reservations.
- We took economic constraints into consideration as our product would be completely free to use for any restaurant.  

### Test Cases and Results
#### Path Testing


### Limitations

