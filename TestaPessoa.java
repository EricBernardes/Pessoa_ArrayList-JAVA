import java.util.ArrayList;
public class TestaPessoa{
  public static void main(String[] args){
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("Eric", "99999999"));
    pessoas.add(new Pessoa("Pedro", "99999999"));
    pessoas.add(new Pessoa("Joao", "99999999"));

    Pessoa p = new Pessoa("Caio", "99999999");
    pessoas.add(p);
    pessoas.add(p);
    pessoas.add(p);

    System.out.println(pessoas);

    /*System.out.println(pessoas.get(3)); //vai ser printado o objeto na posição 3, asssim por diante nas debaixo
    System.out.println(pessoas.get(4)); 
    System.out.println(pessoas.get(5));*/

    pessoas.remove(5); //o método remove passando o indice

    //System.out.println(pessoas.get(5)); //Não existe mais esse objeto para imprimir

    pessoas.remove(pessoas.get(4)); //método remove passando o endereço do objeto

    //System.out.println(pessoas.get(4)); //Não existe esse objeto para imprimir

    System.out.println(pessoas);

    /*Pessoa p = new Pessoa("Pedro", "9999999999");
	    System.out.println(p.getNome());
	    System.out.println(p.getTelefone());
    Pessoa p2 = new Pessoa();
        p2.setNome("Joao");
        p2.setTelefone("99999999978");
		System.out.println(p2.getNome());
	    System.out.println(p2.getTelefone());*/
  } 
}
