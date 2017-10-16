function validar(campo) {
	if (campo.value == null || campo.value.length == 0
			|| /^\s+$/.test(campo.value)) {
		mostrarError(campo.id, "Error: Nombre Vacío");
	} else {
		borrarError(campo.id);
	}
}

function mostrarError(id, texto) {
	document.getElementById("sp" + id).innerHTML = texto;
}

function borrarError(id) {
	document.getElementById("sp" + id).innerHTML = "";
}

function validarOtro(campo) {
	if (campo.value == null || campo.value.length == 0
			|| /^\s+$/.test(campo.value)) {
		mostrarErrorOtro(campo.id, "Error: Appelidos Vacío");
	} else {
		borrarErrorOtro(campo.id);
	}
}

function mostrarErrorOtro(id, texto) {
	if (document.getElementById("error" + id) == null) {
		var parrafo = document.createElement("span");
		parrafo.id = "error" + id;
		parrafo.style = "color: red";
		parrafo.appendChild(document.createTextNode(texto));
		// inserto el span dentro del div después del input
		if (document.getElementById(id).nextSibling) {
			document.getElementById(id).parentNode.insertBefore(parrafo,
					document.getElementById(id).nextSibling);
		} else {
			document.getElementById(id).parentNode.appendChild(parrafo);
		}
	}
}

function borrarErrorOtro(id) {
	document.getElementById("dv" + id).removeChild(document.getElementById("error" + id));
}