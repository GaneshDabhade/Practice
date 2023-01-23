let leadsList = []
let saveInputBtn = document.getElementById("saveInput-btn")
let inputBox = document.getElementById("inputBox-el")
let ulEl = document.getElementById("ul-el")

saveInputBtn.addEventListener("click", function(){   
    leadsList.push(inputBox.value) 
    console.log(leadsList)
    render(leadsList)
})

function render(leads){
    let listItems = ""
    for(let i = 0; i < leads.length; i++){
        listItems += `<li>${leads[i]}</li>`
    }   
    ulEl.innerHTML = listItems
}

