package com.apsii.notifier;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.apsii.listener.Listener;
import com.apsii.model.Pedido;

public class NotificadorPedidos implements Notificador {

	private Set<Listener> listeners;
	private List<Pedido> novosPedidos;
	
	public NotificadorPedidos() {
		listeners = new HashSet<Listener>();
	}
	
	public void registrarListener(Listener listener) {
		listeners.add(listener);
	}

	public void removerListener(Listener listener) {
		listeners.remove(listener);
	}

	public void notificarListeners() {
		for (Listener listener : listeners) {
			listener.atualizar(novosPedidos);
		}
	}
		
	public void novosPedidos(List<Pedido> pedidos) {
		novosPedidos = pedidos;
		notificarListeners();
	}

}
