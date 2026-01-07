package paquete;

public class calculadora extends javax.swing.JFrame {
    
    public float numero_a;
    public float numero_b;
    public String operador;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(calculadora.class.getName());

    public calculadora() {
        initComponents();
        //funcion para que al abrir la ventana aparezca al centro de la pantalla
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resultado = new javax.swing.JLabel();
        boton_reiniciar = new javax.swing.JButton();
        boton_porcentaje = new javax.swing.JButton();
        boton_borrar = new javax.swing.JButton();
        boton_dividir = new javax.swing.JButton();
        boton_siete = new javax.swing.JButton();
        boton_cuatro = new javax.swing.JButton();
        boton_uno = new javax.swing.JButton();
        boton_ocho = new javax.swing.JButton();
        boton_dos = new javax.swing.JButton();
        boton_cinco = new javax.swing.JButton();
        boton_nueve = new javax.swing.JButton();
        boton_seis = new javax.swing.JButton();
        boton_tres = new javax.swing.JButton();
        boton_multiplicar = new javax.swing.JButton();
        boton_restar = new javax.swing.JButton();
        boton_sumar = new javax.swing.JButton();
        boton_cero = new javax.swing.JButton();
        boton_punto = new javax.swing.JButton();
        boton_igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        resultado.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        resultado.setOpaque(true);

        boton_reiniciar.setText("CE");
        boton_reiniciar.addActionListener(this::boton_reiniciarActionPerformed);

        boton_porcentaje.setText("%");
        boton_porcentaje.addActionListener(this::boton_porcentajeActionPerformed);

        boton_borrar.setText("C");
        boton_borrar.addActionListener(this::boton_borrarActionPerformed);

        boton_dividir.setText("/");
        boton_dividir.addActionListener(this::boton_dividirActionPerformed);

        boton_siete.setText("7");
        boton_siete.addActionListener(this::boton_sieteActionPerformed);

        boton_cuatro.setText("4");
        boton_cuatro.addActionListener(this::boton_cuatroActionPerformed);

        boton_uno.setText("1");
        boton_uno.addActionListener(this::boton_unoActionPerformed);

        boton_ocho.setText("8");
        boton_ocho.addActionListener(this::boton_ochoActionPerformed);

        boton_dos.setText("2");
        boton_dos.addActionListener(this::boton_dosActionPerformed);

        boton_cinco.setText("5");
        boton_cinco.addActionListener(this::boton_cincoActionPerformed);

        boton_nueve.setText("9");
        boton_nueve.addActionListener(this::boton_nueveActionPerformed);

        boton_seis.setText("6");
        boton_seis.addActionListener(this::boton_seisActionPerformed);

        boton_tres.setText("3");
        boton_tres.addActionListener(this::boton_tresActionPerformed);

        boton_multiplicar.setText("x");
        boton_multiplicar.addActionListener(this::boton_multiplicarActionPerformed);

        boton_restar.setText("-");
        boton_restar.addActionListener(this::boton_restarActionPerformed);

        boton_sumar.setText("+");
        boton_sumar.addActionListener(this::boton_sumarActionPerformed);

        boton_cero.setText("0");
        boton_cero.addActionListener(this::boton_ceroActionPerformed);

        boton_punto.setText(".");
        boton_punto.addActionListener(this::boton_puntoActionPerformed);

        boton_igual.setText("=");
        boton_igual.addActionListener(this::boton_igualActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_restar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_siete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_seis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_restar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_uno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_dos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_tres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_cero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ceroActionPerformed
        //el metodo set para mandar el valor como cero
        //el metodo get para capturar el valor existente en la casilla
        this.resultado.setText(this.resultado.getText()+"0");
    }//GEN-LAST:event_boton_ceroActionPerformed

    private void boton_reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reiniciarActionPerformed
        this.resultado.setText("");
    }//GEN-LAST:event_boton_reiniciarActionPerformed

