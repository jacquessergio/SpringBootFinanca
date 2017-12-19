package br.com.boot.financa.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.boot.financa.model.Usuario;
import br.com.boot.financa.utils.ErrorTypeStyle;

@RestController
@RequestMapping("/api/financas/usuario")
public class UsuarioEndpoint {

	@Autowired
	private Usuario usuario;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> all() {

		return new ResponseEntity<>(Usuario.getListUsuario(), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> add(@RequestBody Usuario u) {

		Usuario.listUsuario.add(u);

		return new ResponseEntity<>(all(), HttpStatus.OK);
	}

	@RequestMapping(path = "/find/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable("id") Long id) {

		usuario.setId(id);
		int i = Usuario.listUsuario.indexOf(usuario);
		if (i == -1)
			return new ResponseEntity<>(new ErrorTypeStyle("Usuario não encontrado"), HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(Usuario.listUsuario.get(i), HttpStatus.OK);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> del(@PathVariable("id") Long id) {

		usuario.setId(id);
		int i = Usuario.listUsuario.indexOf(usuario);

		if (i == -1)
			return new ResponseEntity<>(new ErrorTypeStyle("Usuario não encontrado"), HttpStatus.NOT_FOUND);
		Usuario.listUsuario.remove(usuario);

		return new ResponseEntity<>(all(), HttpStatus.OK);

	}

}
