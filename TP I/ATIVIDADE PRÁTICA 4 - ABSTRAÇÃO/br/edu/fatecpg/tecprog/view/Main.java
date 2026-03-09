package br.edu.fatecpg.tecprog.view;

import br.edu.fatecpg.tecprog.model.*;

public class Main {

	public static void main(String[] args) {
		Aguia america = new Aguia();
		america.tamanho = 70;
		america.velocidade = 80;
		america.idade = 6;
		america.visao = 4;
		america.cor = "Branco e Marrom";
		america.especie = "Águia careca";
		
		System.out.println("A águia associada aos EUA é a " + america.especie);
		america.Voar();
		
		Aguia melhor = new Aguia();
		melhor.tamanho = 99;
		melhor.velocidade = 100;
		melhor.idade = 22;
		melhor.visao = 4;
		melhor.cor = "Branco e Cinza";
		melhor.especie = "Hárpia Brasileira";
		
		System.out.println("A águia mais foda é a " + melhor.especie);
		melhor.Cacar();
		
		Elefante dumbo = new Elefante();
		dumbo.especie = "Grimpoteuthis";
		dumbo.cor = "Cinza";
		dumbo.tamanhoDaTromba = 4;
		dumbo.tamanhoDasOrelhas = 1000000000;
		dumbo.peso = 2;
		dumbo.presasDeMarfim = false;
		
		System.out.println("As orelhas do Dumbo tem " + dumbo.tamanhoDasOrelhas + "cm");
		dumbo.AgarrarObjetos();
	
		Elefante elefanteDoHoraDeAventura = new Elefante();
		elefanteDoHoraDeAventura.especie = "Guerra";
		elefanteDoHoraDeAventura.cor = "Rosa";
		elefanteDoHoraDeAventura.tamanhoDaTromba = 6;
		elefanteDoHoraDeAventura.tamanhoDasOrelhas = 80;
		elefanteDoHoraDeAventura.peso = 10;
		elefanteDoHoraDeAventura.presasDeMarfim = true;
		
		System.out.println("O elefante do hora de aventura é da cor " + elefanteDoHoraDeAventura.cor);
		dumbo.BeberAgua();
		
		Leao mufasa = new Leao();
		mufasa.cor = "Amarelo/Laranja";
		mufasa.altura = 120;
		mufasa.idade = 55;
		mufasa.peso = 190;
		
		System.out.println("Mufasa tinha " + mufasa.idade + "anos aparentemente");
		mufasa.Dormir();
		
		Leao alex = new Leao();
		alex.cor = "Amarelo/Laranja/Marrom";
		alex.altura = 300; //ele fica em pé
		alex.idade = 48;
		alex.peso = 127;
		
		System.out.println("Já que ele fica em pé, Alex tem " + alex.altura + "cm de altura");
		alex.Rugir();
		
		Tigre tigrao = new Tigre(); //do ursinho pooh
		tigrao.cor = "Laranja";
		tigrao.habitat = "Bosque dos cem Acres";
		tigrao.peso = 230;
		tigrao.altura = 182; //não é a altura dele
		tigrao.expectativaDeVida = 40; //sei lá, é uma pelucia, não um tigre de verdade
		tigrao.listrado = true;
		
		System.out.println("O Tigrão do ursinho pooh, mora no " + tigrao.habitat);
		tigrao.Nadar();
		
		Tigre diego = new Tigre(); //O tigre do era do gelo
		diego.cor = "Laranja";
		diego.habitat = "A Era do Gelo";
		diego.peso = 400;
		diego.altura = 120;
		diego.expectativaDeVida = 15; //usei a de um tigre real
		diego.listrado = false;
		
		System.out.println("Um tigre dente sabre como o Diego podia pesar cerca de " + diego.peso + "kg");
		diego.Cacar();
		
		Papagaio louroJose = new Papagaio();
		louroJose.corDasPenas = "Verde e Amarelo";
		louroJose.especie = "Fantoche";
		louroJose.idade = 28;
		louroJose.peso = 0.2;
		louroJose.tamanho = 30;
		louroJose.velocidade = 0;
	
		System.out.println("A primeira aparição do Louro José foi em 1997, ele tem " + louroJose.idade + "anos");
		louroJose.Cantar();
		
		Papagaio skully = new Papagaio(); //papagaio super nada importante de um desenho de peter pan
		skully.corDasPenas = "Verde, Amarelo, Azul, Vermelho";
		skully.especie = "Papagaio de Verdade";
		skully.idade = 7;
		skully.peso = 1.2;
		skully.tamanho = 40;
		skully.velocidade = 40;
	
		System.out.println("O papagaio super icônico e fácil de lembrar, Skully tem " + louroJose.idade + "anos");
		skully.Cantar();

		Pinguim cadumaveric = new Pinguim();
		cadumaveric.especie = "pinguim saltador da rocha";
		cadumaveric.altura = 1.30;
		cadumaveric.cor_plumagem = "preto e branco"; 
		cadumaveric.idade = 17; 
		cadumaveric.filhotes = 0;
		
		System.out.println("o cadu maveric é da raça " + cadumaveric.especie );
		cadumaveric.nadar();
		
		Pinguim rico = new Pinguim();
		cadumaveric.especie = "pinguim imperador";
		cadumaveric.altura = 0.70;
		cadumaveric.cor_plumagem = "preto e branco"; 
		cadumaveric.idade = 30; 
		cadumaveric.filhotes = 2;
		
		System.out.println("o cadu maveric é da raça " + cadumaveric.especie );
		rico.chocar_ovos();
		
		Gato felix  = new Gato();
		felix.raça = "vira lata";
		felix.idade = 3;
		felix.peso = 5.5;
		felix.cor_olhos = "preto";
		
		System.out.println("o gato felix tem os olhos da cor " + felix.cor_olhos );
		felix.caçar();
		
		Gato mimi  = new Gato();
		felix.raça = "persa";
		felix.idade = 10;
		felix.peso = 7.4;
		felix.cor_olhos = "azul";
		
		System.out.println("a gata mimi pesa " + mimi.peso );
		mimi.ronronar();
		
		Coelho pernalonga = new Coelho();
		pernalonga.tamanho_orelhas = 17.4;
		pernalonga.idade = 85;
		pernalonga.cor = "cinza";
		pernalonga.peso = 7.9;
		
		System.out.println("o perna longa tem " + pernalonga.idade + " anos");
		pernalonga.comer();
		
		Coelho coelhobranco = new Coelho();
		pernalonga.tamanho_orelhas = 10.0;
		pernalonga.idade = 7;
		pernalonga.cor = "branco";
		pernalonga.peso = 4.2;
		
		System.out.println("o coelho branco tem a cor " + coelhobranco.cor + " quem adivinharia");
		coelhobranco.correr();
		
		Raposa robinhood = new Raposa();
		robinhood.cor_pelo = "laranja";
		robinhood.especie = "raposa vermelha";
		robinhood.tamanho = 1.8;
		robinhood.habitat = "reino magico";
		
		System.out.println("o robinhood tem " + robinhood.tamanho + " de altura");
		robinhood.caçar();
		
		Raposa tails = new Raposa();
		tails.cor_pelo = "laranja";
		tails.especie = "raposa vermelha";
		tails.tamanho = 0.80;
		tails.habitat = "greenhill zone";
		
		System.out.println("o tails mora no habitat " + tails.habitat );
		tails.correr();
		
		Cavalo spirit = new Cavalo();
		spirit.raça = "mustang";
		spirit.cor_pelagem = "bege";
		spirit.tamanho = 2.7;
		
		System.out.println("o cavalo spirit é da raça " + spirit.raça);
		spirit.galopar();
		
		Cavalo pédepano = new Cavalo();
		pédepano.raça = "mustang";
		pédepano.cor_pelagem = "branco";
		pédepano.tamanho = 2.3;
		
		System.out.println("o cavalo pé de pano tem a cor " + pédepano.cor_pelagem);
		pédepano.saltar();
	}

}
