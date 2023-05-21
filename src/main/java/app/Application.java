package app;

import model.Endereco;
import service.ViaCepService;

public class Application {
    public static void main(String[] args) {

        ViaCepService viaCepService = new ViaCepService();

        Endereco endereco = viaCepService.getEndereco("95625000");

        System.out.println(endereco.toString());
    }
}
