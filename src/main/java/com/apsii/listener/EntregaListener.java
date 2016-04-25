package com.apsii.listener;

import java.util.List;

import com.apsii.model.Pedido;
import com.apsii.notifier.Notificador;

public class EntregaListener implements Listener {
	
	private Notificador notificador;
	
	public EntregaListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}

	public void atualizar(List<Pedido> pedidos) {
		System.out.println("---- Entregar Pedidos ----");
		for (Pedido pedido : pedidos) {
			System.out.println(pedido.getDescricao() + " R$ " + pedido.getValor());
		}
	}

}
