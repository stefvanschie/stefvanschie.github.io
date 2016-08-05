var licenses = {
  "GNU AGPLv3":{
    "commercial":true,
    "distribution":true,
    "modification":true,
    "patent":true,
    "private":true,

    "disclose":true,
    "license-copyright":true,
    "network":true,
    "license":true,
    "changes":true,

    "liable":true,
    "trademark":false
  },
  "GNU GPLv3":{
    "commercial":true,
    "distribution":true,
    "modification":true,
    "patent":true,
    "private":true,

    "disclose":true,
    "license-copyright":true,
    "license":true,
    "changes":true,

    "liable":true,
    "trademark":false
  },
  "GNU LGPLv3":{
    "commercial":true,
    "distribution":true,
    "modification":true,
    "patent":true,
    "private":true,

    "disclose":true,
    "license-copyright":true,
    "license":true,
    "changes":true,

    "liable":true,
    "trademark":false
  },
  "Mozilla Public License 2.0":{
    "commercial":true,
    "distribution":true,
    "modification":true,
    "patent":true,
    "private":true,

    "disclose":true,
    "license-copyright":true,
    "license":true,

    "liable":true,
    "trademark":true
  },
  "Apache License 2.0":{
    "commercial":true,
    "distribution":true,
    "modification":true,
    "patent":true,
    "private":true,

    "license-copyright":true,
    "changes":true,

    "liable":true,
    "trademark":true
  },
  "MIT License":{
    "commercial":true,
    "distribution":true,
    "modification":true,
    "patent":false,
    "private":true,

    "license-copyright":true,

    "liable":true,
    "trademark":false
  },
  "The Unlicense":{
    "commercial":true,
    "distribution":true,
    "modification":true,
    "patent":false,
    "private":true,

    "liable":true,
    "trademark":false
  }
};

$(document).ready(function() {
  $("#btn-license").click(function() {
    $(this).text("Searching for licenses");

    var found = [];

    for (var key in licenses) {
      if (!licenses.hasOwnProperty(key)) {
        continue;
      }

      var correct = true;

      for (var prop in licenses[key]) {
        correct = $("input[value='" + prop + "']").is(":checked") == licenses[key][prop];
      }

      if (correct) {
        found.push(key);
      }
    }
    
    if (found.length !== 0) {
      for (var license in found) {
        $("#licenses").html("<a href='http://google.com/#q=" + license + "'>" + license + "</a><br / >");
      }
    } else {
      $("#licenses").html("<p>We found zero matches for the current selected options</p>");
    }
  });
});
