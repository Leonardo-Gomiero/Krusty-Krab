class Despesa {
	constructor(nome, numero, ambi, qpessoas, deco, descricao, valor) {
		this.nome = nome
		this.numero = numero
		this.ambi = ambi
		this.qpessoas = qpessoas
		this.deco = deco
		this.descricao = descricao
		this.valor = valor
	}

	validarDados() {
		for(let i in this) {
			if(this[i] == undefined || this[i] == '' || this[i] == null) {
				return false
			}
		}
		return true
	}
}

class Bd {

	constructor() {
		let id = localStorage.getItem('id')

		if(id === null) {
			localStorage.setItem('id', 0)
		}
	}

	getProximoId() {
		let proximoId = localStorage.getItem('id')
		return parseInt(proximoId) + 1
	}

	gravar(d) {
		let id = this.getProximoId()

		localStorage.setItem(id, JSON.stringify(d))

		localStorage.setItem('id', id)
	}

	recuperarTodosRegistros() {

		//array de despesas
		let despesas = Array()

		let id = localStorage.getItem('id')

		//recuperar todas as despesas cadastradas em localStorage
		for(let i = 1; i <= id; i++) {

			//recuperar a despesa
			let despesa = JSON.parse(localStorage.getItem(i))

			//existe a possibilidade de haver índices que foram pulados/removidos
			//nestes casos nós vamos pular esses índices
			if(despesa === null) {
				continue
			}

            despesa.id = i
			despesas.push(despesa)
		}

		return despesas
	}

	pesquisar(despesa){

		let despesasFiltradas = Array()
		despesasFiltradas = this.recuperarTodosRegistros()
		console.log(despesasFiltradas);
		console.log(despesa)

		//ano
		if(despesa.nome != ''){
			console.log("filtro de nome");
			despesasFiltradas = despesasFiltradas.filter(d => d.nome == despesa.nome)
		}
			
		//mes
		if(despesa.numero != ''){
			console.log("filtro de numero");
			despesasFiltradas = despesasFiltradas.filter(d => d.numero == despesa.numero)
		}

		//dia
		if(despesa.ambi != ''){
			console.log("filtro de ambi");
			despesasFiltradas = despesasFiltradas.filter(d => d.do == despesa.ambi)
		}

		//tipo
		if(despesa.qpessoas != ''){
			console.log("filtro de qpessoas");
			despesasFiltradas = despesasFiltradas.filter(d => d.qpessoas == despesa.qpessoas)
		}

		//deco
		if(despesa.deco != ''){
			console.log("filtro de deco");
			despesasFiltradas = despesasFiltradas.filter(d => d.deco == despesa.deco)
		}

		if(despesa.descricao != ''){
			console.log("filtro de descricao");
			despesasFiltradas = despesasFiltradas.filter(d => d.descricao == despesa.descricao)
		}

		//valor
		if(despesa.valor != ''){
			console.log("filtro de valor");
			despesasFiltradas = despesasFiltradas.filter(d => d.valor == despesa.valor)
		}

		
		return despesasFiltradas

	}

    remover(id){
        localStorage.removeItem(id)
    }
}

let bd = new Bd()


function cadastrarDespesa() {

	let nome = document.getElementById('nome')
	let numero = document.getElementById('numero')
	let ambi = document.getElementById('ambi')
	let qpessoas = document.getElementById('qpessoas')
	let deco = document.getElementById('deco')
	let descricao = document.getElementById('descricao')
	let valor = document.getElementById('valor')

	let despesa = new Despesa(
		nome.value, 
		numero.value, 
		ambi.value, 
		qpessoas.value, 
		deco.value,
		descricao.value,
		valor.value
	)


	if(despesa.validarDados()) {
		bd.gravar(despesa)

		document.getElementById('modal_titulo').innerHTML = 'Reserva efetuada com sucesso'
		document.getElementById('modal_titulo_div').className = 'modal-header text-success'
		document.getElementById('modal_btn').innerHTML = 'Voltar'
		document.getElementById('modal_btn').className = 'btn btn-success'

		//dialog de sucesso
		$('#modalRegistraDespesa').modal('show') 

		nome.value = '' 
		numero.value = ''
		ambi.value = ''
		qpessoas.value = ''
		deco.value = ''
		descricao.value = ''
		valor.value = ''
		
	} else {
		
		document.getElementById('modal_titulo').innerHTML = 'Erro na efetuação da reserva'
		document.getElementById('modal_titulo_div').className = 'modal-header text-danger'
		document.getElementById('modal_conteudo').innerHTML = 'Erro no pedido, verifique se todos os campos foram preenchidos corretamente!'
		document.getElementById('modal_btn').innerHTML = 'Voltar e corrigir'
		document.getElementById('modal_btn').className = 'btn btn-danger'

		//dialog de erro
		$('#modalRegistraDespesa').modal('show') 
	}
}

function carregaListaDespesas(despesas = Array(), filtro = false) {

    if(despesas.length == 0 && filtro == false){
		despesas = bd.recuperarTodosRegistros() 
	}
	

	let listaDespesas = document.getElementById("listaDespesas")
    listaDespesas.innerHTML = ''
	despesas.forEach(function(d){

		//Criando a linha (tr)
		var linha = listaDespesas.insertRow();

		//Criando as colunas (td)
		linha.insertCell(0).innerHTML = d.nome

		//Ajustar o tipo
		switch(d.ambi){
			case '1': d.ambi = 'Ambiente Interno'
				break
			case '2': d.ambi = 'Ambiente Externo'
				break
			
		}
		linha.insertCell(1).innerHTML = d.ambi

        switch(d.qpessoas){
			case '1': d.qpessoas = 'Mesa para 1 pessoa'
				break
			case '2': d.qpessoas = 'Mesa para 2 pessoas'
				break
			case '3': d.qpessoas = 'Mesa para 3 pessoas'
				break
			case '4': d.qpessoas = 'Mesa para 4 pessoas'
				break
			case '5': d.qpessoas = 'Mesas para 5 pessoas'
				break
			case '6': d.qpessoas = 'Mesas para 6 pessoas'
				break
			case '7': d.qpessoas = 'Mesas para 7 pessoas'
				break
			case '8': d.qpessoas = 'Mesas para 8 pessoas'
				break
			case '9': d.qpessoas = 'Mesas para 9 pessoas'
				break
			case '10': d.qpessoas = 'Mesas para 10 pessoas'
				break
			case '11': d.qpessoas = 'Mesas para 11 pessoas'
				break
			case '12': d.qpessoas = 'Mesas para 12 pessoas'
				break
			case '13': d.qpessoas = 'Mesas para 13 pessoas'
				break
			case '14': d.qpessoas = 'Mesas para  pessoas'
				break
			case '15': d.qpessoas = 'Mesas para 5 pessoas'
				break
			case '16': d.qpessoas = 'Reservar o ambiente'
				break
        }
		linha.insertCell(2).innerHTML = d.qpessoas
		linha.insertCell(3).innerHTML = d.deco
		linha.insertCell(4).innerHTML = d.descricao
		linha.insertCell(5).innerHTML = d.valor

		
        let btn = document.createElement("button")
        btn.className = 'btn btn-danger btn-sm'
        btn.innerHTML = '<i class="fas fa-times"</i>'
        btn.id = `id_despesa_${d.id}`
        btn.onclick = function(){
            let id = this.id.replace('id_despesa_','')
            bd.remover(id)
            window.location.reload()
        }
        linha.insertCell(6).append(btn)
		
	})

 }
