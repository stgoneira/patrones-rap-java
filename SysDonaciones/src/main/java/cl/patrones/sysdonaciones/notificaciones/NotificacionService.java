package cl.patrones.sysdonaciones.notificaciones;

import org.springframework.stereotype.Service;

@Service
public class NotificacionService {

	public void notificar(String transaccionId) {
		System.out.println("Enviando email....");
	}
}
