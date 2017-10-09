/**
 * 
 */

var aleatorio = 0;
var intentos = 1;

function init() {
	var var1 = "Usu";
	var var2 = "Apel";

	var var3 = 5 / 0;

	var var4 = "4";
	var var5 = "5";

	// alert("Yo soy " + var1);
	// alert("Mis apellidos + 2 es igual a " + (var2 + 2));
	// alert("5/0= " + var3);
	// alert("4*5= " + (var4 + var5));

	aleatorio = parseInt(Math.random() * 10) + 1;
}

function calcularEdad() {
	var nombre = document.getElementById("nombre").value;
	var edad = document.getElementById("edad").value;

	var dias = edad * 365;

	document.getElementById("resultado").innerHTML = nombre + " tiene " + edad
			+ " años y en días son " + dias;
}

function calcularMayor(num1, num2) {
	var mensaje = "";
	if (num1 > num2) {
		mensaje = num1 + " es mayor que " + num2;
	} else if (num2 > num1) {
		mensaje = num2 + " es mayor que " + num1;
	} else {
		mensaje = num2 + " es igual que " + num1;
	}
	document.getElementById("mensaje").innerHTML = mensaje;
}

function mostrarFrase(frase, contador) {
	var texto = "";
	var i = 1;
	// while (i<=contador) {
	// texto += frase + "<br />";
	// i++;
	// }

	for (var j = 1; j <= contador; j++) {
		texto += frase + "<br />";
	}

	document.getElementById("mensaje2").innerHTML = texto;
}

function mostrarFacto() {
	var num = document.getElementById("facto").value;
	var fact = 1;
	for (var i = 1; i <= num; i++) {
		fact = fact * i;
	}
	document.getElementById("resFacto").innerHTML = fact;
}

function calcularPotencia() {
	var base = document.getElementById("base").value;
	var exponente = document.getElementById("exponente").value;
	var potencia = Math.pow(base, exponente);
	document.getElementById("potencia").innerHTML = potencia;
}

function adivinarNumero(numero) {
	if (intentos <= 5) {
		if (numero < aleatorio)
			document.getElementById("mensajeAdivinar").innerHTML = "El número es mayor";
		else if (numero > aleatorio)
			document.getElementById("mensajeAdivinar").innerHTML = "El número es menor";
		else
			document.getElementById("mensajeAdivinar").innerHTML = "Encontrado en "
					+ intentos + " intentos";
		intentos++;
	} else {
		document.getElementById("mensajeAdivinar").innerHTML = "No tiene más intentos";
	}
}

var contador = 0;
var suma = 0;

function calcularRepetido(numero) {
	if (numero != 9999) {
		contador++;
		suma += parseInt(numero);
	} else {
		// mostrar contador en el span resultadoRep
		document.getElementById("resultadoRep").innerHTML = "Nº Introducidos: "
				+ contador + "\nSuma: " + suma;

		contador = 0;
		suma = 0;

		document.getElementById("calcularRep").disabled = true;
	}
}

function reiniciarRepetido() {
	contador = 0;
	suma = 0;
	document.getElementById("calcularRep").disabled = false;
	document.getElementById("numrep").value = "";
	document.getElementById("numrep").focus();
}