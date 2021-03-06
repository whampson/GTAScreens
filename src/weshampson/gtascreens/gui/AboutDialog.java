
package weshampson.gtascreens.gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import weshampson.commonutils.jar.JarProperties;

/**
 *
 * @author  Wes Hampson
 * @version 1.0.0 (Sep 6, 2014)
 * @since   1.0.0 (Sep 5, 2014)
 */
public class AboutDialog extends javax.swing.JDialog {
    private static final String EMAIL_ADDRESS = "thehambone93@gmail.com";

    /** Creates new form AboutDialog
     * @param parent
     * @param modal */
    public AboutDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("About " + JarProperties.getApplicationTitle());
        versionNumberLabel2.setText(JarProperties.getApplicationVersion()+ " build " + Integer.toString(JarProperties.getBuildNumber()));
        buildDateLabel2.setText(new SimpleDateFormat("dd MMMM yyyy").format(JarProperties.getBuildDate()));
        infoLabel3.setText("<html><a href='mailto:" + EMAIL_ADDRESS + "'>" + EMAIL_ADDRESS + "</a></html>");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        createdByLabel1 = new javax.swing.JLabel();
        createdByLabel2 = new javax.swing.JLabel();
        buildDateLabel1 = new javax.swing.JLabel();
        buildDateLabel2 = new javax.swing.JLabel();
        versionNumberLabel1 = new javax.swing.JLabel();
        versionNumberLabel2 = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();
        infoLabel2 = new javax.swing.JLabel();
        infoLabel3 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("GTAScreens");

        descriptionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descriptionLabel.setText("Download GTA screenshots with ease.");

        createdByLabel1.setText("Created by:");

        createdByLabel2.setText("Wes Hampson (thehambone93)");

        buildDateLabel1.setText("Build date:");

        buildDateLabel2.setText("<build date>");

        versionNumberLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        versionNumberLabel1.setText("Version:");

        versionNumberLabel2.setText("<version number>");

        infoLabel1.setText("Problems? Suggestions?");

        infoLabel2.setText("Email me at:");

        infoLabel3.setText("mailto:<email address>");
        infoLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoLabel3MouseClicked(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(versionNumberLabel1)
                                    .addComponent(createdByLabel1)
                                    .addComponent(buildDateLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(versionNumberLabel2)
                                    .addComponent(createdByLabel2)
                                    .addComponent(buildDateLabel2)))
                            .addComponent(infoLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(infoLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoLabel3)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createdByLabel1)
                    .addComponent(createdByLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(versionNumberLabel1)
                    .addComponent(versionNumberLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buildDateLabel1)
                    .addComponent(buildDateLabel2))
                .addGap(18, 18, 18)
                .addComponent(infoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoLabel2)
                    .addComponent(infoLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(closeButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoLabel3MouseClicked
        try {
            Desktop.getDesktop().browse(new URI("mailto:" + EMAIL_ADDRESS));
        } catch (URISyntaxException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }//GEN-LAST:event_infoLabel3MouseClicked

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        dispose();
    }//GEN-LAST:event_closeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buildDateLabel1;
    private javax.swing.JLabel buildDateLabel2;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel createdByLabel1;
    private javax.swing.JLabel createdByLabel2;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel infoLabel2;
    private javax.swing.JLabel infoLabel3;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel versionNumberLabel1;
    private javax.swing.JLabel versionNumberLabel2;
    // End of variables declaration//GEN-END:variables
}