/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Fani Salamah
 */
public class PilihTempat extends javax.swing.JFrame {
    int selectedFilm;
    int selectedTime;
    ArrayList<Integer> selected;
    ArrayList<String> selectedSeatName;

    /**
     * Creates new form PilihTempat
     */
    public PilihTempat(int film, int jam) {
        initComponents();
        selected = new ArrayList<>();
        selectedSeatName = new ArrayList<>();
        
        this.selectedFilm = film;
        this.selectedTime = jam;

        Seat seat;
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(0);
        seat1.setText(seat.getName());
        seat1.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(1);
        seat2.setText(seat.getName());
        seat2.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(2);
        seat3.setText(seat.getName());
        seat3.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(3);
        seat4.setText(seat.getName());
        seat4.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(4);
        seat5.setText(seat.getName());
        seat5.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(5);
        seat6.setText(seat.getName());
        seat6.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(6);
        seat7.setText(seat.getName());
        seat7.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(7);
        seat8.setText(seat.getName());
        seat8.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(8);
        seat9.setText(seat.getName());
        seat9.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(9);
        seat10.setText(seat.getName());
        seat10.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(10);
        seat11.setText(seat.getName());
        seat11.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(11);
        seat12.setText(seat.getName());
        seat12.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(12);
        seat13.setText(seat.getName());
        seat13.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(13);
        seat14.setText(seat.getName());
        seat14.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(14);
        seat15.setText(seat.getName());
        seat15.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(15);
        seat16.setText(seat.getName());
        seat16.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(16);
        seat17.setText(seat.getName());
        seat17.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(17);
        seat18.setText(seat.getName());
        seat18.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(18);
        seat19.setText(seat.getName());
        seat19.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(19);
        seat20.setText(seat.getName());
        seat20.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(20);
        seat21.setText(seat.getName());
        seat21.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(21);
        seat22.setText(seat.getName());
        seat22.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(22);
        seat23.setText(seat.getName());
        seat23.setEnabled(seat.seat_available);
        seat = TiketBioskop.filmList.get(film).timeList.get(jam).seatList.get(23);
        seat24.setText(seat.getName());
        seat24.setEnabled(seat.seat_available);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnd_next = new javax.swing.JButton();
        seat1 = new javax.swing.JToggleButton();
        seat2 = new javax.swing.JToggleButton();
        seat3 = new javax.swing.JToggleButton();
        seat4 = new javax.swing.JToggleButton();
        seat5 = new javax.swing.JToggleButton();
        seat6 = new javax.swing.JToggleButton();
        seat7 = new javax.swing.JToggleButton();
        seat8 = new javax.swing.JToggleButton();
        seat9 = new javax.swing.JToggleButton();
        seat10 = new javax.swing.JToggleButton();
        seat11 = new javax.swing.JToggleButton();
        seat12 = new javax.swing.JToggleButton();
        seat13 = new javax.swing.JToggleButton();
        seat14 = new javax.swing.JToggleButton();
        seat15 = new javax.swing.JToggleButton();
        seat16 = new javax.swing.JToggleButton();
        seat17 = new javax.swing.JToggleButton();
        seat18 = new javax.swing.JToggleButton();
        seat19 = new javax.swing.JToggleButton();
        seat20 = new javax.swing.JToggleButton();
        seat21 = new javax.swing.JToggleButton();
        seat22 = new javax.swing.JToggleButton();
        seat23 = new javax.swing.JToggleButton();
        seat24 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 580));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PILIH TEMPAT DUDUK");

        btnd_next.setText("PESAN");
        btnd_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnd_nextActionPerformed(evt);
            }
        });

        seat1.setMaximumSize(new java.awt.Dimension(60, 30));
        seat1.setMinimumSize(new java.awt.Dimension(45, 23));
        seat1.setPreferredSize(new java.awt.Dimension(60, 30));
        seat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat1ActionPerformed(evt);
            }
        });

        seat2.setMaximumSize(new java.awt.Dimension(45, 23));
        seat2.setMinimumSize(new java.awt.Dimension(45, 23));
        seat2.setPreferredSize(new java.awt.Dimension(45, 23));
        seat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat2ActionPerformed(evt);
            }
        });

        seat3.setMaximumSize(new java.awt.Dimension(45, 23));
        seat3.setMinimumSize(new java.awt.Dimension(45, 23));
        seat3.setPreferredSize(new java.awt.Dimension(65, 35));
        seat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat3ActionPerformed(evt);
            }
        });

        seat4.setMaximumSize(new java.awt.Dimension(45, 23));
        seat4.setMinimumSize(new java.awt.Dimension(45, 23));
        seat4.setPreferredSize(new java.awt.Dimension(65, 35));
        seat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat4ActionPerformed(evt);
            }
        });

        seat5.setMaximumSize(new java.awt.Dimension(45, 23));
        seat5.setMinimumSize(new java.awt.Dimension(45, 23));
        seat5.setPreferredSize(new java.awt.Dimension(65, 33));
        seat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat5ActionPerformed(evt);
            }
        });

        seat6.setMaximumSize(new java.awt.Dimension(45, 23));
        seat6.setMinimumSize(new java.awt.Dimension(45, 23));
        seat6.setPreferredSize(new java.awt.Dimension(65, 33));
        seat6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat6ActionPerformed(evt);
            }
        });

        seat7.setMaximumSize(new java.awt.Dimension(65, 35));
        seat7.setMinimumSize(new java.awt.Dimension(45, 23));
        seat7.setPreferredSize(new java.awt.Dimension(65, 35));
        seat7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat7ActionPerformed(evt);
            }
        });

        seat8.setMaximumSize(new java.awt.Dimension(45, 23));
        seat8.setMinimumSize(new java.awt.Dimension(45, 23));
        seat8.setPreferredSize(new java.awt.Dimension(45, 23));
        seat8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat8ActionPerformed(evt);
            }
        });

        seat9.setMaximumSize(new java.awt.Dimension(45, 23));
        seat9.setMinimumSize(new java.awt.Dimension(45, 23));
        seat9.setPreferredSize(new java.awt.Dimension(45, 23));
        seat9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat9ActionPerformed(evt);
            }
        });

        seat10.setMaximumSize(new java.awt.Dimension(45, 23));
        seat10.setMinimumSize(new java.awt.Dimension(45, 23));
        seat10.setPreferredSize(new java.awt.Dimension(45, 23));
        seat10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat10ActionPerformed(evt);
            }
        });

        seat11.setMaximumSize(new java.awt.Dimension(45, 23));
        seat11.setMinimumSize(new java.awt.Dimension(45, 23));
        seat11.setPreferredSize(new java.awt.Dimension(45, 23));
        seat11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat11ActionPerformed(evt);
            }
        });

        seat12.setMaximumSize(new java.awt.Dimension(45, 23));
        seat12.setMinimumSize(new java.awt.Dimension(45, 23));
        seat12.setPreferredSize(new java.awt.Dimension(65, 33));
        seat12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat12ActionPerformed(evt);
            }
        });

        seat13.setMaximumSize(new java.awt.Dimension(45, 23));
        seat13.setMinimumSize(new java.awt.Dimension(45, 23));
        seat13.setPreferredSize(new java.awt.Dimension(45, 23));
        seat13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat13ActionPerformed(evt);
            }
        });

        seat14.setMaximumSize(new java.awt.Dimension(45, 23));
        seat14.setMinimumSize(new java.awt.Dimension(45, 23));
        seat14.setPreferredSize(new java.awt.Dimension(45, 23));
        seat14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat14ActionPerformed(evt);
            }
        });

        seat15.setMaximumSize(new java.awt.Dimension(45, 23));
        seat15.setMinimumSize(new java.awt.Dimension(45, 23));
        seat15.setPreferredSize(new java.awt.Dimension(45, 23));
        seat15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat15ActionPerformed(evt);
            }
        });

        seat16.setMaximumSize(new java.awt.Dimension(45, 23));
        seat16.setMinimumSize(new java.awt.Dimension(45, 23));
        seat16.setPreferredSize(new java.awt.Dimension(45, 23));
        seat16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat16ActionPerformed(evt);
            }
        });

        seat17.setMaximumSize(new java.awt.Dimension(45, 23));
        seat17.setMinimumSize(new java.awt.Dimension(45, 23));
        seat17.setPreferredSize(new java.awt.Dimension(45, 23));
        seat17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat17ActionPerformed(evt);
            }
        });

        seat18.setMaximumSize(new java.awt.Dimension(45, 23));
        seat18.setMinimumSize(new java.awt.Dimension(45, 23));
        seat18.setPreferredSize(new java.awt.Dimension(45, 23));
        seat18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat18ActionPerformed(evt);
            }
        });

        seat19.setMaximumSize(new java.awt.Dimension(45, 23));
        seat19.setMinimumSize(new java.awt.Dimension(45, 23));
        seat19.setPreferredSize(new java.awt.Dimension(45, 23));
        seat19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat19ActionPerformed(evt);
            }
        });

        seat20.setMaximumSize(new java.awt.Dimension(45, 23));
        seat20.setMinimumSize(new java.awt.Dimension(45, 23));
        seat20.setPreferredSize(new java.awt.Dimension(45, 23));
        seat20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat20ActionPerformed(evt);
            }
        });

        seat21.setMaximumSize(new java.awt.Dimension(45, 23));
        seat21.setMinimumSize(new java.awt.Dimension(45, 23));
        seat21.setPreferredSize(new java.awt.Dimension(45, 23));
        seat21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat21ActionPerformed(evt);
            }
        });

        seat22.setMaximumSize(new java.awt.Dimension(45, 23));
        seat22.setMinimumSize(new java.awt.Dimension(45, 23));
        seat22.setPreferredSize(new java.awt.Dimension(45, 23));
        seat22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat22ActionPerformed(evt);
            }
        });

        seat23.setMaximumSize(new java.awt.Dimension(45, 23));
        seat23.setMinimumSize(new java.awt.Dimension(45, 23));
        seat23.setPreferredSize(new java.awt.Dimension(45, 23));
        seat23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat23ActionPerformed(evt);
            }
        });

        seat24.setMaximumSize(new java.awt.Dimension(45, 23));
        seat24.setMinimumSize(new java.awt.Dimension(45, 23));
        seat24.setPreferredSize(new java.awt.Dimension(45, 23));
        seat24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seat24ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("POSISI SCREEN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnd_next, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seat14, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(seat20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(seat21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seat4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(seat10, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(seat16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seat5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seat11, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(seat17, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(seat23, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(seat24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seat6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seat2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(seat3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(seat4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(seat5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seat6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seat1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seat9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(seat7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(seat8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(seat14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seat15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seat17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seat18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seat16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seat13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seat22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seat24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seat23, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seat19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seat21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seat20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnd_next, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnd_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnd_nextActionPerformed
        //this.setVisible(false);
        //new CetakTiket().setVisible(true);
        Collections.sort(this.selected);
        
        String seatname;
        this.selectedSeatName.removeAll(selectedSeatName);

        Iterator<Integer> iter = this.selected.iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            seatname = TiketBioskop.filmList.get(this.selectedFilm).timeList.get(this.selectedTime).seatList.get(next).getName();
            this.selectedSeatName.add(seatname);
        }
        this.actionBuy();
    }//GEN-LAST:event_btnd_nextActionPerformed

    private void actionBuy() {
        Iterator<Integer> iter = this.selected.iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            TiketBioskop.filmList.get(this.selectedFilm).timeList.get(this.selectedTime).seatList.get(next).buy();
        }
        Transaksi trans = new Transaksi();
        trans.time = LocalDateTime.now();
        trans.filmName = TiketBioskop.filmList.get(this.selectedFilm).getName();
        trans.pricePerSeat = TiketBioskop.filmList.get(this.selectedFilm).timeList.get(this.selectedTime).getPrice();
        trans.priceTotal = this.selected.size() * trans.pricePerSeat;
        trans.showTime = TiketBioskop.filmList.get(this.selectedFilm).timeList.get(this.selectedTime).getTime();
        trans.seats = this.selectedSeatName;
        TiketBioskop.transaksi.add(trans);
        this.setVisible(false);
        new CetakTiket(trans).setVisible(true);
    }
    
    private void seat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat1ActionPerformed
        if (seat1.isSelected()) {
            selected.add(0);
        } else {
            selected.remove(new Integer(0));
        }
    }//GEN-LAST:event_seat1ActionPerformed

    private void seat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat2ActionPerformed
        if (seat2.isSelected()) {
            selected.add(1);
        } else {
            selected.remove(new Integer(1));
        }
    }//GEN-LAST:event_seat2ActionPerformed

    private void seat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat3ActionPerformed
        if (seat3.isSelected()) {
            selected.add(2);
        } else {
            selected.remove(new Integer(2));
        }
    }//GEN-LAST:event_seat3ActionPerformed

    private void seat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat4ActionPerformed
        if (seat4.isSelected()) {
            selected.add(3);
        } else {
            selected.remove(new Integer(3));
        }
    }//GEN-LAST:event_seat4ActionPerformed

    private void seat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat5ActionPerformed
        if (seat5.isSelected()) {
            selected.add(4);
        } else {
            selected.remove(new Integer(4));
        }
    }//GEN-LAST:event_seat5ActionPerformed

    private void seat6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat6ActionPerformed
        if (seat6.isSelected()) {
            selected.add(5);
        } else {
            selected.remove(new Integer(5));
        }
    }//GEN-LAST:event_seat6ActionPerformed

    private void seat7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat7ActionPerformed
        if (seat7.isSelected()) {
            selected.add(6);
        } else {
            selected.remove(new Integer(6));
        }
    }//GEN-LAST:event_seat7ActionPerformed

    private void seat8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat8ActionPerformed
        if (seat8.isSelected()) {
            selected.add(7);
        } else {
            selected.remove(new Integer(7));
        }
    }//GEN-LAST:event_seat8ActionPerformed

    private void seat9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat9ActionPerformed
        if (seat9.isSelected()) {
            selected.add(8);
        } else {
            selected.remove(new Integer(8));
        }
    }//GEN-LAST:event_seat9ActionPerformed

    private void seat10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat10ActionPerformed
        if (seat10.isSelected()) {
            selected.add(9);
        } else {
            selected.remove(new Integer(9));
        }
    }//GEN-LAST:event_seat10ActionPerformed

    private void seat11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat11ActionPerformed
        if (seat11.isSelected()) {
            selected.add(10);
        } else {
            selected.remove(new Integer(10));
        }
    }//GEN-LAST:event_seat11ActionPerformed

    private void seat12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat12ActionPerformed
        if (seat12.isSelected()) {
            selected.add(11);
        } else {
            selected.remove(new Integer(11));
        }
    }//GEN-LAST:event_seat12ActionPerformed

    private void seat13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat13ActionPerformed
        if (seat13.isSelected()) {
            selected.add(12);
        } else {
            selected.remove(new Integer(12));
        }
    }//GEN-LAST:event_seat13ActionPerformed

    private void seat14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat14ActionPerformed
        if (seat14.isSelected()) {
            selected.add(13);
        } else {
            selected.remove(new Integer(13));
        }
    }//GEN-LAST:event_seat14ActionPerformed

    private void seat15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat15ActionPerformed
        if (seat15.isSelected()) {
            selected.add(14);
        } else {
            selected.remove(new Integer(14));
        }
    }//GEN-LAST:event_seat15ActionPerformed

    private void seat16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat16ActionPerformed
        if (seat16.isSelected()) {
            selected.add(15);
        } else {
            selected.remove(new Integer(15));
        }
    }//GEN-LAST:event_seat16ActionPerformed

    private void seat17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat17ActionPerformed
        if (seat17.isSelected()) {
            selected.add(16);
        } else {
            selected.remove(new Integer(16));
        }
    }//GEN-LAST:event_seat17ActionPerformed

    private void seat18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat18ActionPerformed
        if (seat18.isSelected()) {
            selected.add(17);
        } else {
            selected.remove(new Integer(17));
        }
    }//GEN-LAST:event_seat18ActionPerformed

    private void seat19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat19ActionPerformed
        if (seat19.isSelected()) {
            selected.add(18);
        } else {
            selected.remove(new Integer(18));
        }
    }//GEN-LAST:event_seat19ActionPerformed

    private void seat20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat20ActionPerformed
        if (seat20.isSelected()) {
            selected.add(19);
        } else {
            selected.remove(new Integer(19));
        }
    }//GEN-LAST:event_seat20ActionPerformed

    private void seat21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat21ActionPerformed
        if (seat21.isSelected()) {
            selected.add(20);
        } else {
            selected.remove(new Integer(20));
        }
    }//GEN-LAST:event_seat21ActionPerformed

    private void seat22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat22ActionPerformed
        if (seat22.isSelected()) {
            selected.add(21);
        } else {
            selected.remove(new Integer(21));
        }
    }//GEN-LAST:event_seat22ActionPerformed

    private void seat23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat23ActionPerformed
        if (seat23.isSelected()) {
            selected.add(22);
        } else {
            selected.remove(new Integer(22));
        }
    }//GEN-LAST:event_seat23ActionPerformed

    private void seat24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seat24ActionPerformed
        if (seat24.isSelected()) {
            selected.add(23);
        } else {
            selected.remove(new Integer(23));
        }
    }//GEN-LAST:event_seat24ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PilihTempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihTempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihTempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihTempat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihTempat(0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnd_next;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton seat1;
    private javax.swing.JToggleButton seat10;
    private javax.swing.JToggleButton seat11;
    private javax.swing.JToggleButton seat12;
    private javax.swing.JToggleButton seat13;
    private javax.swing.JToggleButton seat14;
    private javax.swing.JToggleButton seat15;
    private javax.swing.JToggleButton seat16;
    private javax.swing.JToggleButton seat17;
    private javax.swing.JToggleButton seat18;
    private javax.swing.JToggleButton seat19;
    private javax.swing.JToggleButton seat2;
    private javax.swing.JToggleButton seat20;
    private javax.swing.JToggleButton seat21;
    private javax.swing.JToggleButton seat22;
    private javax.swing.JToggleButton seat23;
    private javax.swing.JToggleButton seat24;
    private javax.swing.JToggleButton seat3;
    private javax.swing.JToggleButton seat4;
    private javax.swing.JToggleButton seat5;
    private javax.swing.JToggleButton seat6;
    private javax.swing.JToggleButton seat7;
    private javax.swing.JToggleButton seat8;
    private javax.swing.JToggleButton seat9;
    // End of variables declaration//GEN-END:variables
}
