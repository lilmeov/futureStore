<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>


    <h3 class="shift">Type product name: </h3>

    <form method="get" action="/hello" class="shift">
        <input  type="text" name="prod_name" required>
        <button class="btn btn-outline-secondary" type="submit" name="prod_name_button" value="prodName">get</button>
    </form>
    <hr>

    <h3 class="shift">Type product type: </h3>

    <form method="get" action="/type" class="shift">
        <input type="text" name="prod_type" required>
        <button class="btn btn-outline-secondary" type="submit" name="prod_type_button" value="prodType">get</button>
    </form>
    <hr>

    <h3 class="shift">Several criteria: </h3>

    <form method="get" action="/several" class="shift">
        <h4>type:</h4>
        <input type="text" name="prod_type" required><br>
        <h4>name:</h4>
        <input type="text" name="prod_name" required><br>
        <h4>min price:</h4>
        <input type="number" name="prod_min_price" required><br>
        <h4>max price:</h4>
        <input type="number" name="prod_max_price" required><br>
        <button class="btn btn-outline-secondary" style="width: 100px; margin-top: 10px" type="submit" name="several_criteria_button" value="prodSeveral">get</button>
    </form>
    <hr>



<a href="http://localhost:1314/myCart/${hi}" class="shift btn btn-primary btn-lg active" role="button" aria-pressed="true">See My Cart</a>

</body>
<style>
    .shift{
        margin-left: 600px;
    }
</style>
</html>