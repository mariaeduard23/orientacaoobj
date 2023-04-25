package aplicacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Produtos produto = new Produtos();
		
		System.out.println("Nome do produto: ");
		produto.produto = teclado.next();
		
		System.out.println("Insira a quantidade: ");
		produto.quantidade = teclado.nextDouble();
		
		System.out.println("Insira o Preço individual: ");
		produto.preco = teclado.nextDouble();

		System.out.println("Confirmação: "+produto.produto+", Estoque: "+produto.quantidade+" Preço: "+produto.preco);
		
		System.out.println("Deseja adicionar produtos ao estoque? ");
		int estoque = teclado.nextInt();
		produto.addProdutos(estoque);
		System.out.println("Atualização: "+produto.produto+", Estoque atual: "+produto.quantidade+" Preço: "+produto.preco);
		
		System.out.println("Foi realizada alguma venda? ");
		estoque = teclado.nextInt();
		produto.subProdutos(estoque);
		System.out.println("Atualização após vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+" Preço: "+produto.preco+" Valor atual o estoque: R$ "+produto.quantidade*produto.preco);
		
		JOptionPane.showMessageDialog(null, "Atualização após vendas: "+produto.produto+", Estoque atual: "+produto.quantidade+" Preço: "+produto.preco+" Valor atual o estoque: R$ "+produto.quantidade*produto.preco);
		
		teclado.close();

	}

}
