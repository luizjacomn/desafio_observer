import com.apsii.listener.EntregaListener;
import com.apsii.listener.FinanceiroListener;
import com.apsii.notifier.Notificador;
import com.apsii.notifier.NotificadorPedidos;
import com.apsii.repository.PedidosRepository;

public class TesteEntrega {
	public static void main(String[] args) {
		Notificador notificador = new NotificadorPedidos();
		new EntregaListener(notificador);
		new FinanceiroListener(notificador);
		PedidosRepository pedidosRepository = new PedidosRepository("../src/main/resources/novos-pedidos.xml");
		notificador.novosPedidos(pedidosRepository.getPedidos());
	}
}
