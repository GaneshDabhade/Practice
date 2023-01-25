let leadsList = []
let leadsFromLocalStorage = JSON.parse(localStorage.getItem("leadsList"))
let saveInputBtn = document.getElementById("saveInput-btn")
let saveTabBtn = document.getElementById("saveTab-btn")
let deleteBtn = document.getElementById("delete-btn")
let inputBox = document.getElementById("inputBox-el")
let ulEl = document.getElementById("ul-el")

if(leadsFromLocalStorage){
    leadsList = leadsFromLocalStorage
    render(leadsFromLocalStorage)
}

saveInputBtn.addEventListener("click", function(){   
    let inputValue = inputBox.value
    if(inputValue !== ""){
        leadsList.push(inputBox.value) 
        saveToLocalStorage(leadsList)
        render(leadsList)
    }
});

saveTabBtn.addEventListener("click", function(){
    chrome.tabs.query({ active: true, currentWindow: true }, function (tabs) {
        var currentTab = tabs[0];
        var currentTabUrl = currentTab.url;
        leadsList.push(currentTabUrl)
        saveToLocalStorage(leadsList)
        render(leadsList)
    });
});

deleteBtn.addEventListener("click", function(){
    leadsList = []
    localStorage.clear()
    render(leadsList)
})

function saveToLocalStorage(leads){
    localStorage.setItem("leadsList", JSON.stringify(leads))
}

function render(leads){
    let listItems = ""
    for(let i = 0; i < leads.length; i++){
        listItems += `<li><a href= '${leads[i]}' target='_blank'>${leads[i]}</a></li>`
    }   
    console.log(listItems)
    ulEl.innerHTML = listItems
}

