<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">   		
  
<title>Index Page</title>

</head>
<body>
<div class="container">
	<div class="row">
		<div class="col">
	<font face="courier"> <br><h4>Hello, ${workerInSession.getName()} ${workerInSession.getSurname()}</h4></font>
	<a href="/login" class="btn btn-dark">Close Session</a>
		</div>
		
		<div class="col">
			<img class="mb-4" src="https://vignette.wikia.nocookie.net/lostpedia/images/3/37/Oceanic_logo.gif/revision/latest?cb=20070916213045&path-prefix=es" alt="" height="125">
		</div>
	</div>
</div>               
<div class="container">

<div class="row">
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="data:image/jpeg;base64,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" alt="Card image cap">
	  	<div class="card-body">
	  		  <h5 class="card-title">Add an Airplane</h5>
	   		<p class="card-text">Introduce new airplanes</p>
	    <a href="/selectingAirplane" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://www.flyedelweiss.com/SiteCollectionImages/Press-Photos/Edelweiss_CabinCrew.jpg?RenditionId=22">
	  	<div class="card-body">
	  		  <h5 class="card-title">Add a Worker</h5>
	   		<p class="card-text">Introduce new Workers</p>
	    <a href="/selectingCountry" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://thehungryguest.com/wp-content/uploads/2018/03/food_and_drink_masthead2.jpg">
	  	<div class="card-body">
	  		  <h5 class="card-title">Add Menus</h5>
	   		<p class="card-text">Introduce new Menus</p>
	    <a href="/addFoodAndDrink" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
</div>

<div class="row">
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://www.aerosieger.de/images/news_picupload/pic_sid7146-0-norm.jpg" alt="Card image cap">
	  	<div class="card-body">
	  		  <h5 class="card-title">List of airplanes</h5>
	   		<p class="card-text">Show all the airplanes</p>
	    <a href="/LoadAirplanesList" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://eodgoxn58m-flywheel.netdna-ssl.com/wp-content/uploads/2016/07/267784_288348997933099_337766240_n.jpg">
	  	<div class="card-body">
	  		  <h5 class="card-title">Add Cabin Crew Flight</h5>
	   		<p class="card-text">Create groups of work</p>
	    <a href="/addCabinCrewFlight" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://amp.insider.com/images/5981e5ba232dfa2d008b48ac-750-563.jpg">
	  	<div class="card-body">
	  		  <h5 class="card-title">Add a new Passenger</h5>
	   		<p class="card-text">Create a Passenger</p>
	    <a href="/addPassenger" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
</div>
<div class="row">
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://ih0.redbubble.net/image.10770212.3748/flat,550x550,075,f.jpg" alt="Card image cap">
	  	<div class="card-body">
	  		  <h5 class="card-title">Add a Flight</h5>
	   		<p class="card-text">Select Airplane, Workers, destination...</p>
	    <a href="/selectingOriginCountry" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
</div>
</div>
<script src="js/bootstrap.min.js"></script>  
</body>
</html>