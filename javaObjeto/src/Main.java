import javax.swing.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {
//        Pessoa p;
//        p = new Pessoa("Agenor", 60);

//        p.nome = "Cristiano";
//        System.out.println(p.nome);
////        p.nome = "Paqueta";
////        System.out.println(p.nome);
////        p.nome = "Ney";
////        System.out.println(p.nome);
//
//        p.setNome("Alex");
//        p.setIdade(18);
//        System.out.println(p.getNome());
//        System.out.println(p.getIdade());
//        p.setNome("Rodrigues");
//        p.setIdade(4);
//        String nome = p.getNome();
//        System.out.println(nome);
//        System.out.println(p.getIdade());

//        String nome = JOptionPane.showInputDialog("Nome: ");
//        int idade = Integer.parseInt(
//                JOptionPane.showInputDialog("Idade: "));
//        Pessoa p = new Pessoa(nome,idade);
//        pessoas.add(p);
//        System.out.println(pessoas);
//        System.out.println(pessoas.get(0).getNome());
//        System.out.println(pessoas.get(0).getIdade());

        for (int i = 0; i < 3; i++) {
            String nome = JOptionPane.showInputDialog("Nome: ");
            int idade = Integer.parseInt(
                    JOptionPane.showInputDialog("Idade: "));
            Pessoa p = new Pessoa(nome,idade);
            pessoas.add(p);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(pessoas.get(i).getNome());
            System.out.println(pessoas.get(i).getIdade());
        }
        }
        }
