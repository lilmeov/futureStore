<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<h2>In your cart: </h2>
<#list productsInCart as product>
    <div style="padding-top: 60px">
        <div class="card" style="width: 18rem;">
            <img src="${product.image}" class="card-img-top" alt="...">
            <div class="card-body">
                <h4>${product.name}</h4>
                <b>price: ${product.price} $</b>
                <p class="card-text">description: ${product.description}</p>
            </div>
        </div>
    </div>
</#list>
</body>
</html>