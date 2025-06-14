package imb.progra2025.p2do4ta.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import imb.progra2025.p2do4ta.entity.Mensaje;
import imb.progra2025.p2do4ta.repository.MensajeRepository;

@Service
public class MensajeService {
	
	@Autowired
	private MensajeRepository repo;
	
	public List<Mensaje> arrayA() {
		List<Mensaje> mensajes = new ArrayList<>();
		
		Mensaje mensaje1 = new Mensaje();
		mensaje1.setCodigo(715);
		mensaje1.setContenido("Soy el mensaje 1");
		
		Mensaje mensaje2 = new Mensaje();
		mensaje2.setCodigo(560);
		mensaje2.setContenido("Soy el mensaje 2");
		
		Mensaje mensaje3 = new Mensaje();
		mensaje3.setCodigo(321);
		mensaje3.setContenido("Soy el mensaje 3");	
		
		mensajes.add(mensaje1);
		mensajes.add(mensaje2);
		mensajes.add(mensaje3);
		
		return mensajes;		
	}
	
	public List<Mensaje> arrayB() {
		List<Mensaje> mensajes = new ArrayList<>();
		
		Mensaje mensaje4 = new Mensaje();
		mensaje4.setCodigo(444);
		mensaje4.setContenido("Soy el mensaje 4");
		
		Mensaje mensaje5 = new Mensaje();
		mensaje5.setCodigo(555);
		mensaje5.setContenido("Soy el mensaje 5");
		
		Mensaje mensaje6 = new Mensaje();
		mensaje6.setCodigo(666);
		mensaje6.setContenido("Soy el mensaje 6");	
		
		mensajes.add(mensaje4);
		mensajes.add(mensaje5);
		mensajes.add(mensaje6);
		
		return mensajes;
	}
	
	public List<Mensaje> obtenerTodosLosMensajes(){
		return repo.findAll();
	}
	
}
