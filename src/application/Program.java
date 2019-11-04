package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import entidades.Empregado;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Empregado> lista = new ArrayList<>();
		String caminho = "C:\\temp\\comparable.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String empregadoCsv = br.readLine();
			while (empregadoCsv != null) {
				// vetor do tipo String com 2 campos splitados por vírgula
				String[] campos = empregadoCsv.split(",");
				lista.add(new Empregado(campos[0], Double.parseDouble(campos[1])));
				empregadoCsv = br.readLine();
			}

			Collections.sort(lista);
			// imprimindo por ordem de nome
			for (Empregado apelido : lista) {
				System.out.println(apelido.getNome() + ", R$" + String.format("%.2f",apelido.getSalary()));

			}

		} catch (IOException erro) {
			System.out.println("Erro" + erro.getMessage());
		}

	}

}	
