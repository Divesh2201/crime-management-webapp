<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<!-- Start -->

<head>
    <title>Mumbai Police</title>
    <link rel='stylesheet' href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link href="css/welcome.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>



<body>

    <!-- Navigation Bar -->

    <nav class="navbar navbar-expand-sm">

        <div class="logo">
            <a href="#"><span class="bold m-r-5"><b>Mumbai Police(Admin Login)</b></span></a>
        </div>

        <ul class="hide">
            <li><a href="#Home">Home</a></li>
            <li><a href="#Services">Services</a></li>
            <li><a href="#About">About Us</a></li>
            <li><a href="#Contact">Contact Us</a></li>
        </ul>

        <form action="register" class="form-inline">
    <input type="submit" class="btn btn-dark btn-success" value="Register"/>
        </form>
    </nav>


    <!--/ Navigation Bar-->


    <!-- Showcase-->

    <div class="carousel slide" data-ride="carousel" id=".">
        <ul class="carousel-indicators">
            <li data-target="#demo" data-slide-to="0" class="active"></li>
            <li data-target="#demo" data-slide-to="1"></li>
            <li data-target="#demo" data-slide-to="2"></li>
            <li data-target="#demo" data-slide-to="3"></li>
        </ul>
        <div class="carousel-inner">
            <div class="carousel-item">
                <img src="https://cdn.dnaindia.com/sites/default/files/styles/full/public/2018/04/06/668813-mumbai-police-02.jpg" alt="Image" width="1100" height="500">
            </div>
            <div class="carousel-item">
                <img src="https://mumbaipolice.gov.in/images/Gallery/11.png" alt="Image" width="1100" height="500">
            </div>
            <div class="carousel-item active">
                <img src="https://mumbaipolice.gov.in/images/Inneralbum/thumb/1571643580_WhatsApp%20Image%202019-10-21%20at%2012.30.13.jpeg" alt="Image" width="1100" height="500">
            </div>
            <div class="carousel-item">
                <img src="https://mumbaipolice.gov.in/images/Gallery/12.png" alt="Image" width="1100" height="500">
            </div>
        </div>
        <a class="carousel-control-prev" href="#demo" data-slide="prev">
            <span class="carousel-control-prev-icon"></span>
        </a>
        <a class="carousel-control-next" href="#demo" data-slide="next">
            <span class="carousel-control-next-icon"></span>
        </a>
    </div>



    <!--/ Showcase-->


    <!--Home-->

    <div class="jumbotron jumbotron-fluid" id="Home">
        <div class="container">
            <h2 align="center"><u>Our Moto</u></h2><br>
            <p align="center">To protect the Good and to destroy the Evil.</p>
        </div>
    </div>

    <!--/ Home-->

    <!--Services-->

    <div class="section section-white no-bottom-padding" id="Services">
        <div class="section-heading">
            <h3 align="center" style="font-size:40px"><b><u>Services</u></b></h3><br>
        </div>
        <div class="container-1">
            <div class="a">
                <p class="grid-item"><a href="/admin/viewCyberCrimeComplaints">View CyberCrime Complaints</a></p>
            </div>
            <div class="b">
                <p class="grid-item"><a href="/admin/viewExtortionComplaints">View Extortion Complaints</a></p>
            </div>
            <div class="c">
                <p class="grid-item"><a href="/admin/viewFelonyComplaints">View Felony Complaints</a></p>
            </div>
            <div class="d">
                <p class="grid-item"><a href="/admin/viewMissingComplaints">View Missing Reports</a></p>
            </div>
            <div class="e">
                <p class="grid-item"><a href="/admin/viewRobberyComplaints">View Robbery Complaints</a></p>
            </div>
            <div class="f">
                <p class="grid-item"><a href="/home" >Logout</a></p>
            </div>
        </div>
    </div><br><br>

    <!--/ Services-->

    <!--About-->


    <div class="section section-white no-bottom-padding" id="About">
        <div class="container">
            <div class="section-heading">
                <h3 align="center" style="font-size:40px"><b><u>About Us</u></b></h3>
            </div>
            <br>
            <div class="section-heading">
                <h3 align="center"><b>Our Mission</b></h3>
            </div>
            <div class="para">
                <p align="center">In order to protect life and property, prevent crime and reduce the fear of crime, we will provide service with understanding, response with compassion, performance with integrity and law enforcement with vision.</p>
            </div>
            <div class="section-heading">
                <h3 align="center"><b>Executive Team</b></h3>
            </div>
            <div class="row">
                <div class="card">
                    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQcuvuSmK0Jh-43eSPGJdfwP_tFNc12J1C8Ig&usqp=CAU" alt="IMAGE" width="250" height="250">
                    <div class="card-text">
                        <h3 style="text-align:center">Akhil Lokhande</h3>
                        <p style="color:grey;text-align:center;font-weight:bold">COMMISSIONER</p>
                        <p style="text-align:center">Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
                        <button class="btn btn-light text-center full-width">Contact</button>
                    </div>
                </div>
                <div class="card">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/e/ea/DCP_Pradip_Sawant.jpg" alt="IMAGE" width="250" height="250">
                    <div class="card-text">
                        <h3 style="text-align:center">Sanjay Deshmukh</h3>
                        <p style="color:grey;text-align:center;font-weight:bold">DCP</p>
                        <p style="text-align:center">Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
                        <button class="btn btn-light text-center full-width">Contact</button>
                    </div>
                </div>
                <div class="card">
                    <img src="https://upload.wikimedia.org/wikipedia/commons/6/64/Sanjay_Barve%2C_Indian_Police_Service%2C_Commissioner_of_Police%2C_Mumbai.jpg" alt="IMAGE" width="250" height="250">
                    <div class="card-text">
                        <h3 style="text-align:center">Ramesh Rawat</h3>
                        <p style="color:grey;text-align:center;font-weight:bold">ACP</p>
                        <p style="text-align:center">Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
                        <button class="btn btn-light text-center full-width">Contact</button>
                    </div>
                </div>
                <div class="card">
                    <img src="https://www.thehindu.com/news/cities/mumbai/rksgsv/article25592910.ece/BINARY/26BMYogendra-Pache" alt="IMAGE" width="250" height="250">
                    <div class="card-text">
                        <h3 style="text-align:center">Rohan Pandey</h3>
                        <p style="color:grey;text-align:center;font-weight:bold">INSPECTOR</p>
                        <p style="text-align:center">Phasellus eget enim eu lectus faucibus vestibulum. Suspendisse sodales pellentesque elementum.</p>
                        <button class="btn btn-light text-center full-width">Contact</button>
                    </div>
                </div>
            </div>
        </div>
    </div><br><br>

    <!--/ About-->


    <!--Contact-->

    <div class="section section-white" id="Contact">
        <div class="container">
            <div class="section-heading">
                <h3 align="center" style="font-size:40px"><b><u>Contact Us</u></b></h3><br>
            </div>
            <div class="para">We appreciate your suggestions and will surely work through them.<br> Feel free to contact us.</div>
            <form action="">
                <input type="text" placeholder="Name">
                <input type="email" placeholder="Email">
                <input type="text" placeholder="Subject">
                <input type="text" placeholder="Message">
                <button class="btn btn-dark text-center m-t-20">Send Message</button>
            </form>
        </div>
    </div>


    <!--Map-->

    <div class="section section-white no-bottom-padding" id="About">
        <div class="container">
            <div class="section-heading">
                <h3 align="center"><b><u>Headquarter's Location</u></b></h3>
            </div><br><br>
            <img class="map" src="https://www.w3schools.com/w3images/map.jpg" alt="MAP">
        </div><br><br>
    </div>

    <!--Footer-->

    <footer class="black">
        <p class="text-center">Emergency-Line:-101 Elder-Line:-1090 Citizen_Wall:-100</p>
        <br>
        <p class="text-center">Copyright�</p>
    </footer>

    <!--/ Footer-->

    <script src="js/welcome.js"></script>

</body>

</html>