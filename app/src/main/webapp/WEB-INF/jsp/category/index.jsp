<%--
  Created by IntelliJ IDEA.
  User: Sweet
  Date: 26.04.2017
  Time: 23:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Категории книг</title>
    <style>
        header{
            width: 100%;
            position: fixed;
            z-index: 1000;
        }
        .option{
            height: 40px;
        }
        .title {
            color: white;
        }
        .foot{
            background-color:black ;
            position: absolute;
            left: 0;
            bottom: 0;
            width: 100%;
            height: 40px;
        }
        .but {
            float: right;
            margin: 10px;
        }
        table {
            width: 100%;
            background: white;
            color: black;
            border-spacing: 1px;
            border-color: black;
        }
        td{
            height: 40px;
            padding: 5px;
        }
        th {

            padding: 5px;
        }
        .search {
            float: right;
            position: relative;
        }
        .search input {
            border: none;
        }
        .search .input {
            width: 100%;
            padding: 8px 37px 9px 15px;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            box-shadow: inset 0 0 5px rgba(0,0,0,0.1), inset 0 1px 2px rgba(0,0,0,0.3);
            border-radius: 20px;
            background: #EEE;
            font: 13px Tahoma, Arial, sans-serif;
            color: #555;
            outline: none;
        }
        .search .input:focus {
            box-shadow: inset 0 0 5px rgba(0,0,0,0.2), inset 0 1px 2px rgba(0,0,0,0.4);
            background: #E8E8E8;
            color: #333;
        }
        .search .submit {
            position: absolute;
            top: 0;
            right: 0;
            width: 37px;
            height: 100%;
            cursor: pointer;
            background: url(https://lh4.googleusercontent.com/-b-5aBxcxarY/UAfFW9lVyjI/AAAAAAAABUg/gQtEXuPuIds/s13/go.png) 50% no-repeat;
            opacity: 0.5;
        }
        .search .submit:hover {
            opacity: 0.8;
        }
        input[type="search"] {
            -webkit-appearance: none;
        }
    </style>
</head>
<body>
<fieldset>

    <legend>Меню</legend>
    <select onchange="window.location.href=this.options[this.selectedIndex].value" name="option" class="option">
        <option autofocus>Выбирите каталог</option>
        <option disabled>-------------</option>
        <option value="${pageContext.request.contextPath}/">На главную</option>
        <option value="${pageContext.request.contextPath}/book">Книги</option>
        <option value="${pageContext.request.contextPath}/author">Автор</option>
    </select>
    <form action="" method="post" class="search">
        <input type="search" name="" placeholder="поиск" class="input" />
        <input type="submit" name="" value="" class="submit" />
    </form>

</fieldset>
<div>
    <center><h1>Жанры литературы</h1></center>
</div>
<div>
    <table border="1">
        <tr><th width="10%">№</th><th width="30%">Жанр литературы</th><th width="30%">Книга</th><th width="30%">Автор</th></tr>
        <tr><td></td><td></td><td></td><td></td></tr>
        <tr><td></td><td></td><td></td><td></td></tr>
        <tr><td></td><td></td><td></td><td></td></tr>
        <tr><td></td><td></td><td></td><td></td></tr>
        <tr><td></td><td></td><td></td><td></td></tr>
        <tr><td></td><td></td><td></td><td></td></tr>
        <tr><td></td><td></td><td></td><td></td></tr>
    </table>
</div>
<form action="${pageContext.request.contextPath}/">
    <button class="but">На главную</button>
</form>
<footer>
    <div class="foot">
        <div class="title"> © Bryl Oleg  </div>
         <div class="title">   e-mail: olegbryl@gmail.com</div>
    </div>
</footer>
</body>
</html>
