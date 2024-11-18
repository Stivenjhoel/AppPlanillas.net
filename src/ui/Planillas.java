package ui;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Empleado;

public class Planillas extends JFrame {
    Empleado empleado = new Empleado();
    JLabel lblMensaje, lblEmpleado, lblPC, lblIP, lblFecha, lblHora;
    thread thHora;

		public Planillas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 768);
        setLayout(null);
        setLocationRelativeTo(null);
        setUndecorated(true);

        JPanel pnlPlanilla = new JPanel();
		pnlPlanilla.setBounds(0, 0, 1024, 59);
		pnlPlanilla.setBackground(new Color(94, 17, 90));
        pnlPlanilla.setLayout(null);
		getContentPane().add(pnlPlanilla);
		
		JLabel imgLogo = new JLabel();
		imgLogo.setIcon( new ImageIcon( Login.class.getResource("/ui/img/logo.png") ) );
		imgLogo.setBounds(96, 4, 208, 43);
		pnlPlanilla.add(imgLogo);
		
		JLabel imgSalir = new JLabel();
		imgSalir.setIcon( new ImageIcon( Login.class.getResource("/ui/img/salir.png") ) );
		imgSalir.setBounds(370, 12, 24, 24);
		pnlPlanilla.add(imgSalir);
		
		JLabel lblMensaje = new JLabel("Dni :");
		lblMensaje.setBounds(20, 60 , 1024, 40);
		getContentPane().add(lblMensaje);
		
		JLabel lblEmpleado = new JLabel ("Password:");
		lblEmpleado.setBounds(20, 728 , 250, 30);
		getContentPane().add(lblEmpleado);

        lblHora = new JLabel();
        lblHora.setBounds(900, 728, 150, 30);
        getContentPane().add(lblHora);

		
        addWindowListener(new WindowAdapter() {
            @Override public void windowOpened(WindowEvent e){
                frame_windowOpened();}});
	}

    protected void frame_windowOpened(){
        lblMensaje.setText( String.format("Bienvenido %s, al sistema de planillas", empleado.getApelidoPaterno()));
        lblEmpleado.setText( String.format("Empleado : %s %s %s", empleado.getApellidoMaterno()));
        lblFecha.setText(new SimpleDateFormat("'Fecha : 'dd/mm/yyyy").format(new Date()));
    }

    public void setEmpleado(Empleado empleado){
       this.empleado = empleado;
    }
}
