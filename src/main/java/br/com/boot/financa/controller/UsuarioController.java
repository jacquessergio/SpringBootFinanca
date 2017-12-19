package br.com.boot.financa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.boot.financa.model.Usuario;

@Controller
@RequestMapping("/financas/usuario")
public class UsuarioController {

	@Autowired
	private Usuario usuario;
	
	@RequestMapping(method=RequestMethod.POST, produces = "text/html")
	public ModelAndView add(@ModelAttribute Usuario u) {
		
		Usuario.listUsuario.add(u);
		
		return new ModelAndView("redirect:/financas/usuario");
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String all(Model model) {

		List<Usuario> u = Usuario.listUsuario;
		
		model.addAttribute("listaUsuario", u);

		return "/index";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/{id}")
	public ModelAndView del(@PathVariable("id") Long id) {
		
		usuario.setId(id);
		Usuario.listUsuario.remove(usuario);
		
		return new ModelAndView("redirect:/financas/usuario");
	}

	
}
