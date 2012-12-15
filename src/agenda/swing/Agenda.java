/*
 * Agenda.java
 *
 * Created on __DATE__, __TIME__
 */

package agenda.swing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author  __USER__
 */
public class Agenda extends javax.swing.JFrame {
	public static final ApplicationContext ac = new ClassPathXmlApplicationContext(
			"applicationContext.xml");
	/** Creates new form Agenda */
	public Agenda() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTextField1 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setTitle("Agenda");
		setUndecorated(true);

		jTextField1.setName("jTextUserName");

		jLabel1.setText("Username :");

		jLabel2.setText("Password :");

		jPasswordField1.setToolTipText("");
		jPasswordField1.setName("jPasswordPassword");

		jButton1.setText("Login");

		jButton2.setText("New User");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("New Company");
		jButton3.setToolTipText("");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24));
		jLabel3.setText("MultiOrganizer");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addComponent(
																														jLabel2,
																														javax.swing.GroupLayout.Alignment.LEADING,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														113,
																														Short.MAX_VALUE)
																												.addComponent(
																														jLabel1,
																														javax.swing.GroupLayout.Alignment.LEADING,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														113,
																														javax.swing.GroupLayout.PREFERRED_SIZE))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jPasswordField1,
																														javax.swing.GroupLayout.DEFAULT_SIZE,
																														184,
																														Short.MAX_VALUE)
																												.addComponent(
																														jTextField1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														184,
																														javax.swing.GroupLayout.PREFERRED_SIZE)))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addComponent(
																										jButton3,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										142,
																										Short.MAX_VALUE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jButton2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jButton1))))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(80, 80,
																		80)
																.addComponent(
																		jLabel3)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel3,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										51, Short.MAX_VALUE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														28,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(
														jLabel2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														25,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jPasswordField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(13, 13, 13)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(jButton2)
												.addComponent(jButton3))
								.addGap(34, 34, 34)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		NewUser newUser = new NewUser();
		newUser.setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Agenda().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}