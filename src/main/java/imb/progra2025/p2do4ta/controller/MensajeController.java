package imb.progra2025.p2do4ta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import imb.progra2025.p2do4ta.entity.Mensaje;
import imb.progra2025.p2do4ta.service.MensajeService;

@RestController
public class MensajeController {

	@Autowired
	private MensajeService service;	

	@GetMapping("/holamundoobjetoarraya")
	public List<Mensaje> conClaseMensajeArrayA(){
		List<Mensaje> mensajes = service.arrayA();
		return mensajes;

		
	}
	
	@GetMapping("/holamundoobjetoarrayb")
	public List<Mensaje> conClaseMensajeArrayB(){
		List<Mensaje> mensajes = service.arrayB();
		
		return mensajes;

		
	}
	
	@GetMapping("/holamundoobjetoarrayc")
	public List<Mensaje> conClaseMensajeArrayC(){
		List<Mensaje> mensajes = new ArrayList<>();
		mensajes.addAll(service.arrayA());
		mensajes.addAll(service.arrayB());		
		return mensajes;

		
	}
	

	@GetMapping("/mensajes")
	public List<Mensaje> ObtenerTodosLosMensajes(){
		List<Mensaje> mensajes = new ArrayList<>();
		mensajes = service.obtenerTodosLosMensajes();		
		return mensajes;
		
	}	
	
	

}
