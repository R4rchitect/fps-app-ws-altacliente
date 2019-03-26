package pe.farmaciasperuanas.fpsappwsaltacliente.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import pe.farmaciasperuanas.fpsappwsaltacliente.assembler.cliente.ClienteAssembler;
import pe.farmaciasperuanas.fpsappwsaltacliente.entity.Cliente;
import pe.farmaciasperuanas.fpsappwsaltacliente.model.ClienteDTO;
import pe.farmaciasperuanas.fpsappwsaltacliente.service.ClienteService;

@Service
public class ClienteFacade {

    private final Logger logger = LoggerFactory.getLogger(getClass());
	
    public final ClienteService clienteService;

    public ClienteFacade(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    
    public void creacliente(ClienteDTO clienteDTO) {
        Cliente cliente = ClienteAssembler.fromDTO(clienteDTO);
        clienteService.creacliente(cliente);
    }
    
    
	
}
