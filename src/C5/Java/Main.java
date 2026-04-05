package C5.Java;

/**
 * 1. CLASSE ABSTRATA (CONCEITO DE HERANÇA)
 * Usamos 'abstract' para que ninguém possa criar um "Ninja" genérico.
 * Um ninja tem de pertencer a um clã específico.
 */
abstract class Ninja {
    // Atributo protegido: as subclasses (Uzumaki, Uchiha) podem aceder diretamente
    protected String nome;

    // CONSTRUTOR: Garante que o ninja já nasce com um nome
    public Ninja(String nome) {
        this.nome = nome;
    }

    /**
     * MÉTODO ABSTRATO (POLIMORFISMO)
     * Não definimos o que este método faz aqui.
     * Cada clã "promete" que vai implementar a sua própria versão.
     */
    public abstract void habilidadeEspecial();
}

/**
 * 2. SUBCLASSE UZUMAKI (HERANÇA)
 * 'extends' significa que Uzumaki herda tudo o que um Ninja tem.
 */
class Uzumaki extends Ninja {
    
    public Uzumaki(String nome) {
        super(nome); // Chama o construtor da classe pai (Ninja)
    }

    // @Override: Indica que estamos a sobrescrever o comportamento genérico
    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " usou o Rasengan! (Grande quantidade de Chakra)");
    }
}

/**
 * 3. SUBCLASSE UCHIHA
 */
class Uchiha extends Ninja {
    
    public Uchiha(String nome) {
        super(nome);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println(nome + " usou o Chidori! (Ataque de Relâmpago)");
    }
}

public class Main {
    /**
     * O método main deve ser sempre 'public static void'
     */
    public static void main(String[] args) {

        // Instanciando objetos usando Polimorfismo
        // Podemos declarar como 'Ninja' (tipo genérico) mas criar como 'Uzumaki' (tipo específico)
        Ninja naruto = new Uzumaki("Naruto Uzumaki");
        Ninja sasuke = new Uchiha("Sasuke Uchiha");

        // Executando os métodos
        naruto.habilidadeEspecial();
        sasuke.habilidadeEspecial();
    }
}
