package com.apsii.listener;

import java.util.List;

import com.apsii.model.Pedido;

public interface Listener {
	
	void atualizar(List<Pedido> pedidos);
	
}
