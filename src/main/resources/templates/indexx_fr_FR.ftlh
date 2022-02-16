<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<#import "/spring.ftl" as spring />
<header>
    <nav class="navbar navbar-dark bg-dark">
        <div class="container-fluid">
            <h4 class="navbar-brand" href="#"> <@spring.message "greeting" /></h4>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#"><@spring.message "category" /></a>
                    </li>
                    <li class="nav-item">
                        <a href="http://localhost:1314/myCart/${hi}" class="nav-link active" role="button" aria-pressed="true"><@spring.message "cart" /></a>
                    </li>

                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <@spring.message "choose.lang" />
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li><a class="dropdown-item" href="http://localhost:1314/?lang=kg_KY"><@spring.message "kyrg" /></a></li>
                            <li><a class="dropdown-item" href="http://localhost:1314/?lang=en_US"><@spring.message "eng" /></a></li>
                            <li><a class="dropdown-item" href="http://localhost:1314/?lang=fr_FR"><@spring.message "franc" /></a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>

    <h3 class="shift" style="padding-top: 50px"><@spring.message "type.name" /></h3>

    <form method="get" action="/hello" class="shift">
        <input  type="text" name="prod_name" required>
        <button class="btn btn-outline-secondary" type="submit" name="prod_name_button" value="prodName"><@spring.message "get" /></button>
    </form>
    <hr>

    <h3 class="shift"><@spring.message "type.type" /></h3>

    <form method="get" action="/type" class="shift">
        <input type="text" name="prod_type" required>
        <button class="btn btn-outline-secondary" type="submit" name="prod_type_button" value="prodType"><@spring.message "get" /></button>
    </form>
    <hr>

    <h3 class="shift"><@spring.message "criteria" /></h3>

    <form method="get" action="/several" class="shift">
        <h4><@spring.message "type" /></h4>
        <input type="text" name="prod_type" required><br>
        <h4><@spring.message "name" /></h4>
        <input type="text" name="prod_name" required><br>
        <h4><@spring.message "min.prize" /></h4>
        <input type="number" name="prod_min_price" required><br>
        <h4><@spring.message "max.prize" /></h4>
        <input type="number" name="prod_max_price" required><br>
        <button class="btn btn-outline-secondary" style="width: 100px; margin-top: 10px" type="submit" name="several_criteria_button" value="prodSeveral"><@spring.message "get" /></button>
    </form>
    <hr>





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
<style>
    .shift{
        margin-left: 600px;
    }
</style>
</html>