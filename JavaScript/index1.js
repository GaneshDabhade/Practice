let myLeads = ["https://example.com", "tel:+123456789"]
const inputEl = document.getElementById("input-el")
const inputbtn = document.getElementById("input-btn")
const ulEl = document.getElementById("ul-el")
let leadsFromLocalStorage = JSON.parse(localStorage.getItem("myLeads"))
const deleteBtn = document.getElementById("delete-btn")
const saveTabBtn = document.getElementById("saveTab-btn")

if(leadsFromLocalStorage){
    myLeads = leadsFromLocalStorage
    render(myLeads)
}

saveTabBtn.addEventListener("click", function(){
    chrome.tabs.query({active: true, currentWindow: true}, function(tabs){
        console.log(tabs)
        // myLeads.push(tabs[0])
        // localStorage.setItem("myLeads", JSON.stringify(myLeads))
        // render(myLeads)   
    })
})

deleteBtn.addEventListener("click",function(){
    localStorage.clear()
    myLeads = []
    render(myLeads)
})

inputbtn.addEventListener("click", function(){   
    if(inputEl.value){
        myLeads.push(inputEl.value)   
        inputEl.value = ""
        localStorage.setItem("myLeads", JSON.stringify(myLeads))
        render(myLeads)
    } 
})

function render(leads){
    let listItems = ""
        listItems += `
            <li>
                <a target='_blank' href='www.google.com'>
                    www.google.com
                </a>
            </li>
            `
    ulEl.innerHTML = listItems
}

// function render(leads){
//     let listItems = ""
//     for(let i = 0; i < leads.length; i++){
//         listItems += `
//             <li>
//                 <a target='_blank' href='www.google.com'>
//                     www.google.com
//                 </a>
//             </li>
//             `
//     }
//     ulEl.innerHTML = listItems
// }
