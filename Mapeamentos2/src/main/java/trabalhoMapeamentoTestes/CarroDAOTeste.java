package trabalhoMapeamentoTestes;

import trabalhoMapeamento.Carro;
import trabalhoMapeamentoDAO.CarroDAO;
//import javax.persistence.*;

public class CarroDAOTeste {
    public static void main(String[] args) {
        CarroDAO carroDAO = new CarroDAO();
        
        // Criando um carro e salvando
        Carro carro1 = new Carro(1, "Toyota", "Corolla", 2020);
        carroDAO.salvar(carro1);
        System.out.println("Carro salvo: " + carro1.getModelo());

        // Buscando um carro
        Carro carroBuscado = carroDAO.buscar(1);
        System.out.println("Carro buscado: " + (carroBuscado != null ? carroBuscado.getModelo() : "não localizado"));

        // Atualizando um carro
        carro1.setAno(2030); // Mudando o ano do carro
        carroDAO.atualizar(carro1);
        System.out.println("Carro atualizado: " + carroDAO.buscar(1).getAno());

        // Excluindo um carro
        carroDAO.excluir(1);
        System.out.println("Carro excluído: " + (carroDAO.buscar(1) == null ? "sucesso" : "falha"));
    }
}
