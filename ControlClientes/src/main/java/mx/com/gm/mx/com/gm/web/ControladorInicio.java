package mx.com.gm.mx.com.gm.web;

//import java.util.ArrayList;
import java.util.List;

//import com.sun.tools.sjavac.Log;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;
//import mx.com.gm.mx.com.gm.dao.IPersonaDao;
import mx.com.gm.mx.com.gm.domain.Persona;
import mx.com.gm.mx.com.gm.servicio.PersonaService;
@Controller
@Slf4j
public class ControladorInicio {
	//MODELO VISTA CONTROLADOR
	//ESTE ES EL CONTROLADOR

	//autowired es para inyectar objetos sin el new
	@Autowired
	private PersonaService personaService;
	
	@GetMapping("/")
	public String inicio(Model model) {
		List<Persona>personas = personaService.ListarPersonas();  

		model.addAttribute("personas", personas);
		 return "index";
	}

	@GetMapping("/agregar")
	public String agregar(Persona persona){
	return "modificar";
	}

	@PostMapping("/guardar")
	public String guardar (Persona persona){
		personaService.guardar(persona);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{idPersona}")
	public String editar (Persona persona, Model model){
	persona =	personaService.encontrarPersona(persona);
	model.addAttribute("persona", persona);
		return "modificar";
	}

	@GetMapping("/eliminar")
	public String eliminar (Persona persona){
	personaService.eliminar(persona);
	return "redirect:/";
	}
}
