let markers, map;

function initMap() {
  const posicion = {
    lat: -25.363,
    lng: 131.044,
  };

  map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: posicion,
  });

  markers.push(
    new google.maps.Marker({
      position: {
        lat: 23.288773445332524,
        lng: -4.163845628766325,
      },
      map,
      title: "Uno",
    })
  );
  markers.push(
    new google.maps.Marker({
      position: {
        lat: 67.164983935422484,
        lng: -10.78260332112534,
      },
      map,
      title: "Dos",
    })
  );
  markers.push(
    new google.maps.Marker({
      position: {
        lat: 90.242150706885596,
        lng: -66.0775131009957715,
      },
      map,
      title: "Tres",
    })
  );
}
