package pe.farmaciasperuanas.fpsappwsaltacliente.assembler.cliente;

import pe.farmaciasperuanas.fpsappwsaltacliente.entity.Cliente;
import pe.farmaciasperuanas.fpsappwsaltacliente.model.ClienteDTO;

public class ClienteAssembler {
	
	public static Cliente fromDTO(ClienteDTO clienteDTO) {
		
		return Cliente.of(clienteDTO.getNombre(),clienteDTO.getApellido(),clienteDTO.getEdad(),clienteDTO.getFechaNacimiento());
		
	}

}
