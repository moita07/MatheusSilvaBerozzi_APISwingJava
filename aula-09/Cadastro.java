import java.awt.GridLayout;
import javax.swing.*;

public class Cadastro extends JFrame {

    private JTextField campoNome;
    private JTextField campoEmail;
    private JTextField campoIdade;
    private JButton botao;

    public Cadastro() {
        super("Cadastro de Usuário");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        // definição do layout
        setLayout(new GridLayout(4, 2, 10, 10));

        // cria os rótulos (JLabel)
        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelEmail = new JLabel("Email: ");
        JLabel labelIdade = new JLabel("Idade: ");

        // cria os campos do texto
        campoNome = new JTextField();
        campoEmail = new JTextField();
        campoIdade = new JTextField();

        //cria os botões
        botao = new JButton("Cadastrar");

        // adiciona os componentes ao JFrame
        add(labelNome);
        add(campoNome);

        add(labelEmail);
        add(campoEmail);

        add(labelIdade);
        add(campoIdade);

        // espaço vazio para alinhar o layout
        add(new JLabel());
        add(botao);

        // ação do botão
        botao.addActionListener(e -> {
            String nome = campoNome.getText().trim();
            String email = campoEmail.getText().trim();
            String idade = campoIdade.getText().trim();

            if (nome.isEmpty() || email.isEmpty() || idade.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                "Campos obrigatórios!",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                "Usuário cadastrado: \n" +
                "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Idade: " + idade,
                "Cadastro realizado",
                JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setVisible(true);   
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Cadastro());
    }
}