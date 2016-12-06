var quotes = [
  "You can do anything, but not everything.</ br><i> - David Allen</i>",
  "Perfection is achieved, not when there is nothing more to add, but when there is nothing left to take away.</ br><i> - Antoine de Saint-Exupéry</i>",
  "The richest man is not he who has the most, but he who needs the least."
];

$(document).ready(function() {
  alert("test");
  
  $("#quote").text(quotes[Math.floor(Math.random() * quotes.length)]);
  
  $("button").click(function() {
     $("#quote").text(quotes[Math.floor(Math.random() * quotes.length)]);
  });
});
