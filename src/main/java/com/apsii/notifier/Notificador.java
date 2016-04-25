package com.apsii.notifier;

import java.util.List;

import com.apsii.listener.Listener;
import com.apsii.model.Pedido;

public interface Notificador {
	void registrarListener(Listener listener);
	void removerListener(Listener listener);
	void notificarListeners();
	void novosPedidos(List<Pedido> pedidos);
}
