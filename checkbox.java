    function myFunction() {
        var checkBox = document.getElementById("myCheck1");
        var checkBox2 = document.getElementById("myCheck2");
        var text = document.getElementById("text");
        var text2 = document.getElementById("text2");
        
        if (checkBox.checked == true){
          text.style.display = "block";
          text2.style.display = "none";
          checkBox2.checked=false;
          
      
        } else if(checkBox2.checked == true) {
           text2.style.display = "block";
           text.style.display = "none";
          checkBox.checked=false;
           
        }
        
        
        else{
            text.style.display = "none";
             text2.style.display = "none";
            
        }
      }