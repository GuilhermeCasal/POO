package POO_T10;

import java.util.*;

public class RandomTicketTester {
    public static void main(String[] args) {

        RandomTickets tickets = new RandomTickets();

        Festival f = new Festival(new Date(02, 8, 2022), new Date(06, 8, 2022), "MEO SUDOESTE", "Zambujeira do Mar", 13); 
        Festival g = new Festival(new Date(18, 06, 2022), new Date(26, 6, 2022), "Rock in Rio", "Zambujeira do Mar", 13);
        Festival h = new Festival(new Date(06, 07, 2022), new Date(9, 7, 2022), "NOS Alive", "Zambujeira do Mar", 13);
        Festival y = new Festival(new Date(14, 07, 2022), new Date(16, 7, 2022), "SP SR", "Zambujeira do Mar", 13);
        Festival i = new Festival(new Date(01, 07, 2022), new Date(2, 2, 2022), "Sumol", "Zambujeira do Mar", 13);
        Festival o = new Festival(new Date(02, 07, 2022), new Date(30, 7, 2022), "EDP", "Zambujeira do Mar", 13);
        

        List<Pessoa> r = new ArrayList<Pessoa>();        
        r.add(new Pessoa("Maria", 34317245, new DateYMD(12, 1, 2000)));
        r.add(new Pessoa("Carlos", 36331424, new DateYMD(1, 10, 2003)));
        r.add(new Pessoa("Marta", 35940012, new DateYMD(31, 3, 2002)));
        r.add(new Pessoa("Sofia", 34765901, new DateYMD(14, 7, 2000)));
        r.add(new Pessoa("Tiago", 35006531, new DateYMD(3, 6, 2001)));

        // selecionar aleatoriamente uma pessoa, que receberá em cada sorteio 1 ou 2 bilhetes para um dos festivais (escolhido aleatoriamente)
        // os bilhetes disponíveis estão listados no ficheiro 'Lista_festivais.txt'
        for (int i=0; i<2*r.size(); i++) {
            int ri = (int) (Math.random()*r.size());
            tickets.getRandomTicket(r.get(ri));
        }

        tickets.listPersons();
        tickets.listAvailableTickets();
    }
}
