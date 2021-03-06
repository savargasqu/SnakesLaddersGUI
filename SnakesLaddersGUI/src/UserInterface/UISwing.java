package UserInterface;

import Data.Board;
import Data.Player;
import Data.Square;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.lang.Thread.sleep;

import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class UISwing extends JFrame implements UI {

    ResourceBundle bundle = java.util.ResourceBundle.getBundle("UserInterface/Bundle");
    private int selectedOption;
    boolean confirmSetup = false;
    boolean confirmedPlayers = false;
    boolean diceRolled = false;
    
    private ArrayList<JLabel> players=null;
    
    private ArrayList<JLabel> boardUI=null;
    private ArrayList<Integer> boardColor=null;
    private ArrayList<JLabel> arcUI=null;
    
    private int height=0;
    private int width=0;
    private int dado=1;
    
    private String player1StringName="";
    private String player2StringName="";

    public UISwing() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        MenuWindow.setVisible(false);
        SetupWindow.setVisible(false);
        BoardWindow.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        instructionsOptionPane = new javax.swing.JOptionPane();
        aboutOptionPane = new javax.swing.JOptionPane();
        winOptionPane = new javax.swing.JOptionPane();
        MenuWindow = new javax.swing.JPanel();
        MenuOptions = new javax.swing.JPanel();
        playButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        instructionsButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        SetupWindow = new javax.swing.JPanel();
        GameSetup = new javax.swing.JPanel();
        boardSizeLabel = new javax.swing.JLabel();
        playerNumberLabel = new javax.swing.JLabel();
        boardSizeBox = new javax.swing.JComboBox<>();
        numberPlayersBox = new javax.swing.JComboBox<>();
        PlayerInstructions = new javax.swing.JLabel();
        PlayerSetup = new javax.swing.JPanel();
        player1Panel = new javax.swing.JPanel();
        player1Label = new javax.swing.JLabel();
        player1Text = new javax.swing.JTextField();
        player2Panel = new javax.swing.JPanel();
        player2Label = new javax.swing.JLabel();
        player2Text = new javax.swing.JTextField();
        setupLabel = new javax.swing.JLabel();
        ok1Button = new javax.swing.JButton();
        FillerPanel = new javax.swing.JPanel();
        BoardWindow = new javax.swing.JPanel();
        boardMessages = new javax.swing.JLabel();
        Tablero = new javax.swing.JPanel();
        rightColumn = new javax.swing.JPanel();
        dice1Button = new javax.swing.JButton();
        player1Picture = new javax.swing.JLabel();
        player2Picture = new javax.swing.JLabel();
        player1Name = new javax.swing.JLabel();
        player1Status = new javax.swing.JLabel();
        player2Name = new javax.swing.JLabel();
        player2Status = new javax.swing.JLabel();
        separator = new javax.swing.JLabel();
        separator2 = new javax.swing.JLabel();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("UserInterface/Bundle"); // NOI18N
        instructionsOptionPane.setToolTipText(bundle.getString("UISwing.instructionsOptionPane.toolTipText")); // NOI18N

        aboutOptionPane.setToolTipText(bundle.getString("UISwing.aboutOptionPane.toolTipText")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(bundle.getString("UISwing.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(650, 300));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        MenuWindow.setLayout(new java.awt.GridBagLayout());

        MenuOptions.setLayout(new java.awt.GridBagLayout());

        playButton.setText(bundle.getString("UISwing.playButton.text")); // NOI18N
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });
        MenuOptions.add(playButton, new java.awt.GridBagConstraints());

        aboutButton.setText(bundle.getString("UISwing.aboutButton.text")); // NOI18N
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        MenuOptions.add(aboutButton, gridBagConstraints);

        instructionsButton.setText(bundle.getString("UISwing.instructionsButton.text")); // NOI18N
        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        MenuOptions.add(instructionsButton, gridBagConstraints);

        quitButton.setText(bundle.getString("UISwing.quitButton.text")); // NOI18N
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        MenuOptions.add(quitButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        MenuWindow.add(MenuOptions, gridBagConstraints);
        MenuOptions.getAccessibleContext().setAccessibleName(bundle.getString("UISwing.MenuOptions.AccessibleContext.accessibleName")); // NOI18N

        nameLabel.setFont(new java.awt.Font("Castellar", 0, 24)); // NOI18N
        nameLabel.setText(bundle.getString("UISwing.nameLabel.text")); // NOI18N
        MenuWindow.add(nameLabel, new java.awt.GridBagConstraints());

        getContentPane().add(MenuWindow);

        SetupWindow.setLayout(new java.awt.GridBagLayout());

        GameSetup.setLayout(new java.awt.GridBagLayout());

        boardSizeLabel.setText(bundle.getString("UISwing.boardSizeLabel.text")); // NOI18N
        boardSizeLabel.setToolTipText(bundle.getString("UISwing.boardSizeLabel.toolTipText")); // NOI18N
        GameSetup.add(boardSizeLabel, new java.awt.GridBagConstraints());

        playerNumberLabel.setText(bundle.getString("UISwing.playerNumberLabel.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        GameSetup.add(playerNumberLabel, gridBagConstraints);

        boardSizeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8×8", "10×10", "12×12" }));
        boardSizeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boardSizeBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        GameSetup.add(boardSizeBox, gridBagConstraints);

        numberPlayersBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        numberPlayersBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberPlayersBoxActionPerformed(evt);
            }
        });
        numberPlayersBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                numberPlayersBoxPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        GameSetup.add(numberPlayersBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        SetupWindow.add(GameSetup, gridBagConstraints);

        PlayerInstructions.setText(bundle.getString("UISwing.PlayerInstructions.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        SetupWindow.add(PlayerInstructions, gridBagConstraints);

        PlayerSetup.setLayout(new java.awt.GridBagLayout());

        player1Panel.setLayout(new javax.swing.BoxLayout(player1Panel, javax.swing.BoxLayout.LINE_AXIS));

        player1Label.setText(bundle.getString("UISwing.player1Label.text")); // NOI18N
        player1Panel.add(player1Label);

        player1Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player1Text.setText(bundle.getString("UISwing.player1Text.text")); // NOI18N
        player1Text.setPreferredSize(new java.awt.Dimension(150, 22));
        player1Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1TextActionPerformed(evt);
            }
        });
        player1Panel.add(player1Text);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        PlayerSetup.add(player1Panel, gridBagConstraints);

        player2Panel.setLayout(new javax.swing.BoxLayout(player2Panel, javax.swing.BoxLayout.LINE_AXIS));

        player2Label.setText(bundle.getString("UISwing.player2Label.text")); // NOI18N
        player2Label.setEnabled(false);
        player2Panel.add(player2Label);

        player2Text.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        player2Text.setText(bundle.getString("UISwing.player2Text.text")); // NOI18N
        player2Text.setEnabled(false);
        player2Text.setPreferredSize(new java.awt.Dimension(150, 22));
        player2Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2TextActionPerformed(evt);
            }
        });
        player2Panel.add(player2Text);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        PlayerSetup.add(player2Panel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        SetupWindow.add(PlayerSetup, gridBagConstraints);

        setupLabel.setText(bundle.getString("UISwing.setupLabel.text")); // NOI18N
        SetupWindow.add(setupLabel, new java.awt.GridBagConstraints());

        ok1Button.setText(bundle.getString("UISwing.ok1Button.text")); // NOI18N
        ok1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok1ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        SetupWindow.add(ok1Button, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        SetupWindow.add(FillerPanel, gridBagConstraints);

        getContentPane().add(SetupWindow);

        BoardWindow.setLayout(new java.awt.GridBagLayout());

        boardMessages.setText(bundle.getString("UISwing.boardMessages.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        BoardWindow.add(boardMessages, gridBagConstraints);

        Tablero.setMinimumSize(Tablero.getPreferredSize());
        Tablero.setName(""); // NOI18N
        Tablero.setOpaque(false);
        Tablero.setPreferredSize(new java.awt.Dimension(200, 200));
        Tablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        BoardWindow.add(Tablero, gridBagConstraints);

        rightColumn.setMinimumSize(new java.awt.Dimension(250, 500));
        rightColumn.setPreferredSize(new java.awt.Dimension(250, 500));
        rightColumn.setLayout(new java.awt.GridBagLayout());

        dice1Button.setIcon(new javax.swing.ImageIcon(UISwing.class.getClass().getResource("/Resources/1.png")));
        dice1Button.setBorder(null);
        dice1Button.setBorderPainted(false);
        dice1Button.setContentAreaFilled(false);
        dice1Button.setPreferredSize(new java.awt.Dimension(120, 120));
        dice1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dice1ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dice1ButtonMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dice1ButtonMouseReleased(evt);
            }
        });
        dice1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dice1ButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        rightColumn.add(dice1Button, gridBagConstraints);

        player1Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/J1.png"))); // NOI18N
        player1Picture.setText(bundle.getString("UISwing.player1Picture.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        rightColumn.add(player1Picture, gridBagConstraints);

        player2Picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/J2.png"))); // NOI18N
        player2Picture.setText(bundle.getString("UISwing.player2Picture.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        rightColumn.add(player2Picture, gridBagConstraints);

        player1Name.setText(player1StringName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        rightColumn.add(player1Name, gridBagConstraints);

        player1Status.setText(bundle.getString("UISwing.player1Status.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        rightColumn.add(player1Status, gridBagConstraints);

        player2Name.setText(player2StringName);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        rightColumn.add(player2Name, gridBagConstraints);

        player2Status.setText(bundle.getString("UISwing.player2Status.text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        rightColumn.add(player2Status, gridBagConstraints);

        separator.setText(bundle.getString("UISwing.separator.text")); // NOI18N
        separator.setPreferredSize(new java.awt.Dimension(0, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        rightColumn.add(separator, gridBagConstraints);

        separator2.setText(bundle.getString("UISwing.separator2.text")); // NOI18N
        separator2.setPreferredSize(new java.awt.Dimension(0, 100));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        rightColumn.add(separator2, gridBagConstraints);

        BoardWindow.add(rightColumn, new java.awt.GridBagConstraints());

        getContentPane().add(BoardWindow);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        selectedOption = 4;
    }//GEN-LAST:event_quitButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        MenuWindow.setVisible(false);
        SetupWindow.setVisible(true);
        BoardWindow.setVisible(false);
        selectedOption = 1;
    }//GEN-LAST:event_playButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        selectedOption = 3;
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void boardSizeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boardSizeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boardSizeBoxActionPerformed

    private void ok1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok1ButtonActionPerformed

        //Goes to player setup
        this.initBoard(boardSizeBox.getSelectedIndex()+1);
        ArrayList<String> playerslist=new ArrayList<>();
        playerslist.add("Player1");
        playerslist.add("1");
        player1StringName=player1Text.getText();
        player1Name.setText(player1StringName);

        
        if(numberPlayersBox.getSelectedIndex()==0) {
            player2StringName="-";
            player2Name.setText(player2StringName);
            player2Picture.setEnabled(false);
            player2Name.setEnabled(false);
            player2Status.setEnabled(false);
        }
        else {
        playerslist.add("Player2");
        playerslist.add("2");
        player2StringName=player2Text.getText();
        player2Name.setText(player2StringName);
        }
        
        this.initPlayers(playerslist);

        MenuWindow.setVisible(false);
        SetupWindow.setVisible(false);
        BoardWindow.setVisible(true);
        confirmSetup = true;
    }//GEN-LAST:event_ok1ButtonActionPerformed

    private void numberPlayersBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberPlayersBoxActionPerformed
        int i=numberPlayersBox.getSelectedIndex();
        switch(i) {
            case 0:
                player2Label.setEnabled(false);
                player2Text.setEnabled(false);
                break;
            case 1:
                player2Label.setEnabled(true);
                player2Text.setEnabled(true);
                break;   
        }
    }//GEN-LAST:event_numberPlayersBoxActionPerformed

    private void instructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionsButtonActionPerformed
        selectedOption = 2;
    }//GEN-LAST:event_instructionsButtonActionPerformed

    private void dice1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dice1ButtonActionPerformed
        diceRolled = true;
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        dice1Button.setIcon(new javax.swing.ImageIcon(UISwing.class.getClass().getResource("/Resources/"+String.valueOf(dado)+".png"))); // NOI18N
    }//GEN-LAST:event_dice1ButtonActionPerformed

    private void player1TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player1TextActionPerformed

    private void player2TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2TextActionPerformed

    private void dice1ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dice1ButtonMouseEntered
        if(!diceRolled){
            this.setCursor(new Cursor(Cursor.HAND_CURSOR));
            dice1Button.setIcon(new javax.swing.ImageIcon(UISwing.class.getClass().getResource("/Resources/file.gif"))); // NOI18N
        }
    }//GEN-LAST:event_dice1ButtonMouseEntered

    private void dice1ButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dice1ButtonMouseReleased


    }//GEN-LAST:event_dice1ButtonMouseReleased

    private void dice1ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dice1ButtonMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        dice1Button.setIcon(new javax.swing.ImageIcon(UISwing.class.getClass().getResource("/Resources/"+String.valueOf(dado)+".png"))); // NOI18N
    }//GEN-LAST:event_dice1ButtonMouseExited

    private void numberPlayersBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_numberPlayersBoxPropertyChange
      // TODO add your handling code here:
    }//GEN-LAST:event_numberPlayersBoxPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BoardWindow;
    private javax.swing.JPanel FillerPanel;
    private javax.swing.JPanel GameSetup;
    private javax.swing.JPanel MenuOptions;
    private javax.swing.JPanel MenuWindow;
    private javax.swing.JLabel PlayerInstructions;
    private javax.swing.JPanel PlayerSetup;
    private javax.swing.JPanel SetupWindow;
    private javax.swing.JPanel Tablero;
    private javax.swing.JButton aboutButton;
    private javax.swing.JOptionPane aboutOptionPane;
    private javax.swing.JLabel boardMessages;
    private javax.swing.JComboBox<String> boardSizeBox;
    private javax.swing.JLabel boardSizeLabel;
    private javax.swing.JButton dice1Button;
    private javax.swing.JButton instructionsButton;
    private javax.swing.JOptionPane instructionsOptionPane;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JComboBox<String> numberPlayersBox;
    private javax.swing.JButton ok1Button;
    private javax.swing.JButton playButton;
    private javax.swing.JLabel player1Label;
    private javax.swing.JLabel player1Name;
    private javax.swing.JPanel player1Panel;
    private javax.swing.JLabel player1Picture;
    private javax.swing.JLabel player1Status;
    private javax.swing.JTextField player1Text;
    private javax.swing.JLabel player2Label;
    private javax.swing.JLabel player2Name;
    private javax.swing.JPanel player2Panel;
    private javax.swing.JLabel player2Picture;
    private javax.swing.JLabel player2Status;
    private javax.swing.JTextField player2Text;
    private javax.swing.JLabel playerNumberLabel;
    private javax.swing.JButton quitButton;
    private javax.swing.JPanel rightColumn;
    private javax.swing.JLabel separator;
    private javax.swing.JLabel separator2;
    private javax.swing.JLabel setupLabel;
    private javax.swing.JOptionPane winOptionPane;
    // End of variables declaration//GEN-END:variables

    @Override
    public int printMenu() {
        MenuWindow.setVisible(true);

        BoardWindow.setVisible(false);
        selectedOption = -1;
        
        while (selectedOption == -1) {

            pause();
        }
        return selectedOption;
    }

    @Override
    public void printInstructions() {
        JOptionPane.showMessageDialog(instructionsOptionPane, bundle.getString("UISwing.InstructionsOptionPaneText"));
    }

    @Override
    public void printAbout() {
        JOptionPane.showMessageDialog(aboutOptionPane, bundle.getString("UISwing.aboutOptionPaneText"));    

    }

    @Override
    public int askBoardSize() {
        int selectSize = 0;
        while (!confirmSetup) {
            pause();
        }
        String sizeString = (String) boardSizeBox.getModel().getSelectedItem();

        if (sizeString != null) {
            switch (sizeString) {
                case "8×8":
                    selectSize = 1;
                    break;
                case "10×10":
                    selectSize = 2;
                    break;
                case "12×12":
                    selectSize = 3;
                    break;
                default:
                    break;
            }
        }
        return selectSize;
    }

    @Override
    public int askNumberOfPlayers() {
        while (!confirmSetup) {
            pause();

        }     

        String numberString = (String) numberPlayersBox.getModel().getSelectedItem();
        char numberChar = numberString.charAt(0);
        int selectNumber = Character.getNumericValue(numberChar);

        switch (selectNumber) {
            case 1:
                player1Panel.setVisible(true);
                player2Panel.setVisible(false);
                break;
            case 2:
                player1Panel.setVisible(true);
                player2Panel.setVisible(true);
                break;
        }

        return selectNumber;
    }

    @Override
    public char askPlayerToken(int playerNum) {
        while(!confirmSetup) {
            pause();
        }

        char token = ' ';
        switch (playerNum) {
            case 0:
                token = 'a';
                break;
            case 1:
                token = 'b';
                break;
        }
        return token;
    }

    @Override
    public void printBoard(Board board) {

        Square[] squareBoard=board.getBoard();    
        for(int i=0;i<squareBoard.length;i++) {
            Square square=squareBoard[i];
            if(square.getPlayers()!=null && square.getPlayers().size()>0) {
                for(int x=0; x<square.getPlayers().size();x++) {
                    int token=0;
                    if(square.getPlayers().get(x).getToken()=='b') {
                        token=1;
                    }
                    players.get(token).setBounds(this.width-50*((i%(int)Math.sqrt(squareBoard.length))+1), this.height-50*((int)(i/(int)Math.sqrt(squareBoard.length))+1),50,50);
                    Tablero.setComponentZOrder(players.get(token), 0);
                }
            }
        }

    }

    @Override
    public void askRoll(Player player) {
        boardMessages.setText(bundle.getString("UISwing.playerWord")+player+bundle.getString("UISwing.playerPrompt.text"));

        while (!diceRolled) {
            pause();
        }
    }

    @Override
    public void turnFeedback(int move, Player player, Square position) {
/*        switch (move) {
            case 1:
                System.out.print("Bummer");
                break;
            case 2:
                System.out.print("Meh");
                break;
            case 3:
                System.out.print("Ok");
                break;
            case 4:
                System.out.print("Good");
                break;
            case 5:
                System.out.print("Great");
                break;
            case 6:
                System.out.print("WOW");
                break;
        }*/
        dado=move;
        boardMessages.setText(bundle.getString("UISwing.playerWord") + player + bundle.getString("UISwing.TurnFeedbackText1") + move + bundle.getString("UISwing.TurnFeedbackText2") + String.valueOf(position.getIndex()));

        diceRolled = false;
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        dice1Button.setIcon(new javax.swing.ImageIcon(UISwing.class.getClass().getResource("/Resources/"+String.valueOf(dado)+".png"))); // NOI18N
        try {
            sleep(2000);
        }
        catch(Exception e) {
            
        }
    }

    @Override
    public void arcFeedback(boolean good, int entry, int exit) {

        String feedback="";
        if (good) {
            feedback+=bundle.getString("UISwing.LadderFeedbacktext");
        } else if (!good) {
            feedback+=bundle.getString("UISwing.SnakeFeedbacktext");
        }
        boardMessages.setText(feedback+bundle.getString("UISwing.ArcFeedbackSquare1text")+entry+bundle.getString("UISwing.ArcFeedbackSquare2text")+exit);

    }

    @Override
    public void badFeedback() {
        //throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printPlayerWins(Player player) {
        MenuWindow.setVisible(true);
        SetupWindow.setVisible(false);
        PlayerSetup.setVisible(false);
        BoardWindow.setVisible(false);
        
        boardMessages.setText("");

        JOptionPane.showMessageDialog(this,bundle.getString("UISwing.playerWord") + player + bundle.getString("UISwing.winOptionPaneText"));

        }
    
    private void pause() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(UISwing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @Override
    public void printArcs(ArrayList<Integer> doors) {
             // Initilize Arcs
        arcUI = new ArrayList<>();
        for(int q=0;q<doors.size();q=q+2) {
            int init=doors.get(q);
            int end=doors.get(q+1);
                //System.out.println(String.valueOf(init)+" - "+String.valueOf(end));
                JLabel newJLabel1 = new javax.swing.JLabel();
                newJLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
                newJLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
                newJLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
                
                JLabel newJLabel2 = new javax.swing.JLabel();
                newJLabel2.setMaximumSize(new java.awt.Dimension(50, 50));
                newJLabel2.setMinimumSize(new java.awt.Dimension(50, 50));
                newJLabel2.setPreferredSize(new java.awt.Dimension(50, 50));
                
                String image=null;
                if(end>init) {
                    image="ladder";
                }
                else {
                    image="snake";
                }

                newJLabel1.setIcon(new ImageIcon(UISwing.class.getClass().getResource("/Resources/"+image+"_i.png")));
                newJLabel1.setBounds(this.width-50*(((init)%(int)(width/50))+1), this.height-50*((int)((init)/(int)(width/50))+1),50,50);
                
                newJLabel2.setIcon(new ImageIcon(UISwing.class.getClass().getResource("/Resources/"+image+"_f.png")));
                newJLabel2.setBounds(this.width-50*(((end)%(int)(width/50))+1), this.height-50*((int)((end)/(int)(width/50))+1),50,50);
                Tablero.add(newJLabel1);
                Tablero.setComponentZOrder(newJLabel1, 0);
                Tablero.add(newJLabel2);
                Tablero.setComponentZOrder(newJLabel2, 0);

                arcUI.add(newJLabel1);
                arcUI.add(newJLabel2);
        }
    }
    
    private void initBoard(int size) {
        boardUI=new ArrayList<>();
        boardColor=new ArrayList<>();
        int length=0;
        switch(size) {
            case 1:
                length=8;
                break;
            case 2:
                length=10;
                break;
            case 3:
                length=12;
                break;
        }
        Tablero.setLayout(null);
        Tablero.setSize(length*50,length*50);
        Tablero.setPreferredSize(Tablero.getSize());
        Tablero.setMaximumSize(Tablero.getSize());
        Tablero.setMinimumSize(Tablero.getSize());
        this.height = length*50;
        this.width = length*50;
        
        this.setSize(this.width+300,this.height+200);
        this.setResizable(false);
        
        for(int i=0; i<length;i++){
                for(int j=0; j<length;j++){
                    JLabel newJLabel1 = new javax.swing.JLabel();
                    newJLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
                    newJLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
                    newJLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
                    Tablero.add(newJLabel1);
                    newJLabel1.setBounds((length*50)-(j+1)*50, (length*50)-(i+1)*50, 50, 50);
                    newJLabel1.setVerticalTextPosition(SwingConstants.CENTER);
                    newJLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
                    boolean flag=true;
                    int random=0;
                    while(flag) {
                        boolean test=true;
                        random = 1+(int)(Math.random()*4);
                        if(j>0 && boardColor.get(i*length+j-1)==random)
                            test=false;
                        
                        if(i>0 && boardColor.get((i-1)*length+j)==random)
                            test=false;
                        
                        if(test)
                            flag=false;
                    }
                    
                    newJLabel1.setIcon(new ImageIcon(UISwing.class.getClass().getResource("/Resources/back"+String.valueOf(random)+".jpg")));
                    newJLabel1.setText(String.valueOf(j+i*length+1));
                    if(random==1) {
                        newJLabel1.setForeground(Color.BLACK);
                    }
                    else {
                        newJLabel1.setForeground(Color.WHITE);
                    }
                    newJLabel1.setFont(new Font(newJLabel1.getFont().getName(), Font.BOLD, 20));
                    Tablero.setComponentZOrder(newJLabel1, Tablero.getComponentCount()-1);
                    boardUI.add(newJLabel1);
                    boardColor.add(random);
                }
        }
    }
    
    private void initPlayers(ArrayList<String> playersList) {
        players=new ArrayList<>();
        for(int i=0; i<playersList.size()/2; i++) {
            JLabel newJLabel1 = new javax.swing.JLabel();
            newJLabel1.setMaximumSize(new java.awt.Dimension(50, 50));
            newJLabel1.setMinimumSize(new java.awt.Dimension(50, 50));
            newJLabel1.setPreferredSize(new java.awt.Dimension(50, 50));
            newJLabel1.setIcon(new ImageIcon(UISwing.class.getClass().getResource("/Resources/J"+playersList.get(2*i+1)+".png")));
            newJLabel1.setBounds(this.width-50, this.height-50,50,50);
            Tablero.add(newJLabel1);
            Tablero.setComponentZOrder(newJLabel1, 0);

            players.add(newJLabel1);
        }
    }
    
}
