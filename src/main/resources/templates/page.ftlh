<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Items</title>
    <script src="https://kit.fontawesome.com/a89a4ef5c6.js" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div>
    You are searching : <b>${name}</b>
</div>

<#assign a = "${button}">


<#if a == "prodType">
<#list prodTypes as product>
<div style="padding-top: 60px">
    <form method="get" action="/putProdInCart">
        <div class="card" style="width: 18rem;">
            <img src="${product.image}" class="card-img-top" alt="...">
            <div class="card-body">
                <h4>${product.name}</h4>
                <b>price: ${product.price} $</b>
                <p class="card-text">description: ${product.description}</p>
                <p class="card-text">amount: ${product.amount}</p>
                <button name="prodValue" value="${product.id}" type="submit" class="btn btn-outline-success">Get</button>
            </div>
        </div>
    </form>
</div>
</#list>
<#elseif a == "prodName">
<#list products as product>
<div style="padding-top: 60px">
    <form method="get" action="/putProdInCart">
        <div class="card" style="width: 18rem;">
            <img src="${product.image}" class="card-img-top" alt="...">
            <div class="card-body">
                <h4>${product.name}</h4>
                <b>price: ${product.price} $</b>
                <p class="card-text">description: ${product.description}</p>
                <p class="card-text">amount: ${product.amount}</p>
                <button name="prodValue" value="${product.id}" type="submit" class="btn btn-outline-success">Get</button>
            </div>
        </div>
    </form>
</div>
</#list>
<#elseif a == "prodSeveral">
    <#list products as product>
        <div style="padding-top: 60px">
            <form method="get" action="/putProdInCart">
                <div class="card" style="width: 18rem;">
                    <img src="${product.image}" class="card-img-top" alt="...">
                    <div class="card-body">
                        <h4>${product.name}</h4>
                        <b>price: ${product.price} $</b>
                        <p class="card-text">description: ${product.description}</p>
                        <p class="card-text">amount: ${product.amount}</p>
                        <button name="prodValue" value="${product.id}" type="submit" class="btn btn-outline-success">Get</button>
                    </div>
                </div>
            </form>
        </div>
    </#list>
<#elseif a == 4>
    x is 4
<#else>
    x is not 1 nor 2 nor 3 nor 4
</#if>

</body>
</html>