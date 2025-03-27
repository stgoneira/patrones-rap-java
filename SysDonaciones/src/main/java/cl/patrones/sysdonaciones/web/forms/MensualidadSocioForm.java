package cl.patrones.sysdonaciones.web.forms;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class MensualidadSocioForm extends DonacionFormBase {

	String rut;	
	
	public MensualidadSocioForm() {
		super();
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	
}
