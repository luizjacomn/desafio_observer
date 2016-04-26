package com.apsii.repository;

import java.util.List;

import com.apsii.model.Pedido;
import com.thoughtworks.xstream.XStream;

public class PedidosRepository {
	private XStream leitor;
	private List<Pedido> pedidos;

	public PedidosRepository() {
		initLeitorXML();
		pedidosXMLParaLista();
	}

	private void initLeitorXML() {
		leitor = new XStream();
		leitor.alias("pedidos", List.class);
		leitor.alias("pedido", Pedido.class);
	}

	@SuppressWarnings("unchecked")
	private void pedidosXMLParaLista() {
		pedidos = (List<Pedido>) leitor.fromXML(getClass().getResource("/novos-pedidos.xml"));
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
}