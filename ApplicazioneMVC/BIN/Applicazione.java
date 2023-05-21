

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Applicazione extends JFrame{
    static final int LUNGHEZZA_APPLICAZIONE= 1000;
    static final int ALTEZZA_APPLICAZIONE= 500;
    static final int LARGHEZZA_BOTTONE=70;
    static final int ALTEZZA_BOTTONE=50;

    String proprietarioCarta;
    double saldo;
    
    JTextField txtnumUtente = new JTextField();
    JLabel datiLabel = new JLabel("Visualizza i dati della Carta: ");
    JLabel datiCarta = new JLabel("");
    JLabel sAtt = new JLabel();

    JButton visualizzaCarta = new JButton("Visualizza Carta");
    JButton versamento = new JButton("Versamento");
    JButton pagamento = new JButton("Pagamento");
    JButton visualizzaSaldoAtt = new JButton("Visualizza saldo attuale");

    Container contentPane;


    public Applicazione(){
        super("Conto Corrente");
        this.setSize(LUNGHEZZA_APPLICAZIONE, ALTEZZA_APPLICAZIONE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.proprietarioCarta= "anonimo";
        this.saldo= 100.00;
        aperturaApplicazione();
        aggiungiListener();

    }

    public Applicazione(String pro, double s){
        super("Conto Corrente");
        this.setSize(LUNGHEZZA_APPLICAZIONE, ALTEZZA_APPLICAZIONE);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.proprietarioCarta= pro;
        this.saldo= s;
        aperturaApplicazione();
        aggiungiListener();
         
    }

    public void aperturaApplicazione(){
        this.setResizable(false);

        JLabel titolo = new JLabel("Visualizza i dati della Carta: ");
        titolo.setFont(new Font("Arial", Font.PLAIN, 25 ));
        titolo.setHorizontalAlignment(SwingConstants.CENTER);
        titolo.setBorder(new EmptyBorder(40, 0, 0, 0));
        
        JPanel datiSx = new JPanel(new GridLayout(2, 2));
        
        JLabel prop = new JLabel("Proprietario della carta: ");
        prop.setFont(new Font("Arial", Font.PLAIN, 15));
        
        JLabel saldoAtt = new JLabel("Saldo attuale: ");
        saldoAtt.setFont(new Font("Arial", Font.PLAIN, 15 ));
        saldoAtt.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel pro = new JLabel(); //contenuto proprietario carta
        pro.setText(proprietarioCarta);
        pro.setFont(new Font("Arial", Font.PLAIN, 15 ));
        
        sAtt.setText(Double.toString(saldo));
        sAtt.setFont(new Font("Arial", Font.PLAIN, 15 ));
        
        datiSx.add(prop);
        datiSx.add(pro);
        
        datiSx.add(saldoAtt);
        datiSx.add(sAtt);

        JPanel datiDx = new JPanel();
        datiDx.setBorder(new EmptyBorder(95, 0, 0, 30));
        txtnumUtente.setPreferredSize(new Dimension(600, 200));
        txtnumUtente.setFont(new Font("Arial", Font.PLAIN, 15));
        datiDx.add(txtnumUtente);
        txtnumUtente.setBorder(new LineBorder(Color.BLACK));

        JPanel bottoni = new JPanel(new GridLayout(1, 3));
        

        bottoni.add(versamento);
        bottoni.add(pagamento);
        bottoni.add(visualizzaSaldoAtt);


        this.getContentPane().add(datiDx, BorderLayout.EAST);
        this.getContentPane().add(datiSx, BorderLayout.WEST);
        this.getContentPane().add(titolo, BorderLayout.NORTH);
        this.getContentPane().add(bottoni, BorderLayout.SOUTH);

    }

    public void aggiungiListener(){
        versamento.addActionListener(new ApplicazioneListener());
        pagamento.addActionListener(new ApplicazioneListener());
        visualizzaSaldoAtt.addActionListener(new ApplicazioneListener());
    }

    public void versamentoApplicazione(){
        saldo+= (Double.parseDouble(txtnumUtente.getText())); //Prende in input un double
        sAtt.setText(Double.toString(saldo));
    }

    public void pagamentoApplicazione(){
        if(saldo>=Double.parseDouble(txtnumUtente.getText())){
            saldo-=Double.parseDouble(txtnumUtente.getText());
            sAtt.setText(Double.toString(saldo));
        }
    }

    public void visualizzazioneApplicazione(){
        txtnumUtente.setText(Double.toString(saldo));
    }

    public class ApplicazioneListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton button = (JButton) e.getSource(); //serve a salvare il nome del pulsante premuto

            if(button.getActionCommand().equals("Versamento")){ //per vedere se il bottone selezionato è Versamento
                System.out.println("Versamento");
                versamentoApplicazione();
            }else if((button.getActionCommand().equals("Pagamento"))){
                System.out.println("Pagamento");
                pagamentoApplicazione();
            }else{
                System.out.println("Visualizza");
                visualizzazioneApplicazione();
            }
        }
    }

}

