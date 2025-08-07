let passengerArray = [];

function searchFlights() {
  const from = document.getElementById("from").value;
  const to = document.getElementById("to").value;

  if (from && to) {
    alert(`Searching flights from ${from} to ${to}...`);
  } else {
    alert("Please enter both From and To destinations.");
  }
}

function openBooking() {
  document.getElementById("bookingModal").style.display = "block";
}

function closeBooking() {
  document.getElementById("bookingModal").style.display = "none";
}

function confirmBooking() {
  const name = document.getElementById("passengerName").value;
  const flightId = document.getElementById("flightId").value;

  if (name && flightId) {
    alert(`Booking confirmed for ${name}!`);
    passengerArray.push(name);
    updatePassengerList();
    closeBooking();

    // Clear input fields
    document.getElementById("passengerName").value = "";
    document.getElementById("flightId").value = "";
  } else {
    alert("Please fill both Passenger Name and Flight ID.");
  }
}

function updatePassengerList() {
  const list = document.getElementById("passengerList");
  list.innerHTML = ""; // reset list

  passengerArray.forEach((name, index) => {
    const li = document.createElement("li");
    li.textContent = `${index + 1}. ${name}`;
    list.appendChild(li);
  });
}
