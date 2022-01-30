const div = document.getElementById('my-div');

const body = document.getElementsByTagName("body");

const foodBtn = document.getElementById('food');
const householdBtn = document.getElementById('household');
const sportBtn = document.getElementById('sport');
const techBtn = document.getElementById('tech');
const stationeryBtn = document.getElementById('stationery');
const furnitureBtn = document.getElementById('furniture');
const clothesBtn = document.getElementById('clothes');
const cosmeticBtn = document.getElementById('cosmetic');
const plantsBtn = document.getElementById('plants');


let FoodLength;
function getFood(){
    if (foodBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/food")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                FoodLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML +=
                        `<div class = "MyFood container" style="padding-top: 60px">
               <div class="card" style="width: 18rem;">
                  <img src="${elem.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                    <h4>${elem.name}</h4>
                    <b>price: ${elem.price} $</b>
                     <p class="card-text">description: ${elem.description}</p>
                     <p class="card-text">amount: ${elem.amount}</p>
                    </div>
               </div>
               </div>`
                })
            })
        foodBtn.classList.remove("yes");
        foodBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MyFood');
        for (let i = 0; i < FoodLength; i++) {
            q[i].remove();
        }

        foodBtn.classList.remove("no");
        foodBtn.classList.add("yes");
    }
}
////////////////////////////////////////////////////////////////////////
let householdLength;
function getHouseHold(){
    if (householdBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/household")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                householdLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML += `             
                 <div class = "MyHousehold container" style="padding-top: 60px">                         
                        <div class="card text-center" style="width: 18rem;">
                           <img src="${elem.image}" class="card-img-top col" alt="...">
                          <div class="card-body">
                              <h4>${elem.name}</h4>
                              <b>price: ${elem.price} $</b>
                              <p class="card-text">description: ${elem.description}</p>
                              <p class="card-text">amount: ${elem.amount}</p>
                          </div>
                       </div>
                 </div>`
                })
            })
        householdBtn.classList.remove("yes");
        householdBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MyHousehold');
        for (let i = 0; i < householdLength; i++) {
            q[i].remove();
        }

        householdBtn.classList.remove("no");
        householdBtn.classList.add("yes");
    }
}
////////////////////////////////////////////////////////////////////////

let sportLength;
function getSport(){
    if (sportBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/sport")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                sportLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML += `<div class = "MySport container" style="padding-top: 60px">
               <div class="card text-center" style="width: 18rem;" >
                  <img src="${elem.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                    <h4>${elem.name}</h4>
                    <b>price: ${elem.price} $</b>
                     <p class="card-text">description: ${elem.description}</p>
                     <p class="card-text">amount: ${elem.amount}</p>
                    </div>
               </div>
               </div>`
                })
            })
        sportBtn.classList.remove("yes");
        sportBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MySport');
        for (let i = 0; i < sportLength; i++) {
            q[i].remove();
        }

        sportBtn.classList.remove("no");
        sportBtn.classList.add("yes");
    }
}
////////////////////////////////////////////////////////////////////////////////

let techLength;
function getTech(){
    if (techBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/tech")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                techLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML += `<div class = "MyTech container" style="padding-top: 60px">
               <div class="card text-center" style="width: 18rem;" >
                  <img src="${elem.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                    <h4>${elem.name}</h4>
                    <b>price: ${elem.price} $</b>
                     <p class="card-text">description: ${elem.description}</p>
                     <p class="card-text">amount: ${elem.amount}</p>
                    </div>
               </div>
               </div>`
                })
            })
        techBtn.classList.remove("yes");
        techBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MyTech');
        for (let i = 0; i < techLength; i++) {
            q[i].remove();
        }

        techBtn.classList.remove("no");
        techBtn.classList.add("yes");
    }
}
////////////////////////////////////////////////////////////////////////////////

let StationeryLength;
function getStationery(){
    if (stationeryBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/stationery")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                StationeryLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML += `<div class = "MyStationery container" style="padding-top: 60px">
               <div class="card text-center" style="width: 18rem;" >
                  <img src="${elem.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                    <h4>${elem.name}</h4>
                    <b>price: ${elem.price} $</b>
                     <p class="card-text">description: ${elem.description}</p>
                     <p class="card-text">amount: ${elem.amount}</p>
                    </div>
               </div>
               </div>`
                })
            })
        stationeryBtn.classList.remove("yes");
        stationeryBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MyStationery');
        for (let i = 0; i < StationeryLength; i++) {
            q[i].remove();
        }

        stationeryBtn.classList.remove("no");
        stationeryBtn.classList.add("yes");
    }
}
////////////////////////////////////////////////////////////////////////////////

let FurnitureLength;
function getFurniture(){
    if (furnitureBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/furniture")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                FurnitureLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML += `<div class = "MyFurniture container" style="padding-top: 60px">
               <div class="card text-center" style="width: 18rem;" >
                  <img src="${elem.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                    <h4>${elem.name}</h4>
                    <b>price: ${elem.price} $</b>
                     <p class="card-text">description: ${elem.description}</p>
                     <p class="card-text">amount: ${elem.amount}</p>
                    </div>
               </div>
               </div>`
                })
            })
        furnitureBtn.classList.remove("yes");
        furnitureBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MyFurniture');
        for (let i = 0; i < FurnitureLength; i++) {
            q[i].remove();
        }

        furnitureBtn.classList.remove("no");
        furnitureBtn.classList.add("yes");
    }
}
////////////////////////////////////////////////////////////////////////////////

let ClothesLength;
function getClothes(){
    if (clothesBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/clothes")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                FurnitureLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML += `<div class = "MyClothes container" style="padding-top: 60px">    
               <div class="card text-center" style="width: 18rem;" >
                  <img src="${elem.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                    <h4>${elem.name}</h4>
                    <b>price: ${elem.price} $</b>
                     <p class="card-text">description: ${elem.description}</p>
                     <p class="card-text">amount: ${elem.amount}</p>
                    </div>
               </div>
               </div>`
                })
            })
        clothesBtn.classList.remove("yes");
        clothesBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MyClothes');
        for (let i = 0; i < FurnitureLength; i++) {
            q[i].remove();
        }

        clothesBtn.classList.remove("no");
        clothesBtn.classList.add("yes");
    }
}
////////////////////////////////////////////////////////////////////////////////

let CosmeticLength;
function getCosmetic(){
    if (cosmeticBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/cosmetics")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                CosmeticLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML += `<div class = "MyCosmetic container" style="padding-top: 60px">
               <div class="card text-center" style="width: 18rem;" >
                  <img src="${elem.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                    <h4>${elem.name}</h4>
                    <b>price: ${elem.price} $</b>
                     <p class="card-text">description: ${elem.description}</p>
                     <p class="card-text">amount: ${elem.amount}</p>
                    </div>
               </div>
               </div>`
                })
            })
        cosmeticBtn.classList.remove("yes");
        cosmeticBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MyCosmetic');
        for (let i = 0; i < CosmeticLength; i++) {
            q[i].remove();
        }

        cosmeticBtn.classList.remove("no");
        cosmeticBtn.classList.add("yes");
    }
}
////////////////////////////////////////////////////////////////////////////////

let PlantsLength;
function getPlants(){
    if (plantsBtn.classList.contains("yes")){
        fetch("http://localhost:1314/getByType/plants")
            .then((resp => {
                return resp.json();
            }))
            .then((resp) => {
                PlantsLength = resp.length;
                resp.forEach(elem => {
                    div.innerHTML += `<div class = "MyPlants container" style="padding-top: 60px">
               <div class="card text-center" style="width: 18rem;" >
                  <img src="${elem.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                    <h4>${elem.name}</h4>
                    <b>price: ${elem.price} $</b>
                     <p class="card-text">description: ${elem.description}</p>
                     <p class="card-text">amount: ${elem.amount}</p>
                    </div>
               </div>
               </div>`
                })
            })
        plantsBtn.classList.remove("yes");
        plantsBtn.classList.add("no");
    }else {
        const q = document.querySelectorAll('.MyPlants');
        for (let i = 0; i < PlantsLength; i++) {
            q[i].remove();
        }

        plantsBtn.classList.remove("no");
        plantsBtn.classList.add("yes");
    }
}
