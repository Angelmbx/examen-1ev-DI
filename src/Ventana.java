import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {

    JButton btLimpiar;
    JButton btSalir;
    JButton btProcesarFrase;
    TextField textField1; TextField textField2; TextField textField3; TextField textField4; TextField textField5; TextField textField6;
    JLabel jl1; JLabel jl2; JLabel jl3; JLabel jl4;JLabel jl5; JLabel jl6;
    Container contenedor;
    public Ventana(){
        contenedor = this.getContentPane();
        contenedor.setLayout(new BorderLayout());

        //Parte superior
        jl1 = new JLabel("Introduce una frase");
        textField1 = new TextField();
        JPanel panelNorte = new JPanel();
        panelNorte.setLayout(new GridBagLayout());
        GridBagConstraints cb = new GridBagConstraints();
        cb.gridx=0; cb.gridy=0; cb.gridheight=1; cb.gridwidth=1; cb.weightx=1; cb.weighty=1;
        panelNorte.add(jl1,cb);
        cb.gridx=1; cb.gridy=0; cb.gridheight=1; cb.gridwidth=1; cb.weightx=1; cb.weighty=1; cb.fill=MAXIMIZED_HORIZ;
        panelNorte.add(textField1, cb);
        contenedor.add(panelNorte, BorderLayout.NORTH);

        //centro
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout( new GridLayout(1,2));
        btProcesarFrase = new JButton("Procesar frase");
        btProcesarFrase.addActionListener(this);
        panelCentral.add(btProcesarFrase);


        jl2 = new JLabel("Numero de letras"); jl3 = new JLabel("Numero de palabras");
        jl4 = new JLabel("Invertir frase"); jl5 = new JLabel("Separar palabras"); jl6 = new JLabel("Primera posicion vocal");
        textField2 = new TextField(); textField3 = new TextField(); textField4 = new TextField(); textField5= new TextField(); textField6= new TextField();
        textField2.setEnabled(false); textField3.setEnabled(false); textField4.setEnabled(false); textField5.setEnabled(false); textField6.setEnabled(false);


        JPanel centroDerecha = new JPanel();
        centroDerecha.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx=0; c.gridy=0; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1;
        centroDerecha.add(jl2, c);
        c.gridx=1; c.gridy=0; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1; c.fill= MAXIMIZED_HORIZ;
        centroDerecha.add(textField2,c);
        c.gridx=0; c.gridy=1; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1;
        centroDerecha.add(jl3, c);
        c.gridx=1; c.gridy=1; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1; c.fill= MAXIMIZED_HORIZ;
        centroDerecha.add(textField3, c); textField3.setEnabled(false);
        c.gridx=0; c.gridy=2; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1;
        centroDerecha.add(jl4, c);
        c.gridx=1; c.gridy=2; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1; c.fill= MAXIMIZED_HORIZ;
        centroDerecha.add(textField4, c); textField4.setEnabled(false);
        c.gridx=0; c.gridy=3; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1;
        centroDerecha.add(jl5, c);
        c.gridx=1; c.gridy=3; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1; c.fill= MAXIMIZED_HORIZ;
        centroDerecha.add(textField5, c); textField5.setEnabled(false);
        c.gridx=0; c.gridy=4; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1;
        centroDerecha.add(jl6, c);
        c.gridx=1; c.gridy=4; c.weightx=1; c.weighty=1; c.gridwidth=1; c.gridheight=1; c.fill= MAXIMIZED_HORIZ;
        centroDerecha.add(textField6, c); textField6.setEnabled(false);

        panelCentral.add(centroDerecha);
        contenedor.add(panelCentral, BorderLayout.CENTER);

        //Parte inferior
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new GridLayout(1,2));
        btLimpiar= new JButton("Limpiar"); btSalir = new JButton("Salir");
        btLimpiar.addActionListener(this); btSalir.addActionListener(this);
        panelInferior.add(btLimpiar); panelInferior.add(btSalir);

        contenedor.add(panelInferior, BorderLayout.SOUTH);




        this.setVisible(true);
        this.setSize(500, 370);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(btSalir)){
            this.dispose();
        }

    }
}
