<script type="text/javascript">


        function searchItem() {
        let val = document.querySelector('#mySearch').value.trim().toLocaleLowerCase();
        let elasticItems = document.querySelectorAll(".elastic button");
        let tabcontent = document.querySelectorAll(".tabcontent");
            let indexTab = 0;
            let flag = false;
        if(val !=''){
            elasticItems.forEach(function (elem) {
                if(elem.innerHTML.toLocaleLowerCase().search(val) == -1){
                    elem.classList.add("hide");
                    tabcontent[indexTab].style.display = "none";

                } else {
                    elem.classList.remove("hide");
                    showTable(flag, indexTab, tabcontent);
                }
                indexTab++;
            })
        } else {
            elasticItems.forEach(function (elem){
                elem.classList.remove("hide");
                showTable(flag, indexTab, tabcontent);
                indexTab++;
            })

        }
            let index = 0;
            elasticItems.forEach(function (elem) {
                if(index == 0 && !elem.classList.contains("hide")){
                    elem.classList.add("active");

                    index++;
                }else {elem.classList.remove("active");}
            });

            function showTable(isflag, thisIndexTab, tabcontent) {
                if(isflag == false) {
                    tabcontent[thisIndexTab].removeAttribute("style");
                    flag = true;
                } else {
                    tabcontent[thisIndexTab].style.display = "none";
                }

            }
    }



    function openItem(evt, itemName) {
        // Declare all variables
        let i, tabcontent, tablinks;

        // Get all elements with class="tabcontent" and hide them
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }

        // Get all elements with class="tablinks" and remove the class "active"
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }

        // Show the current tab, and add an "active" class to the link that opened the tab
        document.getElementById(itemName).style.display = "block";
        evt.currentTarget.className += " active";
    }


</script>