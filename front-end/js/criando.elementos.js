var myHeaders = new Headers();
myHeaders.append("Content-type", "aplication/json");
var requestOptions ={
    method:'GET',
    headers: myHeaders,
    redirect: 'follow'
};

fetch("http://localhost:8080/produto", 
requestOptions).then(response =>
    response.json())
    .then(result =>{
        result.forEach(element => {
            let table = document.createElement('table');
            document.getElementById('body').appendChild(table);
            let row_1 = document.createElement('tr');
            let coluna_1 = document.createElement('td');
            coluna_1.innerHTML = "<img src='imagem/wg.jpg' width='150' <br>"+ "<br>"  + element["descricao"] + "<br>"+ element["preco"] ;
            coluna_1.href = 'index.html?id=' + element['id']
            row_1.appendChild(coluna_1);
            table.appendChild(row_1);
        });
    })




