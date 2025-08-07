# Airline Reservation System

---

A modern and user-friendly web application designed to simplify flight search, ticket booking, and admin-level reservation management.  
This system enables users to easily find available flights, book seats, and view confirmation details. Admins can view and manage bookings with ease.  

Developed using Spring Boot (REST API) and PostgreSQL for the backend, and HTML, CSS, JavaScript for the frontend, this project ensures smooth interactions and effective airline management.

---

## Project Overview

This system allows users to:

- ✈️ Search for flights by source and destination.
- 🧾 Book tickets with passenger and flight details.
- 👩‍💼 Admin can view and manage all bookings.

---

## Technologies Used

| Layer    | Technology                         |
| -------- | --------------------------------- |
| Backend  | Spring Boot, Spring Web, REST API |
| Database | PostgreSQL                        |
| Frontend | HTML, CSS, JavaScript (Vanilla)   |
| Tools    | Maven, Eclipse IDE, Git, Postman  |

---

## Features

1. Flight Search by City (From / To)  
2. Flight Booking with Passenger Info  
3. Admin Dashboard to View All Bookings  
4. Booking Confirmation Display  
5. Simple Email Login for Admin  
6. Attractive & Responsive UI  
7. Booking Data Stored in PostgreSQL  
8. Background Image for Better UX  h

---


## Project Structure
       

       airline_reservation_system/
       ┣ src/
       ┃ ┣ main/
       ┃ ┣ java/com/example/controller/
       ┃ ┃ ┣ java/com/example/entity/
       ┃ ┃ ┣ java/com/example/repository/
       ┃ ┃ ┣ java/com/example/service/
       ┃ ┗ resources/
       ┃ ┃ ┗ application.properties
       ┣ static/
       ┃ ┣ style.css
       ┃ ┗ app.js
       ┣ templates/
       ┃ ┗ index.html
       ┣ README.md
       ┗ pom.xml


---

## User Roles

| Role  | Access                                  |
| ----- | --------------------------------------- |
| User  | Search flights, book tickets             |
| Admin | View all bookings, manage flight records |

---

## REST API Endpoints

| Method | Endpoint               | Description                    |
| ------ | ---------------------- | ------------------------------ |
| GET    | `/flights/all`         | Get all available flights      |
| POST   | `/booking/save`        | Submit a new booking           |
| GET    | `/bookings/all`        | View all bookings (admin view) |
| DELETE | `/booking/delete/{id}` | Delete a booking by ID (admin) |

---


## Sample API Response
---

    {

    "id": 1,

    "passengerName": "Sanika Kavade",
    "flightNo": "AI-2025",
    "fromCity": "Mumbai",
    "toCity": "Delhi",
    "travelDate": "2025-08-10",
    "status": "Confirmed"
     }
    ]
---



🛫 How to Run This Project
---

✅ Backend (Spring Boot)
---
1.Open the project in Eclipse IDE.

2.Run the main Spring Boot application class:

    a.AirlineReservationSystemApplication.java

3.Make sure PostgreSQL is installed and running.

4.Create a database named:

    a.airline_reservation_system

5.Spring Boot will connect automatically using:

    a.Port: 8067
    b.JDBC URL: jdbc:postgresql://localhost:5432/airline_reservation_system

6.Once the app starts, backend REST API will be available at:

    a.http://localhost:8067
---



🌐 Frontend (HTML, CSS, JavaScript)
---

1.Go to the project folder.

2.Open the file index.html in any browser (Chrome recommended).

3.You will see:

    a.A Search form for flights.

    b.A Book button to reserve a seat.

    c.An Admin section to view all bookings.

4.Try each functionality to test the full application flow.

5.All responses are handled dynamically through JavaScript and REST API calls.

---

Screenshots
---

---





<img width="1038" height="616" alt="image" src="https://github.com/user-attachments/assets/7b836297-acec-4a5c-b75a-6c756e5e6ee9" />





---





<img width="1040" height="544" alt="image" src="https://github.com/user-attachments/assets/416cd46e-938d-42d0-a875-306cfd81c17a" />





---




<img width="1222" height="717" alt="image" src="https://github.com/user-attachments/assets/618bb0e8-e1ef-4091-959b-4b686aa77235" />





---




<img width="1220" height="596" alt="image" src="https://github.com/user-attachments/assets/71454e3b-e0e7-4d21-ba10-671514ff0838" />





---


📂 GitHub Repo
---

Airline Reservation System on GitHub

---

👩‍💻 Project Developed By
---
• Name: Sanika Kavade

• Education: Diploma (Information Technology) – 3rd Year

• College: SVERI College of Engineering (Poly), Pandharpur

• Email: kavdesanika11@gmail.com

• Internship Guide: Anirudh Gaikwad

---
