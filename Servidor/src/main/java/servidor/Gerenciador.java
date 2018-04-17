package servidor;

import org.springframework.web.bind.annotation.*;
import servidor.data.Cardapio;
import servidor.data.Cliente;
import servidor.data.Entrega;
import servidor.data.Produto;

@RestController
public class Gerenciador {

    @RequestMapping(value = "/cliente", method = RequestMethod.POST, consumes = "application/json")
    public Response cadastrarCliente(@RequestBody Cliente request) {
        return new Response("Nome -> " + request.getNome() + ", Id -> " + request.getIdCliente());
    }

    @RequestMapping(value = "/entrega", method = RequestMethod.POST, consumes = "application/json")
    public Response cadastrarEntrega(@RequestBody Entrega request) {
        return new Response("Nome do cliente -> " + request.getCliente().getNome() + ", Endereco -> " + request.getEndereco()
        + ", Id Pedido -> " + request.getPedido().getIdPedido());
    }

    @RequestMapping(value = "/produto", method = RequestMethod.POST, consumes = "application/json")
    public Response cadastrarProduto(@RequestBody Produto request) {
        return new Response("Produto -> " + request.getNome() + ", Preco -> " + request.getPreco());
    }

    @RequestMapping(value = "/cardapio", method = RequestMethod.POST, consumes = "application/json")
    public Response cadastrarCardapio(@RequestBody Cardapio request) {
        return new Response("Id cardapio cadastrado -> " + request.getIdCardapio());
    }

    @RequestMapping(value = "/cardapio/alterar", method = RequestMethod.POST, consumes = "application/json")
    public Response alterarCardapio(@RequestBody Cardapio request) {
        return new Response("Id cardapio alterado -> " + request.getIdCardapio());
    }
}