    private void boton_unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_unoActionPerformed
        this.resultado.setText(this.resultado.getText()+"1");
    }//GEN-LAST:event_boton_unoActionPerformed

    private void boton_dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_dosActionPerformed
        this.resultado.setText(this.resultado.getText()+"2");
    }//GEN-LAST:event_boton_dosActionPerformed

    private void boton_tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_tresActionPerformed
        this.resultado.setText(this.resultado.getText()+"3");
    }//GEN-LAST:event_boton_tresActionPerformed

    private void boton_cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cuatroActionPerformed
        this.resultado.setText(this.resultado.getText()+"4");
    }//GEN-LAST:event_boton_cuatroActionPerformed

    private void boton_cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cincoActionPerformed
        this.resultado.setText(this.resultado.getText()+"5");
    }//GEN-LAST:event_boton_cincoActionPerformed

    private void boton_seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_seisActionPerformed
        this.resultado.setText(this.resultado.getText()+"6");
    }//GEN-LAST:event_boton_seisActionPerformed

    private void boton_sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sieteActionPerformed
        this.resultado.setText(this.resultado.getText()+"7");
    }//GEN-LAST:event_boton_sieteActionPerformed

    private void boton_ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ochoActionPerformed
        this.resultado.setText(this.resultado.getText()+"8");
    }//GEN-LAST:event_boton_ochoActionPerformed

    private void boton_nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nueveActionPerformed
        this.resultado.setText(this.resultado.getText()+"9");
    }//GEN-LAST:event_boton_nueveActionPerformed

    private void boton_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_puntoActionPerformed
        //solo si el texto en la pantalla no contiene un punto se puede colocar
        if(!(this.resultado.getText().contains("."))){
            this.resultado.setText(this.resultado.getText()+".");
        }
    }//GEN-LAST:event_boton_puntoActionPerformed

    private void boton_sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sumarActionPerformed
        //asignar el valor que esta en la pantalla a la variable numero_a
        //para asignar el numero a la variable (que es string) se debe transformar a float
        this.numero_a=Float.parseFloat(this.resultado.getText());
        this.operador="+"; //asignar al operador el signo
        
        this.resultado.setText(""); //devolver una cadena vacía
    }//GEN-LAST:event_boton_sumarActionPerformed

    private void boton_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_igualActionPerformed
        // primero va a asignar el valor que esta en la pantalla a la variable numero_b
        this.numero_b=Float.parseFloat(this.resultado.getText());
        
        //despues va aimprimir el resultado
        switch(this.operador){
            //para cada caso va a realizar la operacion correspondiente
            //la funcion quitar_cero va a convertir el valor Float a cadena para mandarlo a la pantalla
            case "+" : 
                this.resultado.setText(quitar_cero(this.numero_a + this.numero_b)); break;
            case "-" : 
                this.resultado.setText(quitar_cero(this.numero_a - this.numero_b)); break;
            case "*" : 
                this.resultado.setText(quitar_cero(this.numero_a * this.numero_b)); break;
            case "/" :
                this.resultado.setText(quitar_cero(this.numero_a / this.numero_b)); break;
            case "%" : 
                this.resultado.setText(quitar_cero(this.numero_a * (this.numero_b / 100))); break;
        }
    }//GEN-LAST:event_boton_igualActionPerformed

    private void boton_restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_restarActionPerformed
        this.numero_a=Float.parseFloat(this.resultado.getText());
        this.operador="-"; //asignar al operador el signo
        
        this.resultado.setText(""); //devolver una cadena vacía
    }//GEN-LAST:event_boton_restarActionPerformed

    private void boton_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_multiplicarActionPerformed
        this.numero_a=Float.parseFloat(this.resultado.getText());
        this.operador="*"; //asignar al operador el signo
        
        this.resultado.setText(""); //devolver una cadena vacía
    }//GEN-LAST:event_boton_multiplicarActionPerformed

    private void boton_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_dividirActionPerformed
        this.numero_a=Float.parseFloat(this.resultado.getText());
        this.operador="/"; //asignar al operador el signo
        
        this.resultado.setText(""); //devolver una cadena vacía
    }//GEN-LAST:event_boton_dividirActionPerformed

    private void boton_porcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_porcentajeActionPerformed
        this.numero_a=Float.parseFloat(this.resultado.getText());
        this.operador="%"; //asignar al operador el signo
        
        this.resultado.setText(""); //devolver una cadena vacía
    }//GEN-LAST:event_boton_porcentajeActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        String textoActual = this.resultado.getText();

        // Verificar que haya texto para borrar
        if (!textoActual.isEmpty()) {
            // Eliminar el último carácter
            String nuevoTexto = textoActual.substring(0, textoActual.length() - 1);
            this.resultado.setText(nuevoTexto);
        }
    }//GEN-LAST:event_boton_borrarActionPerformed
    
    //para los resultados que no contienen decimales mostrar el resultado entero
    public String quitar_cero(float respuesta){
        String retorno = ""; 
        retorno=Float.toString(respuesta); //convertir el valor Float a String
        
        
        //si el residuo del valor lo dividimos entre 1 es cero
        if(respuesta%1==0){
            //recortar los ultimos dos caracteres
            retorno=retorno.substring(0,retorno.length()-2);
        } 
    return retorno; //devolver el valor del retorno a la variable respuesta
    }
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new calculadora().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar;
    private javax.swing.JButton boton_cero;
    private javax.swing.JButton boton_cinco;
    private javax.swing.JButton boton_cuatro;
    private javax.swing.JButton boton_dividir;
    private javax.swing.JButton boton_dos;
    private javax.swing.JButton boton_igual;
    private javax.swing.JButton boton_multiplicar;
    private javax.swing.JButton boton_nueve;
    private javax.swing.JButton boton_ocho;
    private javax.swing.JButton boton_porcentaje;
    private javax.swing.JButton boton_punto;
    private javax.swing.JButton boton_reiniciar;
    private javax.swing.JButton boton_restar;
    private javax.swing.JButton boton_seis;
    private javax.swing.JButton boton_siete;
    private javax.swing.JButton boton_sumar;
    private javax.swing.JButton boton_tres;
    private javax.swing.JButton boton_uno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
