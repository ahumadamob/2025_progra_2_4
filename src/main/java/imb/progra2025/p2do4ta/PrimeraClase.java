package imb.progra2025.p2do4ta;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeraClase {
	
	@GetMapping("/holamundo")
	public String holaMundo() {
		return "Hola Mundo!";
	}
	
	@GetMapping("/holamundojson")
	public List<String> holaMundoConJson() {
		List<String> jsonQueDevuelvo = new ArrayList<String>();
		jsonQueDevuelvo.add("Hola Mundo");
		jsonQueDevuelvo.add("Segundo mensaje");
		return jsonQueDevuelvo;
	}
	
	@GetMapping("/holamundoobjeto")
	public Mensaje conClaseMensaje(){
		Mensaje mensaje = new Mensaje();
		mensaje.setCodigo(715);
		mensaje.setContenido("Hola Mundo");
		return mensaje;
		
	}
	
	@GetMapping("/holamundoobjetoarray")
	public List<Mensaje> conClaseMensajeArray(){
		List<Mensaje> mensajes = new ArrayList<>();
		
		Mensaje mensaje1 = new Mensaje();
		mensaje1.setCodigo(715);
		mensaje1.setContenido("Hola Mundo");
		
		Mensaje mensaje2 = new Mensaje();
		mensaje2.setCodigo(560);
		mensaje2.setContenido("Bienvenidos");
		
		Mensaje mensaje3 = new Mensaje();
		mensaje3.setCodigo(321);
		mensaje3.setContenido("A la clase");	
		
		mensajes.add(mensaje1);
		mensajes.add(mensaje2);
		mensajes.add(mensaje3);
		
		return mensajes;

		
	}	
	
	

}
