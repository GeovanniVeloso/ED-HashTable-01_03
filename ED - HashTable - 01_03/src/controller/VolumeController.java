package controller;

import javax.swing.JOptionPane;

import br.edu.fatec.zl.Lista;
import model.Barra;

public class VolumeController {

	Lista<Barra>[] hashTable = new Lista[5];
	
	Barra barra;
	
	public VolumeController() {
		int tamanho = hashTable.length;
		for (int i = 0; i < tamanho; i++) {
			hashTable[i] = new Lista<Barra>();
		}
	}
	
	public void calculaVolume() {
		int h = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura da barra."));
		int l = Integer.parseInt(JOptionPane.showInputDialog("Insira a largura da barra."));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o comprimento da barra."));
		
		Barra barra = new Barra(h, l, c, null);
		
		int v = hash();
		
		if(v>= 50 && v<=60) {
			Lista<Barra> andar = hashTable[0];
			barra.barraNome = "Para Bombons";
			if(andar.isEmpty()) {
				try {
					andar.addFirst(barra);
				} catch (Exception e) {
					System.err.println(e);
				}
			}else {
				try {
					andar.addLast(barra);
				} catch (Exception e) {
					System.err.println(e);
				}
			}
		}else {
			if(v>=100 && v<=110) {
				Lista<Barra> andar = hashTable[1];
				barra.barraNome = "Para Pavês";
				if(andar.isEmpty()) {
					try {
						andar.addFirst(barra);
					} catch (Exception e) {
						System.err.println(e);
					}
				}else {
					try {
						andar.addLast(barra);
					} catch (Exception e) {
						System.err.println(e);
					}
				}
			}else {
				if(v>=150 && v<=165) {
					Lista<Barra> andar = hashTable[2];
					barra.barraNome = "Para Brigadeiros";
					if(andar.isEmpty()) {
						try {
							andar.addFirst(barra);
						} catch (Exception e) {
							System.err.println(e);
						}
					}else {
						try {
							andar.addLast(barra);
						} catch (Exception e) {
							System.err.println(e);
						}
					}
				}else {
					if(v>=200 && v <=220) {
						Lista<Barra> andar = hashTable[3];
						barra.barraNome = "Para Bolos";
						if(andar.isEmpty()) {
							try {
								andar.addFirst(barra);
							} catch (Exception e) {
								System.err.println(e);
							}
						}else {
							try {
								andar.addLast(barra);
							} catch (Exception e) {
								System.err.println(e);
							}
						}
					}else {
						if(v>=260 && v<=280) {
							Lista<Barra> andar = hashTable[4];
							barra.barraNome = "Para Ovos de Páscoa";
							if(andar.isEmpty()) {
								try {
									andar.addFirst(barra);
								} catch (Exception e) {
									System.err.println(e);
								}
							}else {
								try {
									andar.addLast(barra);
								} catch (Exception e) {
									System.err.println(e);
								}
							}
						}else {
							System.err.println("Dimensões não encontradas.");
						}
					}
				}
			}
		}
	}
	
	public void consultaBarras() {
		
		for(int i = 0; i < 5; i++) {
			Lista<Barra> andar = hashTable[i];
			if(andar.isEmpty()) {
				System.out.println("Não existem barras com essa dimensão");
			}else {
				try {
					Barra barra = andar.get(0);
				} catch (Exception e) {
					System.err.println(e);
				}
				int size = andar.size();
				System.out.println("Existem "+size+" barras para fazer "+barra.getBarraNome());
			}
		}
		
	}
	
	private int hash() {
		int volume = barra.getAltura()*barra.getComprimento()*barra.getLargura();
		return volume;
	}

}
