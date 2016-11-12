var quotes = [
  "You can do anything, but not everything.",
  "Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away.",
  "The richest man is not he who has the most, but he who needs the least."
]

$(document).ready(function() {
  $("#quote").text(quotes[Math.floor(Math.random() * quotes.length)]);
  
  $("button").click(function() {
     $("#quote").text(quotes[Math.floor(Math.random() * quotes.length)]);
  });
});
