package view;

import java.io.IOException;
import controller.SteamController;

public class Principal {

	public static void main(String[] args) {
		
		SteamController Executar = new SteamController();
		String Arquivo,Ano,Mes, Path;
		float Media;
		
		Arquivo = "SteamCharts.csv";
		 Path = "C:\\Windows\\Temp";
		 Ano = "2019";
		 Mes = "January";
		 Media = (float) 85;
		
		try {
			Executar.CriarArquivoNovo(Path, Arquivo, Ano, Mes);
			Executar.Media(Path, Arquivo, Ano, Mes, Media);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
