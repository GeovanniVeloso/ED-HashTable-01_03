package view;

import javax.swing.JOptionPane;

import controller.VolumeController;

public class Principal {

	public static void main(String[] args) {
		int c = 0;
		
		VolumeController vc = new VolumeController();

		while (c != 3) {
			c = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite 1 para adicionar uma barra \n Digite 2 para listar as barras cadastradas \n Digite 3 para sair."));
			
			switch (c) {
			case 1:
				vc.calculaVolume();
				break;
			case 2:
				vc.consultaBarras();
				break;
			case 3:
				System.out.println("Finlizando...");
			default:
				System.err.println("Opção não encontrada.");
				break;
			}
		}

	}

}
