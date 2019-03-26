package pe.farmaciasperuanas.fpsappwsaltacliente.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.farmaciasperuanas.fpsappwsaltacliente.facade.ClienteFacade;
import pe.farmaciasperuanas.fpsappwsaltacliente.model.ClienteDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping
public class ClienteRest {	

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final ClienteFacade clienteFacade;

    public ClienteRest(ClienteFacade clienteFacade) {
        this.clienteFacade = clienteFacade;
    }
    
    @PostMapping("creacliente")
    public String creacliente(@RequestBody ClienteDTO clienteDTO) {
        logger.info("=== (POST) /login START ===");
        logger.info(clienteDTO.toString());
        clienteFacade.creacliente(clienteDTO);
        return "OK";
    }

   /* @PostMapping("login")
    public Local login(@RequestBody Usuario usuario) {
        logger.info("=== (POST) /login START ===");
        logger.info(usuario.toString());
        Local localLogin = usuarioFacade.login(usuario);
        return localLogin;
    }

    @PostMapping("registrarUsuario")
    public Usuario registrarUsuario(@RequestBody Usuario usuario) throws Exception{
        logger.info("=== (POST) /registrarUsuario START ===");
        Usuario usuarioTmp= usuarioFacade.registrarUsuario(usuario);
        return usuarioTmp;
    }
    
    @GetMapping("hi")
    public String hi(){
        logger.info("=== (POST) /registrarUsuario START ===");
        return "Hi Joedayz";
    }*/

}