/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JFramePTZControl.java
 *
 * Created on 2009-11-2, 9:08:17
 */
/**
 *
 * @author Administrator
 */

package ClientDemo;

import com.sun.jna.NativeLong;
import javax.swing.JOptionPane;

/*****************************************************************************
 *绫� 锛�   JFramePTZControl
 *绫绘弿杩� 锛氫簯鍙版帶鍒�
 ****************************************************************************/
public class JFramePTZControl extends javax.swing.JFrame
{

    /************鎴愬憳鍙橀噺*****************/
    static HCNetSDK hCNetSDK = HCNetSDK.INSTANCE;
    private NativeLong m_lRealHandle;//棰勮鍙ユ焺
    private boolean m_bAutoOn;//鑷姩宸﹀彸浜戝彴
    private boolean m_bLightOn;//寮�鍚伅鍏�
    private boolean m_bWiperOn;//寮�鍚洦鍒�
    private boolean m_bFanOn;//寮�鍚鎵�
    private boolean m_bHeaterOn;//寮�鍚姞鐑�
    private boolean m_bAuxOn1;//寮�鍚緟鍔�1
    private boolean m_bAuxOn2;//寮�鍚緟鍔�2
    private boolean m_bIsOnCruise;//鏄惁鍦ㄥ贰鑸�

    private int m_iBrightness;//浜害
    private int m_iContrast;//瀵规瘮搴�
    private int m_iSaturation;//楗卞拰搴�
    private int m_iHue;//鑹插害

    private int m_iVolume;//闊抽噺

