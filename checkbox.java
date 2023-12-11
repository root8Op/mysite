    function myFunction() {
        var checkBox = document.getElementById("myCheck1");
        var checkBox2 = document.getElementById("myCheck2");
        var checkBox3 = document.getElementById("mycheck3")
        var text = document.getElementById("text");
        
        if (checkBox.checked == true){
          text.style.display = "block";
          checkBox2.checked=false;
          checkBox3.checked=false;
          
      
        } else if(checkBox2.checked == true) {
           text.style.display = "none";
          checkBox.checked=false;
          checkBox3.checked=false;
           
        }
        else if(checkBox3.checked == true) {
            text.style.display = "none";
           checkBox2.checked=false;
            checkBox.checked=false;
         }
        
        else{
            text.style.display = "none";
            
        }
      }