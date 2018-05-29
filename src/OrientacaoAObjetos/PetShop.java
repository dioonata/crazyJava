package OrientacaoAObjetos;

public class PetShop {
    public static void main(String[] args) {
        /*
        Cachorro cachorro = new Cachorro();
        
        cachorro.idade = 5;
        cachorro.nome = "cangula";
        cachorro.raca = "PitBull";
        cachorro.sexo = "Macho";
        
        System.out.println("Nome...: " +cachorro.nome);
        System.out.println("Idade..: " +cachorro.idade );
        System.out.println("Raça...: " +cachorro.raca);
        System.out.println("Machado: " +cachorro.sexo);
        
        System.out.println("");
        System.out.println("-----------------------------------");
        System.out.println("--------------Passeio--------------");
        */
        Pessoa p1 = new Pessoa();
        Caminhada caminhada = new Caminhada();
        
        p1.cachorro = new Cachorro();
        
        p1.cachorro.nome = "Cangula";
        
        p1.nome = "Dioônata";
        caminhada.andar(p1);
        
    }
}
