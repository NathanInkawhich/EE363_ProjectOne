package edu.clarkson.inkawhna.emersocj.fall2014.ee363.projectone;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
    JButton playAgainButton;
    JTextField whoWonField;
    String playerName = "Player";
    


    Weapon computerRightHand = new RightHandWeapon();
    Weapon computerLeftHand = new LeftHandWeapon();
    
    JRadioButton rockButton;
    JRadioButton paperButton;
    JRadioButton scissorsButton;
    JRadioButton lizardButton;
    JRadioButton spockButton;
    JRadioButton poisionButton;
    JRadioButton radioactiveButton;
    JRadioButton infectedButton;
    
    JTextField yourAttackField;
    JTextField opponentAttackField;
    
    JPanel resultsPanel;
	JPanel cards;
    final static String STARTPANEL = "START SCREEN";
	//final static String RIGHTHANDPANEL = "RIGHT HANDED GAME";
	//final static String LEFTHANDPANEL = "LEFT HANDED GAME";
	final static String TWOHANDPANEL = "TWO HANDED GAME";
	final static String RESULTSPANEL = "RESULTS";
	
	/**
	 * Adds the GUI components to the container.
	 * @param pane
	 */
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
        
        nameField= new JTextField(20);
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
        rockButton = new JRadioButton("ROCK");
        rockButton.addActionListener(this);
        rockButton.setActionCommand("ROCK");
        paperButton = new JRadioButton("PAPER");
        paperButton.addActionListener(this);
        paperButton.setActionCommand("PAPER");
        scissorsButton = new JRadioButton("SCISSORS");
        scissorsButton.addActionListener(this);
        scissorsButton.setActionCommand("SCISSORS");
        lizardButton = new JRadioButton("LIZARD");
        lizardButton.addActionListener(this);
        lizardButton.setActionCommand("LIZARD");
        spockButton = new JRadioButton("SPOCK");
        spockButton.addActionListener(this);
        spockButton.setActionCommand("SPOCK");
        ButtonGroup rightHandGroup = new ButtonGroup();
        rightHandGroup.add(rockButton);
        rightHandGroup.add(paperButton);
        rightHandGroup.add(scissorsButton);
        rightHandGroup.add(lizardButton);
        rightHandGroup.add(spockButton);
        rockButton.setSelected(true);
       
        rightHandPanel.add(rightHandLabel1);
        rightHandPanel.add(rockButton);
        rightHandPanel.add(paperButton);
        rightHandPanel.add(scissorsButton);
        rightHandPanel.add(lizardButton);
        rightHandPanel.add(spockButton);
        
      //LEFT HAND PANEL
        JPanel leftHandPanel = new JPanel(new GridLayout(0,1));
        JLabel leftHandLabel1 = new JLabel("LEFT HANDED weapon:");
        poisionButton = new JRadioButton("POISION");
        poisionButton.addActionListener(this);
        poisionButton.setActionCommand("POISION");
        radioactiveButton = new JRadioButton("RADIOACTIVE");
        radioactiveButton.addActionListener(this);
        radioactiveButton.setActionCommand("RADIOACTIVE");
        infectedButton = new JRadioButton("INFECTED");
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
        poisionButton.setSelected(true);
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
        resultsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints r = new GridBagConstraints();
        playAgainButton = new JButton("Play Again!");
        playAgainButton.addActionListener(this);
        JLabel resultsLabel = new JLabel("Game Results");
        JLabel resultsLabel1 = new JLabel("Your Attack: ");
        yourAttackField = new JTextField(20);
        yourAttackField.setEditable(false);
        opponentAttackField = new JTextField(20);
        opponentAttackField.setEditable(false);
        JLabel resultsLabel2 = new JLabel("Opponents Attack: ");
        JLabel nullLabel = new JLabel("  ");
        JLabel nullLabel2 = new JLabel("  ");
        whoWonField = new JTextField("This is where the results go",20);
        whoWonField.setEditable(false);
        //whoWonField.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 0;
        r.gridy = 0;
        r.gridwidth = 2;
        resultsLabel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        resultsPanel.add(resultsLabel,r);
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 0;
        r.gridy = 1;
        r.gridwidth = 1;
        resultsLabel1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        resultsPanel.add(resultsLabel1,r);
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 1;
        r.gridy = 1;
        r.gridwidth = 1;
        resultsPanel.add(yourAttackField,r);
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 0;
        r.gridy = 2;
        r.gridwidth = 1;
        resultsLabel2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        resultsPanel.add(resultsLabel2,r);
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 1;
        r.gridy = 2;
        r.gridwidth = 1;
        resultsPanel.add(opponentAttackField,r);
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 0;
        r.gridy = 3;
        r.gridwidth = 2;
        resultsPanel.add(nullLabel,r);
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 0;
        r.gridy = 4;
        r.gridwidth = 2;
        //whoWonField.setHorizontalAlignment(SwingConstants.LEFT);
        resultsPanel.add(whoWonField,r);
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 0;
        r.gridy = 5;
        r.gridwidth = 2;
        resultsPanel.add(nullLabel2,r);
        r.fill = GridBagConstraints.VERTICAL;
        r.weightx = 0.5;
        r.gridx = 0;
        r.gridy = 6;
        r.gridwidth = 2;
        playAgainButton.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        resultsPanel.add(playAgainButton,r);
        
        cards = new JPanel(new CardLayout());
		cards.add(startPanel,STARTPANEL);
		//cards.add(rightHandCard,RIGHTHANDPANEL);
		//cards.add(leftHandCard,LEFTHANDPANEL);
		cards.add(twoHandCard,TWOHANDPANEL);
		cards.add(resultsPanel,RESULTSPANEL);
		
		pane.add(cards);
	}
	/**
	 * Handles action listener cases.
	 */
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
				
			playerName = nameField.getText();
			if(playerName.equals(""))
				playerName = "Player";
			}
		}
		if (e.getSource().equals(backButton)) {
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, STARTPANEL);
		}
		if (e.getSource().equals(submitMoveButton)) {
			
			
		    Weapon playerRightHand = new RightHandWeapon();
		    Weapon playerLeftHand = new LeftHandWeapon();
		    computerRightHand = new RightHandWeapon();
		    computerLeftHand = new LeftHandWeapon();
		    
			if(rockButton.isSelected() == true)     	playerRightHand = new Rock(playerRightHand);
			if(paperButton.isSelected() == true)    	playerRightHand = new Paper(playerRightHand);
			if(scissorsButton.isSelected() == true)		playerRightHand = new Scissors(playerRightHand);
			if(lizardButton.isSelected() == true)   	playerRightHand = new Lizard(playerRightHand);
			if(spockButton.isSelected() == true)    	playerRightHand = new Spock(playerRightHand);
			if(poisionButton.isSelected() == true)  	playerLeftHand = new Poisonous(playerLeftHand);
			if(radioactiveButton.isSelected() == true)  playerLeftHand = new Radioactive(playerLeftHand);
			if(infectedButton.isSelected() == true) 	playerLeftHand =new Infested(playerLeftHand);
				
			
			generateOpponentAttack();
			

			ArrayList<Weapon> weaponArray = new <Weapon>ArrayList();
			
			weaponArray.add(playerRightHand);
			weaponArray.add(computerRightHand);
			weaponArray.add(playerLeftHand);
			weaponArray.add(computerLeftHand);
			

			GameScoring gameScoring = new GameScoring();
			gameScoring.setScoringBehavior(0);
			
			int score = gameScoring.selectWinner(weaponArray);
			if(score == 1) whoWonField.setText(playerName +" Won!");
			else if (score == 0)whoWonField.setText("Computer"+" Won!");
			else whoWonField.setText("TIE!");

			
			System.out.println("Who won: " + score);
			String[] pr = playerRightHand.attack().split(" ");
			System.out.println("Player Right: " + pr[0]);
			String[] pl = playerLeftHand.attack().split(" ");
			System.out.println("Player Left: " + pl[0]);
			String[] cr = computerRightHand.attack().split(" ");
			System.out.println("Computer Right: " + cr[0]);
			String[] cl = computerLeftHand.attack().split(" ");
			System.out.println("Computer Left: " + cl[0]);
			/*
			System.out.println();
			System.out.println("Player Right: " + playerRightHand.attack());
			System.out.println("Player Left: " + playerLeftHand.attack()); 
			System.out.println("Computer Right: " + computerRightHand.attack());
			System.out.println("Computer Left: " + computerLeftHand.attack()); 
			 */
		   yourAttackField.setText(pr[0] + " , " + pl[0]);
		   opponentAttackField.setText(cr[0] + " , " + cl[0]);
		   
			
			CardLayout card = (CardLayout) (cards.getLayout());
			card.show(cards, RESULTSPANEL);
		}
		
		if (e.getSource().equals(playAgainButton)) {
			CardLayout cl = (CardLayout) (cards.getLayout());
			cl.show(cards, TWOHANDPANEL);
		}		
	}
			
	/**
	 * Generates a random computer attack.		
	 */
	private void generateOpponentAttack(){
		
		Random rn = new Random();
		
		
		int randRight = rn.nextInt(5);
			
		if     (randRight == 0 ) computerRightHand = new Rock(computerRightHand);
		else if(randRight == 1 ) computerRightHand = new Paper(computerRightHand);
		else if(randRight == 2 ) computerRightHand = new Scissors(computerRightHand);
		else if(randRight == 3 ) computerRightHand = new Spock(computerRightHand);
		else if(randRight == 4 ) computerRightHand = new Lizard(computerRightHand);
	

		int randLeft = rn.nextInt(3);
		
		if	   (randLeft == 0 ) computerLeftHand = new Poisonous(computerLeftHand);
		else if(randLeft == 1 ) computerLeftHand = new Infested(computerLeftHand);
		else if(randLeft == 2 ) computerLeftHand = new Radioactive(computerLeftHand);
		
	}
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("RPSLS/RPI Game");
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        ImplementGame game = new ImplementGame();
        //Set up the content pane.
        game.addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
	/**
	 * Executes GUI
	 * @param args
	 */
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
