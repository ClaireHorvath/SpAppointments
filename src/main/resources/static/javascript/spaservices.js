let spaServices = [
    {service: "Hot Stone Massage", description: "Relieve any pain and built up tension in your muscles", aesthetician: "Albert", price: "$175.00"},
    {service: "Seaweed Facial", description: "Promotes smooth, luminous, and soft skin", aesthetician: "Maria", price: "$160.00"},
    {service: "Microdermabrasian", description: "Renew overall skin texture and tone", aesthetician: "Caitlyn", price: "$190.00"},
    {service: "Sea Salt Body Exfoliate", description: "Removes excess dead skin to give face and body a radiant glow", aesthetician: "Tressie", price: "$180.00"}
]

let servicesButton = document.querySelector("#view-services")

function getSpaServices(evt) {
    evt.preventDefault();
    console.log(spaServices)
}

servicesButton.addEventListener('submit', spaServices);
