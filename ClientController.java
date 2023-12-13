package Model;

public class ClientController {

	public static void main(String[] args) {

	}

public class ClientController {
	//Model Object
	//View Object
	private Model model;
	private ClientView view;
	
	public ClientController(Client model, ClientView view) {
		this.model = model;
		this.view = view;
}
	//control model object
	public void setNomeCliente(String nome) {
		model.setNome(nome);
		}
	public void setClienteTelefone(String Telefone) {
		model.Telefone(Telefone);
	}
	
	public String getClienteTelefone() {
		return model.Telefone();
	}
	
	public String getClienteNome() {
		return model.getNome();
	}
	
	//control view object
	public void updateView() {
		view.printClientDetails(model.getNome(), model.getTelefone());
	}
	
	}
}
