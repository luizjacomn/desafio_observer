package com.apsii.listener;

import java.util.List;

import com.apsii.model.Pedido;
import com.apsii.notifier.Notificador;

public class FinanceiroListener implements Listener {

private Notificador notificador;
	
	public FinanceiroListener(Notificador notificador) {
		this.notificador = notificador;
		this.notificador.registrarListener(this);
	}

	public void atualizar(List<Pedido> pedidos) {
		System.out.println("---- Financeiro Pedidos ----");
		for (Pedido pedido : pedidos) {
			System.out.println(pedido.getDescricao() + " R$ " + pedido.getValor());
		}
	}

}
