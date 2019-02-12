let btn = document.getElementById("btn");
let busInfo = document.getElementById("bus-info");
let currentDate = new Date();

btn.addEventListener("click", function(){
  let httpRequest = new XMLHttpRequest();
  httpRequest.open("GET", "http://futar.bkk.hu/bkk-utvonaltervezo-api/ws/otp/api/where/arrivals-and-departures-for-stop.json?key=apaiary-test&version=3&appVersion=apiary-1.0&includeReferences=true&stopId=BKK_F03868&onlyDepartures=false&limit=20&minutesBefore=0&minutesAfter=120");
  httpRequest.onload = function(){
    let busData = JSON.parse(httpRequest.responseText);
    let toHtml = function(busData) {
      let htmlString = "";
      let trips = Object.values(busData.data.references.trips);
      let routes = Object.values(busData.data.references.routes);
      let stopTimes = Object.values(busData.data.entry.stopTimes);

      for (let i = 0; i < trips.length; i++) {
        for (let j = 0; j < routes.length; j++) {
          if (trips[i].routeId === routes[j].id) {
            htmlString += "<h1>" + routes[j].shortName + "</h1>"
          }
        }

        htmlString += "<p>" + trips[i].tripHeadsign + "</p>";
        
        for (let k = 0; k < stopTimes.length; k++) {
          if (trips[i].id === stopTimes[k].tripId) {
            let date = new Date(null);
            if (stopTimes[k].predictedArrivalTime == undefined) {
              date.setSeconds(stopTimes[k].arrivalTime);
            } else {
              date.setSeconds(stopTimes[k].predictedArrivalTime);
            }
            console.log(date);

            let timeString = date.toString().substr(16,8);
            
            htmlString += "<p>" + timeString + "</p>";
          }
        }
      }

      busInfo.insertAdjacentHTML("beforeend", htmlString);
    };
    toHtml(busData);
  };
  httpRequest.send();
});
