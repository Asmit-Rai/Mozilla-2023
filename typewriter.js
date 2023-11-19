document.addEventListener('DOMContentLoaded', function(event) {
    var dataText = ["💡Innovation💡","🌐Technology🌐", "💻Collaboration💻", "👨🏻‍💻Development👨🏻‍💻"];
  
    function typeWriter(text, i, fnCallback) {
      if (i < text.length) {
        document.querySelector("h2").innerHTML = text.substring(0, i + 1) + '<span aria-hidden="true"></span>';
  
        setTimeout(function() {
          typeWriter(text, i + 1, fnCallback)
        }, 100);
      } else if (typeof fnCallback == 'function') {
        setTimeout(fnCallback, 700);
      }
    }
  
    function StartTextAnimation(i) {
      if (typeof dataText[i] == 'undefined') {
        i = 0; // Reset to the beginning of the array
      }
  
      typeWriter(dataText[i], 0, function() {
        StartTextAnimation(i + 1);
      });
    }
  
    StartTextAnimation(0);
  });
  