    /*************************************************
    鍑芥暟:      JFramePTZControl
    鍑芥暟鎻忚堪:	鏋勯�犲嚱鏁�   Creates new form JFramePTZControl
     *************************************************/
    public JFramePTZControl(NativeLong lRealHandle)
    {
        m_lRealHandle = lRealHandle;
        m_bAutoOn = false;
        m_bLightOn = false;
        m_bWiperOn = false;
        m_bFanOn = false;
        m_bHeaterOn = false;
        m_bAuxOn1 = false;
        m_bAuxOn2 = false;
        m_bIsOnCruise = false;
        
        m_iBrightness = 6;
        m_iContrast = 6;
        m_iSaturation = 6;
        m_iHue = 6;
        m_iVolume = 50;

        initComponents();
        int i;
        for (i = 0; i < HCNetSDK.MAX_PRESET_V30; i++)
        {
            jComboBoxPreset.addItem(i + 1);
        }
        jComboBoxPreset.setSelectedIndex(0);

        //宸¤埅杞ㄨ抗
        for (i = 0; i < HCNetSDK.MAX_CRUISE_V30; i++)
        {
            jComboBoxSeq.addItem(i + 1);
        }
        jComboBoxSeq.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPTZ = new javax.swing.JPanel();
        jButtonAux2 = new javax.swing.JButton();
        jButtonAux1 = new javax.swing.JButton();
        jButton1IrisClose = new javax.swing.JButton();
        jButtonFocusFar = new javax.swing.JButton();
        jButton1ZoomOut = new javax.swing.JButton();
        jButtonRight = new javax.swing.JButton();
        jButtonRightDown = new javax.swing.JButton();
        jButtonRightUp = new javax.swing.JButton();
        jButtonUp = new javax.swing.JButton();
        jButtonAuto = new javax.swing.JButton();
        jButtondown = new javax.swing.JButton();
        jButtonLeftUp = new javax.swing.JButton();
        jButtonLeft = new javax.swing.JButton();
        jButtonLeftDown = new javax.swing.JButton();
        jButtonZoomIn = new javax.swing.JButton();
        jButton1FocusNear = new javax.swing.JButton();
        jButton1IrisOpen = new javax.swing.JButton();
        jButtonLight = new javax.swing.JButton();
        jButtonFanPwron = new javax.swing.JButton();
        jButtonHeater = new javax.swing.JButton();
        jButtonWiperPwron = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSpeed = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jComboBoxPreset = new javax.swing.JComboBox();
        jButtonGotoPreset = new javax.swing.JButton();
        jButtonSetPreset = new javax.swing.JButton();
        jButtonDeletePreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxSeq = new javax.swing.JComboBox();
        jButtonGotoSeq = new javax.swing.JButton();
        jButtonSetSeq = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonTrackStop = new javax.swing.JButton();
        jButtonTrackRun = new javax.swing.JButton();
        jButtonTrackStart = new javax.swing.JButton();
        jPanelVideoPara = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonDefault = new javax.swing.JButton();
        jSliderVolume = new javax.swing.JSlider();
        jSliderHue = new javax.swing.JSlider();
        jSliderSaturation = new javax.swing.JSlider();
        jSliderContrast = new javax.swing.JSlider();
        jSliderBright = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("浜戝彴鎺у埗");

        jPanelPTZ.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonAux2.setText("杈呭姪2");
        jButtonAux2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAux2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAux2ActionPerformed(evt);
            }
        });

        jButtonAux1.setText("杈呭姪");
        jButtonAux1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAux1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAux1ActionPerformed(evt);
            }
        });

        jButton1IrisClose.setText("灏�");
        jButton1IrisClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1IrisClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1IrisCloseMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1IrisCloseMouseReleased(evt);
            }
        });

        jButtonFocusFar.setText("杩�");
        jButtonFocusFar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonFocusFar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonFocusFarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonFocusFarMouseReleased(evt);
            }
        });

        jButton1ZoomOut.setText("浼�");
        jButton1ZoomOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1ZoomOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1ZoomOutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1ZoomOutMouseReleased(evt);
            }
        });

        jButtonRight.setText("鍙�");
        jButtonRight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRightMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonRightMouseReleased(evt);
            }
        });

        jButtonRightDown.setText("鍙充笅");
        jButtonRightDown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonRightDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRightDownMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonRightDownMouseReleased(evt);
            }
        });

        jButtonRightUp.setText("鍙充笂");
        jButtonRightUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonRightUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRightUpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonRightUpMouseReleased(evt);
            }
        });

        jButtonUp.setText("涓�");
        jButtonUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonUpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonUpMouseReleased(evt);
            }
        });

        jButtonAuto.setText("鑷姩");
        jButtonAuto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAutoActionPerformed(evt);
            }
        });

        jButtondown.setText("涓�");
        jButtondown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtondown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtondownMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtondownMouseReleased(evt);
            }
        });

        jButtonLeftUp.setText("宸︿笂");
        jButtonLeftUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonLeftUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonLeftUpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonLeftUpMouseReleased(evt);
            }
        });

        jButtonLeft.setText("宸�");
        jButtonLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonLeftMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonLeftMouseReleased(evt);
            }
        });

        jButtonLeftDown.setText("宸︿笅");
        jButtonLeftDown.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonLeftDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonLeftDownMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonLeftDownMouseReleased(evt);
            }
        });

        jButtonZoomIn.setText("缂�");
        jButtonZoomIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonZoomIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonZoomInMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonZoomInMouseReleased(evt);
            }
        });

        jButton1FocusNear.setText("杩�");
        jButton1FocusNear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1FocusNear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1FocusNearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1FocusNearMouseReleased(evt);
            }
        });

        jButton1IrisOpen.setText("澶�");
        jButton1IrisOpen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1IrisOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1IrisOpenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1IrisOpenMouseReleased(evt);
            }
        });

        jButtonLight.setText("鐏厜");
        jButtonLight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLightActionPerformed(evt);
            }
        });

        jButtonFanPwron.setText("椋庢墖");
        jButtonFanPwron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonFanPwron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFanPwronActionPerformed(evt);
            }
        });

        jButtonHeater.setText("鍔犵儹");
        jButtonHeater.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonHeater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHeaterActionPerformed(evt);
            }
        });

        jButtonWiperPwron.setText("闆ㄥ埛");
        jButtonWiperPwron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonWiperPwron.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWiperPwronActionPerformed(evt);
            }
        });

        jLabel1.setText("鍏夊湀");

        jLabel3.setText("鑱氱劍");

        jLabel2.setText("璋冪劍");

        jLabel4.setText("浜戝彴閫熷害");

        jComboBoxSpeed.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "榛樿", "1", "2", "3", "4", "5" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("棰勭疆鐐�"));

        jButtonGotoPreset.setText("璋冪敤");
        jButtonGotoPreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonGotoPreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGotoPresetActionPerformed(evt);
            }
        });

        jButtonSetPreset.setText("璁剧疆");
        jButtonSetPreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSetPreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetPresetActionPerformed(evt);
            }
        });

        jButtonDeletePreset.setText("鍒犻櫎");
        jButtonDeletePreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonDeletePreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletePresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jComboBoxPreset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGotoPreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSetPreset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDeletePreset))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPreset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGotoPreset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetPreset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeletePreset, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("宸¤埅璺緞"));

        jButtonGotoSeq.setText("璋冪敤");
        jButtonGotoSeq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonGotoSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGotoSeqActionPerformed(evt);
            }
        });

        jButtonSetSeq.setText("璁剧疆");
        jButtonSetSeq.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSetSeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetSeqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jComboBoxSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGotoSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSetSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSeq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSetSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGotoSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("杞ㄩ亾璁板綍"));

        jButtonTrackStop.setText("鍋滄");
        jButtonTrackStop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonTrackStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrackStopActionPerformed(evt);
            }
        });

        jButtonTrackRun.setText("杩愯");
        jButtonTrackRun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonTrackRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrackRunActionPerformed(evt);
            }
        });

        jButtonTrackStart.setText("寮�濮�");
        jButtonTrackStart.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonTrackStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrackStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jButtonTrackStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonTrackStop, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonTrackRun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTrackStop, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTrackStart, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTrackRun, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelPTZLayout = new javax.swing.GroupLayout(jPanelPTZ);
        jPanelPTZ.setLayout(jPanelPTZLayout);
        jPanelPTZLayout.setHorizontalGroup(
            jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPTZLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jButtonLeftUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonRightUp, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jButtonLeftDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtondown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonRightDown, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jButtonZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1ZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jButton1FocusNear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonFocusFar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jButton1IrisOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton1IrisClose, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jButtonLight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonWiperPwron, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonAux1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jButtonFanPwron, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonHeater, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonAux2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPTZLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanelPTZLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelPTZLayout.createSequentialGroup()
                .addComponent(jPanel2, 0, 167, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelPTZLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPTZLayout.setVerticalGroup(
            jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPTZLayout.createSequentialGroup()
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLeftUp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRightUp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLeftDown, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtondown, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRightDown, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1ZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1FocusNear, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButtonFocusFar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1IrisOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1IrisClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLight, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonWiperPwron, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAux1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFanPwron, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHeater, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAux2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPTZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelVideoPara.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelVideoPara.setLayout(null);

        jLabel5.setText("瀵规瘮搴�");
        jPanelVideoPara.add(jLabel5);
        jLabel5.setBounds(10, 50, 36, 15);

        jLabel6.setText("楗卞拰搴�");
        jPanelVideoPara.add(jLabel6);
        jLabel6.setBounds(10, 80, 36, 15);

        jLabel7.setText("鑹插害");
        jPanelVideoPara.add(jLabel7);
        jLabel7.setBounds(10, 110, 24, 15);

        jLabel8.setText("闊抽噺");
        jPanelVideoPara.add(jLabel8);
        jLabel8.setBounds(10, 140, 24, 15);

        jLabel9.setText("浜害");
        jPanelVideoPara.add(jLabel9);
        jLabel9.setBounds(10, 20, 24, 15);

        jButtonDefault.setText("榛樿鍊�");
        jButtonDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDefaultActionPerformed(evt);
            }
        });
        jPanelVideoPara.add(jButtonDefault);
        jButtonDefault.setBounds(50, 200, 70, 23);

        jSliderVolume.setMinimum(1);
        jSliderVolume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderVolumeStateChanged(evt);
            }
        });
        jPanelVideoPara.add(jSliderVolume);
        jSliderVolume.setBounds(60, 140, 110, 20);

        jSliderHue.setMaximum(10);
        jSliderHue.setMinimum(1);
        jSliderHue.setValue(6);
        jSliderHue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderHueStateChanged(evt);
            }
        });
        jPanelVideoPara.add(jSliderHue);
        jSliderHue.setBounds(60, 110, 110, 20);

        jSliderSaturation.setMaximum(10);
        jSliderSaturation.setMinimum(1);
        jSliderSaturation.setValue(6);
        jSliderSaturation.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderSaturationStateChanged(evt);
            }
        });
        jPanelVideoPara.add(jSliderSaturation);
        jSliderSaturation.setBounds(60, 80, 110, 20);

        jSliderContrast.setMaximum(10);
        jSliderContrast.setMinimum(1);
        jSliderContrast.setValue(6);
        jSliderContrast.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderContrastStateChanged(evt);
            }
        });
        jPanelVideoPara.add(jSliderContrast);
        jSliderContrast.setBounds(60, 50, 110, 20);

        jSliderBright.setMaximum(10);
        jSliderBright.setMinimum(1);
        jSliderBright.setValue(6);
        jSliderBright.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderBrightStateChanged(evt);
            }
        });
        jPanelVideoPara.add(jSliderBright);
        jSliderBright.setBounds(60, 20, 110, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPTZ, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelVideoPara, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPTZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelVideoPara, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*************************************************
    鍑芥暟:       宸︿笂 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonLeftUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLeftUpMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.UP_LEFT, 0);
    }//GEN-LAST:event_jButtonLeftUpMousePressed

    private void jButtonLeftUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLeftUpMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.UP_LEFT, 1);
    }//GEN-LAST:event_jButtonLeftUpMouseReleased

    /*************************************************
    鍑芥暟:       鍙充笅 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonRightDownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRightDownMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.DOWN_RIGHT, 0);
    }//GEN-LAST:event_jButtonRightDownMousePressed

    private void jButtonRightDownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRightDownMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.DOWN_RIGHT, 1);
    }//GEN-LAST:event_jButtonRightDownMouseReleased

    /*************************************************
    鍑芥暟:       涓� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.TILT_UP, 0);
    }//GEN-LAST:event_jButtonUpMousePressed

    private void jButtonUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.TILT_UP, 1);
    }//GEN-LAST:event_jButtonUpMouseReleased

    /*************************************************
    鍑芥暟:       涓� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtondownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtondownMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.TILT_DOWN, 0);
    }//GEN-LAST:event_jButtondownMousePressed

    private void jButtondownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtondownMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.TILT_DOWN, 1);
    }//GEN-LAST:event_jButtondownMouseReleased

    /*************************************************
    鍑芥暟:       鍙充笂 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonRightUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRightUpMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.TILT_DOWN, 0);
    }//GEN-LAST:event_jButtonRightUpMousePressed

    private void jButtonRightUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRightUpMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.TILT_DOWN, 1);
    }//GEN-LAST:event_jButtonRightUpMouseReleased

    /*************************************************
    鍑芥暟:       宸︿笅 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonLeftDownMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLeftDownMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.DOWN_LEFT, 0);
    }//GEN-LAST:event_jButtonLeftDownMousePressed

    private void jButtonLeftDownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLeftDownMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.DOWN_LEFT, 1);
    }//GEN-LAST:event_jButtonLeftDownMouseReleased

    /*************************************************
    鍑芥暟:       宸� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonLeftMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLeftMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.PAN_LEFT, 0);
    }//GEN-LAST:event_jButtonLeftMousePressed

    private void jButtonLeftMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLeftMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.PAN_LEFT, 1);
    }//GEN-LAST:event_jButtonLeftMouseReleased

    /*************************************************
    鍑芥暟:       鍙� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonRightMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRightMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.PAN_RIGHT, 0);
    }//GEN-LAST:event_jButtonRightMousePressed

    private void jButtonRightMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRightMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.PAN_RIGHT, 1);
    }//GEN-LAST:event_jButtonRightMouseReleased

    /*************************************************
    鍑芥暟:       璋冪劍 缂� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonZoomInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZoomInMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.ZOOM_IN, 0);
    }//GEN-LAST:event_jButtonZoomInMousePressed

    private void jButtonZoomInMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonZoomInMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.ZOOM_IN, 1);
    }//GEN-LAST:event_jButtonZoomInMouseReleased

    /*************************************************
    鍑芥暟:       璋冪劍 浼� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButton1ZoomOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1ZoomOutMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.ZOOM_OUT, 0);
    }//GEN-LAST:event_jButton1ZoomOutMousePressed

    private void jButton1ZoomOutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1ZoomOutMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.ZOOM_OUT, 1);
    }//GEN-LAST:event_jButton1ZoomOutMouseReleased

    /*************************************************
    鍑芥暟:       鑱氱劍 杩� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButton1FocusNearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1FocusNearMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.FOCUS_NEAR, 0);
    }//GEN-LAST:event_jButton1FocusNearMousePressed

    private void jButton1FocusNearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1FocusNearMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.FOCUS_NEAR, 1);
    }//GEN-LAST:event_jButton1FocusNearMouseReleased

    /*************************************************
    鍑芥暟:       鑱氱劍 杩� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButtonFocusFarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFocusFarMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.FOCUS_FAR, 0);
    }//GEN-LAST:event_jButtonFocusFarMousePressed

    private void jButtonFocusFarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFocusFarMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.FOCUS_FAR, 1);
    }//GEN-LAST:event_jButtonFocusFarMouseReleased

    /*************************************************
    鍑芥暟:       鍏夊湀 寮� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButton1IrisOpenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1IrisOpenMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.IRIS_OPEN, 0);
    }//GEN-LAST:event_jButton1IrisOpenMousePressed

    private void jButton1IrisOpenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1IrisOpenMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.IRIS_OPEN, 1);
    }//GEN-LAST:event_jButton1IrisOpenMouseReleased

    /*************************************************
    鍑芥暟:       鍏夊湀 鍏� 鎸夐挳鐨刾ress鍜宺elease鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
     *************************************************/
    private void jButton1IrisCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1IrisCloseMousePressed
        PTZControlAll(m_lRealHandle, HCNetSDK.IRIS_CLOSE, 0);
    }//GEN-LAST:event_jButton1IrisCloseMousePressed

    private void jButton1IrisCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1IrisCloseMouseReleased
        PTZControlAll(m_lRealHandle, HCNetSDK.IRIS_CLOSE, 1);
    }//GEN-LAST:event_jButton1IrisCloseMouseReleased

    /*************************************************
    鍑芥暟:       "鑷姩"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟  浜戝彴寮�濮�/鍋滄宸﹀彸鑷姩鎵弿
     *************************************************/
    private void jButtonAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAutoActionPerformed
        int iSpeed = jComboBoxSpeed.getSelectedIndex();
        if (!m_bAutoOn)
        {
            if (iSpeed >= 1)
            {
                hCNetSDK.NET_DVR_PTZControlWithSpeed(m_lRealHandle, HCNetSDK.PAN_AUTO, 0, iSpeed);
            } else
            {
                hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.PAN_AUTO, 0);
            }
            jButtonAuto.setText("鍋滄");
            m_bAutoOn = true;
        } else
        {
            if (iSpeed >= 1)
            {
                hCNetSDK.NET_DVR_PTZControlWithSpeed(m_lRealHandle, HCNetSDK.PAN_AUTO, 1, iSpeed);
            } else
            {
                hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.PAN_AUTO, 1);
            }
            jButtonAuto.setText("鑷姩");
            m_bAutoOn = false;
        }
    }//GEN-LAST:event_jButtonAutoActionPerformed

    /*************************************************
    鍑芥暟:       "鐏厜"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟  鎵撳紑/鍏抽棴鐏厜
     *************************************************/
    private void jButtonLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLightActionPerformed
        if (!m_bLightOn)
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.LIGHT_PWRON, 0);
            jButtonLight.setText("鍏崇伅");
            m_bLightOn = true;
        } else
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.LIGHT_PWRON, 1);
            jButtonLight.setText("鐏厜");
            m_bLightOn = false;
        }
    }//GEN-LAST:event_jButtonLightActionPerformed

    /*************************************************
    鍑芥暟:       "闆ㄥ埛"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟  寮�濮�/鍋滄闆ㄥ埛
     *************************************************/
    private void jButtonWiperPwronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWiperPwronActionPerformed
        if (!m_bWiperOn)
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.WIPER_PWRON, 0);
            jButtonWiperPwron.setText("闆ㄥ仠");
            m_bWiperOn = true;
        } else
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.WIPER_PWRON, 1);
            jButtonWiperPwron.setText("闆ㄥ埛");
            m_bWiperOn = false;
        }
    }//GEN-LAST:event_jButtonWiperPwronActionPerformed

    /*************************************************
    鍑芥暟:       "椋庢墖"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟  寮�濮�/鍋滄 椋庢墖
     *************************************************/
    private void jButtonFanPwronActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFanPwronActionPerformed
        if (!m_bFanOn)
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.FAN_PWRON, 0);
            jButtonFanPwron.setText("鍋滈");
            m_bFanOn = true;
        } else
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.FAN_PWRON, 1);
            jButtonFanPwron.setText("椋庢墖");
            m_bFanOn = false;
        }
    }//GEN-LAST:event_jButtonFanPwronActionPerformed

    /*************************************************
    鍑芥暟:       "鍔犵儹"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟  寮�濮�/鍋滄 鍔犵儹
     *************************************************/
    private void jButtonHeaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHeaterActionPerformed
        if (!m_bHeaterOn)
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.HEATER_PWRON, 0);
            jButtonHeater.setText("鍋滄");
            m_bHeaterOn = true;
        } else
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.HEATER_PWRON, 1);
            jButtonHeater.setText("鍔犵儹");
            m_bHeaterOn = false;
        }
    }//GEN-LAST:event_jButtonHeaterActionPerformed

    /*************************************************
    鍑芥暟:       "杈呭姪1"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟  寮�濮�/鍋滄 杈呭姪1
     *************************************************/
    private void jButtonAux1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAux1ActionPerformed
        if (!m_bAuxOn1)
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.AUX_PWRON1, 0);
            jButtonAux1.setText("鍋滄1");
            m_bAuxOn1 = true;
        } else
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.AUX_PWRON1, 1);
            jButtonAux1.setText("杈呭姪1");
            m_bAuxOn1 = false;
        }
    }//GEN-LAST:event_jButtonAux1ActionPerformed

    /*************************************************
    鍑芥暟:       "杈呭姪2"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟  寮�濮�/鍋滄 杈呭姪2
     *************************************************/
    private void jButtonAux2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAux2ActionPerformed
        if (!m_bAuxOn2)
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.AUX_PWRON1, 0);
            jButtonAux2.setText("鍋滄2");
            m_bAuxOn2 = true;
        } else
        {
            hCNetSDK.NET_DVR_PTZControl(m_lRealHandle, HCNetSDK.AUX_PWRON1, 1);
            jButtonAux2.setText("杈呭姪2");
            m_bAuxOn2 = false;
        }
    }//GEN-LAST:event_jButtonAux2ActionPerformed

    /*************************************************
    鍑芥暟:       杞ㄩ亾璁板綍  "寮�濮�"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	寮�濮嬭建閬撹褰�
     *************************************************/
    private void jButtonTrackStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrackStartActionPerformed
        if (!hCNetSDK.NET_DVR_PTZTrack(m_lRealHandle, HCNetSDK.STA_MEM_CRUISE))
        {
            JOptionPane.showMessageDialog(this, "寮�濮嬭褰曡建杩瑰け璐�");
            return;
        }
    }//GEN-LAST:event_jButtonTrackStartActionPerformed

    /*************************************************
    鍑芥暟:       杞ㄩ亾璁板綍  "鍋滄"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	鍋滄杞ㄩ亾璁板綍
     *************************************************/
    private void jButtonTrackStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrackStopActionPerformed
        if (!hCNetSDK.NET_DVR_PTZTrack(m_lRealHandle, HCNetSDK.STO_MEM_CRUISE))
        {
            JOptionPane.showMessageDialog(this, "鍋滄璁板綍杞ㄩ亾澶辫触");
            return;
        }
    }//GEN-LAST:event_jButtonTrackStopActionPerformed

    /*************************************************
    鍑芥暟:       杞ㄩ亾璁板綍  "杩愯"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	杩愯杞ㄩ亾璁板綍
     *************************************************/
    private void jButtonTrackRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrackRunActionPerformed
        if (!hCNetSDK.NET_DVR_PTZTrack(m_lRealHandle, HCNetSDK.RUN_CRUISE))
        {
            JOptionPane.showMessageDialog(this, "杩愯杞ㄨ抗澶辫触");
            return;
        }
    }//GEN-LAST:event_jButtonTrackRunActionPerformed

    /*************************************************
    鍑芥暟:       棰勭疆鐐�  "璋冪敤"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	璋冪敤棰勭疆鐐�
     *************************************************/
    private void jButtonGotoPresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGotoPresetActionPerformed
        int iPreset = jComboBoxPreset.getSelectedIndex() + 1;
        if (!hCNetSDK.NET_DVR_PTZPreset(m_lRealHandle, HCNetSDK.GOTO_PRESET, iPreset))
        {
            JOptionPane.showMessageDialog(this, "璋冪敤棰勭疆鐐瑰け璐�");
            return;
        }
    }//GEN-LAST:event_jButtonGotoPresetActionPerformed

    /*************************************************
    鍑芥暟:       棰勭疆鐐�  "璁剧疆"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	璁剧疆棰勭疆鐐�
     *************************************************/
    private void jButtonSetPresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetPresetActionPerformed
        int iPreset = jComboBoxPreset.getSelectedIndex() + 1;
        if (!hCNetSDK.NET_DVR_PTZPreset(m_lRealHandle, HCNetSDK.SET_PRESET, iPreset))
        {
            JOptionPane.showMessageDialog(this, "璁剧疆棰勭疆鐐瑰け璐�");
            return;
        }
    }//GEN-LAST:event_jButtonSetPresetActionPerformed

    /*************************************************
    鍑芥暟:       棰勭疆鐐�  "鍒犻櫎"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	鍒犻櫎棰勭疆鐐�
     *************************************************/
    private void jButtonDeletePresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletePresetActionPerformed
        int iPreset = jComboBoxPreset.getSelectedIndex() + 1;
        if (!hCNetSDK.NET_DVR_PTZPreset(m_lRealHandle, HCNetSDK.CLE_PRESET, iPreset))
        {
            JOptionPane.showMessageDialog(this, "璁剧疆棰勭疆鐐瑰け璐�");
            return;
        }
    }//GEN-LAST:event_jButtonDeletePresetActionPerformed

    /*************************************************
    鍑芥暟:       宸¤埅璺緞  "璋冪敤"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	璋冪敤宸¤埅璺緞
     *************************************************/
    private void jButtonGotoSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGotoSeqActionPerformed
        byte iSeq = (byte) (jComboBoxSeq.getSelectedIndex() + 1);
        if (!m_bIsOnCruise)
        {
            if (!hCNetSDK.NET_DVR_PTZCruise(m_lRealHandle, HCNetSDK.RUN_SEQ, iSeq, (byte) 0, (short) 0))
            {
                JOptionPane.showMessageDialog(this, "璋冪敤宸¤埅澶辫触");
                return;
            }
        }
    }//GEN-LAST:event_jButtonGotoSeqActionPerformed

    /*************************************************
    鍑芥暟:       宸¤埅璺緞  "璁剧疆"鎸夐挳  鍙屽嚮鍝嶅簲鍑芥暟
    鍑芥暟鎻忚堪:	璁剧疆宸¤埅璺緞
     *************************************************/
    private void jButtonSetSeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetSeqActionPerformed
        JDialogPTZCruise dlgPTZCruise = new JDialogPTZCruise(this, true, m_lRealHandle);
        dlgPTZCruise.setBounds(this.getX(), this.getY(), 350, 270);
        dlgPTZCruise.setVisible(true);
    }//GEN-LAST:event_jButtonSetSeqActionPerformed

    private void jSliderBrightStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSliderBrightStateChanged
    {//GEN-HEADEREND:event_jSliderBrightStateChanged
        m_iBrightness = jSliderBright.getValue();
        setVideoEffect();
    }//GEN-LAST:event_jSliderBrightStateChanged

    private void jSliderContrastStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSliderContrastStateChanged
    {//GEN-HEADEREND:event_jSliderContrastStateChanged
        m_iContrast = jSliderContrast.getValue();
        setVideoEffect();
    }//GEN-LAST:event_jSliderContrastStateChanged

    private void jSliderSaturationStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSliderSaturationStateChanged
    {//GEN-HEADEREND:event_jSliderSaturationStateChanged
        m_iSaturation = jSliderSaturation.getValue();
        setVideoEffect();
    }//GEN-LAST:event_jSliderSaturationStateChanged

    private void jSliderHueStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSliderHueStateChanged
    {//GEN-HEADEREND:event_jSliderHueStateChanged
        m_iHue = jSliderHue.getValue();
        setVideoEffect();
    }//GEN-LAST:event_jSliderHueStateChanged

    private void jSliderVolumeStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_jSliderVolumeStateChanged
    {//GEN-HEADEREND:event_jSliderVolumeStateChanged
        m_iVolume = jSliderVolume.getValue();

        if (ClientDemo.g_lVoiceHandle.intValue() >= 0)
        {
            hCNetSDK.NET_DVR_SetVoiceComClientVolume(ClientDemo.g_lVoiceHandle, (short) (m_iVolume * ((0xffff) / 100)));
        }
    }//GEN-LAST:event_jSliderVolumeStateChanged

    private void jButtonDefaultActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButtonDefaultActionPerformed
    {//GEN-HEADEREND:event_jButtonDefaultActionPerformed
        m_iBrightness = 6;
        m_iContrast = 6;
        m_iSaturation = 6;
        m_iHue = 6;
        m_iVolume = 50;

        jSliderBright.setValue(6);
        jSliderContrast.setValue(6);
        jSliderSaturation.setValue(6);
        jSliderHue.setValue(6);
        jSliderVolume.setValue(50);

        setVideoEffect();
    }//GEN-LAST:event_jButtonDefaultActionPerformed

    private boolean setVideoEffect()
    {
        if(!hCNetSDK.NET_DVR_ClientSetVideoEffect(m_lRealHandle, m_iBrightness, m_iContrast, m_iSaturation, m_iHue))
        {
            JOptionPane.showMessageDialog(this, "璁剧疆棰勮瑙嗛鏄剧ず鍙傛暟澶辫触");
            return false;
        }
        else
        {
            return true;
        }
    }

    /*************************************************
    鍑芥暟鍚�:    PTZControlAll
    鍑芥暟鎻忚堪:	浜戝彴鎺у埗鍑芥暟
    杈撳叆鍙傛暟:
    lRealHandle: 棰勮鍙ユ焺
    iPTZCommand: PTZ鎺у埗鍛戒护
    iStop: 寮�濮嬫垨鏄仠姝㈡搷浣�
    杈撳嚭鍙傛暟:
    杩斿洖鍊�:
     *************************************************/
    private void PTZControlAll(NativeLong lRealHandle, int iPTZCommand, int iStop)
    {
        int iSpeed = jComboBoxSpeed.getSelectedIndex();
        if (lRealHandle.intValue() >= 0)
        {
            boolean ret;
            if (iSpeed >= 1)//鏈夐�熷害鐨刾tz
            {
                ret = hCNetSDK.NET_DVR_PTZControlWithSpeed(lRealHandle, iPTZCommand, iStop, iSpeed);
                if (!ret)
                {
                    JOptionPane.showMessageDialog(this, "浜戝彴鎺у埗澶辫触");
                    return;
                }
            } else//閫熷害涓洪粯璁ゆ椂
            {
                ret = hCNetSDK.NET_DVR_PTZControl(lRealHandle, iPTZCommand, iStop);
                if (!ret)
                {
                    JOptionPane.showMessageDialog(this, "浜戝彴鎺у埗澶辫触");
                    return;
                }
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1FocusNear;
    private javax.swing.JButton jButton1IrisClose;
    private javax.swing.JButton jButton1IrisOpen;
    private javax.swing.JButton jButton1ZoomOut;
    private javax.swing.JButton jButtonAuto;
    private javax.swing.JButton jButtonAux1;
    private javax.swing.JButton jButtonAux2;
    private javax.swing.JButton jButtonDefault;
    private javax.swing.JButton jButtonDeletePreset;
    private javax.swing.JButton jButtonFanPwron;
    private javax.swing.JButton jButtonFocusFar;
    private javax.swing.JButton jButtonGotoPreset;
    private javax.swing.JButton jButtonGotoSeq;
    private javax.swing.JButton jButtonHeater;
    private javax.swing.JButton jButtonLeft;
    private javax.swing.JButton jButtonLeftDown;
    private javax.swing.JButton jButtonLeftUp;
    private javax.swing.JButton jButtonLight;
    private javax.swing.JButton jButtonRight;
    private javax.swing.JButton jButtonRightDown;
    private javax.swing.JButton jButtonRightUp;
    private javax.swing.JButton jButtonSetPreset;
    private javax.swing.JButton jButtonSetSeq;
    private javax.swing.JButton jButtonTrackRun;
    private javax.swing.JButton jButtonTrackStart;
    private javax.swing.JButton jButtonTrackStop;
    private javax.swing.JButton jButtonUp;
    private javax.swing.JButton jButtonWiperPwron;
    private javax.swing.JButton jButtonZoomIn;
    private javax.swing.JButton jButtondown;
    private javax.swing.JComboBox jComboBoxPreset;
    private javax.swing.JComboBox jComboBoxSeq;
    private javax.swing.JComboBox jComboBoxSpeed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPTZ;
    private javax.swing.JPanel jPanelVideoPara;
    private javax.swing.JSlider jSliderBright;
    private javax.swing.JSlider jSliderContrast;
    private javax.swing.JSlider jSliderHue;
    private javax.swing.JSlider jSliderSaturation;
    private javax.swing.JSlider jSliderVolume;
    // End of variables declaration//GEN-END:variables
}
