Algoritmo sin_titulo
	Definir existencias Como Entero
	Definir entregadas Como Entero
	
	existencias <- 3200
	
	Mientras existencias>=100 Hacer
		Escribir 'Selecciona el nº de existencias'
		Leer entregadas
		existencias <- existencias-entregadas
		Escribir 'Existencias actuales: ',existencias
	FinMientras
	Escribir 'No existen existencias disponibles'
FinAlgoritmo
