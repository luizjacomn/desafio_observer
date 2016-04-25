package com.apsii.repository;

import java.io.File;
import java.util.List;

import com.apsii.model.Pedido;
import com.thoughtworks.xstream.XStream;

public class PedidosRepository {
	private XStream leitor;
	private String caminho;
	private List<Pedido> pedidos;

	public PedidosRepository(String caminho) {
		this.caminho = caminho;
		initLeitorXML();
		pedidosXMLParaLista();
	}

	private void initLeitorXML() {
		leitor = new XStream();
		leitor.alias("pedidos", List.class);
		leitor.alias("pedido", Pedido.class);
	}

	private void pedidosXMLParaLista() {
		pedidos = (List<Pedido>) leitor.fromXML(new File(caminho).getAbsolutePath());
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
}