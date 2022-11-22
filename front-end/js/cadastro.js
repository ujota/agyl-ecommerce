const formulario = document.querySelector("#formCadastroProduto");
formulario.addEventListener("submit", function(event){
    event.preventDefault();

    //Variaveis que solicita do HTML
    const urlImagemProduto = document.querySelector("#inputUrl");
    const precoProduto = document.querySelector("#inputPreco");
    const descricaoProduto = document.querySelector("#inputDescricao");

    //Variaveis de armazenamento
    const url_imagem_produto = urlImagemProduto.value;
    const preco_produto = precoProduto.value;
    const descricao_produto = descricaoProduto.value;

    fetch("http://localhost:8080/produto",{
        method:'POST',
        headers:{
            'content-type':'application/json'
        },
        body:JSON.stringify({
            "url_imagem":url_imagem_produto,
            "descricao":descricao_produto,
            "preco":preco_produto,
        })
    })
    .then(querySelector =>{
        alert('Pruduto cadastrado com sucesso!', querySelector);
    }).catch(()=>{
        alert('Falhou!')
    })
    
})
