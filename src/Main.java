import Cards.*;
import Users.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        int i;
        String playerName, playChoice;
        ArrayList<Card> cardsAux;
        Card aux;
        int championPoints =0 ;
        ArrayList<String> champion = new ArrayList<String>();
        UserFactory userFactory;

        ArrayList<User> Players = new ArrayList<User>();
        Deck singleDeck = Deck.getInstance();

        System.out.print("Bem vindos ao Blackjack Versus!\n");

        // SETUP DE JOGO
        System.out.print("Quantos pessoas querem jogar? (2-4)\n");
        int players = new Scanner(System.in).nextInt();
        if(players <2 || players > 4){
            System.out.print("Número de jogadores invalido.\n");
            return;
        }

        for(i=1; i<= players; i++)
        {
            System.out.print("Qual o nome do jogador "+ i +"?\n");
            playerName = new Scanner(System.in).next();
            Players.add(UserFactory.getUser(playerName));
        }

        //Loop principal
        while(true)
        {

            championPoints =0;
            champion.clear();
            System.out.print("\n\nEmbaralhando e distribuindo cartas...\n\n");

            // IMPLEMENTAR SINGLEDECK.ShuffleDeck()
            singleDeck.ShuffleDeck();

            // Distribui cartas iniciais
            for(User player : Players)
            {
                player.addCard(singleDeck.popCard());
                player.addCard(singleDeck.popCard());
                cardsAux = player.getCards();
                System.out.print(player.getName() + " possui as seguintes cartas:\n");
                System.out.print(cardsAux.get(0).getName() + " de " + cardsAux.get(0).getSuit()+ " e " + cardsAux.get(1).getName() + " de " + cardsAux.get(1).getSuit()+ " = "+ player.getHandValue() + "\n\n");
            }

            // LOGICA DE JOGO
            for(User player : Players)
            {
                System.out.print("\n\n");
                while(true)
                {
                    cardsAux = player.getCards();
                    System.out.print(player.getName() + " possui as seguintes cartas:\n");
                    i = 0;
                    for(Card card: cardsAux){
                        System.out.print("["+ cardsAux.get(i).getName() + " de " + cardsAux.get(i).getSuit()+"] ");
                        i++;
                    }
                    System.out.print("= " + player.getHandValue() + " pontos.\n");

                    if(player.getHandValue() == 21){
                        System.out.print("[BLACKJACK] "+ player.getName() + " fez exatamente 21 pontos!\n\n");
                        break;
                    }
                    if(player.getHandValue() > 21){
                        System.out.print("[PERDEU] "+ player.getName() + " fez mais de 21 pontos e perdeu.\n\n");
                        break;
                    }

                    System.out.print("Quer comprar mais uma carta?('y' ou 'n')\n");
                    playChoice = new Scanner(System.in).next();

                    if(playChoice.equalsIgnoreCase("n"))
                    {
                        break;
                    }
                    else if(playChoice.equalsIgnoreCase("y"))
                    {
                        aux = singleDeck.popCard();
                        System.out.print("Carta comprada: "+ aux.getName() +" de " +aux.getSuit()+"\n");
                        player.addCard(aux);
                    }
                }
            }

            for(User player : Players)
            {
                if(player.getHandValue()>championPoints && player.getHandValue() <= 21) {
                    championPoints = player.getHandValue();
                    champion.clear();
                    champion.add(player.getName());
                }else if(player.getHandValue() == championPoints && player.getHandValue() <= 21){
                    champion.add(player.getName());
                }
            }


            if(champion.size() == 1){
                System.out.println("O vencedor foi " + champion.get(0) + ", com a pontuação de: " + championPoints + "\n");
            } else if(champion.size() > 1 && championPoints!=0){
                System.out.println("Houve um empate, os vencedores foram: \n");
                for(int j = 0 ; j< champion.size() ; j++) {
                    System.out.println(champion.get(j) + "\n");
                }
                System.out.println("Com a pontuação de :" + championPoints + "\n");
            } else if ( championPoints == 0){
                System.out.println("Não houve vencedores! \n");
            }

            // FIM DE JOGO


            System.out.print("Quer jogar denovo?('y' ou 'n')\n");
            playChoice = new Scanner(System.in).next();

            if(playChoice.equalsIgnoreCase("n")){
                System.out.print("\n\nObrigado por jogar nosso Blackjack!\n\n");
                break;
            }
            else if(playChoice.equalsIgnoreCase("y")){
                for (User player : Players){
                    singleDeck.insertCardsBack(player.removeCards());
                }
            }
        }


    }
}
