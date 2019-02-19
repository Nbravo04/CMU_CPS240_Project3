package theDinerMenu;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JEditorPane;

public class TheDinerGui extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup HotSuaceGroup = new ButtonGroup();
	private final ButtonGroup EggStyleGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheDinerGui frame = new TheDinerGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TheDinerGui() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblEggStyle = new JLabel("Egg Style:");
		
		JRadioButton rdbtnScrammbled = new JRadioButton("Scrambled ");
		EggStyleGroup.add(rdbtnScrammbled);
		
		JRadioButton rdbtnOverEasy = new JRadioButton("Over Easy");
		EggStyleGroup.add(rdbtnOverEasy);
		
		JRadioButton rdbtnSunnysideUp = new JRadioButton("Sunny-side up");
		EggStyleGroup.add(rdbtnSunnysideUp);
		
		JRadioButton rdbtnPoached = new JRadioButton("Poached");
		EggStyleGroup.add(rdbtnPoached);
		
		JSeparator separator = new JSeparator();
		
		JLabel lblHotSauce = new JLabel("Hot Sauce:");
		
		JRadioButton rdbtnFranksHotSauce = new JRadioButton("Franks Hot Sauce");
		HotSuaceGroup.add(rdbtnFranksHotSauce);
		
		JRadioButton rdbtnTabasco = new JRadioButton("Tabasco");
		HotSuaceGroup.add(rdbtnTabasco);
		
		JRadioButton rdbtnNone = new JRadioButton("None");
		HotSuaceGroup.add(rdbtnNone);
		rdbtnNone.setSelected(true);
		
		JSeparator separator_1 = new JSeparator();
		
		JLabel lblMeat = new JLabel("Meat:");
		
		JCheckBox chckbxBacon = new JCheckBox("Bacon");
		
		JCheckBox chckbxHam = new JCheckBox("Ham");
		
		JCheckBox chckbxSausage = new JCheckBox("Sausage");
		
		JSeparator separator_2 = new JSeparator();
		
		JLabel lblBread = new JLabel("Bread:");
		
		JRadioButton rdbtnWhite = new JRadioButton("White");
		
		JRadioButton rdbtnWheat = new JRadioButton("Wheat");
		
		JRadioButton rdbtnRye = new JRadioButton("Rye");
		
		JSeparator separator_3 = new JSeparator();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnNewButton = new JButton("Send");
		
		JLabel lblSpecialOptions = new JLabel("Special Instructions:");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnScrammbled)
									.addGap(18)
									.addComponent(rdbtnOverEasy)
									.addGap(18)
									.addComponent(rdbtnSunnysideUp)
									.addGap(18)
									.addComponent(rdbtnPoached))
								.addComponent(lblEggStyle)
								.addComponent(lblHotSauce)
								.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnFranksHotSauce)
							.addGap(50)
							.addComponent(rdbtnTabasco)
							.addPreferredGap(ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
							.addComponent(rdbtnNone)
							.addGap(55))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMeat)
							.addContainerGap(386, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxBacon)
							.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
							.addComponent(chckbxHam, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(92)
							.addComponent(chckbxSausage)
							.addGap(40))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblBread)
							.addContainerGap(382, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnWhite)
							.addGap(107)
							.addComponent(rdbtnWheat)
							.addPreferredGap(ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
							.addComponent(rdbtnRye)
							.addGap(60))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton, 0, 0, Short.MAX_VALUE))
								.addComponent(separator_3, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 404, GroupLayout.PREFERRED_SIZE))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblSpecialOptions)
							.addContainerGap(368, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblEggStyle)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnScrammbled)
						.addComponent(rdbtnOverEasy)
						.addComponent(rdbtnSunnysideUp)
						.addComponent(rdbtnPoached))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblHotSauce)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnFranksHotSauce)
						.addComponent(rdbtnTabasco)
						.addComponent(rdbtnNone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMeat)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(chckbxBacon)
						.addComponent(chckbxSausage)
						.addComponent(chckbxHam))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblBread)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnWhite)
						.addComponent(rdbtnWheat)
						.addComponent(rdbtnRye))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSpecialOptions)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JEditorPane editorPane = new JEditorPane();
		scrollPane.setViewportView(editorPane);
		contentPane.setLayout(gl_contentPane);
	}
}
