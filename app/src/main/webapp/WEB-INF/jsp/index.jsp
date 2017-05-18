<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title>Библиотека</title>
<style>
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
            <option value="${pageContext.request.contextPath}/book">Книги</option>
            <option value="${pageContext.request.contextPath}/author">Автор</option>
            <option value="${pageContext.request.contextPath}/category">Жанры литературы</option>
        </select>
        <form action="" method="post" class="search">
            <input type="search" name="" placeholder="поиск" class="input" />
            <input type="submit" name="" value="" class="submit" />
        </form>

    </fieldset>




<footer>
    <div class="foot">
        <div class="title"> © Bryl Oleg  </div>
        <div class="title">   e-mail: olegbryl@gmail.com</div>
    </div>
</footer>
</body>
</html>