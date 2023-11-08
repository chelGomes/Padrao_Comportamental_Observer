import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
    @Test
    void deveNotificarUmCliente() {
        Produto produto = new Produto("Smartwatch", 300, "relogio digital", "10");
        Cliente cliente = new Cliente("Ana", "av independencia");
        produto.lancarProduto(cliente);
        produto.lancarProduto();
        assertEquals("Aluno 1, nota lançada na Turma{ano=2021, semestre=1, nomeDisciplina='Algoritmos', nomeTurma='A'}", cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarCliente() {
        Produto produto = new Produto("PlayStation 5 (PS5)", 3000, "videogame", "110");
        Cliente cliente1 = new Cliente("Joao","rua rui barbosa");
        Cliente cliente2 = new Cliente("Jose","av andradas");
        cliente1.cadastrar(produto);
        cliente2.cadastrar(produto);
        produto.lancarProduto();
        assertEquals("Cliente 1, produto reservado {nomeProduto=PlayStation 5 (PS5), preco=3000, descricao='videogaeame', codigo='110'}", cliente1.getUltimaNotificacao());
        assertEquals("Cliente 2, produto reservado {nomeProduto=PlayStation 5 (PS5), preco=3000, descricao='videogaeame', codigo='110'}", cliente2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarCliente() {
        Produto produto = new Produto("Smartphone", 2500, "aparelho celular", "100");
        Cliente cliente = new Cliente("Joao","av getulio vargas");
        produto.lancarProduto();
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    void deveNotificarClientePrime() {
        Produto prime1 = new Produto("iPhone 13 Pro", 4000, "Smartphones", "500");
        Produto prime2 = new Produto("Apple Watch Series 7", 3500, "Smartwatches", "477");
        Cliente cliente1 = new Cliente("Alex","av rio branco");
        Cliente cliente2 = new Cliente("Maria","rua sao mateus");
        cliente1.cadastrar(prime1);
        cliente2.cadastrar(prime2);
        prime1.lancarProduto();
        assertEquals("Prime 1, produto prime reservado{nomeProduto=iPhone 13 Pro, preco=4000, descricao='Smartphones', codigo='500'}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}
