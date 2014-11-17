package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * This class implements the Rock, Paper, Scissors, Lizard, Spock game
 * @author ninka_000
 *
 */
public class ImplementGame implements ActionListener {
	
	JTextField nameField;
	JButton startGameButton;
	JButton submitAttackButton;
	JComboBox typeOfGameBox;
	String[] gameTypes = {"Two Handed Game (RPSLS/PIR)","Right Handed Game (RPSLS)", "Left Handed Game (PIR)"};
	JPanel startPanel;
	JPanel leftHandPanel;
	JPanel rightHandPanel;
	JPanel twoHandPanel;
	JButton submitMoveButton;
    JButton backButton;
    
    String rightHandChoice;
    String leftHandChoice;
    
    
	JPanel cards;
    final static String STARTPANEL = "START SCREEN";
	//final static String RIGHTHANDPANEL = "RIGHT HANDED GAME";
	//final static String LEFTHANDPANEL = "LEFT HANDED GAME";
	final static String TWOHANDPANEL = "TWO HANDED GAME";
	final static String RESULTSPANEL = "RESULTS";
	
	public void addComponentsToPane(Container pane) {
		
		startPanel = new JPanel(new GridBagLayout());
    	GridBagConstraints c = new GridBagConstraints();
    	JLabel nameLabel= new JLabel("What is your name: ");
    	c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        nameLabel.setBorder(BorderFactory.createEmptyBorder(10,10,5,10));
        startPanel.add(nameLabel, c);
        
        nameField= new JTextField("\t\t\t");
    	c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        nameField.setBorder(BorderFactory.createEmptyBorder(5,10,10,10));
        startPanel.add(nameField, c);
        
        JLabel gameLabel= new JLabel("What type of game would you like to play: ");
    	c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        gameLabel.setBorder(BorderFactory.createEmptyBorder(20,10,5,10));
        startPanel.add(gameLabel, c);
        
        typeOfGameBox = new JComboBox(gameTypes);
    	c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 3;
        typeOfGameBox.setBorder(BorderFactory.createEmptyBorder(5,10,10,10));
        startPanel.add(typeOfGameBox, c);
        
        startGameButton = new JButton("Start Game");
        startGameButton.addActionListener(this);
    	c.fill = GridBagConstraints.VERTICAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 4;
        startGameButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        startPanel.add(startGameButton, c);
        
      //TWO HAND CARD
        JPanel twoHandCard = new JPanel(new GridBagLayout());
        GridBagConstraints s = new GridBagConstraints();
      //TITLE PANEL
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Welcome to the TWO HANDED game, ");
        JLabel titleLabel2 = new JLabel("Now choose your weapons!!");
        titlePanel.add(titleLabel);
        titlePanel.add(titleLabel2);
      //RIGHT HAND PANEL
        JPanel rightHandPanel = new JPanel(new GridLayout(0,1));
        JLabel rightHandLabel1 = new JLabel("RIGHT HANDED weapon: ");
        JRadioButton rockButton = new JRadioButton("ROCK");
        rockButton.addActionListener(this);
        rockButton.setActionCommand("ROCK");
        JRadioButton paperButton = new JRadioButton("PAPER");
        paperButton.addActionListener(this);
        paperButton.setActionCommand("PAPER");
        JRadioButton scissorsButton = new JRadioButton("SCISSORS");
        scissorsButton.addActionListener(this);
        scissorsButton.setActionCommand("SCISSORS");
        JRadioButton lizardButton = new JRadioButton("LIZARD");
        lizardButton.addActionListener(this);
        lizardButton.setActionCommand("LIZARD");
        JRadioButton spockButton = new JRadioButton("SPOCK");
        spockButton.addActionListener(this);
        spockButton.setActionCommand("SPOCK");
        ButtonGroup rightHandGroup = new ButtonGroup();
        rightHandGroup.add(rockButton);
        rightHandGroup.add(paperButton);
        rightHandGroup.add(scissorsButton);
        rightHandGroup.add(lizardButton);
        rightHandGroup.add(spockButton);
       
        rightHandPanel.add(rightHandLabel1);
        rightHandPanel.add(rockButton);
        rightHandPanel.add(paperButton);
        rightHandPanel.add(scissorsButton);
        rightHandPanel.add(lizardButton);
        rightHandPanel.add(spockButton);
        
      //LEFT HAND PANEL
        JPanel leftHandPanel = new JPanel(new GridLayout(0,1));
        JLabel leftHandLabel1 = new JLabel("LEFT HANDED weapon:");
        JRadioButton poisionButton = new JRadioButton("POISION");
        poisionButton.addActionListener(this);
        poisionButton.setActionCommand("POISION");
        JRadioButton radioactiveButton = new JRadioButton("RADIOACTIVE");
        radioactiveButton.addActionListener(this);
        radioactiveButton.setActionCommand("RADIOACTIVE");
        JRadioButton infectedButton = new JRadioButton("INFECTED");
        rockButton.addActionListener(this);
        infectedButton.setActionCommand("INFECTED");
        ButtonGroup leftHandGroup = new ButtonGroup();
        leftHandGroup.add(poisionButton);
        leftHandGroup.add(radioactiveButton);
        leftHandGroup.add(infectedButton);
        leftHandPanel.add(leftHandLabel1);
        leftHandPanel.add(poisionButton);
        leftHandPanel.add(radioactiveButton);
        leftHandPanel.add(infectedButton);
        
      //BUTTON PANEL
        JPanel buttonPanel = new JPanel();
        submitMoveButton = new JButton("Submit Move!");
        submitMoveButton.addActionListener(this);
        backButton = new JButton("Back");
        backButton.addActionListener(this);
        buttonPanel.add(submitMoveButton);
        buttonPanel.add(backButton);
      
        s.fill = GridBagConstraints.VERTICAL;
        s.weightx = 0.5;
        s.gridx = 0;
        s.gridy = 0;
        s.gridwidth = 2;
        titlePanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        twoHandCard.add(titlePanel,s);
        
        s.fill = GridBagConstraints.VERTICAL;
        s.weightx = 0.5;
        s.gridx = 0;
        s.gridy = 1;
        s.gridwidth = 1;
        rightHandPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        twoHandCard.add(rightHandPanel,s);
        
        s.fill = GridBagConstraints.VERTICAL;
        s.weightx = 0.5;
        s.gridx = 1;
        s.gridy = 1;
        s.gridwidth = 1;
        leftHandPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        twoHandCard.add(leftHandPanel,s);
        
        s.fill = GridBagConstraints.VERTICAL;
        s.weightx = 0.5;
        s.gridx = 0;
        s.gridy = 2;
        s.gridwidth = 2;
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        twoHandCard.add(buttonPanel,s);
        
        //RESULTS PANEL
        JPanel resultsPanel = new JPanel();
        JLabel resultsLabel = new JLabel("Game Results");
        JLabel resultsLabel1 = new JLabel("Your Attack: ");
        String message1 = rightHandChoice ;
        JLabel resultsLabel2 = new JLabel("Opponents Attack: ");
        
        cards = new JPanel(new CardLayout());
		cards.add(startPanel,STARTPANEL);
		//cards.add(rightHandCard,RIGHTHANDPANEL);
		//cards.add(leftHandCard,LEFTHANDPANEL);
		cards.add(twoHandCard,TWOHANDPANEL);
		pane.add(cards);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(startGameButton)) {
			
			CardLayout cl = (CardLayout) (cards.getLayout());
			if(typeOfGameBox.getSelectedItem().equals("Right Handed Game (RPSLS)")){
				//cl.show(cards, RIGHTHANDPANEL);
				JOptionPane.showMessageDialog(null, "OOPS!\nThe developers are still working on implementing the RIGHT handed game\nPlease use the TWO HANDED game for now");

			}
			if(typeOfGameBox.getSelectedItem().equals("Left Handed Game (PIR)")){
				//cl.show(cards, LEFTHANDPANEL);
				JOptionPane.showMessageDialog(null, "OOPS!\nThe developers are still working on implementing the LEFT handed game\nPlease use the TWO HANDED game for now");
			}
			if(typeOfGameBox.getSelectedItem().equals("Two Handed Game (RPSLS/PIR)")){
				cl.show(cards, TWOHANDPANEL);

			}
		}
		if (e.getSource().equals(backButton)) {
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, STARTPANEL);
		}
		if (e.getSource().equals(submitMoveButton)) {
			rightHandChoice = e.getActionCommand();
			leftHandChoice = e.getActionCommand();
			System.out.println("rightHandChoice: " + rightHandChoice);
			System.out.println("leftHandChoice: " + leftHandChoice);
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, RESULTSPANEL);
		}
		
		
		
	}
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("RPSLS/RPI Game");
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImplementGame game = new ImplementGame();
        //Set up the content pane.
        game.addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}