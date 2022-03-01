<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>

<%!
    String getFormattedDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        return sdf.format(new Date());
    }
%>
<html>
<head>
    <!-- В meta и  title указываем название, которое будет указываться на вкладке, для правильной кодировки
    сделать импорты после html-->
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Хвосты и лапы</title>
    <link rel="shortcut icon" href="../../favicon.ico?" type="image/x-icon" />

    <style>
        #dog {
            position: absolute;
            top: 105px;
            left: 0;
            width: 400px;
            height: 300px;
            transform: scaleX(-1);
        }
        #cats {
            position: absolute;
            top: 480px;
            left: 0;
            width: 333px;
            height: 250px;

        }
        #person {
            position: absolute;
            left: 0;
            width: 80px;
            height: 70px;
        }
        .btn {
            background: #d49555; /* Цвет фона */
            cursor: pointer;
            color: #fff; /* Цвет текста */
            padding: 7px 12px; /* Поля */
            margin-bottom: 2em; /* Отступ снизу */
            font: 16px/1 Arial, sans-serif; /* Рубленый шрифт */
        }
        .btn:hover {
            background: #884d22; /* Цвет фона при наведении курсора */
        }
        .btn-flat {
            border: 1px solid #01040a; /* Прозрачная рамка */
        }
        .btn-round {
            border-radius: 10px; /* Радиус скругления */
        }
        .form-selector {
            display: inline-block;
        }
        .btnCat {
            background: #f3c154; /* Цвет фона */
            cursor: pointer;
            color: #fff; /* Цвет текста */
            padding: 7px 12px; /* Поля */
            margin-bottom: 2em; /* Отступ снизу */
            font: 16px/1 Arial, sans-serif; /* Рубленый шрифт */
            border: 1px solid #01040a; /* Прозрачная рамка */
            border-radius: 10px; /* Радиус скругления */
            display: inline-block;
        }
        .btnCat:hover {
            background: #986b15; /* Цвет фона при наведении курсора */
        }

    </style>
</head>
<body>
<img id="dog" src="https://cdn.dribbble.com/users/1401320/screenshots/4544478/corgi-run.gif">
<!--<img id="dog" src="https://99px.ru/sstorage/86/2020/06/image_860306200308344459975.gif">-->
<img id="cats" src="https://cdn.dribbble.com/users/482997/screenshots/3865694/catwalk.gif">
<img id="person" src ="https://cdn.pixabay.com/photo/2014/03/25/15/23/boy-296681_640.png" style="margin-left: 5px">
<script>
    var curPosX = 0;
    var width = document.documentElement.clientWidth;
    let startDog = Date.now();
    let startCat = Date.now()
    let timer = setInterval(function() {
        let timePassedDog = Date.now() - startDog;
        let timePassedCat = Date.now() - startCat;
        let timeDog= Date.now() - startDog - 1800;
        let timeCat = Date.now() - startCat
        if (timePassedDog >= ((width * 3) + 1800)) {
            startDog = Date.now();
        }
        if (timePassedCat >= ((width * 18) + 6000)) {
            startCat = Date.now();
        }
        draw(timeDog, timeCat);
    }, 20);
    function draw(timeDog, timeCat) {
        dog.style.left = (timeDog / 3) + 'px';
        cats.style.left = (width - ((timeCat) / 18)) + 'px';
    }
</script>

<form style="margin-top: 4px  " action="allDogs" method="GET" target="_blank" class="form-selector">
    <p>
        <button style="margin-left: 80px" class="btn btn-flat btn-round">
            Владельцы
        </button>
    </p>
</form>

<h1 style="margin-left: 250px" class="form-selector" >Добро пожаловать в Хвосты и лапы!</h1>
<!--<i class="form-selector" style="margin-left: 250px; alignment-baseline: center"> Сегодня <%= getFormattedDate() %>  </i>
<h3 style="text-align: center; margin-top: 300px">Что можно сделать прямо сейчас:</h3>-->

<div>
    <form style="margin-top: 290px  " action="allDogs" method="GET" target="_blank"  class = "form-selector">
        <p>
            <button style="margin-left: 300px" class="btn btn-flat btn-round">
                Список собак
            </button>
        </p>
    </form>
    <form  target="_blank" class="form-selector">
        <p>
            <button style="margin-left: 175px" class="btn btn-flat btn-round" >
                Добавить собаку
            </button>
        </p>
    </form>
    <form class="form-selector" action="https://ru.wikipedia.org/wiki/Собака" target="_blank" >
        <p>
            <button style="margin-left: 175px" class="btn btn-flat btn-round" >
                Информация
            </button>
        </p>
    </form>
</div>

<div>
    <form style="margin-top: 250px" action="allCats" method="GET" target="_blank" class="form-selector">
        <p>
            <button style="margin-left: 300px" class="btnCat">
                Список кошек
            </button>
        </p>
    </form>
    <form class="form-selector">
        <p>
            <button style="margin-left: 175px" class="btnCat">
                Добавить кошку
            </button>
        </p>
    </form>
    <form class="form-selector" action="https://ru.wikipedia.org/wiki/Кошка" target="_blank">
        <p>
            <button style="margin-left: 175px" class="btnCat">
                Информация
            </button>
        </p>
    </form>
</div>
</body>

</html>