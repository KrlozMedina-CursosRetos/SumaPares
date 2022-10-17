package sumatoriapares;

public class sumatoriaPares extends javax.swing.JFrame {

    String s1,x;
    int t=0,n=0,c=0,l,u,te=0,h=0,t2=0;
    char z;

    public sumatoriaPares() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(c1);
        c1.setBounds(10, 11, 298, 31);
        getContentPane().add(c2);
        c2.setBounds(10, 134, 298, 31);

        jButton1.setText("Sumatoria pares");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 75, 298, 31);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-326)/2, (screenSize.height-210)/2, 326, 210);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        x=c1.getText();
        l=x.length();
        for(int i=0;i<l;i++)
        {
            z=x.charAt(i);
            if(z==' ')
            {
                c=c+1;
            }
        }
        while(c > 0)
        {
            l=x.length();
            for (int i=0; i<l; i++)
            {
                z=x.charAt(i);
                if(z==',')
                {
                    n=i;
                    te=0;
                        break;
                }
            }
            s1=x.substring(0 , n );
            te=te+Integer.parseInt(s1);
            u=te%2;
            if(u==0)
            {
                t=t+te;
                x=x.substring(n+1);
                c=c-1;
            }
            if(u==1)
            {
                x=x.substring(n+1);
                c=c-1;
            }
        }
        t2=t+Integer.parseInt(x);
        if(t2%2==0)
        {
            h=h+1;
            c2.setText(String.valueOf(t2+"  cantidad de pares: "+h));
        }
        else
        {
            c2.setText(String.valueOf(t+"  cantidad de pares: "+h));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sumatoriaPares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables

}
