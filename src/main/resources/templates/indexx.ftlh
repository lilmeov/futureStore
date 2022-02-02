<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h2>Type product name: </h2>

<form method="get" action="/hello">
    <input type="text" name="prod_name" required>
    <button type="submit" name="prod_name_button" value="prodName">get</button>
    <hr>
</form>

<h2>Type product type: </h2>

<form method="get" action="/type">
    <input type="text" name="prod_type" required>
    <button type="submit" name="prod_type_button" value="prodType">get</button>
    <hr>
</form>

<h2>Several criteria: </h2>

<form method="get" action="/several">
    <h3>type:</h3>
    <input type="text" name="prod_type" required><br>
    <h3>name:</h3>
    <input type="text" name="prod_name" required><br>
    <h3>min price:</h3>
    <input type="number" name="prod_min_price" required><br>
    <h3>max price:</h3>
    <input type="number" name="prod_max_price" required><br>
    <button style="width: 100px; margin-top: 10px" type="submit" name="several_criteria_button" value="prodSeveral">get</button>
    <hr>
</form>






</body>
</html>