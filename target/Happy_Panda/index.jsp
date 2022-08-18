<html>
<head>
    <style>
        .nav {
            list-style-type: none;
            margin: 0;
            top:0;
            padding: 0;
            position: fixed;
            background-color: #F2FFF2;
            width: 100%;
        }
        h2 {
            font-family: "Lucida Handwriting", "Courier New", monospace;
            color: #008000;
            padding: 4px;
            letter-spacing: 1px;
        }
        li {
            float: left;
        }
        li a , button {
            display: block;
            color: #808080;
            text-align: center;
            padding: 14px 24px;
            text-decoration: none;
            overflow: hidden;
        }
        li a:hover, button:hover {
            background: #A1F1A1;
            color: #008000;
            border-bottom: 2.5px solid #008000;
        }
        .dropdown-content a:hover{
            background: #A1F1A1;
            color: #008000;
        }
        button {
            background-color: #F2FFF2;
            margin: 0;
            border: 0;
            padding-top: 2px;
        }
        .dropdown {
            padding: 14px 24px;
            background-color: #F2FFF2;
            text-decoration: none;
            overflow: hidden;
        }
        .dropdown-content {
            display: none;
            position: absolute;
            width: 120px;
            background-color: #F2FFF2;
        }
        .dropdown-content a {
            float: none;
            padding: 14px 20px;
            text-decoration: none;
            display: block;
        }
        .dropdown:hover .dropdown-content {
            display: block;
        }
        .footer {
            list-style-type: none;
            position: fixed;
            margin-top: -100px;
            clear:both;
            bottom: 0;
            left: 0;
            width: 100%;
            background-color: #A1F1A1;
            color: #5D5D5D;
        }
        .ul-fa {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            border: 0px solid;
        }
        .nav2 ul {
            padding-right: 20px;
            background-color: #A1F1A1;
            text-align: right;
        }
        .nav2 a{
            text-align: center;
            border-radius: 50%;
            width: 15px;
            height: 12px;
        }
        .fa {
            padding: 10px;
            font-size: 20px;
            text-decoration: none;
            margin: 5px 2px;
        }
        .fa:hover {
            color: #A1F1A1;
        }
        .fa-facebook {
            background: #3B5998;
            color: #FFFFFF;
        }
        .fa-twitter {
            background: #00ACEE;
            color: #FFFFFF;
        }
        .fa-instagram {
            display: inline-block;
            color: #FFFFFF;
            background: #d6249f;
            background: radial-gradient(circle at 30% 107%, #fdf497 0%, #fdf497 5%, #fd5949 45%,#d6249f 60%,#285AEB 90%);
            box-shadow: 0px 3px 10px rgba(0,0,0,.25)
        }
        .fa-linkedin {
            background: #007bb5;
            color: #FFFFFF;
        }
        .fa-youtube {
            background: #FF0000;
            color: #FFFFFF;
        }
    </style>
</head>
<body>
<header>
    <div class="nav">
        <li> <figure><img src="Happy_Panda_logo.png" height="88px" width="100px" alt="Happy Panda"> </figure></li>
        <li> <h2> Happy Panda </h2> <li>
        <li style="float:right"><a href="#"> Contact </a></li>
        <li style="float:right"><a href="#"> Register </a></li>
        <li style="float:right"><a href="#"> Login </a></li>
        <li style="float:right">
            <div class="dropdown"> <button> Services </button>
                <div class="dropdown-content" name="Services ">
                    <br>
                    <a href="#">Meditation Course</a>
                    <a href="#">Personal Consultation</a>
                </div> </div> </li>
        <li style="float:right">
            <div class="dropdown"> <button> About Us </button>
                <div class="dropdown-content" name="About US">
                    <br>
                    <a href="#">Board of Directors</a>
                    <a href="#">Meditation Instructor</a>
                    <a href="#">Mission</a>
                    <a href="#">Vission</a>
                </div> </div> </li>
        <li style="float:right"><a href="#"> Home </a></li>

    </div>
</header>
<div>
<h2>Hello-------- World!</h2>
</div>
<footer>
    <div class="footer">
        <h4>
            <div class="nav2">
                <ul class="ul-fa">
                    <span style="float: left; width: 30%; text-align: left; padding-left: 20px;">Copyright &copy 2022 </span>
                    <span style="float: left; width: 35%; text-align:center; ">All rights reserved</span>
                    <a href="#" class="fa fa-facebook"> </a>
                    <a href="#" class="fa fa-twitter"> </a>
                    <a href="#" class="fa fa-instagram"> </a>
                    <a href="#" class="fa fa-linkedin"> </a>
                    <a href="#" class="fa fa-youtube"> </a>
                </ul> </div>
        </h4>
    </div>
</footer>
</body>
</html>
