package br.com.thalles;

import br.com.thalles.dao.ClientMapDAO;
import br.com.thalles.dao.ClienteSetDAO;
import br.com.thalles.dao.IClienteDAO;
import br.com.thalles.domain.Cliente;

import javax.swing.*;

public class App {

    private static  IClienteDAO iClienteDAO;

    public static void main(String arg[]){

        iClienteDAO = new ClienteSetDAO();

        String opcao = JOptionPane.showInputDialog(null,
                "Digite 1 para cadastro, 2 para consulta, 3 para excluir, 4 para alterar ou 5 para sair",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);


        while (!isOpcaoValida(opcao)){
            if("".equals(opcao)){
                sair();
        }
            opcao = JOptionPane.showInputDialog(null,
                    "Opção inválida, digite 1 para cadastro, 2 para consulta, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

        while (isOpcaoValida(opcao)){
            if (isOpcaoSair(opcao)){
                sair();
            } else if (isOpcaoCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite os dados do cliente separados por vírgula, conforme o exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                cadastrar(dados);

                
            } else if (isConsultar(opcao)) {
                String dados = JOptionPane.showInputDialog(null, "Digite o CPF para consultar os dados do Cliente",
                        "Consultar", JOptionPane.INFORMATION_MESSAGE);
               consultar(dados);
            } else if (isEcluir(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite o CPF do cliente",
                        "Consulta cliente", JOptionPane.INFORMATION_MESSAGE);
                excluir(dados);
            } else if (isAlterar(opcao)) {
                String dados = JOptionPane.showInputDialog(null,
                        "Digite os dados do cliente separados por vígula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado",
                        "Atualização", JOptionPane.INFORMATION_MESSAGE);
                alterar(dados);
            }
            opcao = JOptionPane.showInputDialog(null,
                    "Digite 1 para cadastro, 2 para consulta, 3 para excluir, 4 para alterar ou 5 para sair",
                    "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private static void alterar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente =new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        iClienteDAO.alterar(cliente);
    }

    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso: ", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
    }


    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado encontrado" , "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }



    private static void cadastrar(String dados) {
        String[] dadosSeparados = dados.split(",");
        Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
        Boolean isCadastrado = iClienteDAO.cadstrar(cliente);
        if (isCadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }



    private static void sair() {
        JOptionPane.showMessageDialog(null, "Até logo!", "EROO", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static boolean isOpcaoSair(String opcao) {
        if("5".equals(opcao)){
            return true;
        }
        return false;
    }

   private  static boolean isAlterar(String opcao){
        if("4".equals(opcao)){
            return true;
        }
        return false;
   }

    private static boolean isEcluir(String opcao) {
        if ("3".equals(opcao)) {
            return true;
        }
        return false;
    }

    private static boolean isConsultar(String opcao) {
        if("2".equals(opcao)){
            return true;
        }
        return false;
    }

    private  static boolean isOpcaoCadastro(String opcao) {
        if ("1".equals(opcao)){
            return true;
        }
        return false;
    }


    private static boolean isOpcaoValida(String opcao) {
        if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)){
            return true;
        }
        return false;
    }


}

